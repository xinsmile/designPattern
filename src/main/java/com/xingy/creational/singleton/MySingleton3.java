package com.xingy.creational.singleton;

/**
 * 
 * 懒汉式线程安全
 * @author Admin
 *
 */
public class MySingleton3 {
//	private volatile static MySingleton3 instance = null; 使用 double check 要用volatile
	
	private static MySingleton3 instance = null;

	private MySingleton3() {
	};

	
	//1、方法中声明synchronized关键字
	public synchronized static MySingleton3 getInstance2() throws InterruptedException {
		if (instance != null) {
			
		} else {
			// 创建实例之前可能会有一些准备性的耗时工作
			Thread.sleep(300);
			instance = new MySingleton3();
		}
		return instance;
	}
	
	//2、同步代码块实现
	public static MySingleton3 getInstance() throws InterruptedException {
		synchronized (MySingleton3.class) {
			if (instance != null) {
				
			} else {
				// 创建实例之前可能会有一些准备性的耗时工作
				Thread.sleep(300);
				instance = new MySingleton3();
			}
		}
		return instance;
	}
	
	//（3）、 针对某些重要的代码来进行单独的同步（可能非线程安全）
	
	public static MySingleton3 getInstance3() throws InterruptedException {
		if (instance != null) {
			
		} else {
			// 创建实例之前可能会有一些准备性的耗时工作
			Thread.sleep(300);
			synchronized (MySingleton3.class) {
				instance = new MySingleton3();
			}
		}
		return instance;
	}
	
	//（4）、 Double Check Locking 双检查锁机制（推荐）
	public static MySingleton3 getInstance4() throws InterruptedException {
		if (instance != null) {
			
		} else {
			// 创建实例之前可能会有一些准备性的耗时工作
			Thread.sleep(300);
			synchronized (MySingleton3.class) {
				if (instance == null) {
					instance = new MySingleton3();
				}
			}
		}
		return instance;
	}
	
}
