package com.xingy.creational.factory.abstractfactory.learn2;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.factory.AbstractFactory;
import com.xingy.creational.factory.abstractfactory.learn2.car.factory.BusinessCarFactory;
import com.xingy.creational.factory.abstractfactory.learn2.car.factory.SimpleAndAbstractFactory;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business.BmwBusinessCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.AbstractFactoryTest
 * @date 2019/06/01 17:43
 * @description 抽象工厂模式测试
 */
public class AbstractFactoryTest {
    public static void main(String[] args) throws Exception {
        AbstractFactory factory = new BusinessCarFactory();
        BenzCar benzCar = factory.createBenzCar("benz");
        benzCar.drive();

        BmwBusinessCar car = (BmwBusinessCar) SimpleAndAbstractFactory
                .createBmwCar(BmwBusinessCar.class);
        car.setName("bmw");
        car.drive();
    }
}
