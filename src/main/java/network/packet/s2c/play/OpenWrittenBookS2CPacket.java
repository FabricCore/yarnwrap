package yarnwrap.network.packet.s2c.play;
public class OpenWrittenBookS2CPacket { public net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket wrapperContained; public OpenWrittenBookS2CPacket(net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}