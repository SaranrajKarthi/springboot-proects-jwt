package com.securitySB3.service;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Service;

import com.securitySB3.entity.Register_User;
import com.securitySB3.repo.loginRepo;

@Service
public class UserService {

	@Autowired
	loginRepo loginRepo;
	
	public void saveOrUpdate(Register_User records) {
		loginRepo.save(records);
	}
	public List<Register_User> getAllReglog(String regEmail) {
		List<Register_User> regLogs = new ArrayList<Register_User>();
		loginRepo.findAll().forEach(logs -> regLogs.add(logs));
		return regLogs;
	}
	public Register_User getUserById(int id) {
		return loginRepo.findById(id).get();
	}
	
	public Register_User getUserByUsername(String username) {
        return loginRepo.findByUserName(username);
    }
}
