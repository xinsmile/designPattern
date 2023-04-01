package com.xingy.structural.proxy.learn1.interceptorjdkproxy;

import java.lang.reflect.Method;

public interface Interceptor {

	boolean before(Object proxy, Object target, Method method, Object[] args);
	
	void around(Object proxy, Object target, Method method, Object[] args);

	void after(Object proxy, Object target, Method method, Object[] args);

}
