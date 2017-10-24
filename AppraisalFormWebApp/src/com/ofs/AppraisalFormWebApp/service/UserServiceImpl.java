package com.ofs.AppraisalFormWebApp.service;

import com.ofs.AppraisalFormWebApp.dao.UserDao;
import com.ofs.AppraisalFormWebApp.dao.UserDaoImpl;
import com.ofs.AppraisalFormWebApp.model.User;

public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public User findUserByEmail(String email) {
	
		return userDao.findUserByEmail(email);
	}

	@Override
	public String addUser(User user) {
		
		return userDao.addUser(user);
	}
}
