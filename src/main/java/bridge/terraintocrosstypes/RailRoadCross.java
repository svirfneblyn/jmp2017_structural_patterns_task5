package bridge.terraintocrosstypes;

import bridge.CrossingImpl;
import bridge.icrossing.ICrossing;

/*bridge*/
public class RailRoadCross extends CrossingImpl {
    public void deploy() {
        System.out.println("Rail road will cross with help of hinged bridge.. ");
        iCrossing.deploy();
    }
    public void undeploy() {
        iCrossing.undeploy();
        System.out.println("Rail road crossed succesfully ..");
    }
    public RailRoadCross(ICrossing iCrossing) {
        super(iCrossing);
    }
}
