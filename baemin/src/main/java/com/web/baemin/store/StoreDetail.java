package com.web.baemin.store;

import com.web.baemin.vo.Store;

public class StoreDetail {
	
	private Store storeInfo;
	
	public StoreDetail() {
		
	}
	
	public StoreDetail(Store storeInfo) {
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
		return "StoreDetail [storeInfo=" + storeInfo + "]";
	}
}
