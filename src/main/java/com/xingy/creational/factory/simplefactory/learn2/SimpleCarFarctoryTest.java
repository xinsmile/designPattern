package com.xingy.creational.factory.simplefactory.learn2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.simplefactory.learn2.SimpleCarFarctory
 * @date 2019/06/01 16:51
 * @description 简单工厂测试
 */



public class SimpleCarFarctoryTest {
    public static void main(String[] args){
        Bmw bmw = (Bmw)SimpleFactocy.createCar("bmw");
        bmw.setName("bmw");
        bmw.drive();

        Benz benz = (Benz)SimpleFactocy.createCar("benz");
        benz.setName("benz");
        benz.drive();
    }
}

//抽象产品
@Getter
@Setter
abstract class Car {
    private String name;

    public abstract void drive();

}

//具体产品
class Benz extends Car {

    @Override
    public void drive() {
        System.out.println(this.getName() + "------go----------------");
    }
}

//具体产品
class Bmw extends Car {

    @Override
    public void drive() {
        System.out.println(super.getName() + "------go----------------");
    }
}

class SimpleFactocy{
    public static Car createCar(String type) {
        Car car = null;
        if ("Benz".equalsIgnoreCase(type)) {
            car = new Benz();
        } else if ("Bmw".equalsIgnoreCase(type)) {
            car = new Bmw();
        }
        return car;
    }
}
