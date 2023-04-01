package com.xingy.creational.builder.learn1;

/**
 * 百事可乐
 * @author Admin
 *
 */
public class Pepsi extends  ColdDrink{

	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 30.5f;
	}

	
}
