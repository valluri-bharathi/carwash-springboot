package com.example.demandcarwash.dao;

import com.example.demandcarwash.entity.AdminDetails;
import com.example.demandcarwash.exception.ProgramException;

public interface AdminDao {
	public AdminDetails findUser(AdminDetails admin) throws ProgramException;

}
