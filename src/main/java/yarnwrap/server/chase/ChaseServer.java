package yarnwrap.server.chase;
public class ChaseServer { public net.minecraft.server.chase.ChaseServer wrapperContained; public ChaseServer(net.minecraft.server.chase.ChaseServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public void ip(java.lang.String value) { wrapperContained.ip = value; }
// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public int interval() { return wrapperContained.interval; }
// public void interval(int value) { wrapperContained.interval = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public java.net.ServerSocket socket() { return wrapperContained.socket; }
// public void socket(java.net.ServerSocket value) { wrapperContained.socket = value; }
// public java.util.concurrent.CopyOnWriteArrayList clientSockets() { return wrapperContained.clientSockets; }
// public void clientSockets(java.util.concurrent.CopyOnWriteArrayList value) { wrapperContained.clientSockets = value; }
public ChaseServer(java.lang.String ip,int port,yarnwrap.server.PlayerManager playerManager,int interval) { this.wrapperContained = new net.minecraft.server.chase.ChaseServer(ip,port,playerManager.wrapperContained,interval); }
// public void start() { wrapperContained.start(); }
public void stop() { wrapperContained.stop(); }
// public void runSender() { wrapperContained.runSender(); }
// public void runAcceptor() { wrapperContained.runAcceptor(); }
// public Object getTeleportPosition() { return wrapperContained.getTeleportPosition(); }

}