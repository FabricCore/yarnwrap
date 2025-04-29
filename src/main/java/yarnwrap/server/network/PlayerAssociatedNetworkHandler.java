package yarnwrap.server.network;
public class PlayerAssociatedNetworkHandler { public net.minecraft.server.network.PlayerAssociatedNetworkHandler wrapperContained; public PlayerAssociatedNetworkHandler(net.minecraft.server.network.PlayerAssociatedNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public static void sendPacket(yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.network.PlayerAssociatedNetworkHandler.sendPacket(packet.wrapperContained); }
public yarnwrap.server.network.ServerPlayerEntity getPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getPlayer()); }
// public static yarnwrap.server.network.ServerPlayerEntity getPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.network.PlayerAssociatedNetworkHandler.getPlayer()); }

}