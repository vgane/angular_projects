package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	@Id
	private int foodId;
	
	private String dishName;
	private String foodDescription;
	private int amountofServings;
	private int pricePerServing;
	public int getFoodId() {
		return foodId;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", dishName=" + dishName + ", foodDescription=" + foodDescription
				+ ", amountofServings=" + amountofServings + ", pricePerServing=" + pricePerServing + "]";
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getFoodDescription() {
		return foodDescription;
	}
	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	public int getAmountofServings() {
		return amountofServings;
	}
	public void setAmountofServings(int amountofServings) {
		this.amountofServings = amountofServings;
	}
	public int getPricePerServing() {
		return pricePerServing;
	}
	public void setPricePerServing(int pricePerServing) {
		this.pricePerServing = pricePerServing;
	}
}
