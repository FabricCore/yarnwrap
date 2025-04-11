package yarnwrap.client.gl;
public class GlDebug { public net.minecraft.client.gl.GlDebug wrapperContained; public GlDebug(net.minecraft.client.gl.GlDebug wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEBUG_MESSAGE_QUEUE_SIZE() { return wrapperContained.DEBUG_MESSAGE_QUEUE_SIZE; }
// public void DEBUG_MESSAGE_QUEUE_SIZE(int value) { wrapperContained.DEBUG_MESSAGE_QUEUE_SIZE = value; }
// public java.util.Queue DEBUG_MESSAGES() { return wrapperContained.DEBUG_MESSAGES; }
// public void DEBUG_MESSAGES(java.util.Queue value) { wrapperContained.DEBUG_MESSAGES = value; }
// public Object lastDebugMessage() { return wrapperContained.lastDebugMessage; }
// // public void lastDebugMessage(Object value) { wrapperContained.lastDebugMessage = value; }
// public boolean debugMessageEnabled() { return wrapperContained.debugMessageEnabled; }
// public void debugMessageEnabled(boolean value) { wrapperContained.debugMessageEnabled = value; }
// public java.util.List KHR_VERBOSITY_LEVELS() { return wrapperContained.KHR_VERBOSITY_LEVELS; }
// public void KHR_VERBOSITY_LEVELS(java.util.List value) { wrapperContained.KHR_VERBOSITY_LEVELS = value; }
// public java.util.List ARB_VERBOSITY_LEVELS() { return wrapperContained.ARB_VERBOSITY_LEVELS; }
// public void ARB_VERBOSITY_LEVELS(java.util.List value) { wrapperContained.ARB_VERBOSITY_LEVELS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.List collectDebugMessages() { return wrapperContained.collectDebugMessages(); }
public boolean isDebugMessageEnabled() { return wrapperContained.isDebugMessageEnabled(); }
public java.lang.String getSource(int opcode) { return wrapperContained.getSource(opcode); }
// public void info(int source,int type,int id,int severity,int messageLength,long message) { wrapperContained.info(source,type,id,severity,messageLength,message); }
// public java.lang.String unknown(int opcode) { return wrapperContained.unknown(opcode); }
public java.lang.String getSeverity(int opcode) { return wrapperContained.getSeverity(opcode); }
public void enableDebug(int verbosity,boolean sync) { wrapperContained.enableDebug(verbosity,sync); }
public java.lang.String getType(int opcode) { return wrapperContained.getType(opcode); }

}