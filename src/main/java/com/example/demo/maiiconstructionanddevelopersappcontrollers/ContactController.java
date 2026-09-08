package com.example.demo.maiiconstructionanddevelopersappcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactMessage;
import com.example.demo.maiiconstructionanddevelopersappservices.ContactDetailsService;
import com.example.demo.maiiconstructionanddevelopersappservices.ContactMessageService;

@Controller
public class ContactController {
	@Autowired
    private ContactMessageService contactService;
	@Autowired
    private ContactDetailsService contactDetailsService;

  
    
    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactMessage contactMessage, Model model) {
        contactService.saveMessage(contactMessage);
        model.addAttribute("success", "Thank you! We will contact you soon.");
        model.addAttribute("details", contactDetailsService.getDetails()); 
        model.addAttribute("contactMessage", new ContactMessage());
       
        return "contact";
    }
    

}
