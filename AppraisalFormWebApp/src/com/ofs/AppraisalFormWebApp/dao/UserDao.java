package com.ofs.AppraisalFormWebApp.dao;


import com.ofs.AppraisalFormWebApp.model.User;

public interface UserDao {
	
	public User findUserByEmail(String email);
	public String addUser(User user);
}
