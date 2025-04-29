package yarnwrap.util.logging;
public class LoggerPrintStream { public net.minecraft.util.logging.LoggerPrintStream wrapperContained; public LoggerPrintStream(net.minecraft.util.logging.LoggerPrintStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.logging.LoggerPrintStream.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.logging.LoggerPrintStream.name = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.logging.LoggerPrintStream.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.logging.LoggerPrintStream.LOGGER = value; }

public LoggerPrintStream(java.lang.String name,java.io.OutputStream out) { this.wrapperContained = new net.minecraft.util.logging.LoggerPrintStream(name,out); }
// public void log(java.lang.String message) { wrapperContained.log(message); }
// public static void log(java.lang.String message, ) { net.minecraft.util.logging.LoggerPrintStream.log(message); }
public void println(java.lang.Object object) { wrapperContained.println(object); }
// public static void println(java.lang.Object object, ) { net.minecraft.util.logging.LoggerPrintStream.println(object); }
public void println(java.lang.String message) { wrapperContained.println(message); }
// public static void println(java.lang.String message, ) { net.minecraft.util.logging.LoggerPrintStream.println(message); }

}