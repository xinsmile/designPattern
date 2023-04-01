package com.xingy.structural.bridge.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.bridge.learn1.File
 * @date 2019/06/23 16:49
 * @description
 */
//抽象文件类：抽象类
public abstract class File {
    protected Database database;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public abstract void createFile(String fileName);
}
