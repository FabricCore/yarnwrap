package yarnwrap.network.packet;
public class PacketType { public net.minecraft.network.packet.PacketType wrapperContained; public PacketType(net.minecraft.network.packet.PacketType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side()); }

}