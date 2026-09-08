package com.example.demo.maiiconstructionanddevelopersapprepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.maiiconstructionanddevelopersappentities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
