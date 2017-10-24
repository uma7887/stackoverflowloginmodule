package com.ofs.AppraisalFormWebApp.service;

import com.ofs.AppraisalFormWebApp.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	public String addUser(User user);
}
