package adapter;

import bridge.Crossing;
import composite.FSManager;

import static flyweight.Constants.PATH_TO_SCAN;

/*adapter*/
public class BridgesImpl implements BridgesAdapter {

    public void showBridgeActivity(BridgeEnum typeToCross) {
        Crossing cr = typeToCross.getCross();
        cr.deploy();
        cr.undeploy();
     }
    }
