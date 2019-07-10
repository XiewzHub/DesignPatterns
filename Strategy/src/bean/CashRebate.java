package bean;

public class CashRebate implements CashSuper {
    /**
     * 五折算法
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        money /= 2;
        return money;
    }
}
