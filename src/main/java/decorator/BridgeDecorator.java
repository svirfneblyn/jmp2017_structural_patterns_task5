package decorator;

import bridge.icrossing.ICrossing;

/*decorator*/
public class BridgeDecorator implements ICrossing {
    protected ICrossing cr;
    public BridgeDecorator(ICrossing cr) {
        this.cr = cr;
    }
    @Override
    public void deploy() {
        this.cr.deploy();
    }
    @Override
    public void undeploy() {
        this.cr.undeploy();
    }
}
