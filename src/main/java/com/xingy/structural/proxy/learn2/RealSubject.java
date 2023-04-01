package com.xingy.structural.proxy.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.proxy.learn2.RealSubject
 * @date 2019/06/11 21:43
 * @description 真实对象类
 */
public class RealSubject implements ISubject {

    @Override
    public void doAction(String action) {
        System.out.println("I am RealSubject, do action "+ action);
    }
}
