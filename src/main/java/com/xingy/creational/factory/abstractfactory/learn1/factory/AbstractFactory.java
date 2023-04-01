package com.xingy.creational.factory.abstractfactory.learn1.factory;

import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Color;
import com.xingy.creational.factory.abstractfactory.learn1.interfaces.Shape;

public abstract class AbstractFactory {
	//颜色
	public abstract Color getColor(String color);
	//现状
	public abstract Shape getShape(String shape);
	//....
} 
