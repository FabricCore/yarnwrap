package yarnwrap.server.network;
public class ServerCommonNetworkHandler { public net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained; public ServerCommonNetworkHandler(net.minecraft.server.network.ServerCommonNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int KEEP_ALIVE_INTERVAL() { return wrapperContained.KEEP_ALIVE_INTERVAL; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text TIMEOUT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TIMEOUT_TEXT); }
// public long lastKeepAliveTime() { return wrapperContained.lastKeepAliveTime; }
// public boolean waitingForKeepAlive() { return wrapperContained.waitingForKeepAlive; }
// public long keepAliveId() { return wrapperContained.keepAliveId; }
// public int latency() { return wrapperContained.latency; }
// public boolean flushDisabled() { return wrapperContained.flushDisabled; }
// public yarnwrap.text.Text UNEXPECTED_QUERY_RESPONSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNEXPECTED_QUERY_RESPONSE_TEXT); }
// public boolean transferred() { return wrapperContained.transferred; }
// public int TRANSITION_TIMEOUT() { return wrapperContained.TRANSITION_TIMEOUT; }
// public long transitionStartTime() { return wrapperContained.transitionStartTime; }
// public boolean transitioning() { return wrapperContained.transitioning; }
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