package com.example.demandcarwash.service;

import com.example.demandcarwash.entity.AdminDetails;
import com.example.demandcarwash.exception.ProgramException;

public interface AdminService {
	AdminDetails login(AdminDetails admin) throws ProgramException;

}
