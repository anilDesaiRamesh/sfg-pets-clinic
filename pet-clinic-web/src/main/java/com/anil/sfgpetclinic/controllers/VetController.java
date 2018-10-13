/**
 * 
 */
package com.anil.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class VetController {

	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
	public String listVets() {		
		return "vets/index";
	}

}
