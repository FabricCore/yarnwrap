package yarnwrap.network.packet.c2s.play;
public class ClientTickEndC2SPacket { public net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket wrapperContained; public ClientTickEndC2SPacket(net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket(net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket.INSTANCE); }
// public static void INSTANCE(yarnwrap.network.packet.c2s.play.ClientTickEndC2SPacket value, ) { net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket.INSTANCE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket.CODEC = value.wrapperContained; }


}