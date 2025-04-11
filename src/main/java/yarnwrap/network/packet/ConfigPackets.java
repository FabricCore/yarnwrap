package yarnwrap.network.packet;
public class ConfigPackets { public net.minecraft.network.packet.ConfigPackets wrapperContained; public ConfigPackets(net.minecraft.network.packet.ConfigPackets wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.PacketType FINISH_CONFIGURATION_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.FINISH_CONFIGURATION_S2C); }
// public void FINISH_CONFIGURATION_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.FINISH_CONFIGURATION_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType FINISH_CONFIGURATION_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.FINISH_CONFIGURATION_C2S); }
// public void FINISH_CONFIGURATION_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.FINISH_CONFIGURATION_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType SELECT_KNOWN_PACKS_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.SELECT_KNOWN_PACKS_S2C); }
// public void SELECT_KNOWN_PACKS_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.SELECT_KNOWN_PACKS_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType SELECT_KNOWN_PACKS_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.SELECT_KNOWN_PACKS_C2S); }
// public void SELECT_KNOWN_PACKS_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.SELECT_KNOWN_PACKS_C2S = value.wrapperContained; }
// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }

}