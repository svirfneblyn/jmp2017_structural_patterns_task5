package facade;

import bridge.crosingtypes.PantoonCrossing;
import bridge.icrossing.ICrossing;
import decorator.SmartHingedBridge;
import decorator.SmartPantoonBridge;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public class DecoratorDemonstrator implements IPrinter{

    public void showPattern (){
        print("DECORATOR");
        ICrossing crDecor = new SmartPantoonBridge(new PantoonCrossing());
        crDecor.deploy();
        crDecor.undeploy();
        ICrossing crDecorHig = new SmartHingedBridge(new SmartPantoonBridge(new PantoonCrossing()));
        crDecorHig.deploy();
        crDecorHig.undeploy();
    }
}
