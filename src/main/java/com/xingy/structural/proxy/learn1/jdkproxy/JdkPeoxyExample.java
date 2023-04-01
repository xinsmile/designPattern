package com.xingy.structural.proxy.learn1.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkPeoxyExample implements InvocationHandler {

	//真实对象
	private Object target = null;
	
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("进入代理逻辑方法");
		
		System.out.println("在调度真实对象之前的服务");
//		System.out.println(this);
//		System.out.println(JdkPeoxyExample.this);
		Object obj = method.invoke(target, args);
		
		System.out.println("在调度真实对象之后的服务");
		
		return obj;
	}
}
