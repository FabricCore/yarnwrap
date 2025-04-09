package yarnwrap.client.network;
public class ClientCommonNetworkHandler { public net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained; public ClientCommonNetworkHandler(net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public java.lang.String brand() { return wrapperContained.brand; }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public yarnwrap.client.gui.screen.Screen postDisconnectScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.postDisconnectScreen); }
// public yarnwrap.text.Text LOST_CONNECTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOST_CONNECTION_TEXT); }
// public java.util.List queuedPackets() { return wrapperContained.queuedPackets; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public boolean transferring() { return wrapperContained.transferring; }
// // public boolean strictErrorHandling() { return wrapperContained.strictErrorHandling; }
// public java.util.Map customReportDetails() { return wrapperContained.customReportDetails; }
// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
// public void onCustomPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.onCustomPayload(payload.wrapperContained); }
// public java.net.URL getParsedResourcePackUrl(java.lang.String url) { return wrapperContained.getParsedResourcePackUrl(url); }
// public yarnwrap.text.Text getPrompt(yarnwrap.text.Text requirementPrompt,yarnwrap.text.Text customPrompt) { return new yarnwrap.text.Text(wrapperContained.getPrompt(requirementPrompt.wrapperContained,customPrompt.wrapperContained)); }
// public void send(yarnwrap.network.packet.Packet packet,java.util.function.BooleanSupplier sendCondition,java.time.Duration expiry) { wrapperContained.send(packet.wrapperContained,sendCondition,expiry); }
// public yarnwrap.client.gui.screen.Screen createDisconnectedScreen(yarnwrap.network.DisconnectionInfo info) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createDisconnectedScreen(info.wrapperContained)); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public void sendQueuedPackets() { wrapperContained.sendQueuedPackets(); }
public java.lang.String getBrand() { return wrapperContained.getBrand(); }
// public yarnwrap.client.gui.screen.Screen createConfirmServerResourcePackScreen(java.util.UUID id,java.net.URL url,java.lang.String hash,boolean required,yarnwrap.text.Text prompt) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createConfirmServerResourcePackScreen(id,url,hash,required,prompt.wrapperContained)); }
// public java.util.Optional savePacketErrorReport(yarnwrap.network.packet.Packet packet,java.lang.Throwable exception) { return wrapperContained.savePacketErrorReport(packet.wrapperContained,exception); }

}