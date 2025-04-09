package yarnwrap.network.packet.s2c.play;
public class EnterReconfigurationS2CPacket { public net.minecraft.network.packet.s2c.play.EnterReconfigurationS2CPacket wrapperContained; public EnterReconfigurationS2CPacket(net.minecraft.network.packet.s2c.play.EnterReconfigurationS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.s2c.play.EnterReconfigurationS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.play.EnterReconfigurationS2CPacket(wrapperContained.INSTANCE); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}