package yarnwrap.server.network;
public class ServerQueryNetworkHandler { public net.minecraft.server.network.ServerQueryNetworkHandler wrapperContained; public ServerQueryNetworkHandler(net.minecraft.server.network.ServerQueryNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean responseSent() { return wrapperContained.responseSent; }
// public void responseSent(boolean value) { wrapperContained.responseSent = value; }
// public static boolean responseSent() { return net.minecraft.server.network.ServerQueryNetworkHandler.responseSent; }
// public static void responseSent(boolean value, ) { net.minecraft.server.network.ServerQueryNetworkHandler.responseSent = value; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.server.network.ServerQueryNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.server.network.ServerQueryNetworkHandler.connection = value.wrapperContained; }

// public yarnwrap.text.Text REQUEST_HANDLED() { return new yarnwrap.text.Text(wrapperContained.REQUEST_HANDLED); }
// public void REQUEST_HANDLED(yarnwrap.text.Text value) { wrapperContained.REQUEST_HANDLED = value.wrapperContained; }
// public static yarnwrap.text.Text REQUEST_HANDLED() { return new yarnwrap.text.Text(net.minecraft.server.network.ServerQueryNetworkHandler.REQUEST_HANDLED); }
// public static void REQUEST_HANDLED(yarnwrap.text.Text value, ) { net.minecraft.server.network.ServerQueryNetworkHandler.REQUEST_HANDLED = value.wrapperContained; }

// public yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.server.ServerMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.server.ServerMetadata metadata() { return new yarnwrap.server.ServerMetadata(net.minecraft.server.network.ServerQueryNetworkHandler.metadata); }
// public static void metadata(yarnwrap.server.ServerMetadata value, ) { net.minecraft.server.network.ServerQueryNetworkHandler.metadata = value.wrapperContained; }

public ServerQueryNetworkHandler(yarnwrap.server.ServerMetadata metadata,yarnwrap.network.ClientConnection connection) { this.wrapperContained = new net.minecraft.server.network.ServerQueryNetworkHandler(metadata.wrapperContained,connection.wrapperContained); }

}