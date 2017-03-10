package adapter;

import bridge.CrossingImpl;
import composite.FSManager;

import static flyweight.Constants.PATH_TO_SCAN;

/*adapter*/
public class CompositeAndBridgeImpl implements CompositeAndBridgeAdapter {
    public void buildBridge(BridgeEnum typeToCross) {
        CrossingImpl cr = typeToCross.getCross();
        cr.deploy();
        cr.undeploy();
    }
    public void getFileNamesScanner() {
        FSManager fs = new FSManager();
        fs.compositDemo(PATH_TO_SCAN);
    }
}
