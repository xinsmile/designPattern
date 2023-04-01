package com.xingy.structural.proxy.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.proxy.learn2.TestStatical
 * @date 2019/06/11 21:52
 * @description 测试静态代理
 */
public class TestStatical {
    public static void main(String[] args){
        ISubject subject = new ProxySubject();
        subject.doAction("play");
    }
}
