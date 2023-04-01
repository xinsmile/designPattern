package com.xingy.structural.flyweight.test2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Hashtable;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.flyweight.test1.IgoChessman2
 * @date 2019/06/27 22:43
 * @description 围棋棋子类：抽象享元模式
 */
public abstract class IgoChessman2 {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色： " + this.getColor()
                + ",棋子位置： " + coordinates.getX() + "," + coordinates.getY());
    }
}

class FlyweightTest2 {
    public static void main(String[] args){
        IgoChessman2 black1,black2,black3,white1,white2;
        IgoChessman2Factory factory;

        factory = IgoChessman2Factory.getInstance();

        black1 = factory.getIgoChessman2("b");
        black2 = factory.getIgoChessman2("b");
        black3 = factory.getIgoChessman2("b");
        System.out.println("判断两个黑色棋子是否相同：" + (black1 == black2));

        white1 = factory.getIgoChessman2("w");
        white2 = factory.getIgoChessman2("w");
        System.out.println("判断两个白色棋子是否相同：" + (white1 == white2));

        //显示棋子
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(2,3));
        black3.display(new Coordinates(3,4));
        white1.display(new Coordinates(3,5));
        white2.display(new Coordinates(6,7));

    }
}

//黑色棋子类： 具体享元类
class BlackIgoChessman2 extends IgoChessman2 {

    @Override
    public String getColor() {
        return "黑色";
    }
}

//黑色棋子类： 具体享元类
class WhiteIgoChessman2 extends IgoChessman2 {

    @Override
    public String getColor() {
        return "白色";
    }
}

//坐标类：外部状态类
@AllArgsConstructor
@Getter
@Setter
class Coordinates {

    private int x;
    private int y;
}

//围棋棋子工厂类：享元工厂类，使用单例模式进行设计
class IgoChessman2Factory {
    private static IgoChessman2Factory instance = new IgoChessman2Factory();
    // 使用Hashtable来存储享元对象，充当享元池
    private Hashtable ht;

    private IgoChessman2Factory() {
        ht = new Hashtable();
        IgoChessman2 black, white;
        black = new BlackIgoChessman2();
        ht.put("b", black);
        white = new WhiteIgoChessman2();
        ht.put("w", white);
    }

    //返回享元工厂类的唯一实例
    public static IgoChessman2Factory getInstance() {
        return instance;
    }

    //通过key来获取存储在hashtable中的享元对象
    public IgoChessman2 getIgoChessman2(String color) {
        return (IgoChessman2) ht.get(color);
    }

    // public IgoChessman2 getIgoChessman2(String key) {
    //     if (ht.contains(key)) {
    //         return (IgoChessman2) ht.get(key);
    //     } else {
    //         IgoChessman2 IgoChessman2 = null;
    //         if (key.equalsIgnoreCase("b")) {
    //             IgoChessman2 = new BlackIgoChessman2();
    //         } else if (key.equalsIgnoreCase("w")) {
    //             IgoChessman2 = new WhiteIgoChessman2();
    //         }
    //         ht.put(key, IgoChessman2);
    //         return  IgoChessman2;
    //     }
    // }

}
