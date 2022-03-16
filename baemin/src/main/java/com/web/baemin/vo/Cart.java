package com.web.baemin.vo;

import java.util.Arrays;
import java.util.Objects;

public class Cart {
	private long foodId;
	private String foodName;
	private int foodPrice;
	private int amount;
	private int totalPrice;

	private String[] optionName;
	private int[] optionPrice;
	private long[] optionId;

	public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String[] getOptionName() {
		return optionName;
	}

	public void setOptionName(String[] optionName) {
		this.optionName = optionName;
	}

	public int[] getOptionPrice() {
		return optionPrice;
	}

	public void setOptionPrice(int[] optionPrice) {
		this.optionPrice = optionPrice;
	}

	public long[] getOptionId() {
		return optionId;
	}

	public void setOptionId(long[] optionId) {
		this.optionId = optionId;
	}

	@Override
	public String toString() {
		return "Cart [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", amount=" + amount
				+ ", totalPrice=" + totalPrice + ", optionName=" + Arrays.toString(optionName) + ", optionPrice="
				+ Arrays.toString(optionPrice) + ", optionId=" + Arrays.toString(optionId) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(optionId);
		result = prime * result + Arrays.hashCode(optionName);
		result = prime * result + Arrays.hashCode(optionPrice);
		result = prime * result + Objects.hash(foodId, foodName, foodPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return foodId == other.foodId && Objects.equals(foodName, other.foodName) && foodPrice == other.foodPrice
				&& Arrays.equals(optionId, other.optionId) && Arrays.equals(optionName, other.optionName)
				&& Arrays.equals(optionPrice, other.optionPrice);
	}
}