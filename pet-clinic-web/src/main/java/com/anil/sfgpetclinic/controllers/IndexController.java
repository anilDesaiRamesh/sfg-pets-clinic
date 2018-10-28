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
public class IndexController {

	@RequestMapping({"","/","/index","/index.html"})
	public String index() {		
		return "index";
	}
	
	@RequestMapping({"/oups"})
	public String oopsHandler() {
		return "notimplemented";
	}

}
