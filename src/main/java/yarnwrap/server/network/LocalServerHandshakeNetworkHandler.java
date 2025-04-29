package yarnwrap.server.network;
public class LocalServerHandshakeNetworkHandler { public net.minecraft.server.network.LocalServerHandshakeNetworkHandler wrapperContained; public LocalServerHandshakeNetworkHandler(net.minecraft.server.network.LocalServerHandshakeNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.server.network.LocalServerHandshakeNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.server.network.LocalServerHandshakeNetworkHandler.connection = value.wrapperContained; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.network.LocalServerHandshakeNetworkHandler.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.network.LocalServerHandshakeNetworkHandler.server = value.wrapperContained; }

public LocalServerHandshakeNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection) { this.wrapperContained = new net.minecraft.server.network.LocalServerHandshakeNetworkHandler(server.wrapperContained,connection.wrapperContained); }

}