package com.web.baemin.dao;

public class Food {
	
	private long id;
    private long storeId;
    private String foodName;
    private String foodPrice;
    private String foodDec;
    private String foodImg;
    private String foodThumb;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStoreId() {
		return storeId;
	}
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodDec() {
		return foodDec;
	}
	public void setFoodDec(String foodDec) {
		this.foodDec = foodDec;
	}
	public String getFoodImg() {
		return foodImg;
	}
	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}
	public String getFoodThumb() {
		return foodThumb;
	}
	public void setFoodThumb(String foodThumb) {
		this.foodThumb = foodThumb;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", storeId=" + storeId + ", foodName=" + foodName + ", foodPrice=" + foodPrice
				+ ", foodDec=" + foodDec + ", foodImg=" + foodImg + ", foodThumb=" + foodThumb + "]";
	}
}
