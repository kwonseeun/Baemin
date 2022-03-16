package com.web.baemin.service;

import java.util.List;

import com.web.baemin.dao.FoodOption;
import com.web.baemin.store.StoreDetail;
import com.web.baemin.vo.Store;

public interface StoreService {
	
	List<Store> storeList(int category, int address);
	
	StoreDetail storeDetail(long id);
	
	// 해당 메뉴의 옵션 가져오기
	List<FoodOption> foodOption(int foodId);

	
}
