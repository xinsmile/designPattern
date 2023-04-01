package com.xingy.structural.composite.learn2;

import lombok.AllArgsConstructor;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn2.TextFile
 * @date 2019/06/24 22:40
 * @description 文本文件类：叶子构件
 */
@AllArgsConstructor
public class TextFile extends AbstractFile {

    private String name;

    @Override
    protected void killVirus() {
        //模拟杀毒
        System.out.println("---------对文本文件'" + name + "'进行杀毒");
    }
}
