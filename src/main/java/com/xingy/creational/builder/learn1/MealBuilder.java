package com.xingy.creational.builder.learn1;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @author Admin
 *
 */
public class MealBuilder {
	
	public Meal prepareVegMeal() {
	    Meal meal = new Meal();
	    meal.addItem(new VegBurger());
	    meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareChickenMeal() {
	    Meal meal = new Meal();
	    meal.addItem(new ChickenBurger());
	    meal.addItem(new Pepsi());
		return meal;
	}
}
