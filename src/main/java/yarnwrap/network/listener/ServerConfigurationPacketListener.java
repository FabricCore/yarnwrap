package yarnwrap.network.listener;
public class ServerConfigurationPacketListener { public net.minecraft.network.listener.ServerConfigurationPacketListener wrapperContained; public ServerConfigurationPacketListener(net.minecraft.network.listener.ServerConfigurationPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onReady(yarnwrap.network.packet.c2s.config.ReadyC2SPacket packet) { wrapperContained.onReady(packet.wrapperContained); }
// public static void onReady(yarnwrap.network.packet.c2s.config.ReadyC2SPacket packet, ) { net.minecraft.network.listener.ServerConfigurationPacketListener.onReady(packet.wrapperContained); }
public void onSelectKnownPacks(yarnwrap.network.packet.c2s.config.SelectKnownPacksC2SPacket packet) { wrapperContained.onSelectKnownPacks(packet.wrapperContained); }
// public static void onSelectKnownPacks(yarnwrap.network.packet.c2s.config.SelectKnownPacksC2SPacket packet, ) { net.minecraft.network.listener.ServerConfigurationPacketListener.onSelectKnownPacks(packet.wrapperContained); }

}