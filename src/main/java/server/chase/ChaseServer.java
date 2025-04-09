package yarnwrap.server.chase;
public class ChaseServer { public net.minecraft.server.chase.ChaseServer wrapperContained; public ChaseServer(net.minecraft.server.chase.ChaseServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public int port() { return wrapperContained.port; }
// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public int interval() { return wrapperContained.interval; }
// public boolean running() { return wrapperContained.running; }
// public java.net.ServerSocket socket() { return wrapperContained.socket; }
// public java.util.concurrent.CopyOnWriteArrayList clientSockets() { return wrapperContained.clientSockets; }
// public void start() { wrapperContained.start(); }
public void stop() { wrapperContained.stop(); }
// public void runSender() { wrapperContained.runSender(); }
// public void runAcceptor() { wrapperContained.runAcceptor(); }
// public Object getTeleportPosition() { return wrapperContained.getTeleportPosition(); }

}