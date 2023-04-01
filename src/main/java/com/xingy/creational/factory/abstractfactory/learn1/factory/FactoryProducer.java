package com.xingy.creational.factory.abstractfactory.learn1.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equals("COLOR")) {
			return new ColorFactory();
		} else if (choice.equals("SHAPE")) {
			return new ShapeFactory();
		}
		
		return null;
	}
}
