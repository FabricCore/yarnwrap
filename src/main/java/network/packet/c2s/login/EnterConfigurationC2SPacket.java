package yarnwrap.network.packet.c2s.login;
public class EnterConfigurationC2SPacket { public net.minecraft.network.packet.c2s.login.EnterConfigurationC2SPacket wrapperContained; public EnterConfigurationC2SPacket(net.minecraft.network.packet.c2s.login.EnterConfigurationC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.c2s.login.EnterConfigurationC2SPacket INSTANCE() { return new yarnwrap.network.packet.c2s.login.EnterConfigurationC2SPacket(wrapperContained.INSTANCE); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}