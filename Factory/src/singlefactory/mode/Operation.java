package singlefactory.mode;

public abstract class Operation {
    protected double num1;
    protected double num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
