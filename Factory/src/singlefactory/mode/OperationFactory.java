package singlefactory.mode;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new AddOp();
                break;
            case "-":
                operation = new SubOp();
        }
        return operation;
    }
}
