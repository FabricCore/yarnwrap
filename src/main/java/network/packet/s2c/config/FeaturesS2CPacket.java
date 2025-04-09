package yarnwrap.network.packet.s2c.config;
public class FeaturesS2CPacket { public net.minecraft.network.packet.s2c.config.FeaturesS2CPacket wrapperContained; public FeaturesS2CPacket(net.minecraft.network.packet.s2c.config.FeaturesS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}