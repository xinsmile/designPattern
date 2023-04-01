package com.xingy.creational.prototype.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn3.Rectangle
 * @date 2019/06/05 21:23
 * @description
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
