package yarnwrap.server.rcon;
public class RconClient { public net.minecraft.server.rcon.RconClient wrapperContained; public RconClient(net.minecraft.server.rcon.RconClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean authenticated() { return wrapperContained.authenticated; }
// public void authenticated(boolean value) { wrapperContained.authenticated = value; }
// public java.net.Socket socket() { return wrapperContained.socket; }
// public void socket(java.net.Socket value) { wrapperContained.socket = value; }
// public byte[] packetBuffer() { return wrapperContained.packetBuffer; }
// public void packetBuffer(byte[] value) { wrapperContained.packetBuffer = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String password() { return wrapperContained.password; }
// public void password(java.lang.String value) { wrapperContained.password = value; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.DedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public RconClient(yarnwrap.server.dedicated.DedicatedServer server,java.lang.String password,java.net.Socket socket) { this.wrapperContained = new net.minecraft.server.rcon.RconClient(server.wrapperContained,password,socket); }
// public void fail() { wrapperContained.fail(); }
// public void close() { wrapperContained.close(); }
// public void respond(int sessionToken,java.lang.String message) { wrapperContained.respond(sessionToken,message); }
// public void respond(int sessionToken,int responseType,java.lang.String message) { wrapperContained.respond(sessionToken,responseType,message); }

}