package yarnwrap.network.listener;
public class ClientCommonPacketListener { public net.minecraft.network.listener.ClientCommonPacketListener wrapperContained; public ClientCommonPacketListener(net.minecraft.network.listener.ClientCommonPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSynchronizeTags(yarnwrap.network.packet.s2c.common.SynchronizeTagsS2CPacket packet) { wrapperContained.onSynchronizeTags(packet.wrapperContained); }
public void onCustomPayload(yarnwrap.network.packet.s2c.common.CustomPayloadS2CPacket packet) { wrapperContained.onCustomPayload(packet.wrapperContained); }
public void onDisconnect(yarnwrap.network.packet.s2c.common.DisconnectS2CPacket packet) { wrapperContained.onDisconnect(packet.wrapperContained); }
public void onKeepAlive(yarnwrap.network.packet.s2c.common.KeepAliveS2CPacket packet) { wrapperContained.onKeepAlive(packet.wrapperContained); }
public void onPing(yarnwrap.network.packet.s2c.common.CommonPingS2CPacket packet) { wrapperContained.onPing(packet.wrapperContained); }
public void onResourcePackSend(yarnwrap.network.packet.s2c.common.ResourcePackSendS2CPacket packet) { wrapperContained.onResourcePackSend(packet.wrapperContained); }
public void onResourcePackRemove(yarnwrap.network.packet.s2c.common.ResourcePackRemoveS2CPacket packet) { wrapperContained.onResourcePackRemove(packet.wrapperContained); }
public void onStoreCookie(yarnwrap.network.packet.s2c.common.StoreCookieS2CPacket packet) { wrapperContained.onStoreCookie(packet.wrapperContained); }
public void onServerTransfer(yarnwrap.network.packet.s2c.common.ServerTransferS2CPacket packet) { wrapperContained.onServerTransfer(packet.wrapperContained); }
public void onCustomReportDetails(yarnwrap.network.packet.s2c.common.CustomReportDetailsS2CPacket packet) { wrapperContained.onCustomReportDetails(packet.wrapperContained); }
public void onServerLinks(yarnwrap.network.packet.s2c.common.ServerLinksS2CPacket packet) { wrapperContained.onServerLinks(packet.wrapperContained); }

}