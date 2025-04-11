package yarnwrap.network.packet;
public class CommonPackets { public net.minecraft.network.packet.CommonPackets wrapperContained; public CommonPackets(net.minecraft.network.packet.CommonPackets wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.PacketType CUSTOM_PAYLOAD_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.CUSTOM_PAYLOAD_S2C); }
// public void CUSTOM_PAYLOAD_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.CUSTOM_PAYLOAD_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType KEEP_ALIVE_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.KEEP_ALIVE_S2C); }
// public void KEEP_ALIVE_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.KEEP_ALIVE_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType CUSTOM_PAYLOAD_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.CUSTOM_PAYLOAD_C2S); }
// public void CUSTOM_PAYLOAD_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.CUSTOM_PAYLOAD_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType KEEP_ALIVE_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.KEEP_ALIVE_C2S); }
// public void KEEP_ALIVE_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.KEEP_ALIVE_C2S = value.wrapperContained; }
// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }

}