package yarnwrap.network.packet.c2s.play;
public class HandSwingC2SPacket { public net.minecraft.network.packet.c2s.play.HandSwingC2SPacket wrapperContained; public HandSwingC2SPacket(net.minecraft.network.packet.c2s.play.HandSwingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public static yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.hand); }
// public static void hand(yarnwrap.util.Hand value, ) { net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.hand = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.CODEC = value.wrapperContained; }

public HandSwingC2SPacket(yarnwrap.util.Hand hand) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.HandSwingC2SPacket(hand.wrapperContained); }
// public HandSwingC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.HandSwingC2SPacket(buf.wrapperContained); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public static yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.getHand()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.HandSwingC2SPacket.write(buf.wrapperContained); }

}