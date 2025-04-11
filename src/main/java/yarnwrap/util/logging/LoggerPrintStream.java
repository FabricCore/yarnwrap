package yarnwrap.util.logging;
public class LoggerPrintStream { public net.minecraft.util.logging.LoggerPrintStream wrapperContained; public LoggerPrintStream(net.minecraft.util.logging.LoggerPrintStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public LoggerPrintStream(java.lang.String name,java.io.OutputStream out) { this.wrapperContained = new net.minecraft.util.logging.LoggerPrintStream(name,out); }
// public void log(java.lang.String message) { wrapperContained.log(message); }
public void println(java.lang.Object object) { wrapperContained.println(object); }
public void println(java.lang.String message) { wrapperContained.println(message); }

}