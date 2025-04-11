package yarnwrap.server.network;
public class ServerCommonNetworkHandler { public net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained; public ServerCommonNetworkHandler(net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int KEEP_ALIVE_INTERVAL() { return wrapperContained.KEEP_ALIVE_INTERVAL; }
// public void KEEP_ALIVE_INTERVAL(int value) { wrapperContained.KEEP_ALIVE_INTERVAL = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TIMEOUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TIMEOUT_TEXT); }
// public void TIMEOUT_TEXT(yarnwrap.text.Text value) { wrapperContained.TIMEOUT_TEXT = value.wrapperContained; }
// public long lastKeepAliveTime() { return wrapperContained.lastKeepAliveTime; }
// public void lastKeepAliveTime(long value) { wrapperContained.lastKeepAliveTime = value; }
// public boolean waitingForKeepAlive() { return wrapperContained.waitingForKeepAlive; }
// public void waitingForKeepAlive(boolean value) { wrapperContained.waitingForKeepAlive = value; }
// public long keepAliveId() { return wrapperContained.keepAliveId; }
// public void keepAliveId(long value) { wrapperContained.keepAliveId = value; }
// public int latency() { return wrapperContained.latency; }
// public void latency(int value) { wrapperContained.latency = value; }
// public boolean flushDisabled() { return wrapperContained.flushDisabled; }
// public void flushDisabled(boolean value) { wrapperContained.flushDisabled = value; }
// public yarnwrap.text.Text UNEXPECTED_QUERY_RESPONSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNEXPECTED_QUERY_RESPONSE_TEXT); }
// public void UNEXPECTED_QUERY_RESPONSE_TEXT(yarnwrap.text.Text value) { wrapperContained.UNEXPECTED_QUERY_RESPONSE_TEXT = value.wrapperContained; }
// public boolean transferred() { return wrapperContained.transferred; }
// public void transferred(boolean value) { wrapperContained.transferred = value; }
// public int TRANSITION_TIMEOUT() { return wrapperContained.TRANSITION_TIMEOUT; }
// public void TRANSITION_TIMEOUT(int value) { wrapperContained.TRANSITION_TIMEOUT = value; }
// public long transitionStartTime() { return wrapperContained.transitionStartTime; }
// public void transitionStartTime(long value) { wrapperContained.transitionStartTime = value; }
// public boolean transitioning() { return wrapperContained.transitioning; }
// public void transitioning(boolean value) { wrapperContained.transitioning = value; }
// public ServerCommonNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection,yarnwrap.server.network.ConnectedClientData clientData) { this.wrapperContained = new net.minecraft.server.network.ServerCommonNetworkHandler(server.wrapperContained,connection.wrapperContained,clientData.wrapperContained); }
public void sendPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacket(packet.wrapperContained); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained); }
public void disconnect(yarnwrap.text.Text reason) { wrapperContained.disconnect(reason.wrapperContained); }
// public void baseTick() { wrapperContained.baseTick(); }
// public boolean isHost() { return wrapperContained.isHost(); }
// public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
public com.mojang.authlib.GameProfile getDebugProfile() { return wrapperContained.getDebugProfile(); }
public int getLatency() { return wrapperContained.getLatency(); }
public void disableFlush() { wrapperContained.disableFlush(); }
public void enableFlush() { wrapperContained.enableFlush(); }
// public yarnwrap.server.network.ConnectedClientData createClientData(yarnwrap.network.packet.c2s.common.SyncedClientOptions syncedOptions) { return new yarnwrap.server.network.ConnectedClientData(wrapperContained.createClientData(syncedOptions.wrapperContained)); }
// public boolean checkTransitionTimeout(long time) { return wrapperContained.checkTransitionTimeout(time); }
// public void markTransitionTime() { wrapperContained.markTransitionTime(); }
public void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo) { wrapperContained.disconnect(disconnectionInfo.wrapperContained); }

}