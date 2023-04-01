package com.xingy.creational.prototype.learn2;

import java.io.IOException;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn2.Test
 * @date 2019/06/04 23:54
 * @description
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client();
        // client.testCloneAble();
        client.testSerializable();
    }

    public void testSerializable() throws IOException, ClassNotFoundException {
        Teacher2 teacher = new Teacher2("王老师", "英语");
        Student2 student1 = new Student2("小明", 11, teacher);

        Student2 student2 = student1.serializableClone();
        student2.setName("小强");
        student2.getTeacher().setName("李老师");

        System.out.println("student1: " + student1.toString());
        System.out.println("student2: " + student2.toString());
        System.out.println(student1.getTeacher() == student2.getTeacher());

        // student1: Student2(name=小明, age=11, teacher=Teacher2(name=王老师, course=英语))
        // student2: Student2(name=小强, age=11, teacher=Teacher2(name=李老师, course=英语))
        // false
    }

    public void testCloneAble() {
        Teacher teacher = new Teacher("王老师", "英语");
        Student student1 = new Student("小明", 11, teacher);

        Student student2 = student1.clone();
        student2.setName("小强");
        student2.getTeacher().setName("李老师");

        Student student3 = student1.deepClone();
        student3.setName("小李");
        student3.getTeacher().setName("张老师");

        System.out.println("student1: " + student1.toString());
        System.out.println("student2: " + student2.toString());
        System.out.println("student3: " + student3.toString());
        System.out.println(student1.getTeacher() == student2.getTeacher());
        System.out.println(student1.getTeacher() == student3.getTeacher());

        // student1: Student(name=小明, age=11, teacher=Teacher(name=李老师, course=英语))
        // 浅复制
        // student2: Student(name=小强, age=11, teacher=Teacher(name=李老师, course=英语))
        // 深复制
        // student3: Student(name=小强, age=11, teacher=Teacher(name=张老师, course=英语))
        // true
        // false
    }
}
