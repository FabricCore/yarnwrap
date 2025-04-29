package yarnwrap.network.packet.s2c.play;
public class OpenWrittenBookS2CPacket { public net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket wrapperContained; public OpenWrittenBookS2CPacket(net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public static yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.hand); }
// public static void hand(yarnwrap.util.Hand value, ) { net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.hand = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.CODEC = value.wrapperContained; }

public OpenWrittenBookS2CPacket(yarnwrap.util.Hand hand) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket(hand.wrapperContained); }
// public OpenWrittenBookS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket(buf.wrapperContained); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public static yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.getHand()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket.write(buf.wrapperContained); }

}