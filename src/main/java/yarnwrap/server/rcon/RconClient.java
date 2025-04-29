package yarnwrap.server.rcon;
public class RconClient { public net.minecraft.server.rcon.RconClient wrapperContained; public RconClient(net.minecraft.server.rcon.RconClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean authenticated() { return wrapperContained.authenticated; }
// public void authenticated(boolean value) { wrapperContained.authenticated = value; }
// public static boolean authenticated() { return net.minecraft.server.rcon.RconClient.authenticated; }
// public static void authenticated(boolean value, ) { net.minecraft.server.rcon.RconClient.authenticated = value; }

// public java.net.Socket socket() { return wrapperContained.socket; }
// public void socket(java.net.Socket value) { wrapperContained.socket = value; }
// public static java.net.Socket socket() { return net.minecraft.server.rcon.RconClient.socket; }
// public static void socket(java.net.Socket value, ) { net.minecraft.server.rcon.RconClient.socket = value; }

// public byte[] packetBuffer() { return wrapperContained.packetBuffer; }
// public void packetBuffer(byte[] value) { wrapperContained.packetBuffer = value; }
// public static byte[] packetBuffer() { return net.minecraft.server.rcon.RconClient.packetBuffer; }
// public static void packetBuffer(byte[] value, ) { net.minecraft.server.rcon.RconClient.packetBuffer = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.rcon.RconClient.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.rcon.RconClient.LOGGER = value; }

// public java.lang.String password() { return wrapperContained.password; }
// public void password(java.lang.String value) { wrapperContained.password = value; }
// public static java.lang.String password() { return net.minecraft.server.rcon.RconClient.password; }
// public static void password(java.lang.String value, ) { net.minecraft.server.rcon.RconClient.password = value; }

// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.DedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(net.minecraft.server.rcon.RconClient.server); }
// public static void server(yarnwrap.server.dedicated.DedicatedServer value, ) { net.minecraft.server.rcon.RconClient.server = value.wrapperContained; }

// public RconClient(yarnwrap.server.dedicated.DedicatedServer server,java.lang.String password,java.net.Socket socket) { this.wrapperContained = new net.minecraft.server.rcon.RconClient(server.wrapperContained,password,socket); }
// public void fail() { wrapperContained.fail(); }
// public static void fail() { net.minecraft.server.rcon.RconClient.fail(); }
// public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.server.rcon.RconClient.close(); }
// public void respond(int sessionToken,java.lang.String message) { wrapperContained.respond(sessionToken,message); }
// public static void respond(int sessionToken,java.lang.String message, ) { net.minecraft.server.rcon.RconClient.respond(sessionToken,message); }
// public void respond(int sessionToken,int responseType,java.lang.String message) { wrapperContained.respond(sessionToken,responseType,message); }
// public static void respond(int sessionToken,int responseType,java.lang.String message, ) { net.minecraft.server.rcon.RconClient.respond(sessionToken,responseType,message); }

}