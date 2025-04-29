package yarnwrap.network.packet;
public class PingPackets { public net.minecraft.network.packet.PingPackets wrapperContained; public PingPackets(net.minecraft.network.packet.PingPackets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public static yarnwrap.network.packet.PacketType s2c(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.PingPackets.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }
// public static yarnwrap.network.packet.PacketType c2s(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.PingPackets.c2s(id)); }

}