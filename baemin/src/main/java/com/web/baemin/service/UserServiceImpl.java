package com.web.baemin.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.baemin.dao.UserDAO;
import com.web.baemin.vo.Join;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	@Override
	public void join(Join join) {
		userDAO.join(join);
	}

	@Override
	public int overlapCheck(String value, String valueType) {
		return userDAO.overlapCheck(value, valueType);
	}
	

}
