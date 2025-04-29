package yarnwrap.server.network;
public class ServerCommonNetworkHandler { public net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained; public ServerCommonNetworkHandler(net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int KEEP_ALIVE_INTERVAL() { return wrapperContained.KEEP_ALIVE_INTERVAL; }
// public void KEEP_ALIVE_INTERVAL(int value) { wrapperContained.KEEP_ALIVE_INTERVAL = value; }
public static int KEEP_ALIVE_INTERVAL() { return net.minecraft.server.network.ServerCommonNetworkHandler.KEEP_ALIVE_INTERVAL; }
// public static void KEEP_ALIVE_INTERVAL(int value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.KEEP_ALIVE_INTERVAL = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.network.ServerCommonNetworkHandler.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.server = value.wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.server.network.ServerCommonNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.connection = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerCommonNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.LOGGER = value; }

// public yarnwrap.text.Text TIMEOUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TIMEOUT_TEXT); }
// public void TIMEOUT_TEXT(yarnwrap.text.Text value) { wrapperContained.TIMEOUT_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TIMEOUT_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerCommonNetworkHandler.TIMEOUT_TEXT); }
// public static void TIMEOUT_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.TIMEOUT_TEXT = value.wrapperContained; }

// public long lastKeepAliveTime() { return wrapperContained.lastKeepAliveTime; }
// public void lastKeepAliveTime(long value) { wrapperContained.lastKeepAliveTime = value; }
// public static long lastKeepAliveTime() { return net.minecraft.server.network.ServerCommonNetworkHandler.lastKeepAliveTime; }
// public static void lastKeepAliveTime(long value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.lastKeepAliveTime = value; }

// public boolean waitingForKeepAlive() { return wrapperContained.waitingForKeepAlive; }
// public void waitingForKeepAlive(boolean value) { wrapperContained.waitingForKeepAlive = value; }
// public static boolean waitingForKeepAlive() { return net.minecraft.server.network.ServerCommonNetworkHandler.waitingForKeepAlive; }
// public static void waitingForKeepAlive(boolean value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.waitingForKeepAlive = value; }

// public long keepAliveId() { return wrapperContained.keepAliveId; }
// public void keepAliveId(long value) { wrapperContained.keepAliveId = value; }
// public static long keepAliveId() { return net.minecraft.server.network.ServerCommonNetworkHandler.keepAliveId; }
// public static void keepAliveId(long value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.keepAliveId = value; }

// public int latency() { return wrapperContained.latency; }
// public void latency(int value) { wrapperContained.latency = value; }
// public static int latency() { return net.minecraft.server.network.ServerCommonNetworkHandler.latency; }
// public static void latency(int value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.latency = value; }

// public boolean flushDisabled() { return wrapperContained.flushDisabled; }
// public void flushDisabled(boolean value) { wrapperContained.flushDisabled = value; }
// public static boolean flushDisabled() { return net.minecraft.server.network.ServerCommonNetworkHandler.flushDisabled; }
// public static void flushDisabled(boolean value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.flushDisabled = value; }

// public yarnwrap.text.Text UNEXPECTED_QUERY_RESPONSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNEXPECTED_QUERY_RESPONSE_TEXT); }
// public void UNEXPECTED_QUERY_RESPONSE_TEXT(yarnwrap.text.Text value) { wrapperContained.UNEXPECTED_QUERY_RESPONSE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text UNEXPECTED_QUERY_RESPONSE_TEXT() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerCommonNetworkHandler.UNEXPECTED_QUERY_RESPONSE_TEXT); }
// public static void UNEXPECTED_QUERY_RESPONSE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.UNEXPECTED_QUERY_RESPONSE_TEXT = value.wrapperContained; }

// public boolean transferred() { return wrapperContained.transferred; }
// public void transferred(boolean value) { wrapperContained.transferred = value; }
// public static boolean transferred() { return net.minecraft.server.network.ServerCommonNetworkHandler.transferred; }
// public static void transferred(boolean value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.transferred = value; }

// public int TRANSITION_TIMEOUT() { return wrapperContained.TRANSITION_TIMEOUT; }
// public void TRANSITION_TIMEOUT(int value) { wrapperContained.TRANSITION_TIMEOUT = value; }
// public static int TRANSITION_TIMEOUT() { return net.minecraft.server.network.ServerCommonNetworkHandler.TRANSITION_TIMEOUT; }
// public static void TRANSITION_TIMEOUT(int value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.TRANSITION_TIMEOUT = value; }

// public long transitionStartTime() { return wrapperContained.transitionStartTime; }
// public void transitionStartTime(long value) { wrapperContained.transitionStartTime = value; }
// public static long transitionStartTime() { return net.minecraft.server.network.ServerCommonNetworkHandler.transitionStartTime; }
// public static void transitionStartTime(long value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.transitionStartTime = value; }

// public boolean transitioning() { return wrapperContained.transitioning; }
// public void transitioning(boolean value) { wrapperContained.transitioning = value; }
// public static boolean transitioning() { return net.minecraft.server.network.ServerCommonNetworkHandler.transitioning; }
// public static void transitioning(boolean value, ) { net.minecraft.server.network.ServerCommonNetworkHandler.transitioning = value; }

// public ServerCommonNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ConnectedClientData clientData) { this.wrapperContained = new net.minecraft.server.network.ServerCommonNetworkHandler(server.wrapperContained,connection.wrapperContained,clientData.wrapperContained); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public static void sendPacket(yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.network.ServerCommonNetworkHandler.sendPacket(packet.wrapperContained); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained); }
// public static void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks, ) { net.minecraft.server.network.ServerCommonNetworkHandler.send(packet.wrapperContained,callbacks.wrapperContained); }
public void disconnect(yarnwrap.text.Text reason) { wrapperContained.disconnect(reason.wrapperContained); }
// public static void disconnect(yarnwrap.text.Text reason, ) { net.minecraft.server.network.ServerCommonNetworkHandler.disconnect(reason.wrapperContained); }
// public void baseTick() { wrapperContained.baseTick(); }
// public static void baseTick() { net.minecraft.server.network.ServerCommonNetworkHandler.baseTick(); }
// public boolean isHost() { return wrapperContained.isHost(); }
// public static boolean isHost() { return net.minecraft.server.network.ServerCommonNetworkHandler.isHost(); }
// public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
// public static com.mojang.authlib.GameProfile getProfile() { return net.minecraft.server.network.ServerCommonNetworkHandler.getProfile(); }
public com.mojang.authlib.GameProfile getDebugProfile() { return wrapperContained.getDebugProfile(); }
// public static com.mojang.authlib.GameProfile getDebugProfile() { return net.minecraft.server.network.ServerCommonNetworkHandler.getDebugProfile(); }
public int getLatency() { return wrapperContained.getLatency(); }
// public static int getLatency() { return net.minecraft.server.network.ServerCommonNetworkHandler.getLatency(); }
public void disableFlush() { wrapperContained.disableFlush(); }
// public static void disableFlush() { net.minecraft.server.network.ServerCommonNetworkHandler.disableFlush(); }
public void enableFlush() { wrapperContained.enableFlush(); }
// public static void enableFlush() { net.minecraft.server.network.ServerCommonNetworkHandler.enableFlush(); }
// public yarnwrap.server.network.ConnectedClientData createClientData(yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions) { return new yarnwrap.server.network.ConnectedClientData(wrapperContained.createClientData(syncedOptions.wrapperContained)); }
// public static yarnwrap.server.network.ConnectedClientData createClientData(yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions, ) { return new yarnwrap.server.network.ConnectedClientData(net.minecraft.server.network.ServerCommonNetworkHandler.createClientData(syncedOptions.wrapperContained)); }
// public boolean checkTransitionTimeout(long time) { return wrapperContained.checkTransitionTimeout(time); }
// public static boolean checkTransitionTimeout(long time, ) { return net.minecraft.server.network.ServerCommonNetworkHandler.checkTransitionTimeout(time); }
// public void markTransitionTime() { wrapperContained.markTransitionTime(); }
// public static void markTransitionTime() { net.minecraft.server.network.ServerCommonNetworkHandler.markTransitionTime(); }
public void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo) { wrapperContained.disconnect(disconnectionInfo.wrapperContained); }
// public static void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo, ) { net.minecraft.server.network.ServerCommonNetworkHandler.disconnect(disconnectionInfo.wrapperContained); }

}