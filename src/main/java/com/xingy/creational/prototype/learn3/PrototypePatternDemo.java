package com.xingy.creational.prototype.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn3.PrototypePatternDemo
 * @date 2019/06/05 21:45
 * @description
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());

        Shape cloneShape1 = ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape2.getType());
    }
}
