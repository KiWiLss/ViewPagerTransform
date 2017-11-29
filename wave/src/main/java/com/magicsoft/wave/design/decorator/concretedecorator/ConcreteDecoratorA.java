package com.magicsoft.wave.design.decorator.concretedecorator;

import com.magicsoft.wave.design.decorator.component.Component;
import com.magicsoft.wave.design.decorator.decorator.Decorator;

/**
 * Created by LiCola on  2016/04/22  16:08
 * 某个具体装饰器实现对象，调用接口方法和具有自己的方法 并能够附加上去
 */
public class ConcreteDecoratorA  extends Decorator {

    /**
     * 依赖注入
     *
     * @param component 依赖的对象
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public int operationA(){
        System.out.print(" ConcreteDecoratorA operationA\n");
        return 0;
    }

    @Override
    public void operation() {
        operationA();
        super.operation();
    }
}