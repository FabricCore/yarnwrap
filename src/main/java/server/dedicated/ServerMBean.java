package yarnwrap.server.dedicated;
public class ServerMBean { public net.minecraft.server.dedicated.ServerMBean wrapperContained; public ServerMBean(net.minecraft.server.dedicated.ServerMBean wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public javax.management.MBeanInfo mBeanInfo() { return wrapperContained.mBeanInfo; }
// public java.util.Map entries() { return wrapperContained.entries; }
// public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
public void register(yarnwrap.server.MinecraftServer server) { wrapperContained.register(server.wrapperContained); }
// public long[] getTickTimes() { return wrapperContained.getTickTimes(); }

}