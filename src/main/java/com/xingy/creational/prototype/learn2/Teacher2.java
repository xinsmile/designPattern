package com.xingy.creational.prototype.learn2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn2.Teacher
 * @date 2019/06/04 23:51
 * @description
 */
@Getter
@Setter
@ToString
public class Teacher2 implements Serializable {
    private String name;
    private String course;

    public Teacher2(String name, String course) {
        this.name = name;
        this.course = course;
    }

}
