package bridge;

import bridge.icrossing.ICrossing;

/*bridge*/
public abstract class Crossing {

    public final ICrossing iCrossing;

    public Crossing(ICrossing iCrossing) {
        this.iCrossing = iCrossing;
    }

    abstract public void deploy();

    abstract public void undeploy();

}
