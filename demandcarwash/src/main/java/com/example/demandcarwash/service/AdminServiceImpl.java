package com.example.demandcarwash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demandcarwash.dao.AdminDao;
import com.example.demandcarwash.entity.AdminDetails;
import com.example.demandcarwash.exception.ProgramException;

@Service
public class AdminServiceImpl implements AdminService{
@Autowired
	
	private AdminDao adminDao;

	@Override
	public AdminDetails login(AdminDetails admin) throws ProgramException {
		
		AdminDetails result = adminDao.findUser(admin);
		if (result==null) {
			throw new ProgramException("error");
		}
		return result;

	}
	}


