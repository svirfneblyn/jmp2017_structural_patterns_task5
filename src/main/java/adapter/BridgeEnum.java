package adapter;

import bridge.CrossingImpl;
import bridge.crosingtypes.PantoonCrossing;
import bridge.terraintocrosstypes.RiverCross;
/*adapter*/
public enum BridgeEnum {
    RIVER_BRIDGE("RIVER") {
        public CrossingImpl getCross() {
            return new RiverCross(new PantoonCrossing());
        }
    },
    RAILROAD_BRIDGE("RAILROAD") {
        public CrossingImpl getCross() {
            return new RiverCross(new PantoonCrossing());
        }
    };
    public abstract CrossingImpl getCross();
    private String BridgeType;
    private BridgeEnum(String bridgeType) {
        this.BridgeType = bridgeType;
    }
    public String getBridgeType() {
        return BridgeType;
    }
}
