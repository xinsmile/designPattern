package com.xingy.structural.proxy.learn1;

import com.xingy.structural.proxy.learn1.cglibproxy.CglibProxyExample;
import com.xingy.structural.proxy.learn1.cglibproxy.ReflectServiceImpl;
import com.xingy.structural.proxy.learn1.interceptorjdkproxy.InterceptorJdkPeoxy;
import com.xingy.structural.proxy.learn1.jdkproxy.HelloWorld;
import com.xingy.structural.proxy.learn1.jdkproxy.HelloWorldImpl;
import com.xingy.structural.proxy.learn1.jdkproxy.JdkPeoxyExample;

/**
 * 代理模式 测试
 */
public class TestProxy {
	
	public static void main(String[] args) {
		// testJdkProxy();
		testCGLIBProxy();
// 		testInterceptorJdkProxy();
	}
	
	public static void testJdkProxy() {
		JdkPeoxyExample jdk = new JdkPeoxyExample();
		
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		
		proxy.sayHelloWorld();
//		proxy.sayHello("张三");
	}
	
	public static void testCGLIBProxy() {
		CglibProxyExample cpe = new CglibProxyExample();
		
		ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
		
		obj.sayHello("张三");
		
	}
	
	public static void testInterceptorJdkProxy() {
		HelloWorld proxy = (HelloWorld) InterceptorJdkPeoxy.bind(new HelloWorldImpl(),
				"com.xingy.interceptor.MyInterceptor");
		proxy.sayHelloWorld();	
	}
}
