package com.web.baemin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.baemin.dao.StoreDAO;
import com.web.baemin.store.StoreDetail;
import com.web.baemin.vo.Store;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreDAO storeDAO;
	
	@Override
	public List<Store> storeList(int category, int address) {
			
		Map<String, Object> map = new HashMap<>();
		map.put("category", category);
		map.put("address1", address);
		
		return storeDAO.storeList(map);
	}

	@Override
	public StoreDetail storeDetail(long storeId) {
		Store storeInfo = storeDAO.storeDetail(storeId); 
		
//		List<Food> foodList = storeDAO.foodList(storeId);
//		List<Review> reviewList = storeDAO.reviewList(storeId);
		
		return new StoreDetail(storeInfo);

	}
}