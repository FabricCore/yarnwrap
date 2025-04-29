package yarnwrap.network.packet.s2c.custom;
public class DebugPoiAddedCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload wrapperContained; public DebugPoiAddedCustomPayload(net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload.CODEC = value.wrapperContained; }

// public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public static Object ID() { return net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload.ID; }
// // public static void ID(Object value, ) { net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload.ID = value; }

// public DebugPoiAddedCustomPayload(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.custom.DebugPoiAddedCustomPayload.write(buf.wrapperContained); }

}