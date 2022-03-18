package com.web.baemin.vo;

public class OrderDetail {

	private String orderNum;
	private String foodInfoJSON;
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getFoodInfoJSON() {
		return foodInfoJSON;
	}
	public void setFoodInfoJSON(String foodInfoJSON) {
		this.foodInfoJSON = foodInfoJSON;
	}
	@Override
	public String toString() {
		return "OrderDetail [orderNum=" + orderNum + ", foodInfoJSON=" + foodInfoJSON + "]";
	}	
}