package com.xingy.structural.facade.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.facade.learn1.EncryptFacade
 * @date 2019/06/26 23:04
 * @description 使用抽象外观类，具体外观类使用单例
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt();
}

class FacadeTest2 {
    public static void main(String[] args){
        AbstractEncryptFacade encryptFacade2 = EncryptFacade2.getInstance();
        encryptFacade2.fileEncrypt();

        AbstractEncryptFacade encryptFacade3 = EncryptFacade2.getInstance();
        System.out.println("encryptFacade2 == encryptFacade3: " + (encryptFacade2 == encryptFacade3));

        AbstractEncryptFacade encryptFacade4 = NewEncryptFacade2.getInstance();
        encryptFacade4.fileEncrypt();
    }
}

class EncryptFacade2 extends AbstractEncryptFacade {

    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWirter fileWirter;

    private EncryptFacade2() {
        this.fileReader = new FileReader();
        this.cipherMachine = new CipherMachine();
        this.fileWirter = new FileWirter();
    }

    private static class singletonHolder {
        private static final EncryptFacade2 singleton = new EncryptFacade2();
    }

    public static EncryptFacade2 getInstance() {
        return singletonHolder.singleton;
    }


    @Override
    public void fileEncrypt() {
        fileReader.read();
        cipherMachine.encrypt();
        fileWirter.wirter();
    }
}

class NewEncryptFacade2 extends AbstractEncryptFacade {

    private FileReader fileReader;
    private NewCipherMachine newCipherMachine;
    private FileWirter fileWirter;

    private NewEncryptFacade2() {
        this.fileReader = new FileReader();
        this.newCipherMachine = new NewCipherMachine();
        this.fileWirter = new FileWirter();
    }

    private static class singletonHolder {
        private static final NewEncryptFacade2 singleton = new NewEncryptFacade2();
    }

    public static NewEncryptFacade2 getInstance() {
        return singletonHolder.singleton;
    }


    @Override
    public void fileEncrypt() {
        fileReader.read();
        newCipherMachine.encrypt();
        fileWirter.wirter();
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

//数据加密类
class NewCipherMachine {
    public void encrypt() {
        System.out.println("数据加密新方法");
    }
}

class FileWirter {
    public void wirter() {
        System.out.println("保存文件");
    }
}
