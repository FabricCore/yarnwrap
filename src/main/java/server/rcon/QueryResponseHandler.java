package yarnwrap.server.rcon;
public class QueryResponseHandler { public net.minecraft.server.rcon.QueryResponseHandler wrapperContained; public QueryResponseHandler(net.minecraft.server.rcon.QueryResponseHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryPort() { return wrapperContained.queryPort; }
// public long lastQueryTime() { return wrapperContained.lastQueryTime; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public java.lang.String motd() { return wrapperContained.motd; }
// public yarnwrap.server.rcon.DataStreamHelper data() { return new yarnwrap.server.rcon.DataStreamHelper(wrapperContained.data); }
// public java.lang.String levelName() { return wrapperContained.levelName; }
// public java.net.DatagramSocket socket() { return wrapperContained.socket; }
// public long lastResponseTime() { return wrapperContained.lastResponseTime; }
// public byte[] packetBuffer() { return wrapperContained.packetBuffer; }
// public java.util.Map queries() { return wrapperContained.queries; }
// public java.lang.String hostname() { return wrapperContained.hostname; }
// public int maxPlayerCount() { return wrapperContained.maxPlayerCount; }
// public int port() { return wrapperContained.port; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public java.lang.String GAME_TYPE() { return wrapperContained.GAME_TYPE; }
// public java.lang.String GAME_ID() { return wrapperContained.GAME_ID; }
// public long CLEAN_UP_THRESHOLD() { return wrapperContained.CLEAN_UP_THRESHOLD; }
// public void cleanUp() { wrapperContained.cleanUp(); }
// public byte[] createRulesReply(java.net.DatagramPacket packet) { return wrapperContained.createRulesReply(packet); }
// public byte[] getMessageBytes(java.net.SocketAddress address) { return wrapperContained.getMessageBytes(address); }
// public void createQuery(java.net.DatagramPacket packet) { wrapperContained.createQuery(packet); }
// public boolean handle(java.net.DatagramPacket packet) { return wrapperContained.handle(packet); }
// public void reply(byte buf,java.net.DatagramPacket[] packet) { wrapperContained.reply(buf,packet); }
// public void handleIoException(java.lang.Exception e) { wrapperContained.handleIoException(e); }
// public java.lang.Boolean isValidQuery(java.net.DatagramPacket packet) { return wrapperContained.isValidQuery(packet); }
// public boolean initialize() { return wrapperContained.initialize(); }
public yarnwrap.server.rcon.QueryResponseHandler create(yarnwrap.server.dedicated.DedicatedServer server) { return new yarnwrap.server.rcon.QueryResponseHandler(wrapperContained.create(server.wrapperContained)); }

}