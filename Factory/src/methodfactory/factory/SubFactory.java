package methodfactory.factory;

import singlefactory.mode.Operation;
import singlefactory.mode.SubOp;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new SubOp();
    }
}
