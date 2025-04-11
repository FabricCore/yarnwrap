package yarnwrap.server.dedicated;
public class ServerMBean { public net.minecraft.server.dedicated.ServerMBean wrapperContained; public ServerMBean(net.minecraft.server.dedicated.ServerMBean wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public javax.management.MBeanInfo mBeanInfo() { return wrapperContained.mBeanInfo; }
// public void mBeanInfo(javax.management.MBeanInfo value) { wrapperContained.mBeanInfo = value; }
// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
public void register(yarnwrap.server.MinecraftServer server) { wrapperContained.register(server.wrapperContained); }
// public long[] getTickTimes() { return wrapperContained.getTickTimes(); }

}