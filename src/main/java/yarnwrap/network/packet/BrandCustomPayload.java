package yarnwrap.network.packet;
public class BrandCustomPayload { public net.minecraft.network.packet.BrandCustomPayload wrapperContained; public BrandCustomPayload(net.minecraft.network.packet.BrandCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.BrandCustomPayload.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.BrandCustomPayload.CODEC = value.wrapperContained; }

// public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public static Object ID() { return net.minecraft.network.packet.BrandCustomPayload.ID; }
// // public static void ID(Object value, ) { net.minecraft.network.packet.BrandCustomPayload.ID = value; }

// public BrandCustomPayload(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.BrandCustomPayload(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.BrandCustomPayload.write(buf.wrapperContained); }

}