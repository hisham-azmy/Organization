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

import com.org.model.IoSettings;
import com.org.service.SettingsServcie;

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerSettings {
	private Path path;

	@Autowired
	private SettingsServcie settingsServcie;

	@RequestMapping(value = "/settings", method = RequestMethod.GET)
	public String getSettings(Model model) {

		if (settingsServcie.getSettings() != null) {
			model.addAttribute("settings", settingsServcie.getSettings());
		} else {
			model.addAttribute("settings", new IoSettings());
		}

		return "Settings";
	}

	@RequestMapping(value = "/settings", method = RequestMethod.POST)
	public String postSettings(@Valid @ModelAttribute("settings") IoSettings settings, BindingResult br) {
		if (br.hasErrors()) {
			return "Loan/addLoan";
		}
		settingsServcie.updateSettings(settings);
		return "redirect:/admin/";
	}

}
