package com.xingy.creational.builder.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.AbstarctBuilder
 * @date 2019/06/02 21:22
 * @description 抽象建造者
 */
public abstract class AbstarctBuilder {
    protected Car car = new Car();
    public abstract void setEngines();
    public abstract void setChassis() ;
    public abstract void setCarBody();
    public abstract void setEquipment();
}
