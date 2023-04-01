package com.xingy.creational.builder.learn3.product;

import lombok.ToString;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.product.BenzEngines
 * @date 2019/06/03 22:51
 * @description 奔驰发动机
 */
@ToString
public class BenzEngines extends Engines {
    public BenzEngines(String name) {
        super.setType("Benz");
        super.setName(name);
    }
}
