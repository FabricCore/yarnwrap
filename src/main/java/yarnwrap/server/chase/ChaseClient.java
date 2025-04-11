package yarnwrap.server.chase;
public class ChaseClient { public net.minecraft.server.chase.ChaseClient wrapperContained; public ChaseClient(net.minecraft.server.chase.ChaseClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int CONNECTION_RETRY_INTERVAL() { return wrapperContained.CONNECTION_RETRY_INTERVAL; }
// public void CONNECTION_RETRY_INTERVAL(int value) { wrapperContained.CONNECTION_RETRY_INTERVAL = value; }
// public java.lang.String ip() { return wrapperContained.ip; }
// public void ip(java.lang.String value) { wrapperContained.ip = value; }
// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public yarnwrap.server.MinecraftServer minecraftServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.minecraftServer); }
// public void minecraftServer(yarnwrap.server.MinecraftServer value) { wrapperContained.minecraftServer = value.wrapperContained; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public java.net.Socket socket() { return wrapperContained.socket; }
// public void socket(java.net.Socket value) { wrapperContained.socket = value; }
// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
public void start() { wrapperContained.start(); }
// public void parseMessage(java.lang.String message) { wrapperContained.parseMessage(message); }
// public void executeTeleportCommand(java.util.Scanner scanner) { wrapperContained.executeTeleportCommand(scanner); }
public void stop() { wrapperContained.stop(); }
// public void executeCommand(java.lang.String command) { wrapperContained.executeCommand(command); }
// public java.util.Optional getTeleportPos(java.util.Scanner scanner) { return wrapperContained.getTeleportPos(scanner); }
public void run() { wrapperContained.run(); }

}