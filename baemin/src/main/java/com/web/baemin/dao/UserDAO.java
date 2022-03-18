package com.web.baemin.dao;

import com.web.baemin.vo.Join;

public interface UserDAO {

	void join(Join join) throws Exception;
	
	int overlapCheck(String value, String valueType);

}
