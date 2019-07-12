import mode.Proxy;

public class Main {
    /**
     * 代理模式
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 只需要认识代理类就可以得到真实请求
         */
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
