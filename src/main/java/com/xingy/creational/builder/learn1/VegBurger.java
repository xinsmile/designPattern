package com.xingy.creational.builder.learn1;

/**
 * 素汉堡
 * @author Admin
 *
 */
public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	public String name() {
		return "Veg Burger";
	}

}
