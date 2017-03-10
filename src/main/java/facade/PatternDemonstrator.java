package facade;

import adapter.CompositeAndBridgeImpl;
import bridge.CrossingImpl;
import bridge.crosingtypes.PantoonCrossing;
import bridge.icrossing.ICrossing;
import bridge.terraintocrosstypes.RiverCross;
import composite.FSManager;
import decorator.SmartHingedBridge;
import decorator.SmartPantoonBridge;
import flyweight.FlyweightStylesFactory;

import static adapter.BridgeEnum.RAILROAD_BRIDGE;
import static adapter.BridgeEnum.RIVER_BRIDGE;
import static flyweight.Constants.PATH_TO_SCAN;

/*facade*/
public class PatternDemonstrator {
    public void showBridgePat() {
        printPatternType("BRIDGE");
        CrossingImpl srRiver = new RiverCross(new PantoonCrossing());
        CrossingImpl crRail = new RiverCross(new PantoonCrossing());
        srRiver.deploy();
        srRiver.undeploy();
        crRail.deploy();
        crRail.undeploy();
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
        FlyweightStylesFactory flyweight =  FlyweightStylesFactory.getInstance();
        flyweight.getBlogerFlyweight("horror").getStyleForBlog("coolBlg");
        flyweight.getBlogerFlyweight("funny").getStyleForBlog("funnylBlg");

    }
    private void printPatternType(String patternName) {
        System.out.println("-------------------" + patternName + " PATTERN DEMO ----------------------");
    }
}
