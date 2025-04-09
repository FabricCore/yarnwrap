package yarnwrap.server.network;
public class ServerHandshakeNetworkHandler { public net.minecraft.server.network.ServerHandshakeNetworkHandler wrapperContained; public ServerHandshakeNetworkHandler(net.minecraft.server.network.ServerHandshakeNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public yarnwrap.text.Text IGNORING_STATUS_REQUEST_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.IGNORING_STATUS_REQUEST_MESSAGE); }
// public void login(yarnwrap.network.packet.c2s.handshake.HandshakeC2SPacket packet,boolean transfer) { wrapperContained.login(packet.wrapperContained,transfer); }

}