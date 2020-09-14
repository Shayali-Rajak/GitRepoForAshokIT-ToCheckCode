package com.it.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.it.dto.ContactDTO;
import com.it.service.ContactService;

@Controller
public class ViewContactsController {

	@Autowired
	private ContactService service;
	/**
	 * Add contact hyperlink
	 */
	@GetMapping("/add")
	public String addContactHyperlink(Model model)
	{
		return "index";
	}
	/**
	 * Edit contact
	 */
	@GetMapping("/edit")
	public String editContactById(@RequestParam("cid") Integer cid,Model model)
	{
	    ContactDTO opt=service.getContactById(cid);	
	    model.addAttribute("editopt",opt);
		return "index";
	}
	/**
	 * delete  contact
	 */
	@GetMapping("/delete")
	public String deleteConatct(Integer cid,Model model)
	{
		service.getContactById(cid);
		return "redirect:ContactAll";
	}
}
