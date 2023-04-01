package com.xingy.creational.prototype.learn3;

/**
 * @author xinguiyuan
 * @className com.xingy.creational.prototype.learn3.Shape
 * @date 2019/06/05 21:20
 * @description
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
