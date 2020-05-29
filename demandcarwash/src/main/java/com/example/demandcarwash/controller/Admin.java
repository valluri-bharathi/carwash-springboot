package com.example.demandcarwash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demandcarwash.entity.AdminDetails;
import com.example.demandcarwash.exception.ProgramException;
import com.example.demandcarwash.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/admin")
public class Admin {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public AdminDetails checkUser(@RequestBody AdminDetails admin) throws ProgramException {
		String uName = admin.getUserName();

		AdminDetails result;
		try {
			
			result=adminService.login(admin);
		} catch (Exception e) {
			throw new ProgramException("Error Occurred");
			
		}
		return result;
	}
}