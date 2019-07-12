package mode;

public class Proxy extends Subject {
    RealSubject realSubject;

    /**
     * 代理了真实请求
     */
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
