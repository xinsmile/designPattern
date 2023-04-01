package com.xingy.creational.factory.abstractfactory.learn2.car.factory;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.AudiCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business.AudiBusinessCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business.BenzBusinessCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business.BmwBusinessCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.factory.BusinessFactory
 * @date 2019/06/01 22:18
 * @description 商务车具体工厂
 */
public class BusinessCarFactory extends AbstractFactory  {

    @Override
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzBusinessCar();
    }

    @Override
    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwBusinessCar();
    }

    @Override
    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiBusinessCar();
    }
}
