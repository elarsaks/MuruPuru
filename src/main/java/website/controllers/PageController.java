/*
 * This is a main controller class handling the page traffic.
 * 
 */

package website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	
	@RequestMapping("/")
	public String landing(Model model){
		return"index";
	}
	
	@RequestMapping("/admin")
	public String admin(Model model){
		return"admin";
	}
	
}
