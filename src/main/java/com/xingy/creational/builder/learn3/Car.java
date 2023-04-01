package com.xingy.creational.builder.learn3;

import com.xingy.creational.builder.learn3.product.CarBody;
import com.xingy.creational.builder.learn3.product.Chassis;
import com.xingy.creational.builder.learn3.product.Engines;
import com.xingy.creational.builder.learn3.product.Equipment;
import lombok.Data;
import lombok.ToString;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.Car
 * @date 2019/06/02 21:09
 * @description 产品角色类
 */
@Data
@ToString
public class Car {
    //汽车一般由发动机、底盘、车身和电气设备
    // Cars are generally made up of engines, chassis, body and electrical equipment
    private Engines engines;
    private Chassis chassis;
    private CarBody carbody;
    private Equipment equipment;
}
