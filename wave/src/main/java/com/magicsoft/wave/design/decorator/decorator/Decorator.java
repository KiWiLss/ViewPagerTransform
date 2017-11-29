package com.magicsoft.wave.design.decorator.decorator;

import com.magicsoft.wave.design.decorator.component.Component;

/**
 * Created by LiCola on  2016/04/22  16:04
 * 所有装饰器的抽象父类 持有接口 转发请求
 */
public abstract class Decorator extends Component {

    /**
     * 内部持有的组件接口对象
     */
    protected Component component;

    /**
     * 依赖注入
     * @param component 依赖的对象
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 转发请求给组件对象 这里可以做一些附加操作
     */
    @Override
    public void operation() {
        component.operation();
    }
}