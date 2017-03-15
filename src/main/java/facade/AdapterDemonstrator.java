package facade;

import adapter.CompositeAndBridgeImpl;

import static adapter.BridgeEnum.RAILROAD_BRIDGE;
import static adapter.BridgeEnum.RIVER_BRIDGE;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public class AdapterDemonstrator implements IPrinter {

    public void showPattern() {
        print("ADAPTER");
        CompositeAndBridgeImpl adapt = new CompositeAndBridgeImpl();
        adapt.showBridgeActivity(RIVER_BRIDGE);
        adapt.showBridgeActivity(RAILROAD_BRIDGE);
        adapt.showScannedFileNames();
    }
}
