package com.xingy.creational.factory.simplefactory.learn1;

import com.xingy.creational.factory.simplefactory.learn1.bean.Circle;
import com.xingy.creational.factory.simplefactory.learn1.factory.ReflectShapeFactory;

/**
 * @author xinguiyuan
 * @className Client
 * @date 2019/06/01 14:50
 * @description 测试类
 */
public class Client {
    public static void main(String[] args){
        Circle circle = (Circle) ReflectShapeFactory.makeShape(Circle.class);
        circle.draw();
    }
}
