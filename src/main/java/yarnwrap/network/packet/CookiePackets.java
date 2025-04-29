package yarnwrap.network.packet;
public class CookiePackets { public net.minecraft.network.packet.CookiePackets wrapperContained; public CookiePackets(net.minecraft.network.packet.CookiePackets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public static yarnwrap.network.packet.PacketType s2c(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.CookiePackets.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }
// public static yarnwrap.network.packet.PacketType c2s(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.CookiePackets.c2s(id)); }

}