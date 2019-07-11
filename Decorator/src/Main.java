import mode.ConcreteComponent;
import mode.concrete.ConcreteDecoratorA;
import mode.concrete.ConcreteDecoratorB;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setComponent(concreteComponent);
        b.setComponent(a);
        b.operation();

    }
}
