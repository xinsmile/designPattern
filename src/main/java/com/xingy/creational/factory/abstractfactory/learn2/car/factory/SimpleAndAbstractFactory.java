package com.xingy.creational.factory.abstractfactory.learn2.car.factory;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.AudiCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.factory.SimpleAndAbstractFactory
 * @date 2019/06/01 22:36
 * @description 简单工厂通过反射改进抽象工厂及其子工厂
 */
public class SimpleAndAbstractFactory {
    public static BenzCar createBenzCar(Class<? extends BenzCar> clazz) throws Exception {
        return (BenzCar) Class.forName(clazz.getName()).newInstance();
    };

    public static BmwCar createBmwCar(Class<? extends BmwCar> clazz) throws Exception {
        return (BmwCar) Class.forName(clazz.getName()).newInstance();
    };

    public static AudiCar createAudiCar(Class<? extends AudiCar> clazz) throws Exception {
        return (AudiCar) Class.forName(clazz.getName()).newInstance();
    };
}
