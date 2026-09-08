package com.example.demo.maiiconstructionanddevelopersapprepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {

}
