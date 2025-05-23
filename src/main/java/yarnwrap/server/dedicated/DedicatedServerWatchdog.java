package yarnwrap.server.dedicated;
public class DedicatedServerWatchdog { public net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained; public DedicatedServerWatchdog(net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(net.minecraft.server.dedicated.DedicatedServerWatchdog.server); }
// public static void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value, ) { net.minecraft.server.dedicated.DedicatedServerWatchdog.server = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.DedicatedServerWatchdog.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.DedicatedServerWatchdog.LOGGER = value; }

// public long maxTickTime() { return wrapperContained.maxTickTime; }
// public void maxTickTime(long value) { wrapperContained.maxTickTime = value; }
// public static long maxTickTime() { return net.minecraft.server.dedicated.DedicatedServerWatchdog.maxTickTime; }
// public static void maxTickTime(long value, ) { net.minecraft.server.dedicated.DedicatedServerWatchdog.maxTickTime = value; }

public DedicatedServerWatchdog(yarnwrap.server.dedicated.MinecraftDedicatedServer server) { this.wrapperContained = new net.minecraft.server.dedicated.DedicatedServerWatchdog(server.wrapperContained); }
// public void shutdown() { wrapperContained.shutdown(); }
// public static void shutdown() { net.minecraft.server.dedicated.DedicatedServerWatchdog.shutdown(); }
// public java.lang.String method_31376(yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_31376(world.wrapperContained); }
// public static java.lang.String method_31376(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.server.dedicated.DedicatedServerWatchdog.method_31376(world.wrapperContained); }
// public yarnwrap.util.crash.CrashReport createCrashReport(java.lang.String message,long threadId) { return new yarnwrap.util.crash.CrashReport(wrapperContained.createCrashReport(message,threadId)); }
// public static yarnwrap.util.crash.CrashReport createCrashReport(java.lang.String message,long threadId, ) { return new yarnwrap.util.crash.CrashReport(net.minecraft.server.dedicated.DedicatedServerWatchdog.createCrashReport(message,threadId)); }

}