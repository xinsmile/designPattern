package com.xingy.creational.factory.simplefactory.learn1.bean;

import com.xingy.creational.factory.simplefactory.learn1.interfaces.Shape;

/**
 * @author xinguiyuan
 * @className Rectangle
 * @date 2019/06/01 14:46
 * @description 长方形
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画长方形！！！");
    }
}
