package com.xingy.creational.factory.abstractfactory.learn2.car.concrete.sport;

import com.xingy.creational.factory.abstractfactory.learn2.car.abstracts.AudiCar;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.specific.business.AudiSportCar
 * @date 2019/06/01 19:07
 * @description 奥迪商务车
 */
public class AudiSportCar extends AudiCar {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------AudiSportCar go----------------");
    }
}
