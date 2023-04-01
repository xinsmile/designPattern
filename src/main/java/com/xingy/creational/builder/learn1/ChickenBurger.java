package com.xingy.creational.builder.learn1;

/**
 * 鸡肉汉堡
 * @author Admin
 *
 */
public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.0f;
	}

	public String name() {
		return "Chicken Burger";
	}

}
