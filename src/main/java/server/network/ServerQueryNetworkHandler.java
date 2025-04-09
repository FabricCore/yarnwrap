package yarnwrap.server.network;
public class ServerQueryNetworkHandler { public net.minecraft.server.network.ServerQueryNetworkHandler wrapperContained; public ServerQueryNetworkHandler(net.minecraft.server.network.ServerQueryNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean responseSent() { return wrapperContained.responseSent; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.text.Text REQUEST_HANDLED() { return new yarnwrap.text.Text(wrapperContained.REQUEST_HANDLED); }
// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }

}