package bridge;

import bridge.icrossing.ICrossing;

/*bridge*/
public abstract class CrossingImpl {
    public ICrossing iCrossing;
    public CrossingImpl(ICrossing iCrossing) {
        this.iCrossing = iCrossing;
    }
    abstract public void deploy();
    abstract public void undeploy();
}
