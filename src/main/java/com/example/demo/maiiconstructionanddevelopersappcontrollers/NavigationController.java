package com.example.demo.maiiconstructionanddevelopersappcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactMessage;
import com.example.demo.maiiconstructionanddevelopersappservices.ContactDetailsService;
import com.example.demo.maiiconstructionanddevelopersappservices.MessageService;

@Controller
public class NavigationController {
	@Autowired
	private MessageService messageService;
	
	@Autowired
    private ContactDetailsService contactDetailsService;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("welcomeMessage", messageService.getWelcomeMessage());
		model.addAttribute("appreciationMessage", messageService.getAppreciationMessage());
		return "index";
	}
	@GetMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("welcomeMessage", messageService.getWelcomeMessage());
		model.addAttribute("appreciationMessage", messageService.getAppreciationMessage());
		return "home";
	}
	
	@GetMapping("/openAbout")
	public String openAbout() {
		return "about";
	}
	
	@GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactMessage", new ContactMessage());
        model.addAttribute("details", contactDetailsService.getDetails());
        return "contact";
    }
	
	@GetMapping("/openProject")
	public String openProject() {
		return "project";
	}
	@GetMapping("/openService")
	public String openService() {
		return "service";
	}
	


}
