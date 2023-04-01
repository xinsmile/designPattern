package com.xingy.creational.factory.factorymethod.learn1.factory;

import com.xingy.creational.factory.factorymethod.learn1.bean.Square;
import com.xingy.creational.factory.factorymethod.learn1.interfaces.Shape;
import com.xingy.creational.factory.factorymethod.learn1.interfaces.facory.ShapeFactory;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.factorymethod.learn1.factory.SquareFactory
 * @date 2019/06/01 15:20
 * @description 创建正方形的工厂
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape makeShape() {
        return new Square();
    }
}
