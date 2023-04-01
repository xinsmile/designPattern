package com.xingy.creational.builder.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.Director
 * @date 2019/06/03 23:11
 * @description 指挥者
 */
public class Director {
    private AbstarctBuilder builder;

    public Director(AbstarctBuilder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Car createCar() {
        builder.setEngines();
        builder.setCarBody();
        builder.setChassis();
        builder.setEquipment();
        return builder.car;
    }
}
