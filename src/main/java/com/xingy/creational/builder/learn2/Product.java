package com.xingy.creational.builder.learn2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn2.Product
 * @date 2019/06/02 20:46
 * @description 产品角色：包含多个组成部件的复杂对象。
 */
@Getter
@Setter
public class Product {
    private String partA;
    private String partB;
    private String partC;
    public void show()
    {
        //显示产品的特性
        this.toString();
    }
}
