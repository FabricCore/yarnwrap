package yarnwrap.client.network;
public class ClientCommonNetworkHandler { public net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained; public ClientCommonNetworkHandler(net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public java.lang.String brand() { return wrapperContained.brand; }
// public void brand(java.lang.String value) { wrapperContained.brand = value; }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen postDisconnectScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.postDisconnectScreen); }
// public void postDisconnectScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.postDisconnectScreen = value.wrapperContained; }
// public yarnwrap.text.Text LOST_CONNECTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOST_CONNECTION_TEXT); }
// public void LOST_CONNECTION_TEXT(yarnwrap.text.Text value) { wrapperContained.LOST_CONNECTION_TEXT = value.wrapperContained; }
// public java.util.List queuedPackets() { return wrapperContained.queuedPackets; }
// public void queuedPackets(java.util.List value) { wrapperContained.queuedPackets = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public void serverCookies(java.util.Map value) { wrapperContained.serverCookies = value; }
// public boolean transferring() { return wrapperContained.transferring; }
// public void transferring(boolean value) { wrapperContained.transferring = value; }
// // public boolean strictErrorHandling() { return wrapperContained.strictErrorHandling; }
// // public void strictErrorHandling(boolean value) { wrapperContained.strictErrorHandling = value; }
// public java.util.Map customReportDetails() { return wrapperContained.customReportDetails; }
// public void customReportDetails(java.util.Map value) { wrapperContained.customReportDetails = value; }
// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
// public void serverLinks(yarnwrap.server.ServerLinks value) { wrapperContained.serverLinks = value.wrapperContained; }
// public ClientCommonNetworkHandler(yarnwrap.client.MinecraftClient client,yarnwrap.network.ClientConnection connection,yarnwrap.client.network.ClientConnectionState connectionState) { this.wrapperContained = new net.minecraft.client.network.ClientCommonNetworkHandler(client.wrapperContained,connection.wrapperContained,connectionState.wrapperContained); }
// public void onCustomPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.onCustomPayload(payload.wrapperContained); }
// public java.net.URL getParsedResourcePackUrl(java.lang.String url) { return wrapperContained.getParsedResourcePackUrl(url); }
// public yarnwrap.text.Text getPrompt(yarnwrap.text.Text requirementPrompt,yarnwrap.text.Text customPrompt) { return new yarnwrap.text.Text(wrapperContained.getPrompt(requirementPrompt.wrapperContained,customPrompt.wrapperContained)); }
// public void send(yarnwrap.network.packet.Packet packet,java.util.function.BooleanSupplier sendCondition,java.time.Duration expiry) { wrapperContained.send(packet.wrapperContained,sendCondition,expiry); }
// public yarnwrap.client.gui.screen.Screen createDisconnectedScreen(yarnwrap.network.DisconnectionInfo info) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createDisconnectedScreen(info.wrapperContained)); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public void sendQueuedPackets() { wrapperContained.sendQueuedPackets(); }
public java.lang.String getBrand() { return wrapperContained.getBrand(); }
// public void method_55511(java.util.UUID id) { wrapperContained.method_55511(id); }
// public yarnwrap.client.gui.screen.Screen createConfirmServerResourcePackScreen(java.util.UUID id,java.net.URL url,java.lang.String hash,boolean required,yarnwrap.text.Text prompt) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createConfirmServerResourcePackScreen(id,url,hash,required,prompt.wrapperContained)); }
// public java.util.List method_60880(Object bugReportEntry) { return wrapperContained.method_60880(bugReportEntry); }
// public java.util.Optional savePacketErrorReport(yarnwrap.network.packet.Packet packet,java.lang.Throwable exception) { return wrapperContained.savePacketErrorReport(packet.wrapperContained,exception); }

}