package com.xingy.creational.factory.abstractfactory.learn2.car.concrete.business;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.specific.business.BenzBusinessCar
 * @date 2019/06/01 19:07
 * @description 奔驰商务车
 */
public class BenzBusinessCar extends BenzCar {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------BenzBusinessCar go----------------");
    }
}
