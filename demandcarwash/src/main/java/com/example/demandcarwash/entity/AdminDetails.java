package com.example.demandcarwash.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
	
	
public class AdminDetails {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}