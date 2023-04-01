package com.xingy.creational.factory.factorymethod.learn1.bean;

import com.xingy.creational.factory.factorymethod.learn1.interfaces.Shape;

/**
 * @author xinguiyuan
 * @className Circle
 * @date 2019/06/01 14:44
 * @description
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画圆！！！");
    }
}
