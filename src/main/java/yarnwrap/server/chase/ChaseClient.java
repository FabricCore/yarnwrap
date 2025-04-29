package yarnwrap.server.chase;
public class ChaseClient { public net.minecraft.server.chase.ChaseClient wrapperContained; public ChaseClient(net.minecraft.server.chase.ChaseClient wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.chase.ChaseClient.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.chase.ChaseClient.LOGGER = value; }

// public int CONNECTION_RETRY_INTERVAL() { return wrapperContained.CONNECTION_RETRY_INTERVAL; }
// public void CONNECTION_RETRY_INTERVAL(int value) { wrapperContained.CONNECTION_RETRY_INTERVAL = value; }
// public static int CONNECTION_RETRY_INTERVAL() { return net.minecraft.server.chase.ChaseClient.CONNECTION_RETRY_INTERVAL; }
// public static void CONNECTION_RETRY_INTERVAL(int value, ) { net.minecraft.server.chase.ChaseClient.CONNECTION_RETRY_INTERVAL = value; }

// public java.lang.String ip() { return wrapperContained.ip; }
// public void ip(java.lang.String value) { wrapperContained.ip = value; }
// public static java.lang.String ip() { return net.minecraft.server.chase.ChaseClient.ip; }
// public static void ip(java.lang.String value, ) { net.minecraft.server.chase.ChaseClient.ip = value; }

// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public static int port() { return net.minecraft.server.chase.ChaseClient.port; }
// public static void port(int value, ) { net.minecraft.server.chase.ChaseClient.port = value; }

// public yarnwrap.server.MinecraftServer minecraftServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.minecraftServer); }
// public void minecraftServer(yarnwrap.server.MinecraftServer value) { wrapperContained.minecraftServer = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer minecraftServer() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.chase.ChaseClient.minecraftServer); }
// public static void minecraftServer(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.chase.ChaseClient.minecraftServer = value.wrapperContained; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.chase.ChaseClient.running; }
// public static void running(boolean value, ) { net.minecraft.server.chase.ChaseClient.running = value; }

// public java.net.Socket socket() { return wrapperContained.socket; }
// public void socket(java.net.Socket value) { wrapperContained.socket = value; }
// public static java.net.Socket socket() { return net.minecraft.server.chase.ChaseClient.socket; }
// public static void socket(java.net.Socket value, ) { net.minecraft.server.chase.ChaseClient.socket = value; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.server.chase.ChaseClient.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.server.chase.ChaseClient.thread = value; }

public ChaseClient(java.lang.String ip,int port,yarnwrap.server.MinecraftServer minecraftServer) { this.wrapperContained = new net.minecraft.server.chase.ChaseClient(ip,port,minecraftServer.wrapperContained); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.server.chase.ChaseClient.start(); }
// public void parseMessage(java.lang.String message) { wrapperContained.parseMessage(message); }
// public static void parseMessage(java.lang.String message, ) { net.minecraft.server.chase.ChaseClient.parseMessage(message); }
// public void executeTeleportCommand(java.util.Scanner scanner) { wrapperContained.executeTeleportCommand(scanner); }
// public static void executeTeleportCommand(java.util.Scanner scanner, ) { net.minecraft.server.chase.ChaseClient.executeTeleportCommand(scanner); }
// public void method_38758(Object pos) { wrapperContained.method_38758(pos); }
// public static void method_38758(Object pos, ) { net.minecraft.server.chase.ChaseClient.method_38758(pos); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.chase.ChaseClient.stop(); }
// public void executeCommand(java.lang.String command) { wrapperContained.executeCommand(command); }
// public static void executeCommand(java.lang.String command, ) { net.minecraft.server.chase.ChaseClient.executeCommand(command); }
// public java.util.Optional getTeleportPos(java.util.Scanner scanner) { return wrapperContained.getTeleportPos(scanner); }
// public static java.util.Optional getTeleportPos(java.util.Scanner scanner, ) { return net.minecraft.server.chase.ChaseClient.getTeleportPos(scanner); }
public void run() { wrapperContained.run(); }
// public static void run() { net.minecraft.server.chase.ChaseClient.run(); }

}