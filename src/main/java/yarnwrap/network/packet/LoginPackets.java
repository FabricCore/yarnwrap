package yarnwrap.network.packet;
public class LoginPackets { public net.minecraft.network.packet.LoginPackets wrapperContained; public LoginPackets(net.minecraft.network.packet.LoginPackets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.PacketType HELLO_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.HELLO_S2C); }
// public void HELLO_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.HELLO_S2C = value.wrapperContained; }
public static yarnwrap.network.packet.PacketType HELLO_S2C() { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.LoginPackets.HELLO_S2C); }
// public static void HELLO_S2C(yarnwrap.network.packet.PacketType value, ) { net.minecraft.network.packet.LoginPackets.HELLO_S2C = value.wrapperContained; }

// public yarnwrap.network.packet.PacketType HELLO_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.HELLO_C2S); }
// public void HELLO_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.HELLO_C2S = value.wrapperContained; }
public static yarnwrap.network.packet.PacketType HELLO_C2S() { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.LoginPackets.HELLO_C2S); }
// public static void HELLO_C2S(yarnwrap.network.packet.PacketType value, ) { net.minecraft.network.packet.LoginPackets.HELLO_C2S = value.wrapperContained; }

// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public static yarnwrap.network.packet.PacketType s2c(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.LoginPackets.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }
// public static yarnwrap.network.packet.PacketType c2s(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.LoginPackets.c2s(id)); }

}