package bridge.terraintocrosstypes;

import bridge.Crossing;
import bridge.icrossing.ICrossing;

/*bridge*/
public class RailRoadCross extends Crossing {

    public RailRoadCross(ICrossing iCrossing) {
        super(iCrossing);
    }

    public void deploy() {
        System.out.println("Rail road will cross with help of hinged bridge.. ");
        iCrossing.deploy();
    }

    public void undeploy() {
        iCrossing.undeploy();
        System.out.println("Rail road crossed succesfully ..");
    }


}
