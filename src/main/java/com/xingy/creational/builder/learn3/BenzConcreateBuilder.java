package com.xingy.creational.builder.learn3;

import com.xingy.creational.builder.learn3.product.*;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.builder.learn3.ConcreateBuilder
 * @date 2019/06/02 21:27
 * @description
 */
public class BenzConcreateBuilder extends AbstarctBuilder {

    @Override
    public void setEngines() {
        BenzEngines engines = new BenzEngines("奔驰");
        car.setEngines(engines);
    }

    @Override
    public void setChassis() {
        Chassis chassis = new Chassis();
        car.setChassis(chassis);
    }

    @Override
    public void setCarBody() {
        CarBody carBody = new CarBody();
        car.setCarbody(carBody);
    }

    @Override
    public void setEquipment() {
        Equipment equipment = new Equipment();
        car.setEquipment(equipment);
    }
}
