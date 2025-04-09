package yarnwrap.server.chase;
public class ChaseClient { public net.minecraft.server.chase.ChaseClient wrapperContained; public ChaseClient(net.minecraft.server.chase.ChaseClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int CONNECTION_RETRY_INTERVAL() { return wrapperContained.CONNECTION_RETRY_INTERVAL; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public int port() { return wrapperContained.port; }
// public yarnwrap.server.MinecraftServer minecraftServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.minecraftServer); }
// public boolean running() { return wrapperContained.running; }
// public java.net.Socket socket() { return wrapperContained.socket; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
public void start() { wrapperContained.start(); }
// public void parseMessage(java.lang.String message) { wrapperContained.parseMessage(message); }
// public void executeTeleportCommand(java.util.Scanner scanner) { wrapperContained.executeTeleportCommand(scanner); }
public void stop() { wrapperContained.stop(); }
// public void executeCommand(java.lang.String command) { wrapperContained.executeCommand(command); }
// public java.util.Optional getTeleportPos(java.util.Scanner scanner) { return wrapperContained.getTeleportPos(scanner); }
public void run() { wrapperContained.run(); }

}