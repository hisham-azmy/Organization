package com.org.Admin.controller;

import java.nio.file.Path;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.model.IoGroup;
import com.org.model.IoSettings;
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
	public String getSecIncome(Model model) {

		model.addAttribute("secondIncome", new SecondaryIncome());
		return "SecondaryIncome/addSecondIncome";
	}

	@RequestMapping(value = "/secondIncome/add", method = RequestMethod.POST)
	public String postSettings(@Valid @ModelAttribute("secondaryIncome") SecondaryIncome secondaryIncome,
			BindingResult br) {
		if (br.hasErrors()) {
			return "Loan/addLoan";
		}
		secondaryIncomeService.updateSecondaryIncome(secondaryIncome);
		return "redirect:/admin/allSecondaryIncome";
	}

	@RequestMapping(value = "/allSecondaryIncome", method = RequestMethod.GET)
	public String allGroups(Model model) {
		List<SecondaryIncome> secondaryIncomes = secondaryIncomeService.getAllSecondaryIncome();
		model.addAttribute("members", secondaryIncomes);
		return "SecondaryIncome/allSecondIncomes";
	}

}
