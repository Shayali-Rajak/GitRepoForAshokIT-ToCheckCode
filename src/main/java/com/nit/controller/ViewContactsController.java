package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.service.ContactService;

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
	public String editContactById(Integer cid,Model model)
	{
		return "";
	}
	/**
	 * delete  contact
	 */
	@GetMapping("/delete")
	public String deleteConatct(Integer cid,Model model)
	{
		return "ContactAll";
	}
}
