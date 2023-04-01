package com.xingy.creational.singleton;

import java.io.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈单例需要注意的问题〉
 *
 * @author xinguiyuan
 * @create 2019-05-27 22:41
 * @description 单例需要注意的问题
 * 反射可以破坏单例模式，除了反射以外，使用序列化与反序列化也同样会破坏单例。
 * 序列化会通过反射调用无参数的构造方法创建一个新的对象。
 *
 * 单例模式在面对多线程（multithreading)、类装载器（classloaders）和序列化 (serialization)时如何处理这些缺陷。
 * @since 1.0.0
 */
public class MySingleton6 implements Serializable {
    // 1.如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
    // 假定不是远端存取，例如一些servlet容器对每个servlet使用完全不同的类装载器，
    // 这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
    // private static Class getClass(String classname)
    //         throws ClassNotFoundException {
    //     ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    //     if(classLoader == null)
    //         classLoader = MySingleton6.class.getClassLoader();
    //     return (classLoader.loadClass(classname));
    // }


    // hasReadResolveMethod:如果实现了serializable 或者 externalizable接口的类中包含readResolve则返回true
    //
    // invokeReadResolve:通过反射的方式调用要被反序列化的类的readResolve方法。
    //
    // 所以，原理也就清楚了，主要在Singleton中定义readResolve方法，并在该方法中指定要返回的对象的生成策略，就可以防止单例被破坏。
    private volatile static MySingleton6 singleton;
    private MySingleton6 (){}
    public static MySingleton6 getSingleton() {
        if (singleton == null) {
            synchronized (MySingleton6.class) {
                if (singleton == null) {
                    singleton = new MySingleton6();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(MySingleton6.getSingleton());
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        MySingleton6 newInstance = (MySingleton6) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == MySingleton6.getSingleton());
    }
}

