package yarnwrap.network.packet.c2s.play;
public class PickItemFromEntityC2SPacket { public net.minecraft.network.packet.c2s.play.PickItemFromEntityC2SPacket wrapperContained; public PickItemFromEntityC2SPacket(net.minecraft.network.packet.c2s.play.PickItemFromEntityC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PickItemFromEntityC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PickItemFromEntityC2SPacket.CODEC = value.wrapperContained; }


}