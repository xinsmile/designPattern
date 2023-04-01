package com.xingy.creational.builder.learn1;

/**
 * 可口可乐
 * @author Admin
 *
 */
public class Coke extends  ColdDrink{

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

	
}
