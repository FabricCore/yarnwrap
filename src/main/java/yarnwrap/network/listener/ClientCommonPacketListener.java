package yarnwrap.network.listener;
public class ClientCommonPacketListener { public net.minecraft.network.listener.ClientCommonPacketListener wrapperContained; public ClientCommonPacketListener(net.minecraft.network.listener.ClientCommonPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSynchronizeTags(yarnwrap.network.packet.s2c.common.SynchronizeTagsS2CPacket packet) { wrapperContained.onSynchronizeTags(packet.wrapperContained); }
// public static void onSynchronizeTags(yarnwrap.network.packet.s2c.common.SynchronizeTagsS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onSynchronizeTags(packet.wrapperContained); }
public void onCustomPayload(yarnwrap.network.packet.s2c.common.CustomPayloadS2CPacket packet) { wrapperContained.onCustomPayload(packet.wrapperContained); }
// public static void onCustomPayload(yarnwrap.network.packet.s2c.common.CustomPayloadS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onCustomPayload(packet.wrapperContained); }
public void onDisconnect(yarnwrap.network.packet.s2c.common.DisconnectS2CPacket packet) { wrapperContained.onDisconnect(packet.wrapperContained); }
// public static void onDisconnect(yarnwrap.network.packet.s2c.common.DisconnectS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onDisconnect(packet.wrapperContained); }
public void onKeepAlive(yarnwrap.network.packet.s2c.common.KeepAliveS2CPacket packet) { wrapperContained.onKeepAlive(packet.wrapperContained); }
// public static void onKeepAlive(yarnwrap.network.packet.s2c.common.KeepAliveS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onKeepAlive(packet.wrapperContained); }
public void onPing(yarnwrap.network.packet.s2c.common.CommonPingS2CPacket packet) { wrapperContained.onPing(packet.wrapperContained); }
// public static void onPing(yarnwrap.network.packet.s2c.common.CommonPingS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onPing(packet.wrapperContained); }
public void onResourcePackSend(yarnwrap.network.packet.s2c.common.ResourcePackSendS2CPacket packet) { wrapperContained.onResourcePackSend(packet.wrapperContained); }
// public static void onResourcePackSend(yarnwrap.network.packet.s2c.common.ResourcePackSendS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onResourcePackSend(packet.wrapperContained); }
public void onResourcePackRemove(yarnwrap.network.packet.s2c.common.ResourcePackRemoveS2CPacket packet) { wrapperContained.onResourcePackRemove(packet.wrapperContained); }
// public static void onResourcePackRemove(yarnwrap.network.packet.s2c.common.ResourcePackRemoveS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onResourcePackRemove(packet.wrapperContained); }
public void onStoreCookie(yarnwrap.network.packet.s2c.common.StoreCookieS2CPacket packet) { wrapperContained.onStoreCookie(packet.wrapperContained); }
// public static void onStoreCookie(yarnwrap.network.packet.s2c.common.StoreCookieS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onStoreCookie(packet.wrapperContained); }
public void onServerTransfer(yarnwrap.network.packet.s2c.common.ServerTransferS2CPacket packet) { wrapperContained.onServerTransfer(packet.wrapperContained); }
// public static void onServerTransfer(yarnwrap.network.packet.s2c.common.ServerTransferS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onServerTransfer(packet.wrapperContained); }
public void onCustomReportDetails(yarnwrap.network.packet.s2c.common.CustomReportDetailsS2CPacket packet) { wrapperContained.onCustomReportDetails(packet.wrapperContained); }
// public static void onCustomReportDetails(yarnwrap.network.packet.s2c.common.CustomReportDetailsS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onCustomReportDetails(packet.wrapperContained); }
public void onServerLinks(yarnwrap.network.packet.s2c.common.ServerLinksS2CPacket packet) { wrapperContained.onServerLinks(packet.wrapperContained); }
// public static void onServerLinks(yarnwrap.network.packet.s2c.common.ServerLinksS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onServerLinks(packet.wrapperContained); }
// public void onClearDialog(yarnwrap.network.packet.s2c.common.ClearDialogS2CPacket packet) { wrapperContained.onClearDialog(packet.wrapperContained); }
// public static void onClearDialog(yarnwrap.network.packet.s2c.common.ClearDialogS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onClearDialog(packet.wrapperContained); }
// public void onShowDialog(yarnwrap.network.packet.s2c.common.ShowDialogS2CPacket packet) { wrapperContained.onShowDialog(packet.wrapperContained); }
// public static void onShowDialog(yarnwrap.network.packet.s2c.common.ShowDialogS2CPacket packet, ) { net.minecraft.network.listener.ClientCommonPacketListener.onShowDialog(packet.wrapperContained); }

}