package com.web.baemin.service;

import java.util.List;

import com.web.baemin.store.StoreDetail;
import com.web.baemin.vo.Store;

public interface StoreService {
	List<Store> storeList(int category, int address);
	
	StoreDetail storeDetail(long id);
	
}
