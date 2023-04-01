package com.xingy.creational.singleton;

/**
 * 〈一句话功能简述〉<br>
 * 〈静态内部类单例模式〉
 * 利用了classloder的机制来保证初始化instance时只有一个线程
 * 延时加载
 *
 * @author xinguiyuan
 * @create 2019-05-27 22:19
 * @description 静态内部类单例模式
 * @since 1.0.0
 */
public class MySingleton5 {
    private static class singletonHolder{
        private static final MySingleton5 INSTANCE = new MySingleton5();
    }
    private MySingleton5(){}

    public static MySingleton5 getInstance() {
        return singletonHolder.INSTANCE;
    }
}
