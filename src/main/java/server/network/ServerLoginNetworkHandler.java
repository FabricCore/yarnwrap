package yarnwrap.server.network;
public class ServerLoginNetworkHandler { public net.minecraft.server.network.ServerLoginNetworkHandler wrapperContained; public ServerLoginNetworkHandler(net.minecraft.server.network.ServerLoginNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int loginTicks() { return wrapperContained.loginTicks; }
// public java.util.concurrent.atomic.AtomicInteger NEXT_AUTHENTICATOR_THREAD_ID() { return wrapperContained.NEXT_AUTHENTICATOR_THREAD_ID; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public Object state() { return wrapperContained.state; }
// public java.lang.String serverId() { return wrapperContained.serverId; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public byte[] nonce() { return wrapperContained.nonce; }
// public int TIMEOUT_TICKS() { return wrapperContained.TIMEOUT_TICKS; }
// public java.lang.String profileName() { return wrapperContained.profileName; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public boolean transferred() { return wrapperContained.transferred; }
public void disconnect(yarnwrap.text.Text reason) { wrapperContained.disconnect(reason.wrapperContained); }
public java.lang.String getConnectionInfo() { return wrapperContained.getConnectionInfo(); }
// public boolean hasPlayerWithId(com.mojang.authlib.GameProfile profile) { return wrapperContained.hasPlayerWithId(profile); }
// public void startVerify(com.mojang.authlib.GameProfile profile) { wrapperContained.startVerify(profile); }
// public void tickVerify(com.mojang.authlib.GameProfile profile) { wrapperContained.tickVerify(profile); }
// public void sendSuccessPacket(com.mojang.authlib.GameProfile profile) { wrapperContained.sendSuccessPacket(profile); }

}