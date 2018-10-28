/**
 * 
 */
package com.anil.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anil.sfgpetclinic.services.OwnerService;

/**
 * @author Anil_Ramesh
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	private OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/index", "/index.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

	@RequestMapping({ "/find" })
	public String findOwners() {
		return "notimplemented";

	}

}
