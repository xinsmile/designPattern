package com.xingy.creational.factory.abstractfactory.learn2.car.factory;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.AudiCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.factory.AbstractFactory
 * @date 2019/06/01 22:15
 * @description 抽象工厂
 */
public abstract class AbstractFactory {
    public abstract BenzCar createBenzCar(String car) throws Exception;

    public abstract BmwCar createBmwCar(String car) throws Exception;

    public abstract AudiCar createAudiCar(String car) throws Exception;
}
