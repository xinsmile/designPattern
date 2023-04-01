package com.xingy.structural.composite.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn2.Client
 * @date 2019/06/24 22:57
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args){
        //
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;

        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("111.jpg");
        file2 = new ImageFile("222.jpg");
        file3 = new VideoFile("333.mp4");
        file4 = new TextFile("444.txt");
        file5 = new TextFile("555.txt");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder4.add(file4);
        folder4.add(file5);

        folder1.killVirus();
    }
}
