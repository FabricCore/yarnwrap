package yarnwrap.network.packet;
public class PacketType { public net.minecraft.network.packet.PacketType wrapperContained; public PacketType(net.minecraft.network.packet.PacketType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public void side(yarnwrap.network.NetworkSide value) { wrapperContained.side = value.wrapperContained; }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.packet.PacketType.side); }
// public static void side(yarnwrap.network.NetworkSide value, ) { net.minecraft.network.packet.PacketType.side = value.wrapperContained; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side()); }
// // public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.packet.PacketType.side()); }

}