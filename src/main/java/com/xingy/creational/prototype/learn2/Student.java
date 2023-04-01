package com.xingy.creational.prototype.learn2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn2.Student
 * @date 2019/06/04 23:50
 * @description
 */
@Getter
@Setter
@ToString
public class Student implements Cloneable {
    private String name;
    private int age;
    private Teacher teacher;

    public Student(String name, int age, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    //浅克隆
    public Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    //深克隆（深复制）
    public Student deepClone() {
        Student student = null;
        try {
            student = (Student) super.clone();
            // 引用对象没有实现 Cloneable 接口
            // Teacher teacher = new Teacher(this.teacher.getName(),
            //         this.teacher.getCourse());

            // 引用对象 实现 Cloneable 接口
            Teacher teacher = this.teacher.clone();
            student.setTeacher(teacher);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

}
