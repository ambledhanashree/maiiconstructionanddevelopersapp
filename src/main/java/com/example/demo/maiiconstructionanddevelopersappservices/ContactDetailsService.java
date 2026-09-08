package com.example.demo.maiiconstructionanddevelopersappservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactDetails;
import com.example.demo.maiiconstructionanddevelopersapprepositories.ContactDetailsRepository;

@Service
public class ContactDetailsService {
	@Autowired
    private ContactDetailsRepository repo;

    public ContactDetails getDetails() {
    	return repo.findById(1L).orElseGet(() -> {
            ContactDetails defaultDetails = new ContactDetails();
            defaultDetails.setPhoneNumber("+91-8904431617");
            defaultDetails.setWorkingHours("Mon – sun: 9 AM – 9 PM");
            return defaultDetails;
        });
        
    }

}
