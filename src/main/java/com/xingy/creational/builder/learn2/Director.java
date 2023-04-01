package com.xingy.creational.builder.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn2.Director
 * @date 2019/06/02 20:57
 * @description 指挥者：调用建造者中的方法完成复杂对象的创建。
 */
public class Director {
    private AbstractBuilder builder;
    public Director(AbstractBuilder builder){
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.setPartA();
        builder.setPartB();
        builder.setPartC();
        return builder.product;
    }

}
