package com.xingy.structural.proxy.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.proxy.learn2.ProxySubject
 * @date 2019/06/11 21:44
 * @description 代理对象类
 */
public class ProxySubject implements ISubject {

    ISubject realSubject;

    public ProxySubject(){
        super();
        this.realSubject = new RealSubject();
    }

    @Override
    public void doAction(String action) {
        preRequest();
        realSubject.doAction(action);
        postRequest();
    }

    private void postRequest() {
        System.out.println("postRequest");

    }

    private void preRequest() {
        System.out.println("preRequest");

    }

}
