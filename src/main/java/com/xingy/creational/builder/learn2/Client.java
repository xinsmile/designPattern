package com.xingy.creational.builder.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn2.Client
 * @date 2019/06/02 21:00
 * @description 测试
 */
public class Client {
    public static void main(String[] args)
    {
        AbstractBuilder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
