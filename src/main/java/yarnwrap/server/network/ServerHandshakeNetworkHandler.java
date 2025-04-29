package yarnwrap.server.network;
public class ServerHandshakeNetworkHandler { public net.minecraft.server.network.ServerHandshakeNetworkHandler wrapperContained; public ServerHandshakeNetworkHandler(net.minecraft.server.network.ServerHandshakeNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.server.network.ServerHandshakeNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.server.network.ServerHandshakeNetworkHandler.connection = value.wrapperContained; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.network.ServerHandshakeNetworkHandler.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.network.ServerHandshakeNetworkHandler.server = value.wrapperContained; }

// public yarnwrap.text.Text IGNORING_STATUS_REQUEST_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.IGNORING_STATUS_REQUEST_MESSAGE); }
// public void IGNORING_STATUS_REQUEST_MESSAGE(yarnwrap.text.Text value) { wrapperContained.IGNORING_STATUS_REQUEST_MESSAGE = value.wrapperContained; }
// public static yarnwrap.text.Text IGNORING_STATUS_REQUEST_MESSAGE() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerHandshakeNetworkHandler.IGNORING_STATUS_REQUEST_MESSAGE); }
// public static void IGNORING_STATUS_REQUEST_MESSAGE(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerHandshakeNetworkHandler.IGNORING_STATUS_REQUEST_MESSAGE = value.wrapperContained; }

public ServerHandshakeNetworkHandler(yarnwrap.server.MinecraftServer server,yarnwrap.network.ClientConnection connection) { this.wrapperContained = new net.minecraft.server.network.ServerHandshakeNetworkHandler(server.wrapperContained,connection.wrapperContained); }
// public void login(yarnwrap.network.packet.c2s.handshake.HandshakeC2SPacket packet,boolean transfer) { wrapperContained.login(packet.wrapperContained,transfer); }
// public static void login(yarnwrap.network.packet.c2s.handshake.HandshakeC2SPacket packet,boolean transfer, ) { net.minecraft.server.network.ServerHandshakeNetworkHandler.login(packet.wrapperContained,transfer); }

}