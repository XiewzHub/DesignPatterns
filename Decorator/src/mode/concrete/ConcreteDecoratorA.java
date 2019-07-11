package mode.concrete;

import mode.Decorator;

public class ConcreteDecoratorA extends Decorator {
    /**本类独有功能，区别与具体对象B*/
    private String addState;

    /**
     *
     */
    @Override
    public void operation() {
        super.operation();
        addState = "A装饰标志";
        System.out.println("具体装饰对象A的操作"+addState);
        System.out.println("----------------------------");
    }
}
