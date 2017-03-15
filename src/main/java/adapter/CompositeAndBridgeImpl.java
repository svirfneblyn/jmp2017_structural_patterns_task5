package adapter;

import bridge.Crossing;
import composite.FSManager;

import static flyweight.Constants.PATH_TO_SCAN;

/*adapter*/
public class CompositeAndBridgeImpl implements CompositeAndBridgeAdapter {

    public void showBridgeActivity(BridgeEnum typeToCross) {
        Crossing cr = typeToCross.getCross();
        cr.deploy();
        cr.undeploy();
    }

    public void showScannedFileNames() {
        FSManager fs = new FSManager();
        fs.compositDemo(PATH_TO_SCAN);
     }
    }
