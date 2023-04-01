package com.xingy.creational.builder.learn1;

/**
 * 汉堡类型
 * @author Admin
 *
 */
public abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();
	
}
