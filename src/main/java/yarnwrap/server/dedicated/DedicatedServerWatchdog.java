package yarnwrap.server.dedicated;
public class DedicatedServerWatchdog { public net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained; public DedicatedServerWatchdog(net.minecraft.server.dedicated.DedicatedServerWatchdog wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.dedicated.MinecraftDedicatedServer server() { return new yarnwrap.server.dedicated.MinecraftDedicatedServer(wrapperContained.server); }
// public void server(yarnwrap.server.dedicated.MinecraftDedicatedServer value) { wrapperContained.server = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public long maxTickTime() { return wrapperContained.maxTickTime; }
// public void maxTickTime(long value) { wrapperContained.maxTickTime = value; }
// public void shutdown() { wrapperContained.shutdown(); }

}