package yarnwrap.network.packet.s2c.custom;
public class DebugPoiRemovedCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload wrapperContained; public DebugPoiRemovedCustomPayload(net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload.CODEC = value.wrapperContained; }

// public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public static Object ID() { return net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload.ID; }
// // public static void ID(Object value, ) { net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload.ID = value; }

// public DebugPoiRemovedCustomPayload(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.custom.DebugPoiRemovedCustomPayload.write(buf.wrapperContained); }

}