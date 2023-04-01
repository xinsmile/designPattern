package com.xingy.structural.decorator.learn2;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.decorator.learn2.Component
 * @date 2019/06/25 23:25
 * @description 抽象界面构件类：抽象构件类。为了突出与模式相关的核心代码，对原有控件进行了大量的简化
 */
public abstract class Component {
    public abstract void display();
}

class Client {
    public static void main(String[] args){
        Component component, componentSB, componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);


        componentBB.display();
    }
}

//窗体类：具体构件类
class Window extends Component {

    @Override
    public void display() {
        System.out.println("显示窗体!");
    }
}

//文本框类：具体构件类
class TxetBox extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框!");
    }
}

//列表框类：具体构件类
class ListBox extends Component {

    @Override
    public void display() {
        System.out.println("显示列表框!");
    }
}

//构件装饰类：抽象装饰类（核心）
class ComponentDecorator extends Component {

    private Component component; //维持对抽象构件类型对象的引用

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}

//滚动条装饰类:具体装饰类
class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    //全透明
    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }

}

//黑色边框装饰类:具体装饰类
class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

}
