package bridge.crosingtypes;

import bridge.icrossing.ICrossing;

/*bridge*/
public class HingedBridgeCrossing implements ICrossing {

    public void deploy() {
        System.out.println("Engenering team expand Higed Bridge...  deploy done");
    }

    public void undeploy() {
        System.out.println("Engenering team unexpand Higed Bridge...  undeploy done");
    }
}
