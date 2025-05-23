package yarnwrap.network.packet.s2c.custom;
public class DebugRedstoneUpdateOrderCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload wrapperContained; public DebugRedstoneUpdateOrderCustomPayload(net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public static Object ID() { return net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload.ID; }
// // public static void ID(Object value, ) { net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload.ID = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload.PACKET_CODEC = value.wrapperContained; }


}