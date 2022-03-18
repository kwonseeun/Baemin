package com.web.baemin.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.baemin.vo.Join;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSession sql;
	
	public static String nameSpace = "com.web.baemin.dao";
	
	@Override
	public void join(Join join) throws Exception {		
		try {
			sql.insert("user.join", join);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int overlapCheck(String value, String valueType) {
	
		Map<String, String>map = new HashMap<>();
		map.put("value", value);
		map.put("valueType", valueType);
		
		return sql.selectOne("user.overlapCheck", map);
	}
}
