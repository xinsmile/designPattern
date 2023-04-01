package com.xingy.structural.decorator.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.decorator.learn1.DecoratorPattern
 * @date 2019/06/11 22:50
 * @description
 */
public class DecoratorPattern1 {
    public static void main(String[] args){
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}


//具体构件角色
class ConcreteComponent1 {

    public ConcreteComponent1() {
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

//抽象装饰角色
class Decorator1 extends ConcreteComponent1 {

    private ConcreteComponent1 component;

    public Decorator1(ConcreteComponent1 component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

//具体装饰角色
class ConcreteDecorator1 extends Decorator1 {

    public ConcreteDecorator1(ConcreteComponent1 component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction()
    {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
