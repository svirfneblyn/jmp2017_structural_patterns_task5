package adapter;

import bridge.CrossingImpl;
import composite.FSManager;

import static flyweight.Constants.PATH_TO_SCAN;

/**
 * Created by User on 3/9/2017.
 */
public class CompositeAndBridgeImpl implements CompositeAndBridgeAdapter {

    public void buildBridge(BridgeEnum typeToCross) {
        System.out.println("-------------------ADAPTER---------- ");
        CrossingImpl cr = typeToCross.getCross();
        cr.deploy();
        cr.undeploy();
        System.out.println("-------------------ADAPTER---------- ");
    }

    public void getFileNamesScanner() {
        System.out.println("-------------------ADAPTER---------- ");
        FSManager fs= new FSManager();
        fs.compositDemo(PATH_TO_SCAN);
        System.out.println("-------------------ADAPTER---------- ");
    }
}
