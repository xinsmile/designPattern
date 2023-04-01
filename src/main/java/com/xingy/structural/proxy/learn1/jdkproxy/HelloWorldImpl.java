package com.xingy.structural.proxy.learn1.jdkproxy;

public class HelloWorldImpl implements HelloWorld {

	public void sayHelloWorld() {
		System.out.println("Hello World");
	}

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}
