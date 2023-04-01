package com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.specific.business.BmwSportCar
 * @date 2019/06/01 19:07
 * @description 宝马跑车
 */
public class BmwSportCar extends BmwCar {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------BmwSportCar go----------------");
    }
}
