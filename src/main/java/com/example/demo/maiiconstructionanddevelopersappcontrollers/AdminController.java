package com.example.demo.maiiconstructionanddevelopersappcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.maiiconstructionanddevelopersappservices.ContactMessageService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
	@Autowired
	private ContactMessageService contactMessageService;
	
	

	    @GetMapping("/admin-login")
	    public String login() {
	        return "admin-login";
	    }
	

	   // Show all contact messages
    @GetMapping("/admin-message")
    public String showMessages(Model model, HttpServletRequest request) {
        model.addAttribute("messages", contactMessageService.getAllMessages());
     // Auto logout after page load
        request.getSession().invalidate();
        return "admin-message";
    }

}
