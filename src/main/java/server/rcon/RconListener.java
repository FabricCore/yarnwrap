package yarnwrap.server.rcon;
public class RconListener { public net.minecraft.server.rcon.RconListener wrapperContained; public RconListener(net.minecraft.server.rcon.RconListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.ServerSocket listener() { return wrapperContained.listener; }
// public java.lang.String password() { return wrapperContained.password; }
// public java.util.List clients() { return wrapperContained.clients; }
// public org.slf4j.Logger SERVER_LOGGER() { return wrapperContained.SERVER_LOGGER; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void removeStoppedClients() { wrapperContained.removeStoppedClients(); }
// public void closeSocket(java.net.ServerSocket socket) { wrapperContained.closeSocket(socket); }
public yarnwrap.server.rcon.RconListener create(yarnwrap.server.dedicated.DedicatedServer server) { return new yarnwrap.server.rcon.RconListener(wrapperContained.create(server.wrapperContained)); }

}