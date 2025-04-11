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
// public ServerMBean(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.dedicated.ServerMBean(server.wrapperContained); }
public java.lang.Object getAttribute(java.lang.String attribute) { return wrapperContained.getAttribute(attribute); }
public javax.management.AttributeList getAttributes(java.lang.String[] attributes) { return wrapperContained.getAttributes(attributes); }
public java.lang.Object invoke(java.lang.String actionName,java.lang.Object[] params,java.lang.String[] signature) { return wrapperContained.invoke(actionName,params,signature); }
// public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
// public javax.management.Attribute method_27179(Object entry) { return wrapperContained.method_27179(entry); }
public void register(yarnwrap.server.MinecraftServer server) { wrapperContained.register(server.wrapperContained); }
// public long[] getTickTimes() { return wrapperContained.getTickTimes(); }
// public java.lang.String method_27183(Object entry) { return wrapperContained.method_27183(entry); }
public void setAttribute(javax.management.Attribute attribute) { wrapperContained.setAttribute(attribute); }
public javax.management.AttributeList setAttributes(javax.management.AttributeList attributes) { return wrapperContained.setAttributes(attributes); }

}