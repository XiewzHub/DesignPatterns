package mode.concrete;

import mode.Decorator;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
        System.out.println("-----------------");
    }

    private void addBehavior(){
        System.out.println("对象B独有功能");
    }
}
