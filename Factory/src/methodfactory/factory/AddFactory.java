package methodfactory.factory;

import singlefactory.mode.AddOp;
import singlefactory.mode.Operation;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOp();
    }
}
