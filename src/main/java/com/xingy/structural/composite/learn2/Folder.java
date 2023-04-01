package com.xingy.structural.composite.learn2;

import java.util.ArrayList;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn2.Folder
 * @date 2019/06/24 22:45
 * @description 文件夹类：容器构件
 */
public class Folder extends AbstractFile{

    private ArrayList<AbstractFile> fileList = null;

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    protected void add(AbstractFile file) {
        if (fileList == null) {
            fileList = new ArrayList<>();
        }
        fileList.add(file);
    }

    @Override
    protected void remove(AbstractFile file) {
        if (fileList != null) {
            fileList.remove(file);
        }
    }

    @Override
    protected AbstractFile getChild(int i) {
        if (fileList != null) {
            if (i >= 0 && i < fileList.size()){
                return fileList.get(i);
            }
        }
        return null;
    }

    @Override
    protected void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");

        if (fileList != null) {
            for (Object obj: fileList) {
                ((AbstractFile) obj).killVirus();
            }
        }



    }
}
