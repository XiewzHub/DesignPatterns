package singlefactory;

import singlefactory.mode.Operation;
import singlefactory.mode.OperationFactory;

public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNum1(23);
        operation.setNum2(56);
        System.out.println(operation.getResult());
    }
}
