package com.example.demo.maiiconstructionanddevelopersappentities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {
	@Id
	private Long id;
    private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


}
