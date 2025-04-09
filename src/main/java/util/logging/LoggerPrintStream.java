package yarnwrap.util.logging;
public class LoggerPrintStream { public net.minecraft.util.logging.LoggerPrintStream wrapperContained; public LoggerPrintStream(net.minecraft.util.logging.LoggerPrintStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void log(java.lang.String message) { wrapperContained.log(message); }

}