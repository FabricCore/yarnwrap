package yarnwrap.client.gl;
public class GlDebug { public net.minecraft.client.gl.GlDebug wrapperContained; public GlDebug(net.minecraft.client.gl.GlDebug wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List KHR_VERBOSITY_LEVELS() { return wrapperContained.KHR_VERBOSITY_LEVELS; }
// public void KHR_VERBOSITY_LEVELS(java.util.List value) { wrapperContained.KHR_VERBOSITY_LEVELS = value; }
// public static java.util.List KHR_VERBOSITY_LEVELS() { return net.minecraft.client.gl.GlDebug.KHR_VERBOSITY_LEVELS; }
// public static void KHR_VERBOSITY_LEVELS(java.util.List value, ) { net.minecraft.client.gl.GlDebug.KHR_VERBOSITY_LEVELS = value; }

// public java.util.List ARB_VERBOSITY_LEVELS() { return wrapperContained.ARB_VERBOSITY_LEVELS; }
// public void ARB_VERBOSITY_LEVELS(java.util.List value) { wrapperContained.ARB_VERBOSITY_LEVELS = value; }
// public static java.util.List ARB_VERBOSITY_LEVELS() { return net.minecraft.client.gl.GlDebug.ARB_VERBOSITY_LEVELS; }
// public static void ARB_VERBOSITY_LEVELS(java.util.List value, ) { net.minecraft.client.gl.GlDebug.ARB_VERBOSITY_LEVELS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.GlDebug.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.GlDebug.LOGGER = value; }

// public int DEBUG_MESSAGE_QUEUE_SIZE() { return wrapperContained.DEBUG_MESSAGE_QUEUE_SIZE; }
// public void DEBUG_MESSAGE_QUEUE_SIZE(int value) { wrapperContained.DEBUG_MESSAGE_QUEUE_SIZE = value; }
// public static int DEBUG_MESSAGE_QUEUE_SIZE() { return net.minecraft.client.gl.GlDebug.DEBUG_MESSAGE_QUEUE_SIZE; }
// public static void DEBUG_MESSAGE_QUEUE_SIZE(int value, ) { net.minecraft.client.gl.GlDebug.DEBUG_MESSAGE_QUEUE_SIZE = value; }

// public java.util.Queue debugMessages() { return wrapperContained.debugMessages; }
// public void debugMessages(java.util.Queue value) { wrapperContained.debugMessages = value; }
// public static java.util.Queue debugMessages() { return net.minecraft.client.gl.GlDebug.debugMessages; }
// public static void debugMessages(java.util.Queue value, ) { net.minecraft.client.gl.GlDebug.debugMessages = value; }

// public Object lastDebugMessage() { return wrapperContained.lastDebugMessage; }
// // public void lastDebugMessage(Object value) { wrapperContained.lastDebugMessage = value; }
// // public static Object lastDebugMessage() { return net.minecraft.client.gl.GlDebug.lastDebugMessage; }
// // public static void lastDebugMessage(Object value, ) { net.minecraft.client.gl.GlDebug.lastDebugMessage = value; }

// public java.lang.String getSource(int opcode) { return wrapperContained.getSource(opcode); }
// public static java.lang.String getSource(int opcode, ) { return net.minecraft.client.gl.GlDebug.getSource(opcode); }
// public void onDebugMessage(int source,int type,int id,int severity,int length,long message) { wrapperContained.onDebugMessage(source,type,id,severity,length,message); }
// public static void onDebugMessage(int source,int type,int id,int severity,int length,long message, ) { net.minecraft.client.gl.GlDebug.onDebugMessage(source,type,id,severity,length,message); }
// public java.lang.String unknown(int opcode) { return wrapperContained.unknown(opcode); }
// public static java.lang.String unknown(int opcode, ) { return net.minecraft.client.gl.GlDebug.unknown(opcode); }
// public java.lang.String getSeverity(int opcode) { return wrapperContained.getSeverity(opcode); }
// public static java.lang.String getSeverity(int opcode, ) { return net.minecraft.client.gl.GlDebug.getSeverity(opcode); }
// public yarnwrap.client.gl.GlDebug enableDebug(int verbosity,boolean sync,java.util.Set usedGlCaps) { return new yarnwrap.client.gl.GlDebug(wrapperContained.enableDebug(verbosity,sync,usedGlCaps)); }
// public static yarnwrap.client.gl.GlDebug enableDebug(int verbosity,boolean sync,java.util.Set usedGlCaps, ) { return new yarnwrap.client.gl.GlDebug(net.minecraft.client.gl.GlDebug.enableDebug(verbosity,sync,usedGlCaps)); }
// public java.lang.String getType(int opcode) { return wrapperContained.getType(opcode); }
// public static java.lang.String getType(int opcode, ) { return net.minecraft.client.gl.GlDebug.getType(opcode); }
public java.util.List collectDebugMessages() { return wrapperContained.collectDebugMessages(); }
// public static java.util.List collectDebugMessages() { return net.minecraft.client.gl.GlDebug.collectDebugMessages(); }

}