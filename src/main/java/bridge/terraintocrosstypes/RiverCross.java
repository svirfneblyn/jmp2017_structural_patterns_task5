package bridge.terraintocrosstypes;

import bridge.CrossingImpl;
import bridge.icrossing.ICrossing;

/*bridge*/
public class RiverCross extends CrossingImpl {
    public RiverCross(ICrossing iCrossing) {
        super(iCrossing);
    }
    public void deploy() {
        System.out.println("River will cross with help of pantoon..");
        iCrossing.deploy();
    }
    public void undeploy() {
        System.out.println("River succesfuly crossed..");
        iCrossing.undeploy();
    }
}
