package com.xingy.creational.factory.abstractfactory.learn1.factory;

import com.xingy.creational.factory.abstractfactory.learn1.color.Blue;
import com.xingy.creational.factory.abstractfactory.learn1.color.Green;
import com.xingy.creational.factory.abstractfactory.learn1.color.Red;
import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Color;
import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
