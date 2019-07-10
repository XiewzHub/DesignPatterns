package mode;

import bean.CashNomal;
import bean.CashRebate;
import bean.CashReturn;
import bean.CashSuper;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
//        用到了switch，一旦新增算法，就得加条件，这样子还是不够灵活，后续将用反射替代。。。。
        switch (type) {
            case "rebate":
                this.cashSuper = new CashRebate();
                break;
            case "return":
                this.cashSuper = new CashReturn();
                break;
            case "nomal":
            default:
                this.cashSuper = new CashNomal();
        }
    }

    public double getResult(double orgMoney) {
        return cashSuper.acceptCash(orgMoney);
    }
}
