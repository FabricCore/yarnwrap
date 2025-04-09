package yarnwrap.network.packet.c2s.play;
public class HandSwingC2SPacket { public net.minecraft.network.packet.c2s.play.HandSwingC2SPacket wrapperContained; public HandSwingC2SPacket(net.minecraft.network.packet.c2s.play.HandSwingC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}