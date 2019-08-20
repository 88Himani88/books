package com.example.demo.model;

public class MyOrder 
{
	String orderId;
	Ingredients i=new Ingredients();
	int price;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
