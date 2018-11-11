package com.org.Admin.controller;

import java.nio.file.Path;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.model.SecondaryIncome;
import com.org.service.SecondaryIncomeService;
import com.org.service.SettingsServcie;

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerSecondaryIncome {
	private Path path;

	@Autowired
	private SettingsServcie settingsServcie;

	@Autowired
	private SecondaryIncomeService secondaryIncomeService;

	@RequestMapping(value = "/secondIncome/create", method = RequestMethod.GET)
	public String createGroup(Model model) {
		model.addAttribute("title", "New Secondry Income");
		model.addAttribute("headerMSG", "create a new Secondry Income ");
		model.addAttribute("secondIncome", new SecondaryIncome());
		return "SecondaryIncome/addSecondIncome";
	}

	@RequestMapping(value = "/secondIncome/add", method = RequestMethod.POST)
	public String postSettings(@Valid @ModelAttribute("secondIncome") SecondaryIncome secondIncome, BindingResult br) {
		if (br.hasErrors()) {
			return "SecondaryIncome/addSecondIncome";
		}
		secondaryIncomeService.AddSecondaryIncome(secondIncome);
		return "redirect:/admin/allSecondaryIncome";
	}

	@RequestMapping(value = "/secondIncome/delete/{id}", method = RequestMethod.GET)
	public String secondIncomeDelete(Model model, @PathVariable("id") int id) {

		secondaryIncomeService.deleteSecondaryIncome(id);

		return "redirect:/admin/allSecondaryIncome";
	}

	@RequestMapping(value = "/allSecondaryIncome", method = RequestMethod.GET)
	public String allGroups(Model model) {
		List<SecondaryIncome> secondaryIncomes = secondaryIncomeService.getAllSecondaryIncome();
		model.addAttribute("members", secondaryIncomes);
		return "SecondaryIncome/allSecondIncomes";
	}

	@RequestMapping(value = "/secondIncome/edit/{id}", method = RequestMethod.GET)
	public String editsecondIncome(Model model, @PathVariable("id") int id) {

		SecondaryIncome secondIncome = secondaryIncomeService.getSecondaryIncomeById(id);

		model.addAttribute("title", "Secondry Income");
		model.addAttribute("headerMSG", "Edit the Secondry Income");
		model.addAttribute("secondIncome", secondIncome);

		return "Member/addSecondIncome";
	}

	@RequestMapping(value = "/secondIncome/edit", method = RequestMethod.POST)
	public String editMember(@Valid @ModelAttribute SecondaryIncome secondIncome, BindingResult br) {
		// if (br.hasErrors()) {
		// return "Member/addMember";
		// }
		secondaryIncomeService.updateSecondaryIncome(secondIncome);

		return "redirect:/admin/allSecondIncomes";
	}

}
