package yarnwrap.server.rcon;
public class QueryResponseHandler { public net.minecraft.server.rcon.QueryResponseHandler wrapperContained; public QueryResponseHandler(net.minecraft.server.rcon.QueryResponseHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int queryPort() { return wrapperContained.queryPort; }
// public void queryPort(int value) { wrapperContained.queryPort = value; }
// public long lastQueryTime() { return wrapperContained.lastQueryTime; }
// public void lastQueryTime(long value) { wrapperContained.lastQueryTime = value; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public void ip(java.lang.String value) { wrapperContained.ip = value; }
// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public yarnwrap.server.rcon.DataStreamHelper data() { return new yarnwrap.server.rcon.DataStreamHelper(wrapperContained.data); }
// public void data(yarnwrap.server.rcon.DataStreamHelper value) { wrapperContained.data = value.wrapperContained; }
// public java.lang.String levelName() { return wrapperContained.levelName; }
// public void levelName(java.lang.String value) { wrapperContained.levelName = value; }
// public java.net.DatagramSocket socket() { return wrapperContained.socket; }
// public void socket(java.net.DatagramSocket value) { wrapperContained.socket = value; }
// public long lastResponseTime() { return wrapperContained.lastResponseTime; }
// public void lastResponseTime(long value) { wrapperContained.lastResponseTime = value; }
// public byte[] packetBuffer() { return wrapperContained.packetBuffer; }
// public void packetBuffer(byte[] value) { wrapperContained.packetBuffer = value; }
// public java.util.Map queries() { return wrapperContained.queries; }
// public void queries(java.util.Map value) { wrapperContained.queries = value; }
// public java.lang.String hostname() { return wrapperContained.hostname; }
// public void hostname(java.lang.String value) { wrapperContained.hostname = value; }
// public int maxPlayerCount() { return wrapperContained.maxPlayerCount; }
// public void maxPlayerCount(int value) { wrapperContained.maxPlayerCount = value; }
// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.server.dedicated.DedicatedServer server() { return new yarnwrap.server.dedicated.DedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.DedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public java.lang.String GAME_TYPE() { return wrapperContained.GAME_TYPE; }
// public void GAME_TYPE(java.lang.String value) { wrapperContained.GAME_TYPE = value; }
// public java.lang.String GAME_ID() { return wrapperContained.GAME_ID; }
// public void GAME_ID(java.lang.String value) { wrapperContained.GAME_ID = value; }
// public long CLEAN_UP_THRESHOLD() { return wrapperContained.CLEAN_UP_THRESHOLD; }
// public void CLEAN_UP_THRESHOLD(long value) { wrapperContained.CLEAN_UP_THRESHOLD = value; }
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