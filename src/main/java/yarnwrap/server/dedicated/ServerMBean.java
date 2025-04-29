package yarnwrap.server.dedicated;
public class ServerMBean { public net.minecraft.server.dedicated.ServerMBean wrapperContained; public ServerMBean(net.minecraft.server.dedicated.ServerMBean wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.ServerMBean.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.ServerMBean.LOGGER = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.dedicated.ServerMBean.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.dedicated.ServerMBean.server = value.wrapperContained; }

// public javax.management.MBeanInfo mBeanInfo() { return wrapperContained.mBeanInfo; }
// public void mBeanInfo(javax.management.MBeanInfo value) { wrapperContained.mBeanInfo = value; }
// public static javax.management.MBeanInfo mBeanInfo() { return net.minecraft.server.dedicated.ServerMBean.mBeanInfo; }
// public static void mBeanInfo(javax.management.MBeanInfo value, ) { net.minecraft.server.dedicated.ServerMBean.mBeanInfo = value; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public static java.util.Map entries() { return net.minecraft.server.dedicated.ServerMBean.entries; }
// public static void entries(java.util.Map value, ) { net.minecraft.server.dedicated.ServerMBean.entries = value; }

// public ServerMBean(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.dedicated.ServerMBean(server.wrapperContained); }
public java.lang.Object getAttribute(java.lang.String attribute) { return wrapperContained.getAttribute(attribute); }
// public static java.lang.Object getAttribute(java.lang.String attribute, ) { return net.minecraft.server.dedicated.ServerMBean.getAttribute(attribute); }
public javax.management.AttributeList getAttributes(java.lang.String[] attributes) { return wrapperContained.getAttributes(attributes); }
// public static javax.management.AttributeList getAttributes(java.lang.String[] attributes, ) { return net.minecraft.server.dedicated.ServerMBean.getAttributes(attributes); }
public java.lang.Object invoke(java.lang.String actionName,java.lang.Object[] params,java.lang.String[] signature) { return wrapperContained.invoke(actionName,params,signature); }
// public static java.lang.Object invoke(java.lang.String actionName,java.lang.Object[] params,java.lang.String[] signature, ) { return net.minecraft.server.dedicated.ServerMBean.invoke(actionName,params,signature); }
// public float getAverageTickTime() { return wrapperContained.getAverageTickTime(); }
// public static float getAverageTickTime() { return net.minecraft.server.dedicated.ServerMBean.getAverageTickTime(); }
// public javax.management.Attribute method_27179(Object entry) { return wrapperContained.method_27179(entry); }
// public static javax.management.Attribute method_27179(Object entry, ) { return net.minecraft.server.dedicated.ServerMBean.method_27179(entry); }
// public void register(yarnwrap.server.MinecraftServer server) { wrapperContained.register(server.wrapperContained); }
// public static void register(yarnwrap.server.MinecraftServer server, ) { net.minecraft.server.dedicated.ServerMBean.register(server.wrapperContained); }
// public long[] getTickTimes() { return wrapperContained.getTickTimes(); }
// public static long[] getTickTimes() { return net.minecraft.server.dedicated.ServerMBean.getTickTimes(); }
// public java.lang.String method_27183(Object entry) { return wrapperContained.method_27183(entry); }
// public static java.lang.String method_27183(Object entry, ) { return net.minecraft.server.dedicated.ServerMBean.method_27183(entry); }
public void setAttribute(javax.management.Attribute attribute) { wrapperContained.setAttribute(attribute); }
// public static void setAttribute(javax.management.Attribute attribute, ) { net.minecraft.server.dedicated.ServerMBean.setAttribute(attribute); }
public javax.management.AttributeList setAttributes(javax.management.AttributeList attributes) { return wrapperContained.setAttributes(attributes); }
// public static javax.management.AttributeList setAttributes(javax.management.AttributeList attributes, ) { return net.minecraft.server.dedicated.ServerMBean.setAttributes(attributes); }

}