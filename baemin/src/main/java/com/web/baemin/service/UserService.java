package com.web.baemin.service;

import com.web.baemin.vo.Join;

public interface UserService {
	
	void join(Join join) throws Exception;
	
	int overlapCheck(String value, String valueType);

}
