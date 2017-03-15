package bridge.terraintocrosstypes;

import bridge.Crossing;
import bridge.icrossing.ICrossing;

/*bridge*/
public class RiverCross extends Crossing {

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
