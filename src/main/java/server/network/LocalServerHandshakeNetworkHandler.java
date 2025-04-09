package yarnwrap.server.network;
public class LocalServerHandshakeNetworkHandler { public net.minecraft.server.network.LocalServerHandshakeNetworkHandler wrapperContained; public LocalServerHandshakeNetworkHandler(net.minecraft.server.network.LocalServerHandshakeNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }

}