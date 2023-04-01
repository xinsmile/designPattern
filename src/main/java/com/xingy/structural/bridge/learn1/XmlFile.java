package com.xingy.structural.bridge.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.bridge.learn1.TxtFile
 * @date 2019/06/23 16:48
 * @description
 */
public class XmlFile extends File {

    @Override
    public void createFile(String fileName) {
        database.getData();
        System.out.println(fileName + ",格式为Xml");
    }
}
