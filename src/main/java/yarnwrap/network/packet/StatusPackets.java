package yarnwrap.network.packet;
public class StatusPackets { public net.minecraft.network.packet.StatusPackets wrapperContained; public StatusPackets(net.minecraft.network.packet.StatusPackets wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public static yarnwrap.network.packet.PacketType s2c(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.StatusPackets.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }
// public static yarnwrap.network.packet.PacketType c2s(java.lang.String id, ) { return new yarnwrap.network.packet.PacketType(net.minecraft.network.packet.StatusPackets.c2s(id)); }

}