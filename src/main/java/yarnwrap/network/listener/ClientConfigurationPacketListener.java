package yarnwrap.network.listener;
public class ClientConfigurationPacketListener { public net.minecraft.network.listener.ClientConfigurationPacketListener wrapperContained; public ClientConfigurationPacketListener(net.minecraft.network.listener.ClientConfigurationPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onReady(yarnwrap.network.packet.s2c.config.ReadyS2CPacket packet) { wrapperContained.onReady(packet.wrapperContained); }
// public static void onReady(yarnwrap.network.packet.s2c.config.ReadyS2CPacket packet, ) { net.minecraft.network.listener.ClientConfigurationPacketListener.onReady(packet.wrapperContained); }
public void onDynamicRegistries(yarnwrap.network.packet.s2c.config.DynamicRegistriesS2CPacket packet) { wrapperContained.onDynamicRegistries(packet.wrapperContained); }
// public static void onDynamicRegistries(yarnwrap.network.packet.s2c.config.DynamicRegistriesS2CPacket packet, ) { net.minecraft.network.listener.ClientConfigurationPacketListener.onDynamicRegistries(packet.wrapperContained); }
public void onFeatures(yarnwrap.network.packet.s2c.config.FeaturesS2CPacket packet) { wrapperContained.onFeatures(packet.wrapperContained); }
// public static void onFeatures(yarnwrap.network.packet.s2c.config.FeaturesS2CPacket packet, ) { net.minecraft.network.listener.ClientConfigurationPacketListener.onFeatures(packet.wrapperContained); }
public void onSelectKnownPacks(yarnwrap.network.packet.s2c.config.SelectKnownPacksS2CPacket packet) { wrapperContained.onSelectKnownPacks(packet.wrapperContained); }
// public static void onSelectKnownPacks(yarnwrap.network.packet.s2c.config.SelectKnownPacksS2CPacket packet, ) { net.minecraft.network.listener.ClientConfigurationPacketListener.onSelectKnownPacks(packet.wrapperContained); }
public void onResetChat(yarnwrap.network.packet.s2c.config.ResetChatS2CPacket packet) { wrapperContained.onResetChat(packet.wrapperContained); }
// public static void onResetChat(yarnwrap.network.packet.s2c.config.ResetChatS2CPacket packet, ) { net.minecraft.network.listener.ClientConfigurationPacketListener.onResetChat(packet.wrapperContained); }

}