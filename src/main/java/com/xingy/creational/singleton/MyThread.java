package com.xingy.creational.singleton;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
//		System.out.println(MySingleton.getInstance().hashCode());
		try {
			System.out.println(MySingleton2.getInstance().hashCode());
//			System.out.println(MySingleton3.getInstance2().hashCode());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		testMySingleton();
		testMySingleton2();
//		long beginTime = System.currentTimeMillis();
//		testMySingleton3();
//		long endTime = System.currentTimeMillis();
//		System.out.println("消耗时间：" + (endTime-beginTime + ""));
		//getInstance()  消耗时间：14
		//getInstance2()  消耗时间：11
		//getInstance3()  消耗时间：10 
		//getInstance4()  消耗时间：8
	}

	private static void testMySingleton() {
		createThread(10);
	}
	
	private static void testMySingleton2() {
		createThread(10);
	}

	private static void testMySingleton3() {
		createThread(100);
	}

	private static void createThread(int num) {
		if (num <= 0) {
			System.out.println("num:" + num + ",num要大于0");
		}
		MyThread[] mts = new MyThread[num];
		for (int i = 0; i < mts.length; i++) {
			mts[i] = new MyThread();
		}

		for (int j = 0; j < mts.length; j++) {
			mts[j].start();
		}
	}
}
