package com.xingy.structural.proxy.learn1.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibProxyExample implements MethodInterceptor {

	/**
	 * 
	 * @param cls
	 * @return Class 类的CGLIB 代理对象
	 */
	public Object getProxy(Class cls) {
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(cls);
		
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.err.println("调用真实对象前");
		
		Object result = methodProxy.invokeSuper(proxy, args);
		
		System.out.println("调用真实对象后");
		return result;
	}

}
