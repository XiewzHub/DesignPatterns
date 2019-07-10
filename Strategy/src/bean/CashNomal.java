package bean;

public class CashNomal implements CashSuper {

    /**
     * 八折算法
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money*0.8;
    }
}
