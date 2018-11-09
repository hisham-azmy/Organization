package com.org.Admin.controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.acl.Group;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.jwt.model.Client;
import com.jwt.model.ClientPartnership;
import com.jwt.service.ClientServcie;
import com.org.model.IoGroup;
import com.org.model.IoMember;
import com.org.service.GroupServcie;
import com.org.service.MemberServcie;
import com.org.validation.DateFormatter;

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerMember {
	private Path path;

	@Autowired
	private MemberServcie memberServcie;

	@Autowired
	private GroupServcie groupServcie;

	@RequestMapping(value = "/group/create", method = RequestMethod.GET)
	public String createGroup(Model model) {
		model.addAttribute("title", "New Group");
		model.addAttribute("headerMSG", "create a new Group");
		model.addAttribute("group", new IoGroup());
		return "Group/addGroup";
	}

	@RequestMapping(value = "/group/add", method = RequestMethod.POST)
	public String addGroup(@Valid @ModelAttribute("group") IoGroup group, BindingResult br, HttpServletRequest req) {
		if (br.hasErrors()) {
			return "Group/addGroup";
		}
		groupServcie.AddGroup(group);
		return "/";

	}

	@RequestMapping(value = "/member/create", method = RequestMethod.GET)
	public String createMembers(Model model) {
		model.addAttribute("title", "New Member");
		model.addAttribute("headerMSG", "create a new Client");
		model.addAttribute("member", new IoMember());
		return "Member/addMember";
	}

	@RequestMapping(value = "/member/add", method = RequestMethod.POST)
	public String addNewMember(@Valid @ModelAttribute("member") IoMember member, BindingResult br,
			HttpServletRequest req) {
		if (br.hasErrors()) {
			return "Member/addMember";
		}
		memberServcie.AddMember(member);
		return "redirect:/admin/allMember";

	}

	@RequestMapping(value = "/member/edit/{id}", method = RequestMethod.GET)
	public String editMember(Model model, @PathVariable("id") int id) {
		IoMember member = memberServcie.getMemberById(id);
		model.addAttribute("title", "Edit member");
		model.addAttribute("headerMSG", "Edit the member");
		model.addAttribute("member", member);

		return "Member/addMember";
	}

	@RequestMapping(value = "/member/edit", method = RequestMethod.POST)
	public String editMember(@Valid @ModelAttribute  IoMember member, BindingResult br) {
		// if (br.hasErrors()) {
		// return "Member/addMember";
		// }
		System.out.println("Id of membr inside Edit member controller" + member.getId());
		memberServcie.AddMember(member);

		return "redirect:/admin/allMember";
	}

	@RequestMapping(value = "/member/details/{id}", method = RequestMethod.GET)
	public String MemberDetails(Model model, @PathVariable("id") int id) {
		IoMember member = memberServcie.getMemberById(id);
		model.addAttribute("member", member);

		return "Member/member-detail";
	}

	@RequestMapping(value = "/member/delete/{id}", method = RequestMethod.GET)
	public String Memberdelete(Model model, @PathVariable("id") int id) {
		memberServcie.deleteMember(id);
		// model.addAttribute("member", member);

		return "redirect:/admin/allMember";
	}

	@RequestMapping(value = "/allMember", method = RequestMethod.GET)
	public String AllMembers(Model model) {
		List<IoMember> members = memberServcie.getAllMembers();

		model.addAttribute("members", members);

		return "Member/allMember";
	}

	@InitBinder("user")
	public void customizeBinding(WebDataBinder binder) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		dateFormatter.setLenient(false);
		binder.registerCustomEditor(Date.class, "joinDate", new CustomDateEditor(dateFormatter, true));
	}

	@RequestMapping(value = "/group/searchName", method = RequestMethod.GET)
	@ResponseBody
	public String searchGroup(ModelAndView model, @RequestParam("term") String term, HttpServletRequest req) {

		Gson gson = new Gson();

		return gson.toJson(groupServcie.allNameByGroup(term));
	}

}
