package yarnwrap.server.rcon;
public class RconBase { public net.minecraft.server.rcon.RconBase wrapperContained; public RconBase(net.minecraft.server.rcon.RconBase wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.server.rcon.RconBase.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.server.rcon.RconBase.thread = value; }

// public java.lang.String description() { return wrapperContained.description; }
// public void description(java.lang.String value) { wrapperContained.description = value; }
// public static java.lang.String description() { return net.minecraft.server.rcon.RconBase.description; }
// public static void description(java.lang.String value, ) { net.minecraft.server.rcon.RconBase.description = value; }

// public java.util.concurrent.atomic.AtomicInteger THREAD_COUNTER() { return wrapperContained.THREAD_COUNTER; }
// public void THREAD_COUNTER(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.THREAD_COUNTER = value; }
// public static java.util.concurrent.atomic.AtomicInteger THREAD_COUNTER() { return net.minecraft.server.rcon.RconBase.THREAD_COUNTER; }
// public static void THREAD_COUNTER(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.server.rcon.RconBase.THREAD_COUNTER = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.rcon.RconBase.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.rcon.RconBase.LOGGER = value; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.rcon.RconBase.running; }
// public static void running(boolean value, ) { net.minecraft.server.rcon.RconBase.running = value; }

// public RconBase(java.lang.String description) { this.wrapperContained = new net.minecraft.server.rcon.RconBase(description); }
public boolean start() { return wrapperContained.start(); }
// public static boolean start() { return net.minecraft.server.rcon.RconBase.start(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.server.rcon.RconBase.isRunning(); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.rcon.RconBase.stop(); }

}