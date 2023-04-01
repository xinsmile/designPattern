package com.xingy.creational.factory.abstractfactory.learn2.car.abstracts;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.absctract.Car
 * @date 2019/06/01 19:01
 * @description 奔驰抽象类  产品抽象（Bmw和Audi同理）
 */
@Getter
@Setter
public abstract class BenzCar {
    private String name;

    public abstract void drive();
}
