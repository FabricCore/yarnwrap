package yarnwrap.client.network;
public class ClientCommonNetworkHandler { public net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained; public ClientCommonNetworkHandler(net.minecraft.client.network.ClientCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientCommonNetworkHandler.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.client = value.wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.network.ClientCommonNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.connection = value.wrapperContained; }

// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public static yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ClientCommonNetworkHandler.serverInfo); }
// public static void serverInfo(yarnwrap.client.network.ServerInfo value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.serverInfo = value.wrapperContained; }

// public java.lang.String brand() { return wrapperContained.brand; }
// public void brand(java.lang.String value) { wrapperContained.brand = value; }
// public static java.lang.String brand() { return net.minecraft.client.network.ClientCommonNetworkHandler.brand; }
// public static void brand(java.lang.String value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.brand = value; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(net.minecraft.client.network.ClientCommonNetworkHandler.worldSession); }
// public static void worldSession(yarnwrap.client.session.telemetry.WorldSession value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.worldSession = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen postDisconnectScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.postDisconnectScreen); }
// public void postDisconnectScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.postDisconnectScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen postDisconnectScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.network.ClientCommonNetworkHandler.postDisconnectScreen); }
// public static void postDisconnectScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.postDisconnectScreen = value.wrapperContained; }

// public yarnwrap.text.Text LOST_CONNECTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOST_CONNECTION_TEXT); }
// public void LOST_CONNECTION_TEXT(yarnwrap.text.Text value) { wrapperContained.LOST_CONNECTION_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text LOST_CONNECTION_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.ClientCommonNetworkHandler.LOST_CONNECTION_TEXT); }
// public static void LOST_CONNECTION_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.LOST_CONNECTION_TEXT = value.wrapperContained; }

// public java.util.List queuedPackets() { return wrapperContained.queuedPackets; }
// public void queuedPackets(java.util.List value) { wrapperContained.queuedPackets = value; }
// public static java.util.List queuedPackets() { return net.minecraft.client.network.ClientCommonNetworkHandler.queuedPackets; }
// public static void queuedPackets(java.util.List value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.queuedPackets = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientCommonNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.LOGGER = value; }

// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public void serverCookies(java.util.Map value) { wrapperContained.serverCookies = value; }
// public static java.util.Map serverCookies() { return net.minecraft.client.network.ClientCommonNetworkHandler.serverCookies; }
// public static void serverCookies(java.util.Map value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.serverCookies = value; }

// public boolean transferring() { return wrapperContained.transferring; }
// public void transferring(boolean value) { wrapperContained.transferring = value; }
// public static boolean transferring() { return net.minecraft.client.network.ClientCommonNetworkHandler.transferring; }
// public static void transferring(boolean value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.transferring = value; }

// public java.util.Map customReportDetails() { return wrapperContained.customReportDetails; }
// public void customReportDetails(java.util.Map value) { wrapperContained.customReportDetails = value; }
// public static java.util.Map customReportDetails() { return net.minecraft.client.network.ClientCommonNetworkHandler.customReportDetails; }
// public static void customReportDetails(java.util.Map value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.customReportDetails = value; }

// public yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(wrapperContained.serverLinks); }
// public void serverLinks(yarnwrap.server.ServerLinks value) { wrapperContained.serverLinks = value.wrapperContained; }
// public static yarnwrap.server.ServerLinks serverLinks() { return new yarnwrap.server.ServerLinks(net.minecraft.client.network.ClientCommonNetworkHandler.serverLinks); }
// public static void serverLinks(yarnwrap.server.ServerLinks value, ) { net.minecraft.client.network.ClientCommonNetworkHandler.serverLinks = value.wrapperContained; }

// public ClientCommonNetworkHandler(yarnwrap.client.MinecraftClient client,yarnwrap.network.ClientConnection connection,yarnwrap.client.network.ClientConnectionState connectionState) { this.wrapperContained = new net.minecraft.client.network.ClientCommonNetworkHandler(client.wrapperContained,connection.wrapperContained,connectionState.wrapperContained); }
// public void onCustomPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.onCustomPayload(payload.wrapperContained); }
// public static void onCustomPayload(yarnwrap.network.packet.CustomPayload payload, ) { net.minecraft.client.network.ClientCommonNetworkHandler.onCustomPayload(payload.wrapperContained); }
// public java.net.URL getParsedResourcePackUrl(java.lang.String url) { return wrapperContained.getParsedResourcePackUrl(url); }
// public static java.net.URL getParsedResourcePackUrl(java.lang.String url, ) { return net.minecraft.client.network.ClientCommonNetworkHandler.getParsedResourcePackUrl(url); }
// public yarnwrap.text.Text getPrompt(yarnwrap.text.Text requirementPrompt,yarnwrap.text.Text customPrompt) { return new yarnwrap.text.Text(wrapperContained.getPrompt(requirementPrompt.wrapperContained,customPrompt.wrapperContained)); }
// public static yarnwrap.text.Text getPrompt(yarnwrap.text.Text requirementPrompt,yarnwrap.text.Text customPrompt, ) { return new yarnwrap.text.Text(net.minecraft.client.network.ClientCommonNetworkHandler.getPrompt(requirementPrompt.wrapperContained,customPrompt.wrapperContained)); }
// public void send(yarnwrap.network.packet.Packet packet,java.util.function.BooleanSupplier sendCondition,java.time.Duration expiry) { wrapperContained.send(packet.wrapperContained,sendCondition,expiry); }
// public static void send(yarnwrap.network.packet.Packet packet,java.util.function.BooleanSupplier sendCondition,java.time.Duration expiry, ) { net.minecraft.client.network.ClientCommonNetworkHandler.send(packet.wrapperContained,sendCondition,expiry); }
// public yarnwrap.client.gui.screen.Screen createDisconnectedScreen(yarnwrap.network.DisconnectionInfo info) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createDisconnectedScreen(info.wrapperContained)); }
// public static yarnwrap.client.gui.screen.Screen createDisconnectedScreen(yarnwrap.network.DisconnectionInfo info, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.network.ClientCommonNetworkHandler.createDisconnectedScreen(info.wrapperContained)); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public static void sendPacket(yarnwrap.network.packet.Packet packet, ) { net.minecraft.client.network.ClientCommonNetworkHandler.sendPacket(packet.wrapperContained); }
// public void sendQueuedPackets() { wrapperContained.sendQueuedPackets(); }
// public static void sendQueuedPackets() { net.minecraft.client.network.ClientCommonNetworkHandler.sendQueuedPackets(); }
public java.lang.String getBrand() { return wrapperContained.getBrand(); }
// public static java.lang.String getBrand() { return net.minecraft.client.network.ClientCommonNetworkHandler.getBrand(); }
// public void method_55511(java.util.UUID id) { wrapperContained.method_55511(id); }
// public static void method_55511(java.util.UUID id, ) { net.minecraft.client.network.ClientCommonNetworkHandler.method_55511(id); }
// public yarnwrap.client.gui.screen.Screen createConfirmServerResourcePackScreen(java.util.UUID id,java.net.URL url,java.lang.String hash,boolean required,yarnwrap.text.Text prompt) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.createConfirmServerResourcePackScreen(id,url,hash,required,prompt.wrapperContained)); }
// public static yarnwrap.client.gui.screen.Screen createConfirmServerResourcePackScreen(java.util.UUID id,java.net.URL url,java.lang.String hash,boolean required,yarnwrap.text.Text prompt, ) { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.network.ClientCommonNetworkHandler.createConfirmServerResourcePackScreen(id,url,hash,required,prompt.wrapperContained)); }
// public java.util.List method_60880(Object bugReportEntry) { return wrapperContained.method_60880(bugReportEntry); }
// public static java.util.List method_60880(Object bugReportEntry, ) { return net.minecraft.client.network.ClientCommonNetworkHandler.method_60880(bugReportEntry); }
// public java.util.Optional savePacketErrorReport(yarnwrap.network.packet.Packet packet,java.lang.Throwable exception) { return wrapperContained.savePacketErrorReport(packet.wrapperContained,exception); }
// public static java.util.Optional savePacketErrorReport(yarnwrap.network.packet.Packet packet,java.lang.Throwable exception, ) { return net.minecraft.client.network.ClientCommonNetworkHandler.savePacketErrorReport(packet.wrapperContained,exception); }
// public void showDialog(yarnwrap.registry.entry.RegistryEntry dialog) { wrapperContained.showDialog(dialog.wrapperContained); }
// public static void showDialog(yarnwrap.registry.entry.RegistryEntry dialog, ) { net.minecraft.client.network.ClientCommonNetworkHandler.showDialog(dialog.wrapperContained); }

}