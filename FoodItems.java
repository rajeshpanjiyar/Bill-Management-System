package com.billmanagement;

public class FoodItems {
	private int sn;
	private String dish;
	private int price;
	
	public FoodItems() {
		
	}
	
	public FoodItems(int sn,String dish,int price) {
		this.sn=sn;
		this.dish=dish;
		this.price=price;
	}
	
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
