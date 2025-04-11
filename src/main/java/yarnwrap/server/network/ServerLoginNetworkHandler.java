package yarnwrap.server.network;
public class ServerLoginNetworkHandler { public net.minecraft.server.network.ServerLoginNetworkHandler wrapperContained; public ServerLoginNetworkHandler(net.minecraft.server.network.ServerLoginNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int loginTicks() { return wrapperContained.loginTicks; }
// public void loginTicks(int value) { wrapperContained.loginTicks = value; }
// public java.util.concurrent.atomic.AtomicInteger NEXT_AUTHENTICATOR_THREAD_ID() { return wrapperContained.NEXT_AUTHENTICATOR_THREAD_ID; }
// public void NEXT_AUTHENTICATOR_THREAD_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.NEXT_AUTHENTICATOR_THREAD_ID = value; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// public java.lang.String serverId() { return wrapperContained.serverId; }
// public void serverId(java.lang.String value) { wrapperContained.serverId = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public byte[] nonce() { return wrapperContained.nonce; }
// public void nonce(byte[] value) { wrapperContained.nonce = value; }
// public int TIMEOUT_TICKS() { return wrapperContained.TIMEOUT_TICKS; }
// public void TIMEOUT_TICKS(int value) { wrapperContained.TIMEOUT_TICKS = value; }
// public java.lang.String profileName() { return wrapperContained.profileName; }
// public void profileName(java.lang.String value) { wrapperContained.profileName = value; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public boolean transferred() { return wrapperContained.transferred; }
// public void transferred(boolean value) { wrapperContained.transferred = value; }
public ServerLoginNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection,boolean transferred) { this.wrapperContained = new net.minecraft.server.network.ServerLoginNetworkHandler(server.wrapperContained,connection.wrapperContained,transferred); }
public void disconnect(yarnwrap.text.Text reason) { wrapperContained.disconnect(reason.wrapperContained); }
public java.lang.String getConnectionInfo() { return wrapperContained.getConnectionInfo(); }
// public boolean hasPlayerWithId(com.mojang.authlib.GameProfile profile) { return wrapperContained.hasPlayerWithId(profile); }
// public void startVerify(com.mojang.authlib.GameProfile profile) { wrapperContained.startVerify(profile); }
// public void tickVerify(com.mojang.authlib.GameProfile profile) { wrapperContained.tickVerify(profile); }
// public void sendSuccessPacket(com.mojang.authlib.GameProfile profile) { wrapperContained.sendSuccessPacket(profile); }

}