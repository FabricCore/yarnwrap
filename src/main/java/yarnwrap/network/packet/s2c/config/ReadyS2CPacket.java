package yarnwrap.network.packet.s2c.config;
public class ReadyS2CPacket { public net.minecraft.network.packet.s2c.config.ReadyS2CPacket wrapperContained; public ReadyS2CPacket(net.minecraft.network.packet.s2c.config.ReadyS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.s2c.config.ReadyS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.config.ReadyS2CPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.s2c.config.ReadyS2CPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}