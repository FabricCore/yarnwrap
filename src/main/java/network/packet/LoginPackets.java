package yarnwrap.network.packet;
public class LoginPackets { public net.minecraft.network.packet.LoginPackets wrapperContained; public LoginPackets(net.minecraft.network.packet.LoginPackets wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.PacketType HELLO_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.HELLO_S2C); }
public yarnwrap.network.packet.PacketType HELLO_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.HELLO_C2S); }
// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }

}