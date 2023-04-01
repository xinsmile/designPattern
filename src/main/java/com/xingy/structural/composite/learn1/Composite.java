package com.xingy.structural.composite.learn1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn1.Composite
 * @date 2019/06/24 22:11
 * @description
 */
public class Composite extends Component {
    private List<Component> childComponents = null;

    @Override
    public void addChild(Component child) {
        //延迟初始化
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChild(int index) {
        if (childComponents != null){
            if(index>=0 && index<childComponents.size()){
                return childComponents.get(index);
            }
        }
        return null;
    }

    @Override
    public void someOperation() {
        //容器构件具体业务方法的实现
        if (childComponents != null){
            for(Component c : childComponents){
                //递归的进行子组件相应方法的调用
                c.someOperation();
            }
        }

    }
}
