package com.xingy.creational.builder.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.Client
 * @date 2019/06/03 23:16
 * @description 测试
 */
public class Client {
    public static void main(String[] args){
        Director director = new Director(new BenzConcreateBuilder());
        Car car = director.createCar();

        System.out.println("name: " + car.getEngines().getName()
            + ",type: " + car.getEngines().getType());

        System.out.println("====================");

        Director director1 = new Director(new BmwConcreateBuilder());
        Car car1 = director1.createCar();
        System.out.println("name: " + car1.getEngines().getName()
                + ",type: " + car1.getEngines().getType());
    }
}
