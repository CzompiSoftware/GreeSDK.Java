package hu.czsoft.greesdk.net.packets.serverbound;

import hu.czsoft.greesdk.net.packets.ServerboundPacket;
import lombok.ToString;

@ToString(callSuper = true)
public class ScanAppliancesPacket extends ServerboundPacket {
    public static String TYPE = "scan";

    public ScanAppliancesPacket() {
        type = TYPE;
    }
}
