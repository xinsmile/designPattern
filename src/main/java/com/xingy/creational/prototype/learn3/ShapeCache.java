package com.xingy.creational.prototype.learn3;

import java.util.Hashtable;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn3.ShapeCache
 * @date 2019/06/05 21:26
 * @description
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
