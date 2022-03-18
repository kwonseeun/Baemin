package com.web.baemin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.baemin.dao.UserDAO;
import com.web.baemin.vo.Join;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	@Override
	public void join(Join join) throws Exception { 
		try {
			userDAO.join(join);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int overlapCheck(String value, String valueType) {
		
		return userDAO.overlapCheck(value, valueType);
	}
}
