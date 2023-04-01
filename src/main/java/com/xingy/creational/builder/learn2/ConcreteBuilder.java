package com.xingy.creational.builder.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn2.ConcreteBuilder
 * @date 2019/06/02 20:53
 * @description 具体建造者：实现了抽象建造者接口。
 */
public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public void setPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void setPartB() {
        product.setPartA("建造 PartB");
    }

    @Override
    public void setPartC() {
        product.setPartA("建造 PartC");
    }
}
