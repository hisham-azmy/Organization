package com.jwt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.service.ProductService;
import com.org.dao.UsersService;
import com.org.model.Users;

@Controller
public class HomeController {

	@Autowired
	private UsersService usersService;

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Users users = new Users();
		model.addObject("customer", users);
		model.setViewName("registeration");
		return model;
	}

	@RequestMapping(value = "/registeration", method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute Users users, BindingResult br, Model model) {

		if (br.hasErrors()) {
			return "registeration";
		}

		usersService.AddUsers(users);
		return "redirect:/";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home2(Model model) {
		model.addAttribute("title", "Home Page");
		model.addAttribute("products", productService.getAllProducts());
		return "home-02";
	}

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		if (error != null) {
			model.addAttribute("error", "username or password is wrong.");
		}

		if (logout != null) {
			model.addAttribute("msg", "you have to logout.");
		}

		return "c_login";
	}

}
