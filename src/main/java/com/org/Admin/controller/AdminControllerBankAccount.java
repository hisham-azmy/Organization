package com.org.Admin.controller;

import java.nio.file.Path;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.model.BankAccount;
import com.org.service.BankAccountService;

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerBankAccount {
	private Path path;

	@Autowired
	private BankAccountService bankAccountService;

	@RequestMapping(value = "/BankAcount/create", method = RequestMethod.GET)
	public String createBankAcount(Model model) {
		model.addAttribute("title", "New Bank Account");
		model.addAttribute("headerMSG", "create a new BankAccountService");
		model.addAttribute("bankAccount", new BankAccount());
		return "BankAcount/addBankAccount";
	}

	@RequestMapping(value = "/BankAcount/add", method = RequestMethod.POST)
	public String addBankAcount(@Valid @ModelAttribute("bankAccount") BankAccount bankAccount, BindingResult br,
			HttpServletRequest req) {
		if (br.hasErrors()) {
			return "BankAcount/addBankAccount";
		}
		bankAccountService.AddBankAccount(bankAccount);
		return "redirect:/admin/allBankAccount";

	}

	@RequestMapping(value = "/BankAcount/delete/{id}", method = RequestMethod.GET)
	public String GroupBankAcount(Model model, @PathVariable("id") int id) {
		bankAccountService.deleteBankAccount(id);

		return "redirect:/admin/allBankAccount";
	}

	@RequestMapping(value = "/allBankAccount", method = RequestMethod.GET)
	public String allBankAcount(Model model) {
		List<BankAccount> BankAccount = bankAccountService.getAllBankAccount();

		model.addAttribute("members", BankAccount);

		return "BankAcount/allBankAccount";
	}

	@RequestMapping(value = "/BankAcount/edit/{id}", method = RequestMethod.GET)
	public String editBankAcount(Model model, @PathVariable("id") int id) {
		BankAccount bankAccount = bankAccountService.getBankAccountById(id);
		model.addAttribute("title", "Edit Bank Account");
		model.addAttribute("headerMSG", "Edit Bank Account");
		model.addAttribute("bankAccount", bankAccount);

		return "BankAcount/addBankAccount";
	}

	@RequestMapping(value = "/BankAcount/edit", method = RequestMethod.POST)
	public String editBankAcount(@Valid @ModelAttribute BankAccount bankAccount, BindingResult br) {
		if (br.hasErrors()) {
			return "BankAcount/addBankAccount";
		}
		bankAccountService.updateBankAccount(bankAccount);

		return "redirect:/admin/allBankAccount";
	}

	@RequestMapping(value = "/BankAcount/details/{id}", method = RequestMethod.GET)
	public String MemberDetails(Model model, @PathVariable("id") int id) {
		BankAccount bankAccount = bankAccountService.getBankAccountById(id);
		model.addAttribute("bankAccount", bankAccount);

		return "BankAcount/bankAccount-detail";
	}

	// @RequestMapping(value = "/group/searchName", method = RequestMethod.GET)
	// @ResponseBody
	// public String searchGroup(ModelAndView model, @RequestParam("term") String
	// term, HttpServletRequest req) {
	//
	// Gson gson = new Gson();
	//
	// return gson.toJson(groupServcie.allNameByGroup(term));
	// }

}
