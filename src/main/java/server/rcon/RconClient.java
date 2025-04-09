package yarnwrap.server.rcon;
public class RconClient { public net.minecraft.server.rcon.RconClient wrapperContained; public RconClient(net.minecraft.server.rcon.RconClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean authenticated() { return wrapperContained.authenticated; }
// public java.net.Socket socket() { return wrapperContained.socket; }
// public byte[] packetBuffer() { return wrapperContained.packetBuffer; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String password() { return wrapperContained.password; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void fail() { wrapperContained.fail(); }
// public void close() { wrapperContained.close(); }
// public void respond(int sessionToken,java.lang.String message) { wrapperContained.respond(sessionToken,message); }
// public void respond(int sessionToken,int responseType,java.lang.String message) { wrapperContained.respond(sessionToken,responseType,message); }

}