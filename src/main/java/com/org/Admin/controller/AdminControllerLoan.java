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

import com.google.gson.Gson;
import com.org.model.IoGroup;
import com.org.model.IoMember;
import com.org.model.Loan;
import com.org.service.GroupServcie;
import com.org.service.LoanDetailsService;
import com.org.service.LoanServcie;
import com.org.service.MemberServcie;

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerLoan {
	private Path path;

	@Autowired
	private MemberServcie memberServcie;

	@Autowired
	private GroupServcie groupServcie;

	@Autowired
	private LoanServcie loanServcie;

	@Autowired
	private LoanDetailsService loanDetailsService;

	int loanId = 0;

	@RequestMapping(value = "/loan/create", method = RequestMethod.GET)
	public String createLoan(Model model) {
		model.addAttribute("title", "New Loan");
		model.addAttribute("headerMSG", "create a new Client");
		model.addAttribute("loan", new Loan());
		return "Loan/addLoan";
	}

	@RequestMapping(value = "/loan/add", method = RequestMethod.POST)
	public String addLoan(@Valid @ModelAttribute("loan") Loan loan, BindingResult br, HttpServletRequest req) {
		if (br.hasErrors()) {
			return "Loan/addLoan";
		}
		loanServcie.AddLoan(loan);
		return "redirect:/admin/allLoan";

	}

	@RequestMapping(value = "/loan/edit/{id}", method = RequestMethod.GET)
	public String editLoanById(Model model, @PathVariable("id") int id) {
		Loan loan = loanServcie.getLoanById(id);
		model.addAttribute("title", "Edit Loan");
		model.addAttribute("headerMSG", "Edit the member");
		model.addAttribute("loan", loan);

		return "Loan/addLoan";
	}

	@RequestMapping(value = "/loan/edit", method = RequestMethod.POST)
	public String editLoan(@Valid @ModelAttribute("loan") Loan loan, BindingResult br) {
		if (br.hasErrors()) {
			return "Loan/addLoan";
		}
		loanServcie.updateLoan(loan);
		return "redirect:/admin/allLoan";
	}

	@RequestMapping(value = "/loan/details/{id}", method = RequestMethod.GET)
	public String LoanDetails(Model model, @PathVariable("id") int id) {
		Loan loan = loanServcie.getLoanById(id);

		model.addAttribute("loanDetails", loanDetailsService.getAllLoanDetails(id));
		model.addAttribute("loan", loan);
		model.addAttribute("newloanDetail", new com.org.model.LoanDetails());
		loanId = id;

		return "Loan/loan-detail";
	}

	@RequestMapping(value = "/loan/details", method = RequestMethod.POST)
	public String LoanDetailsPost(@Valid @ModelAttribute("newloanDetail") com.org.model.LoanDetails loanDetails,
			BindingResult br
	/* @PathVariable("loanId") int loanId */) {
		if (br.hasErrors()) {
			return "Loan/addLoan";
		}
		loanDetailsService.AddLoanDetails(loanDetails, loanId);

		return "redirect:/admin/allLoan";
	}

	@RequestMapping(value = "/loan/delete/{id}", method = RequestMethod.GET)
	public String Loandelete(Model model, @PathVariable("id") int id) {
		loanServcie.deleteLoan(id);
		// model.addAttribute("member", member);

		return "redirect:/admin/allLoan";
	}

	@RequestMapping(value = "/allLoan", method = RequestMethod.GET)
	public String AllLoans(Model model) {
		List<Loan> loans = loanServcie.getAllLoan();

		model.addAttribute("loans", loans);

		return "Loan/allLoan";
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

	// @RequestMapping(value = "/loan/details", method = RequestMethod.POST)
	// public String LoanDetailsPost(@Valid @ModelAttribute("newloanDetail")
	// com.org.model.LoanDetails loanDetails,
	// BindingResult br
	// /* @PathVariable("loanId") int loanId */) {
	// if (br.hasErrors()) {
	// return "Loan/addLoan";
	// }
	// loanDetailsService.AddLoanDetails(loanDetails, loanId);
	//
	// return "redirect:/admin/allLoan";
	// }

}
