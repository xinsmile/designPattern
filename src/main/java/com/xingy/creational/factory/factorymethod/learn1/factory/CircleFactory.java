package com.xingy.creational.factory.factorymethod.learn1.factory;

import com.xingy.creational.factory.factorymethod.learn1.bean.Circle;
import com.xingy.creational.factory.factorymethod.learn1.interfaces.Shape;
import com.xingy.creational.factory.factorymethod.learn1.interfaces.facory.ShapeFactory;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.factorymethod.learn1.factory.CircleFactory
 * @date 2019/06/01 15:16
 * @description 创建形状圆的工厂
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape makeShape() {
        return new Circle();
    }
}
