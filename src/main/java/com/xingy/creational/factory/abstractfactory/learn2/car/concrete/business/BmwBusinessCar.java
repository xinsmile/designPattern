package com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BmwCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.specific.business.BmwBusinessCar
 * @date 2019/06/01 19:07
 * @description 宝马商务车
 */
public class BmwBusinessCar extends BmwCar {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------BmwBusinessCar go----------------");
    }
}
