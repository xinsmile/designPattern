package com.xingy.structural.composite.learn1;

/**
 * @author xinguiyuan
 * @className com.xingy.structural.composite.learn1.Component
 * @date 2019/06/24 22:01
 * @description 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 */
public abstract class Component {
    /**
     * @Author xinguiyuan
     * @Description //TODO 示意方法，子组件对象可能有的功能方法
     * @Date 2019/6/24 22:03
     * @Param []
     * @Return void
     **/
    public abstract void someOperation();

    /**
     * @Author xinguiyuan
     * @Description //TODO 向组合对象中加入组件对象
     * @Date 2019/6/24 22:05 
     * @Param [child] 被加入组合对象中的组件对象
     * @Return void
     **/
    public void addChild(Component child){
        // 缺省的实现，抛出例外，因为叶子对象没有这个功能，
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * @Author xinguiyuan
     * @Description //TODO 从组合对象中移出某个组件对象
     * @Date 2019/6/24 22:07
     * @Param [child] 被移出组合对象中的组件对象
     * @Return void
     **/
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * @Author xinguiyuan
     * @Description //TODO 返回某个索引对应的组件对象
     * @Date 2019/6/24 22:08 
     * @Param [index] 需要获取的组件对象的索引，索引从0开始
     * @Return com.xingy.structural.composite.learn1.Component 索引对应的组件对象
     **/
    public Component getChild(int index) {
        // 缺省的实现，抛出例外，因为叶子对象没有这个功能，
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");

    }
}
