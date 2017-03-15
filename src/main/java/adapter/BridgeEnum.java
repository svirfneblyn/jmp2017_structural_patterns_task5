package adapter;

import bridge.Crossing;
import bridge.crosingtypes.HingedBridgeCrossing;
import bridge.crosingtypes.PantoonCrossing;
import bridge.terraintocrosstypes.RailRoadCross;
import bridge.terraintocrosstypes.RiverCross;

/*adapter*/
public enum BridgeEnum {
    RIVER_BRIDGE("RIVER") {
        public Crossing getCross() {
            return new RiverCross(new PantoonCrossing());
        }
    },
    RAILROAD_BRIDGE("RAILROAD") {
        public Crossing getCross() {
            return new RailRoadCross(new HingedBridgeCrossing());
        }
    };
    private String bridgeType;
    BridgeEnum(String bridgeType) {
        this.bridgeType = bridgeType;
    }
    public abstract Crossing getCross();
    public String getBridgeType() {
        return bridgeType;
    }
}
