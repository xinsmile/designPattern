package com.xingy.creational.builder.learn1;

/**
 * 饮料类型
 * @author Admin
 *
 */
public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
	
}
