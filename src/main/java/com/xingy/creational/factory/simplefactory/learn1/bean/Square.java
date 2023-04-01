package com.xingy.creational.factory.simplefactory.learn1.bean;

import com.xingy.creational.factory.simplefactory.learn1.interfaces.Shape;

/**
 * @author xinguiyuan
 * @className Square
 * @date 2019/06/01 14:47
 * @description 正方形
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画正方形！！！");
    }
}
