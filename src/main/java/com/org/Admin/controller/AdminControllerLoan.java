//package com.org.Admin.controller;
//
//import java.io.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.security.acl.Group;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.converter.json.GsonBuilderUtils;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.google.gson.Gson;
//import com.jwt.model.Client;
//import com.jwt.model.ClientPartnership;
//import com.jwt.service.ClientServcie;
//import com.org.model.IoGroup;
//import com.org.model.IoMember;
//import com.org.service.GroupServcie;
//import com.org.service.MemberServcie;
//import com.org.validation.DateFormatter;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminControllerLoan {
//	private Path path;
//
//	@Autowired
//	private MemberServcie memberServcie;
//
//	@Autowired
//	private GroupServcie groupServcie;
//
//	@RequestMapping(value = "/member/create", method = RequestMethod.GET)
//	public String createMember(Model model) {
//		model.addAttribute("title", "New Member");
//		model.addAttribute("headerMSG", "create a new Client");
//		model.addAttribute("member", new IoMember());
//		return "Member/addMember";
//	}
//
//	@RequestMapping(value = "/member/add", method = RequestMethod.POST)
//	public String addNewMember(@Valid @ModelAttribute("member") IoMember member, BindingResult br,
//			HttpServletRequest req) {
//		if (br.hasErrors()) {
//			return "Member/addMember";
//		}
//		memberServcie.AddMember(member);
//		return "Group";
//
//	}
//
//	@RequestMapping(value = "/member/edit/{id}", method = RequestMethod.GET)
//	public String editMember(Model model, @PathVariable("id") int id) {
//		IoMember member= memberServcie.getMemberById(id);
//		model.addAttribute("title", "Edit member");
//		model.addAttribute("headerMSG", "Edit the member");
//		model.addAttribute("member", member);
//
//		return "Member/addMember";
//	}
//
//	@RequestMapping(value = "/member/edit", method = RequestMethod.POST)
//	public String editMember(@Valid @ModelAttribute("member") IoMember member, BindingResult br) {
//		if (br.hasErrors()) {
//			return "Member/addMember";
//		}
//		memberServcie.updateMember(member);
//
//		return "Member/addMember";
//	}
//
//	@RequestMapping(value = "/member/details/{id}", method = RequestMethod.GET)
//	public String MemberDetails(Model model, @PathVariable("id") int id) {
//		IoMember member = memberServcie.getMemberById(id);
//		model.addAttribute("member", member);
//
//		return "Member/member-detail";
//	}
//
//	@RequestMapping(value = "/member/delete/{id}", method = RequestMethod.GET)
//	public String Memberdelete(Model model, @PathVariable("id") int id) {
//		memberServcie.deleteMember(id);
//		// model.addAttribute("member", member);
//
//		return "redirect:/admin/allMember";
//	}
//
//	@RequestMapping(value = "/allMember", method = RequestMethod.GET)
//	public String AllMembers(Model model) {
//		List<IoMember> members = memberServcie.getAllMembers();
//
//		model.addAttribute("members", members);
//
//		return "Member/allMember";
//	}
//
//	@InitBinder("user")
//	public void customizeBinding(WebDataBinder binder) {
//		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//		dateFormatter.setLenient(false);
//		binder.registerCustomEditor(Date.class, "joinDate", new CustomDateEditor(dateFormatter, true));
//	}
//
//	// @RequestMapping(value = "/member/add", method = RequestMethod.POST)
//	// public String addMember(@Valid @ModelAttribute Client client, BindingResult
//	// br, HttpServletRequest req) {
//	// if (br.hasErrors()) {
//	// return "client/addClient";
//	// }
//	// // image configuration
//	// // memberServcie.AddMember();
//	//
//	// MultipartFile productImage = client.getProductImage();
//	// String rootDir = req.getSession().getServletContext().getRealPath("/");
//	// path = Paths.get(rootDir + "//WEB-INF//resources//img//" + client.getId() +
//	// ".png");
//	// String destinatino = path.toString();
//	// if (productImage != null && !productImage.isEmpty()) {
//	// try {
//	// System.out.println("Path is : " + destinatino);
//	// productImage.transferTo(new File(destinatino));
//	// System.out.println("Name is :" + productImage.getName());
//	// } catch (Exception e) {
//	// throw new RuntimeException("saving file is failed", e);
//	// }
//	// }
//	//
//	// return "redirect:/admin";
//	// }
//	//
//	// @RequestMapping(value = "/client/delete/{id}", method = RequestMethod.GET)
//	// public String deleteClient(Model model, @PathVariable("id") int id) {
//	// clientService.deleteClient(id);
//	//
//	// return "redirect:/admin/productInventory";
//	// }
//	//
//	// @RequestMapping(value = "/client/edit/{id}", method = RequestMethod.GET)
//	// public String editClient(Model model, @PathVariable("id") int id) {
//	// Client client = clientService.getClientById(id);
//	// model.addAttribute("title", "Edit Client");
//	// model.addAttribute("headerMSG", "Edit the Client");
//	// model.addAttribute("client", client);
//	//
//	// return "client/addClient";
//	// }
//	//
//	// @RequestMapping(value = "/client/edit", method = RequestMethod.POST)
//	// public String editClient(@Valid @ModelAttribute Client client, BindingResult
//	// br) {
//	// if (br.hasErrors()) {
//	// return "newClient";
//	// }
//	// clientService.updateClient(client);
//	// return "redirect:/admin/productInventory";
//	// }
//	//
//	// @RequestMapping(value = "/client/details/{id}", method = RequestMethod.GET)
//	// public String ProductDetails(Model model, @PathVariable("id") int id) {
//	// Client client = clientService.getClientById(id);
//	//
//	// model.addAttribute("client", client);
//	//
//	// return "client/client-detail";
//	// }
//	//
//	// @RequestMapping(value = "/allClient", method = RequestMethod.GET)
//	// public String AllClients(Model model) {
//	// List<Client> clients = clientService.getAllClients();
//	//
//	// model.addAttribute("client", clients);
//	//
//	// return "client/allClients";
//	// }
//	//
//	// // @RequestMapping(value = "/ajax/filter", method = RequestMethod.GET)
//	// // public ModelAndView filterProduct(ModelAndView model,
//	// @RequestParam("name")
//	// // float name,
//	// // @RequestParam("maxPrice") float maxPrice) {
//	// //
//	// // model.addObject("products", clientService.filterClientsByName(name));
//	// // model.setViewName("products_list");
//	// //
//	// // return model;
//	// // }
//	//
//	// @RequestMapping(value = "/ajax/filterByName", method = RequestMethod.GET)
//	// public ModelAndView filterByName(ModelAndView model, @RequestParam("name")
//	// String name) {
//	//
//	// model.addObject("client", clientService.filterClientsByName(name));
//	// model.setViewName("client/clients_list");
//	//
//	// return model;
//	// }
//	//
//	// // **********************************************************
//	// // @RequestMapping(value = "/", method = RequestMethod.GET)
//	// // public String home(Locale locale, Model model) {
//	// // // logger.info("Welcome home! The client locale is {}.", locale);
//	// //
//	// // return "home";
//	// // }
//	//
//	// // *********************** parternership
//	//
//	// @RequestMapping(value = "/partnership/create", method = RequestMethod.GET)
//	// public String createPartenerShip(Model model) {
//	// model.addAttribute("title", "New PartenerShip");
//	// model.addAttribute("headerMSG", "create PartenerShip");
//	// model.addAttribute("part", new ClientPartnership());
//	// return "parternship/addPartnership";
//	// }
//	//
//	// // @RequestMapping(value = "/ajax/filterByName", method = RequestMethod.GET)
//	// // public ModelAndView filterPartnershipByName(ModelAndView model,
//	// // @RequestParam("name") String name) {
//	// //
//	// // model.addObject("client", clientService.filterClientsByName(name));
//	// // model.setViewName("client/clients_list");
//	// //
//	// // return model;
//	// // }
//	//
//	@RequestMapping(value = "/group/searchName", method = RequestMethod.GET)
//	@ResponseBody
//	public String searchGroup(ModelAndView model, @RequestParam("term") String term, HttpServletRequest req) {
//
//		Gson gson = new Gson();
//
//		return gson.toJson(groupServcie.allNameByGroup(term));
//	}
//
//}
