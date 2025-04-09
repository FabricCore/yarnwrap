package yarnwrap.server.dedicated;
public class DedicatedServerWatchdog { public net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained; public DedicatedServerWatchdog(net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.server); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public long maxTickTime() { return wrapperContained.maxTickTime; }
// public void shutdown() { wrapperContained.shutdown(); }

}