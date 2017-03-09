package bridge.crosingtypes;

import bridge.icrossing.ICrossing;

/**
 * Created by Ihar_Rubanovich on 3/7/2017.
 */
public class HingedBridgeCrossing implements ICrossing {
    public void deploy() {
        System.out.println("Engenering team expand Higed Bridge...  deploy done");
    }

    public void undeploy() {
        System.out.println("Engenering team unexpand Higed Bridge...  undeploy done");

    }
}
