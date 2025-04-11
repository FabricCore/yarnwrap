package yarnwrap.server.rcon;
public class RconListener { public net.minecraft.server.rcon.RconListener wrapperContained; public RconListener(net.minecraft.server.rcon.RconListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.ServerSocket listener() { return wrapperContained.listener; }
// public void listener(java.net.ServerSocket value) { wrapperContained.listener = value; }
// public java.lang.String password() { return wrapperContained.password; }
// public void password(java.lang.String value) { wrapperContained.password = value; }
// public java.util.List clients() { return wrapperContained.clients; }
// public void clients(java.util.List value) { wrapperContained.clients = value; }
// public org.slf4j.Logger SERVER_LOGGER() { return wrapperContained.SERVER_LOGGER; }
// public void SERVER_LOGGER(org.slf4j.Logger value) { wrapperContained.SERVER_LOGGER = value; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.DedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public RconListener(yarnwrap.server.dedicated.DedicatedServer server,java.net.ServerSocket listener,java.lang.String password) { this.wrapperContained = new net.minecraft.server.rcon.RconListener(server.wrapperContained,listener,password); }
// public void removeStoppedClients() { wrapperContained.removeStoppedClients(); }
// public boolean method_27175(yarnwrap.server.rcon.RconClient client) { return wrapperContained.method_27175(client.wrapperContained); }
// public void closeSocket(java.net.ServerSocket socket) { wrapperContained.closeSocket(socket); }
public yarnwrap.server.rcon.RconListener create(yarnwrap.server.dedicated.DedicatedServer server) { return new yarnwrap.server.rcon.RconListener(wrapperContained.create(server.wrapperContained)); }

}