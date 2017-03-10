package decorator;

import bridge.icrossing.ICrossing;

/*decorator*/
public class SmartPantoonBridge extends BridgeDecorator {
    public SmartPantoonBridge(ICrossing cr) {
        super(cr);
    }
    @Override
    public void deploy() {
        super.deploy();
        System.out.println("This is smart pantoon and he deployed succesfully");
    }
    @Override
    public void undeploy() {
        super.undeploy();
        System.out.println("Thanks for use oure smart pantoon. Smart pantoon bridge undeployed succesfully. Keep yourself!");
    }
}
