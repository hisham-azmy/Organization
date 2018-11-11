//package com.org.Admin.controller;
//
//import java.nio.file.Path;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.org.model.Loan;
//import com.org.model.LoanDetails;
//import com.org.service.LoanDetailsService;
//import com.org.service.LoanServcie;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminControllerLoanDetails {
//	private Path path;
//
//	@Autowired
//	private LoanDetailsService loanDetailsService;
//	@Autowired
//	private LoanServcie loanServcie;
//	int loanId = 0;
//
//	// ***************** create LoanDetail *****************
//	@RequestMapping(value = "/loanDetails/create", method = RequestMethod.GET)
//	public String LoanDetails(Model model, @PathVariable("id") int id) {
//		model.addAttribute("title", "Add Loan Details");
//		model.addAttribute("newloanDetail", new LoanDetails());
//		return "LoanDetails/addLoanDetails";
//	}
//
//	@RequestMapping(value = "/loanDetails/add", method = RequestMethod.POST)
//	public String LoanDetailsPost(@Valid @ModelAttribute("newloanDetail") LoanDetails loanDetails, BindingResult br) {
//		if (br.hasErrors()) {
//			return "LoanDetails/addLoanDetails";
//		}
//		loanDetailsService.AddLoanDetails(loanDetails);
//		return "redirect:/admin/allLoanDetails";
//	}
//
//	@RequestMapping(value = "/loanDetails/edit/{id}", method = RequestMethod.GET)
//	public String editloanDetailsById(Model model, @PathVariable("id") int id) {
//		LoanDetails loanDetails = loanDetailsService.getLoanDetailsById(id);
//		model.addAttribute("title", "Edit Loan Details");
//		model.addAttribute("headerMSG", "Edit the Loan Details");
//		model.addAttribute("loanDetails ", loanDetails);
//
//		return "LoanDetails/addLoanDetails";
//	}
//
//	@RequestMapping(value = "/loanDetails/edit", method = RequestMethod.POST)
//	public String editLoan(@Valid @ModelAttribute("loanDetails") LoanDetails loanDetails, BindingResult br) {
//		if (br.hasErrors()) {
//			return "Loan/addLoan";
//		}
//		loanDetailsService.updateLoanDetails(loanDetails, 1);
//		return "redirect:/admin/allLoanDetails";
//	}
//
//	@RequestMapping(value = "/loan/delete/{id}", method = RequestMethod.GET)
//	public String Loandelete(Model model, @PathVariable("id") int id) {
//		loanServcie.deleteLoan(id);
//		// model.addAttribute("member", member);
//
//		return "redirect:/admin/allLoan";
//	}
//
//	@RequestMapping(value = "/allLoanDetails", method = RequestMethod.GET)
//	public String AllLoanDetails(Model model) {
//		List<LoanDetails> allLoanDetails = loanDetailsService.getAllLoanDetails();
//		model.addAttribute("loansDetails", allLoanDetails);
//		return "LoanDetails/allLoanDetails";
//	}
//
//	// @RequestMapping(value = "/group/searchName", method = RequestMethod.GET)
//	// @ResponseBody
//	// public String searchGroup(@RequestParam("term") String term,
//	// HttpServletRequest req) {
//	// Gson gson = new Gson();
//	// return gson.toJson(loanServcie.getAllNamePerLoans(term));
//	// }
//
//}
