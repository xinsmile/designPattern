package com.xingy.creational.prototype.learn2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn2.Teacher
 * @date 2019/06/04 23:51
 * @description
 */
@Getter
@Setter
@ToString
public class Teacher implements Cloneable {
    private String name;
    private String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // 用于实现Student的深克隆（深复制）
    public Teacher clone() {

        Teacher clone = null;
        try {
            clone = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
