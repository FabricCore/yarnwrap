package yarnwrap.server.chase;
public class ChaseServer { public net.minecraft.server.chase.ChaseServer wrapperContained; public ChaseServer(net.minecraft.server.chase.ChaseServer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.chase.ChaseServer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.chase.ChaseServer.LOGGER = value; }

// public java.lang.String ip() { return wrapperContained.ip; }
// public void ip(java.lang.String value) { wrapperContained.ip = value; }
// public static java.lang.String ip() { return net.minecraft.server.chase.ChaseServer.ip; }
// public static void ip(java.lang.String value, ) { net.minecraft.server.chase.ChaseServer.ip = value; }

// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public static int port() { return net.minecraft.server.chase.ChaseServer.port; }
// public static void port(int value, ) { net.minecraft.server.chase.ChaseServer.port = value; }

// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public static yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(net.minecraft.server.chase.ChaseServer.playerManager); }
// public static void playerManager(yarnwrap.server.PlayerManager value, ) { net.minecraft.server.chase.ChaseServer.playerManager = value.wrapperContained; }

// public int interval() { return wrapperContained.interval; }
// public void interval(int value) { wrapperContained.interval = value; }
// public static int interval() { return net.minecraft.server.chase.ChaseServer.interval; }
// public static void interval(int value, ) { net.minecraft.server.chase.ChaseServer.interval = value; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.chase.ChaseServer.running; }
// public static void running(boolean value, ) { net.minecraft.server.chase.ChaseServer.running = value; }

// public java.net.ServerSocket socket() { return wrapperContained.socket; }
// public void socket(java.net.ServerSocket value) { wrapperContained.socket = value; }
// public static java.net.ServerSocket socket() { return net.minecraft.server.chase.ChaseServer.socket; }
// public static void socket(java.net.ServerSocket value, ) { net.minecraft.server.chase.ChaseServer.socket = value; }

// public java.util.concurrent.CopyOnWriteArrayList clientSockets() { return wrapperContained.clientSockets; }
// public void clientSockets(java.util.concurrent.CopyOnWriteArrayList value) { wrapperContained.clientSockets = value; }
// public static java.util.concurrent.CopyOnWriteArrayList clientSockets() { return net.minecraft.server.chase.ChaseServer.clientSockets; }
// public static void clientSockets(java.util.concurrent.CopyOnWriteArrayList value, ) { net.minecraft.server.chase.ChaseServer.clientSockets = value; }

public ChaseServer(java.lang.String ip,int port,yarnwrap.server.PlayerManager playerManager,int interval) { this.wrapperContained = new net.minecraft.server.chase.ChaseServer(ip,port,playerManager.wrapperContained,interval); }
// public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.server.chase.ChaseServer.start(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.chase.ChaseServer.stop(); }
// public void runSender() { wrapperContained.runSender(); }
// public static void runSender() { net.minecraft.server.chase.ChaseServer.runSender(); }
// public void runAcceptor() { wrapperContained.runAcceptor(); }
// public static void runAcceptor() { net.minecraft.server.chase.ChaseServer.runAcceptor(); }
// public Object getTeleportPosition() { return wrapperContained.getTeleportPosition(); }
// public static Object getTeleportPosition() { return net.minecraft.server.chase.ChaseServer.getTeleportPosition(); }

}