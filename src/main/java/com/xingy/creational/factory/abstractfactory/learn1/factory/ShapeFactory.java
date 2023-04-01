package com.xingy.creational.factory.abstractfactory.learn1.factory;

import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Color;
import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Shape;
import com.xingy.creational.factory.abstractfactory.learn1.shape.Circle;
import com.xingy.creational.factory.abstractfactory.learn1.shape.Rectangle;
import com.xingy.creational.factory.abstractfactory.learn1.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;		
	}

}
