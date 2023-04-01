package com.xingy.structural.bridge.learn1;

import com.xingy.structural.XMLUtil;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.bridge.learn1.Client
 * @date 2019/06/23 17:20
 * @description
 */
public class Client {
    public static void main(String[] args){
        File file = (File) XMLUtil.getBean("file", 0);
        Database database = (Database) XMLUtil.getBean("database", 0);
        file.setDatabase(database);
        file.createFile("11111.txt");

        file = (File) XMLUtil.getBean("file", 1);
        database = (Database) XMLUtil.getBean("database", 1);
        file.setDatabase(database);
        file.createFile("11111.xml");
    }
}
