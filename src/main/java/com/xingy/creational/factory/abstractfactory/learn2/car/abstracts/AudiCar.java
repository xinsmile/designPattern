package com.xingy.creational.factory.abstractfactory.learn2.car.abstracts;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.abstractfactory.learn2.car.absctract.AudiCar
 * @date 2019/06/01 19:01
 * @description 奥迪抽象类  产品抽象（Bmw和Audi同理）
 */
@Getter
@Setter
public abstract class AudiCar {
    private String name;

    public abstract void drive();
}
