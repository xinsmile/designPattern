/**   
 * Copyright © 2018 
 * 
 * @Package: com.xingy.factory.simplefactory
 * @author: Xingy   
 * @date: 2018年8月25日 下午4:21:32 
 */

package com.xingy.creational.factory.simplefactory.learn1.factory;

import com.xingy.creational.factory.simplefactory.learn1.bean.Circle;
import com.xingy.creational.factory.simplefactory.learn1.bean.Rectangle;
import com.xingy.creational.factory.simplefactory.learn1.bean.Square;
import com.xingy.creational.factory.simplefactory.learn1.interfaces.Shape;

/**
 * @ClassName: AnimalSimpleFactory 
 * @Description: 简单工厂
 * @author: Xingy
 * @date: 2018年8月25日 下午4:21:32  
 */
public class ShapeSimpleFactory {
	public static Shape makeShape(String type) {
		if ("circle".equalsIgnoreCase(type)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(type)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(type)) {
			return new Square();
		}else {
			System.out.println("type为空或者类型不匹配,type= " + type);
			return null;
		}
	}
}
