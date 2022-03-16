package com.web.baemin.dao;

import java.util.List;
import java.util.Map;

import com.web.baemin.vo.Store;

public interface StoreDAO {

	List<Store> storeList(Map<String, Object> map);
	 
	Store storeDetail(long storeId);
	
	List<Food> foodList(long storeId);
	
	List<FoodOption> foodOption(int foodId);
}
