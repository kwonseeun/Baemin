package com.web.baemin.store;

import java.util.List;

import com.web.baemin.dao.Food;
import com.web.baemin.vo.Store;

public class StoreDetail {
	
	private Store storeInfo;
	
	private List<Food> foodList;
	
	
	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	public StoreDetail() {
		
	}
	
	
	public StoreDetail(Store storeInfo, List<Food> foodList) {
		this.storeInfo = storeInfo;
	}

	public Store getStoreInfo() {
		return storeInfo;
	}

	public void setStoreInfo(Store storeInfo) {
		this.storeInfo = storeInfo;
	}

	@Override
	public String toString() {
		return "StoreDetail [storeInfo=" + storeInfo + ", foodList=" + foodList + "]";
	}
}
