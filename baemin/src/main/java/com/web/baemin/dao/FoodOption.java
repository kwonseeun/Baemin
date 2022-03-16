package com.web.baemin.dao;

public class FoodOption {
	
	private long id;
    private long foodId;
    private String optionName;
    private long optionPrice;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFoodId() {
		return foodId;
	}
	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public long getOptionPrice() {
		return optionPrice;
	}
	public void setOptionPrice(long optionPrice) {
		this.optionPrice = optionPrice;
	}
	@Override
	public String toString() {
		return "FoodOption [id=" + id + ", foodId=" + foodId + ", optionName=" + optionName + ", optionPrice="
				+ optionPrice + "]";
	}
}
