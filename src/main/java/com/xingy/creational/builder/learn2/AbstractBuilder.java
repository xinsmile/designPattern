package com.xingy.creational.builder.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn2.Builder
 * @date 2019/06/02 20:51
 * @description 抽象建造者：包含创建产品各个子部件的抽象方法。
 */
public abstract class AbstractBuilder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void setPartA();
    public abstract void setPartB();
    public abstract void setPartC();

}
