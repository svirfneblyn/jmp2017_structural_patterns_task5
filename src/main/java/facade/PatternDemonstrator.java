package facade;

import adapter.CompositeAndBridgeImpl;
import bridge.CrossingImpl;
import bridge.crosingtypes.PantoonCrossing;
import bridge.icrossing.ICrossing;
import bridge.terraintocrosstypes.RiverCross;
import composite.FSManager;
import decorator.SmartHingedBridge;
import decorator.SmartPantoonBridge;

import static adapter.BridgeEnum.RAILROAD_BRIDGE;
import static adapter.BridgeEnum.RIVER_BRIDGE;
import static flyweight.Constants.PATH_TO_SCAN;

/*facade*/
public class PatternDemonstrator {
    public void showBridgePat() {
        printPatternType("BRIDGE");
        CrossingImpl cr = new RiverCross(new PantoonCrossing());
        cr.deploy();
        cr.undeploy();
    }
    public void showAdapterPat() {
        printPatternType("ADAPTER");
        CompositeAndBridgeImpl adapt = new CompositeAndBridgeImpl();
        adapt.buildBridge(RIVER_BRIDGE);
        adapt.buildBridge(RAILROAD_BRIDGE);
        adapt.getFileNamesScanner();
    }
    public void showCompositePat() {
        printPatternType("COMPOSITE");
        FSManager fs = new FSManager();
        fs.compositDemo(PATH_TO_SCAN);
    }
    public void showDecoratorPat() {
        printPatternType("DECORATOR");
        ICrossing crDecor = new SmartPantoonBridge(new PantoonCrossing());
        crDecor.deploy();
        crDecor.undeploy();
        ICrossing crDecorHig = new SmartHingedBridge(new SmartPantoonBridge(new PantoonCrossing()));
        crDecorHig.deploy();
        crDecorHig.undeploy();
    }
    public void showFlyweightPat() {
        printPatternType("FLYWEIGHT");
        CompositeAndBridgeImpl adapt = new CompositeAndBridgeImpl();
        adapt.buildBridge(RIVER_BRIDGE);
        adapt.buildBridge(RAILROAD_BRIDGE);
        adapt.getFileNamesScanner();
    }
    private void printPatternType(String patternName) {
        System.out.println("-------------------" + patternName + " PATTERN DEMO ----------------------");
    }
}
