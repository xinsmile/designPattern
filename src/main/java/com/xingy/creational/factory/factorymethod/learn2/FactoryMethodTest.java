package com.xingy.creational.factory.factorymethod.learn2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.factory.factorymethod.learn2.FactoryMethodTest
 * @date 2019/06/01 17:27
 * @description 工厂模式测试
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();
        Benz benz = (Benz) carFactory.createCar();
        benz.setName("new benz");
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

abstract class CarFactory {
    public abstract Car createCar();
}

class BenzFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }
}

class BmwFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Bmw();
    }
}
