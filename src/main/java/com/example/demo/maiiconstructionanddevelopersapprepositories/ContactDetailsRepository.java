package com.example.demo.maiiconstructionanddevelopersapprepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.maiiconstructionanddevelopersappentities.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {

}
