import mode.CashContext;

public class Main {

    /**
     * 策略模式用于封装算法，每个算法之间互不影响
     *
     * 策略模式测试
     * @param args
     */
    public static void main(String[] args) {
        String type = "nomal";
        type = "rebate";
        type = "return";
        CashContext cashContext = new CashContext(type);
        double result = cashContext.getResult(500);
        System.out.println(type+"："+result);

    }
}
