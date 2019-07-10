package bean;

public class CashReturn implements CashSuper {
    /**
     * 满100减50算法
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        if(money >100){
            money -= 50;
        }
        return money;
    }
}
