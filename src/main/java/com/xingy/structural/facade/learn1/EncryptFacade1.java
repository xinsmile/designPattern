package com.xingy.structural.facade.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.facade.learn1.EncryptFacade
 * @date 2019/06/26 23:04
 * @description 加密外观类：外观类
 */
public class EncryptFacade1 {

    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWirter fileWirter;

    public EncryptFacade1() {
        this.fileReader = new FileReader();
        this.cipherMachine = new CipherMachine();
        this.fileWirter = new FileWirter();
    }

    public void fileEncrypt() {
        fileReader.read();
        cipherMachine.encrypt();
        fileWirter.wirter();
    }
}

class FacadeTest1 {
    public static void main(String[] args){
        EncryptFacade1 encryptFacade1 = new EncryptFacade1();

        encryptFacade1.fileEncrypt();
    }
}

//文件读取类：子系统
class FileReader {
    public void read() {
        System.out.println("读取文件");
    }
}

//数据加密类
class CipherMachine {
    public void encrypt() {
        System.out.println("数据加密");
    }
}

class FileWirter {
    public void wirter() {
        System.out.println("保存文件");
    }
}
