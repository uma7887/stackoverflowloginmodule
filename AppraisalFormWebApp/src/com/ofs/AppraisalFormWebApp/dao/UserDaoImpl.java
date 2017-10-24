package com.ofs.AppraisalFormWebApp.dao;

import com.ofs.AppraisalFormWebApp.model.User;
import com.ofs.AppraisalFormWebApp.util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();

	@Override
	public User findUserByEmail(String email) {
		hibernateUtil.openCurrentSession();
		
		User user =(User) hibernateUtil.getCurrentSession().createQuery("from User where email='"+email+"' and isActive=1").uniqueResult();
		
		hibernateUtil.closeCurrentSession();
		
		return user;
	}

	@Override
	public String addUser(User user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}
}
