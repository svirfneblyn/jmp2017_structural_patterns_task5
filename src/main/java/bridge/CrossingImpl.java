package bridge;

import bridge.icrossing.ICrossing;

/**
 * Created by Ihar_Rubanovich on 3/7/2017.
 */
public abstract class CrossingImpl {
    public ICrossing iCrossing;

    public CrossingImpl(ICrossing iCrossing) {
        this.iCrossing = iCrossing;
    }
    abstract public void deploy();
    abstract public void undeploy();
}
