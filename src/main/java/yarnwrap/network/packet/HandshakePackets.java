package yarnwrap.network.packet;
public class HandshakePackets { public net.minecraft.network.packet.HandshakePackets wrapperContained; public HandshakePackets(net.minecraft.network.packet.HandshakePackets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }
// public static yarnwrap.network.packet.PacketType c2s(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.HandshakePackets.c2s(id)); }

}