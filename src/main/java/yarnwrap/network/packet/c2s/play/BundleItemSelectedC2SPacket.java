package yarnwrap.network.packet.c2s.play;
public class BundleItemSelectedC2SPacket { public net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket wrapperContained; public BundleItemSelectedC2SPacket(net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket.CODEC = value.wrapperContained; }

// public BundleItemSelectedC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.BundleItemSelectedC2SPacket.write(buf.wrapperContained); }

}