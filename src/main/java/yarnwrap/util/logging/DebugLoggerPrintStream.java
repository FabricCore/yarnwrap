package yarnwrap.util.logging;
public class DebugLoggerPrintStream { public net.minecraft.util.logging.DebugLoggerPrintStream wrapperContained; public DebugLoggerPrintStream(net.minecraft.util.logging.DebugLoggerPrintStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.logging.DebugLoggerPrintStream.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.logging.DebugLoggerPrintStream.LOGGER = value; }


}