package com.xingy.structural.bridge.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.bridge.learn1.JdbcDatabase
 * @date 2019/06/23 16:53
 * @description
 */
//jdbc 获取数据库数据实现类：具体实现类
public class JdbcDatabase implements Database {

    @Override
    public void getData() {
        System.out.println("使用 jdbc 获取数据成功");
    }
}
