/**   
 * Copyright © 2018 
 * 
 * @Package: com.xingy.factory.simplefactory
 * @author: Xingy   
 * @date: 2018年8月25日 下午4:48:40 
 */
package com.xingy.creational.factory.simplefactory.learn1.factory;


import com.xingy.creational.factory.simplefactory.learn1.interfaces.Shape;

/**
 * @ClassName: ReflectSimpleFactory
 * @Description: TODO  利用反射解决简单工厂每次增加新了产品类都要修改产品工厂的弊端
 * @author: Xingy
 * @date: 2018年8月25日 下午4:48:40
 *
 * 这种方式的虽然符合了 开放-关闭原则 ，但是每一次传入的都是产品类的全部路径，这样比较麻烦。
 * 如果需要改善的话可以通过 反射+配置文件 的形式来改善，这种方式使用的也是比较多的。
 */
public class ReflectShapeFactory {
	public static Shape makeShape(Class<? extends Shape> clazz) {
		Shape shape = null;
		try {
			shape = (Shape) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("不支持抽象类或接口");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("权限不足，不能访问私有对象");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("该类不存在");
			e.printStackTrace();
		}
		return shape;
	}
}
