package com.example.demo.model;

public class Ingredients 
{
	int cheese;
	int salad;
	int bacon;
	@Override
	public String toString() {
		return "Ingredients [cheese=" + cheese + ", salad=" + salad + ", bacon=" + bacon + "]";
	}
	public int getCheese() {
		return cheese;
	}
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	public int getSalad() {
		return salad;
	}
	public void setSalad(int salad) {
		this.salad = salad;
	}
	public int getBacon() {
		return bacon;
	}
	public void setBacon(int bacon) {
		this.bacon = bacon;
	}

}
