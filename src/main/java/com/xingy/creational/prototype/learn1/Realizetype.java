package com.xingy.creational.prototype.learn1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.Prototype1
 * @date 2019/05/31 00:17
 * @description 原型模式的克隆分为浅克隆和深克隆，
 * Java 中的 Object 类提供了浅克隆的 clone() 方法，
 * 具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，
 * 这里的 Cloneable 接口就是抽象原型类。
 *
 */
@Getter
@Setter
public class Realizetype implements Cloneable{

    private String name;

    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        obj1.setName("val1");
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1 == obj2?" + (obj1 == obj2) );

        System.out.println("obj1 name:" +obj1.name);
        System.out.println("obj2 name:" +obj2.name);

        obj2.setName("val2");
        System.out.println("obj1 name:" +obj1.name);
        System.out.println("obj2 name:" +obj2.name);

        // 具体原型创建成功！
        // 具体原型复制成功！
        // obj1 == obj2?false
        // obj1 name:val1
        // obj2 name:val1
        // obj1 name:val1
        // obj2 name:val2
    }
}
