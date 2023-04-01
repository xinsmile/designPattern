package com.xingy.creational.factory.factorymethod.learn1;

import com.xingy.creational.factory.factorymethod.learn1.bean.Circle;
import com.xingy.creational.factory.factorymethod.learn1.factory.CircleFactory;
import com.xingy.creational.factory.factorymethod.learn1.interfaces.facory.ShapeFactory;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.factorymethod.learn1.Client
 * @date 2019/06/01 15:22
 * @description 测试类
 */
public class Client {
    public static void main(String[] args){
        ShapeFactory circleFactory = new CircleFactory();
        Circle circle = (Circle) circleFactory.makeShape();
        circle.draw();
    }
}
