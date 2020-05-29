package com.example.demandcarwash.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demandcarwash.entity.AdminDetails;
import com.example.demandcarwash.exception.ProgramException;
@Repository

public class AdminDaoImpl implements AdminDao{
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private MongoOperations mongoOperation;
	

	@Override
	public AdminDetails findUser(AdminDetails admin) throws ProgramException {
			Query query = new Query();
			Query query1 = new Query();
			String uName = admin.getUserName();
			String pwd = admin.getPassword();
			try {
			
				
				query = query.addCriteria(Criteria.where("userName").is(uName).andOperator(Criteria.where("password").is(pwd)));
				query1=query1.addCriteria(Criteria.where("userName").is(uName));
				boolean dataExists = mongoTemplate.exists(query, "admin");
				if (dataExists) {
					return mongoTemplate.findOne(query1, AdminDetails.class);
				}
			} 
			catch (Exception e) {
				throw new ProgramException("reposit error");
			}
			return null;
	}
}

		