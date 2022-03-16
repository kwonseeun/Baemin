package com.web.baemin.vo;

import java.util.List;

public class CartList {

		private long storeId;
		private String storeName;
		int cartTotal;
		private int deleveryTip;
		
		List<Cart> cart;

		public CartList(long storeId2, String storeName2, int totalPrice, int deleveryTip2, List<Cart> newCart) {
			// TODO Auto-generated constructor stub
		}

		public long getStoreId() {
			return storeId;
		}

		public void setStoreId(long storeId) {
			this.storeId = storeId;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public int getCartTotal() {
			return cartTotal;
		}

		public void setCartTotal(int cartTotal) {
			this.cartTotal = cartTotal;
		}

		public int getDeleveryTip() {
			return deleveryTip;
		}

		public void setDeleveryTip(int deleveryTip) {
			this.deleveryTip = deleveryTip;
		}

		public List<Cart> getCart() {
			return cart;
		}

		public void setCart(List<Cart> cart) {
			this.cart = cart;
		}

		@Override
		public String toString() {
			return "CartList [storeId=" + storeId + ", storeName=" + storeName + ", cartTotal=" + cartTotal
					+ ", deleveryTip=" + deleveryTip + ", cart=" + cart + "]";
		}
	}