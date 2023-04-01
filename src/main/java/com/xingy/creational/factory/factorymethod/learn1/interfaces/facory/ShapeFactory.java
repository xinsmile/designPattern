package com.xingy.creational.factory.factorymethod.learn1.interfaces.facory;

import com.xingy.creational.factory.factorymethod.learn1.interfaces.Shape;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.factorymethod.learn1.interfaces.facory.ShapeFactory
 * @date 2019/06/01 15:02
 * @description 创建形状工厂接口
 */
public interface ShapeFactory {
    Shape makeShape();
}
