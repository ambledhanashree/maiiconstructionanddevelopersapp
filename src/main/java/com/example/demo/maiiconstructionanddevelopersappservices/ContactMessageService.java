package com.example.demo.maiiconstructionanddevelopersappservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactMessage;
import com.example.demo.maiiconstructionanddevelopersapprepositories.ContactMessageRepository;

@Service
public class ContactMessageService {
	@Autowired
    private ContactMessageRepository contactRepo;

    public void saveMessage(ContactMessage message) {
        contactRepo.save(message);
    }
    public List<ContactMessage> getAllMessages() {
        return contactRepo.findAll();
    }

}
