package com.example.demo.maiiconstructionanddevelopersappservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.maiiconstructionanddevelopersappentities.Message;
import com.example.demo.maiiconstructionanddevelopersapprepositories.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository messageRepository;
	 public String getWelcomeMessage() {
	        return messageRepository.findById(1L)
	               .map(Message::getContent)
	               .orElse("Welcome to Maii Construction and Developers!");
	        	
	 }
	 public String getAppreciationMessage() {
	        return messageRepository.findById(2L)
	        		.map(Message::getContent)
		               .orElse("We appreciate your interest in  Maii Construction and Developers.\r\n"
		               		+ "Your trust means a lot to us, and we are committed\r\n"
		               		+ "to providing reliable and professional service.\r\n"
		               		+ "Lets build something great together!");
	 }

}
