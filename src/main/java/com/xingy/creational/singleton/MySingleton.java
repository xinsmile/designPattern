package com.xingy.creational.singleton;

/**
 * 饿汉式
 * @author Admin
 *
 */
public class MySingleton {
	
	/*//方法一
	private static MySingleton instance = new MySingleton();
	
	private MySingleton(){};
	
	public static MySingleton getInstance () {
		return instance;
	}*/
	
	//方法二 IODH
	private static class singletonHolder {
		private static final MySingleton singleton = new MySingleton();
	}
	
	public static MySingleton getInstance() {
		return singletonHolder.singleton;
	}
}
