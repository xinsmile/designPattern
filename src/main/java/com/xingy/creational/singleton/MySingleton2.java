package com.xingy.creational.singleton;

/**
 * 懒汉式线程不安全
 * @author Admin
 *
 */
public class MySingleton2 {
	
	private static MySingleton2 instance = null;
	
	private MySingleton2(){};
	
	public static MySingleton2 getInstance () throws InterruptedException {
		if (instance != null) {
			
		} else {
			//创建实例之前可能会有一些准备性的耗时工作 
			Thread.sleep(300); 
			instance = new MySingleton2();
		}
		return instance;
	}
	
}
