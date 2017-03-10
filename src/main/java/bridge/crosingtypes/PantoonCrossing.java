package bridge.crosingtypes;

import bridge.icrossing.ICrossing;

/*bridge*/
public class PantoonCrossing implements ICrossing {
    public void deploy() {
        System.out.println("Engenering team expand Pantton...  ");
    }

    public void undeploy() {
        System.out.println("Engenering team unexpand Pantton...");
    }
}
