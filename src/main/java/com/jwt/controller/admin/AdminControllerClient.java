package com.jwt.controller.admin;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

@Controller
@RequestMapping(value = "/admin")
public class AdminControllerClient {
	private Path path;

	@Autowired
	private ClientServcie clientService;

	@RequestMapping(value = "/client/create", method = RequestMethod.GET)
	public String createClient(Model model) {
		model.addAttribute("title", "New Client");
		model.addAttribute("headerMSG", "create a new Client");
		model.addAttribute("client", new Client());
		return "client/addClient";
	}

	@RequestMapping(value = "/client/add", method = RequestMethod.POST)
	public String addClient(@Valid @ModelAttribute Client client, BindingResult br, HttpServletRequest req) {
		if (br.hasErrors()) {
			return "client/addClient";
		}
		// image configuration
		clientService.AddClient(client);

		MultipartFile productImage = client.getProductImage();
		String rootDir = req.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDir + "//WEB-INF//resources//img//" + client.getId() + ".png");
		String destinatino = path.toString();
		if (productImage != null && !productImage.isEmpty()) {
			try {
				System.out.println("Path is  : " + destinatino);
				productImage.transferTo(new File(destinatino));
				System.out.println("Name is :" + productImage.getName());
			} catch (Exception e) {
				throw new RuntimeException("saving file is failed", e);
			}
		}

		return "redirect:/admin";
	}

	@RequestMapping(value = "/client/delete/{id}", method = RequestMethod.GET)
	public String deleteClient(Model model, @PathVariable("id") int id) {
		clientService.deleteClient(id);

		return "redirect:/admin/productInventory";
	}

	@RequestMapping(value = "/client/edit/{id}", method = RequestMethod.GET)
	public String editClient(Model model, @PathVariable("id") int id) {
		Client client = clientService.getClientById(id);
		model.addAttribute("title", "Edit Client");
		model.addAttribute("headerMSG", "Edit the Client");
		model.addAttribute("client", client);

		return "client/addClient";
	}

	@RequestMapping(value = "/client/edit", method = RequestMethod.POST)
	public String editClient(@Valid @ModelAttribute Client client, BindingResult br) {
		if (br.hasErrors()) {
			return "newClient";
		}
		clientService.updateClient(client);
		return "redirect:/admin/productInventory";
	}

	@RequestMapping(value = "/client/details/{id}", method = RequestMethod.GET)
	public String ProductDetails(Model model, @PathVariable("id") int id) {
		Client client = clientService.getClientById(id);

		model.addAttribute("client", client);

		return "client/client-detail";
	}

	@RequestMapping(value = "/allClient", method = RequestMethod.GET)
	public String AllClients(Model model) {
		List<Client> clients = clientService.getAllClients();

		model.addAttribute("client", clients);

		return "client/allClients";
	}

	// @RequestMapping(value = "/ajax/filter", method = RequestMethod.GET)
	// public ModelAndView filterProduct(ModelAndView model, @RequestParam("name")
	// float name,
	// @RequestParam("maxPrice") float maxPrice) {
	//
	// model.addObject("products", clientService.filterClientsByName(name));
	// model.setViewName("products_list");
	//
	// return model;
	// }

	@RequestMapping(value = "/ajax/filterByName", method = RequestMethod.GET)
	public ModelAndView filterByName(ModelAndView model, @RequestParam("name") String name) {

		model.addObject("client", clientService.filterClientsByName(name));
		model.setViewName("client/clients_list");

		return model;
	}

	// **********************************************************
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String home(Locale locale, Model model) {
	// // logger.info("Welcome home! The client locale is {}.", locale);
	//
	// return "home";
	// }

	// *********************** parternership

	@RequestMapping(value = "/partnership/create", method = RequestMethod.GET)
	public String createPartenerShip(Model model) {
		model.addAttribute("title", "New PartenerShip");
		model.addAttribute("headerMSG", "create PartenerShip");
		model.addAttribute("part", new ClientPartnership());
		return "parternship/addPartnership";
	}

	// @RequestMapping(value = "/ajax/filterByName", method = RequestMethod.GET)
	// public ModelAndView filterPartnershipByName(ModelAndView model,
	// @RequestParam("name") String name) {
	//
	// model.addObject("client", clientService.filterClientsByName(name));
	// model.setViewName("client/clients_list");
	//
	// return model;
	// }

	@RequestMapping(value = "/ajax/searchName", method = RequestMethod.GET)
	@ResponseBody
	public String searchProducts(ModelAndView model, @RequestParam("term") String term, HttpServletRequest req) {

		System.out.println(req.getParameter("term"));

		model.addObject("client", clientService.allNameByClient(term));
		List<String> cc = new ArrayList<String>();

		for (Client client : clientService.filterClientsByName(term)) {
			cc.add(client.getName());
			System.out.println("the value is  " + client.getName());
		}
		Gson gson = new Gson();

		return gson.toJson(clientService.allNameByClient(term));
	}
	
	
	
	

}
