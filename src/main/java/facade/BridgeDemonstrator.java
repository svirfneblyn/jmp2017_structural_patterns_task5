package facade;

import bridge.Crossing;
import bridge.crosingtypes.PantoonCrossing;
import bridge.terraintocrosstypes.RiverCross;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public class BridgeDemonstrator implements IPrinter{

    public void showPattern(){
        print("BRIDGE");
        Crossing srRiver = new RiverCross(new PantoonCrossing());
        Crossing crRail = new RiverCross(new PantoonCrossing());
        srRiver.deploy();
        srRiver.undeploy();
        crRail.deploy();
        crRail.undeploy();
    }
}
