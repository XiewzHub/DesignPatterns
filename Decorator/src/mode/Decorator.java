package mode;

/**
 * 装饰器主类
 */
public class Decorator extends Component {

    /**
     * 可以被子类识别使用
     */
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
