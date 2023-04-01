package com.xingy.structural.flyweight.test1;

import java.util.Hashtable;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.flyweight.test1.IgoChessman
 * @date 2019/06/27 22:43
 * @description 围棋棋子类：抽象享元模式
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色： " + this.getColor());
    }
}

class FlyweightTest1 {
    public static void main(String[] args){
        IgoChessman black1,black2,black3,white1,white2;
        IgoChessmanFactory factory;

        factory = IgoChessmanFactory.getInstance();

        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两个黑色棋子是否相同：" + (black1 == black2));

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两个白色棋子是否相同：" + (white1 == white2));

        //显示棋子
        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();

    }
}

//黑色棋子类： 具体享元类
class BlackIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
        return "黑色";
    }
}

//黑色棋子类： 具体享元类
class WhiteIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
        return "白色";
    }
}

//围棋棋子工厂类：享元工厂类，使用单例模式进行设计
class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    // 使用Hashtable来存储享元对象，充当享元池
    private Hashtable ht;

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    //通过key来获取存储在hashtable中的享元对象
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }

    // public IgoChessman getIgoChessman(String key) {
    //     if (ht.contains(key)) {
    //         return (IgoChessman) ht.get(key);
    //     } else {
    //         IgoChessman igoChessman = null;
    //         if (key.equalsIgnoreCase("b")) {
    //             igoChessman = new BlackIgoChessman();
    //         } else if (key.equalsIgnoreCase("w")) {
    //             igoChessman = new WhiteIgoChessman();
    //         }
    //         ht.put(key, igoChessman);
    //         return  igoChessman;
    //     }
    // }

}
