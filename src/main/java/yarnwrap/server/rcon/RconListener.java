package yarnwrap.server.rcon;
public class RconListener { public net.minecraft.server.rcon.RconListener wrapperContained; public RconListener(net.minecraft.server.rcon.RconListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.ServerSocket listener() { return wrapperContained.listener; }
// public void listener(java.net.ServerSocket value) { wrapperContained.listener = value; }
// public static java.net.ServerSocket listener() { return net.minecraft.server.rcon.RconListener.listener; }
// public static void listener(java.net.ServerSocket value, ) { net.minecraft.server.rcon.RconListener.listener = value; }

// public java.lang.String password() { return wrapperContained.password; }
// public void password(java.lang.String value) { wrapperContained.password = value; }
// public static java.lang.String password() { return net.minecraft.server.rcon.RconListener.password; }
// public static void password(java.lang.String value, ) { net.minecraft.server.rcon.RconListener.password = value; }

// public java.util.List clients() { return wrapperContained.clients; }
// public void clients(java.util.List value) { wrapperContained.clients = value; }
// public static java.util.List clients() { return net.minecraft.server.rcon.RconListener.clients; }
// public static void clients(java.util.List value, ) { net.minecraft.server.rcon.RconListener.clients = value; }

// public org.slf4j.Logger SERVER_LOGGER() { return wrapperContained.SERVER_LOGGER; }
// public void SERVER_LOGGER(org.slf4j.Logger value) { wrapperContained.SERVER_LOGGER = value; }
// public static org.slf4j.Logger SERVER_LOGGER() { return net.minecraft.server.rcon.RconListener.SERVER_LOGGER; }
// public static void SERVER_LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.rcon.RconListener.SERVER_LOGGER = value; }

// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.DedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(net.minecraft.server.rcon.RconListener.server); }
// public static void server(yarnwrap.server.dedicated.DedicatedServer value, ) { net.minecraft.server.rcon.RconListener.server = value.wrapperContained; }

// public RconListener(yarnwrap.server.dedicated.DedicatedServer server,java.net.ServerSocket listener,java.lang.String password) { this.wrapperContained = new net.minecraft.server.rcon.RconListener(server.wrapperContained,listener,password); }
// public void removeStoppedClients() { wrapperContained.removeStoppedClients(); }
// public static void removeStoppedClients() { net.minecraft.server.rcon.RconListener.removeStoppedClients(); }
// public boolean method_27175(yarnwrap.server.rcon.RconClient client) { return wrapperContained.method_27175(client.wrapperContained); }
// public static boolean method_27175(yarnwrap.server.rcon.RconClient client, ) { return net.minecraft.server.rcon.RconListener.method_27175(client.wrapperContained); }
// public void closeSocket(java.net.ServerSocket socket) { wrapperContained.closeSocket(socket); }
// public static void closeSocket(java.net.ServerSocket socket, ) { net.minecraft.server.rcon.RconListener.closeSocket(socket); }
// public yarnwrap.server.rcon.RconListener create(yarnwrap.server.dedicated.DedicatedServer server) { return new yarnwrap.server.rcon.RconListener(wrapperContained.create(server.wrapperContained)); }
// public static yarnwrap.server.rcon.RconListener create(yarnwrap.server.dedicated.DedicatedServer server, ) { return new yarnwrap.server.rcon.RconListener(net.minecraft.server.rcon.RconListener.create(server.wrapperContained)); }

}