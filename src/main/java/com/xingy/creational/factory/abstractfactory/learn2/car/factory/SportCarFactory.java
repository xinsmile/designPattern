package com.xingy.creational.factory.abstractfactory.learn2.car.factory;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.AudiCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport.AudiSportCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport.BenzSportCar;
import com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport.BmwSportCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.factory.BusinessFactory
 * @date 2019/06/01 22:18
 * @description 跑车具体工厂
 */
public class SportCarFactory extends AbstractFactory  {

    @Override
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzSportCar();
    }

    @Override
    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwSportCar();
    }

    @Override
    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiSportCar();
    }
}
