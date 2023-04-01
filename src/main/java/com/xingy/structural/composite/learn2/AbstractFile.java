package com.xingy.structural.composite.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn2.AbstractFile
 * @date 2019/06/24 22:28
 * @description 抽象文件类：抽象构件
 */
public abstract class AbstractFile {
    protected void add(AbstractFile file) {
        throw new UnsupportedOperationException("对不起，不支持此方法！");
    }

    protected void remove(AbstractFile file) {
        throw new UnsupportedOperationException("对不起，不支持此方法！");
    }

    protected AbstractFile getChild(int i) {
        throw new UnsupportedOperationException("对不起，不支持此方法！");
    }

    protected abstract void killVirus();
}
