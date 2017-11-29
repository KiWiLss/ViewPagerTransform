package com.magicsoft.wave.design.decorator.concretecomponent;

import com.magicsoft.wave.design.decorator.component.Component;

/**
 * Created by LiCola on  2016/04/22  16:00
 * 具体实现组件对象接口的对象 被装饰的原始对象
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        //重写方法 做基本的操作  
        System.out.print(" ConcreteComponent operation\n");
    }
}