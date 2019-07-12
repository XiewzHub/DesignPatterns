package methodfactory;


import methodfactory.factory.AddFactory;
import methodfactory.factory.IFactory;
import singlefactory.mode.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory opFactory = new AddFactory();
        Operation operation = opFactory.createOperation();
        operation.setNum1(43);
        operation.setNum2(78);
        System.out.println(operation.getResult());
    }
}
