package website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*Directs the traffic on the website */
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
	
	@RequestMapping("/login")
	public String login(Model model){
		return"login";
	}
	
}
