package com.xingy.structural.composite.learn2;

import lombok.AllArgsConstructor;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn2.VideoFile
 * @date 2019/06/24 22:40
 * @description 视频文件类：叶子构件
 */
@AllArgsConstructor
public class VideoFile extends AbstractFile {

    private String name;

    @Override
    protected void killVirus() {
        //模拟杀毒
        System.out.println("---------对视频文件'" + name + "'进行杀毒");
    }
}
