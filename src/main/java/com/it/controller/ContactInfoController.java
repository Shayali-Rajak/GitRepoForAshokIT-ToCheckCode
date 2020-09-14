package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.it.dto.ContactDTO;
import com.it.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactInfoController {
	
	@Autowired
	private ContactService service;

	/**
	 * display contact form
	 */
	@GetMapping("/index")
	public String showContactForm(Model model)
	{
 		model.addAttribute("contactDTO", new ContactDTO());
		return "index";
	}
	/**
	 * save contact using Submit button
	 */
	
	@PostMapping("/save")
	public String handleSubmitBtn(@ModelAttribute ContactDTO contactDTO ,RedirectAttributes model)
	{
		boolean isSaved=service.saveContact(contactDTO);
		if(isSaved) {
			if(contactDTO.getCid()!=null) {
				model.addFlashAttribute("succmsg", "Contact Updated SuccessFully");

			}
			else {
				model.addFlashAttribute("succmsg", "Contact Saved Successfully");

			}
		}
		else {
			model.addFlashAttribute("errmsg", "Contact failed to Saved");
		}
		//model.addAttribute("contactDTO", new ContactDTO());
		return "redirect:index";
	}
	
	/**
	 * get all contact hyperlink  
	 * 
	 */
	@GetMapping("/all")
	public String viewContactHyperLink(Model model)
	{
		List<ContactDTO> contact = service.getAllContact();
		model.addAttribute( "allcontact", contact);
		return "ContactAll";
	}
}
