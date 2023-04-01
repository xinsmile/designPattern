package com.xingy.creational.builder.learn3.product;

import lombok.ToString;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.product.BmwEngines
 * @date 2019/06/03 22:52
 * @description 宝马发动机
 */
@ToString
public class BmwEngines extends Engines {
    public BmwEngines(String name) {
        super.setName(name);
        super.setType("bmw");
    }
}
