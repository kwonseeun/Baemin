package com.web.baemin.vo;

public class Store {
	
	private long id;
	private int category;
	private String storeName;
	private int storeAddress1;
	private String storeAddress2;
	private String storeAddress3;
	private String storePhone;
	
	private String storeImg;
	private String storeThumb;
	private int openingTime;
	private int closingTime;
	private int minDelevery;
	private int deleveryTime;
	private int deleveryTip;
	private String storeDes;
	
	public Store(int category, String storeName, int storeAddress1, String storeAddress2,
			String storeAddress3, String storePhone) {
		this.storeName = storeName;
		this.storeAddress1 = storeAddress1;
		this.storeAddress2 = storeAddress2;
		this.storeAddress3 = storeAddress3;
		this.storePhone = storePhone;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public int getStoreAddress1() {
		return storeAddress1;
	}
	public void setStoreAddress1(int storeAddress1) {
		this.storeAddress1 = storeAddress1;
	}
	public String getStoreAddress2() {
		return storeAddress2;
	}
	public void setStoreAddress2(String storeAddress2) {
		this.storeAddress2 = storeAddress2;
	}
	public String getStoreAddress3() {
		return storeAddress3;
	}
	public void setStoreAddress3(String storeAddress3) {
		this.storeAddress3 = storeAddress3;
	}
	public String getStorePhone() {
		return storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
	public String getStoreImg() {
		return storeImg;
	}
	public void setStoreImg(String storeImg) {
		this.storeImg = storeImg;
	}
	public String getStoreThumb() {
		return storeThumb;
	}
	public void setStoreThumb(String storeThumb) {
		this.storeThumb = storeThumb;
	}
	public int getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(int openingTime) {
		this.openingTime = openingTime;
	}
	public int getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(int closingTime) {
		this.closingTime = closingTime;
	}
	public int getMinDelevery() {
		return minDelevery;
	}
	public void setMinDelevery(int minDelevery) {
		this.minDelevery = minDelevery;
	}
	public int getDeleveryTime() {
		return deleveryTime;
	}
	public void setDeleveryTime(int deleveryTime) {
		this.deleveryTime = deleveryTime;
	}
	public int getDeleveryTip() {
		return deleveryTip;
	}
	public void setDeleveryTip(int deleveryTip) {
		this.deleveryTip = deleveryTip;
	}
	public String getStoreDes() {
		return storeDes;
	}
	public void setStoreDes(String storeDes) {
		this.storeDes = storeDes;
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", category=" + category + ", storeName=" + storeName + ", storeAddress1="
				+ storeAddress1 + ", storeAddress2=" + storeAddress2 + ", storeAddress3=" + storeAddress3
				+ ", storePhone=" + storePhone + ", storeImg=" + storeImg + ", storeThumb=" + storeThumb
				+ ", openingTime=" + openingTime + ", closingTime=" + closingTime + ", minDelevery=" + minDelevery
				+ ", deleveryTime=" + deleveryTime + ", deleveryTip=" + deleveryTip + ", storeDes=" + storeDes + "]";
	}
}
