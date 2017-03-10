package decorator;

import bridge.icrossing.ICrossing;

/*decorator*/
public class SmartHingedBridge extends BridgeDecorator {
    public SmartHingedBridge(ICrossing cr) {
        super(cr);
    }
    @Override
    public void deploy() {
        super.deploy();
        System.out.println("This is smart hinged bridge and he deployed succesfully");
    }
    @Override
    public void undeploy() {
        super.undeploy();
        System.out.println("Thanks for use oure smart hinged bridge. Smart smart hinged bridge undeployed succesfully. ");
    }
}
