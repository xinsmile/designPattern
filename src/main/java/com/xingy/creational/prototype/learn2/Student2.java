package com.xingy.creational.prototype.learn2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn2.Student
 * @date 2019/06/04 23:50
 * @description 使用Serializable实现深克隆
 */
@Getter
@Setter
@ToString
public class Student2 implements Serializable {
    private String name;
    private int age;
    private Teacher2 teacher;

    public Student2(String name, int age, Teacher2 teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    public Student2 serializableClone() throws IOException, ClassNotFoundException {
        Student2 clone;
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        clone = (Student2) oi.readObject();
        return clone;
    }
}
