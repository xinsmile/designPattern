package com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.BenzCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.specific.sport.BenzSportCar
 * @date 2019/06/01 19:09
 * @description 奔驰跑车
 */
public class BenzSportCar extends BenzCar {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------BenzSportCar go----------------");
    }
}
