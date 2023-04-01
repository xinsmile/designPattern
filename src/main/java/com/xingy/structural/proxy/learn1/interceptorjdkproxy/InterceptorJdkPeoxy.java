package com.xingy.structural.proxy.learn1.interceptorjdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkPeoxy implements InvocationHandler {

	private Object target = null;//真实对象
	private String interceptorClass = null;//拦截器全限定名
	
	public InterceptorJdkPeoxy(Object target, String interceptorClass) {
		this.target = target;
		this.interceptorClass = interceptorClass;
	}
	
	public static Object bind(Object target, String interceptorClass) {
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InterceptorJdkPeoxy(target, interceptorClass));
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (interceptorClass == null) {
			return method.invoke(proxy, args);
		}
		Object result = null;
		
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
		
		//调用前置方法
		if (interceptor.before(proxy, target, method, args)) {
			// 反射原有对象方法
			result = method.invoke(proxy, args);
		} else {//返回false执行around方法
			interceptor.around(proxy, target, method, args);
		}
		//调用后置方法
		interceptor.after(proxy, target, method, args);
		
		return result;
	}

}
