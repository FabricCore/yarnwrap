package yarnwrap.util.profiling.jfr;
public class JfrListener { public net.minecraft.util.profiling.jfr.JfrListener wrapperContained; public JfrListener(net.minecraft.util.profiling.jfr.JfrListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Runnable stopCallback() { return wrapperContained.stopCallback; }
// public void stopCallback(java.lang.Runnable value) { wrapperContained.stopCallback = value; }
// public static java.lang.Runnable stopCallback() { return net.minecraft.util.profiling.jfr.JfrListener.stopCallback; }
// public static void stopCallback(java.lang.Runnable value, ) { net.minecraft.util.profiling.jfr.JfrListener.stopCallback = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiling.jfr.JfrListener.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiling.jfr.JfrListener.LOGGER = value; }

// public JfrListener(java.lang.Runnable stopCallback) { this.wrapperContained = new net.minecraft.util.profiling.jfr.JfrListener(stopCallback); }
// public void log(java.util.function.Supplier logSupplier) { wrapperContained.log(logSupplier); }
// public static void log(java.util.function.Supplier logSupplier, ) { net.minecraft.util.profiling.jfr.JfrListener.log(logSupplier); }
// public void warn(java.util.function.Supplier logSupplier,java.lang.Throwable throwable) { wrapperContained.warn(logSupplier,throwable); }
// public static void warn(java.util.function.Supplier logSupplier,java.lang.Throwable throwable, ) { net.minecraft.util.profiling.jfr.JfrListener.warn(logSupplier,throwable); }
public void stop(java.nio.file.Path dumpPath) { wrapperContained.stop(dumpPath); }
// public static void stop(java.nio.file.Path dumpPath, ) { net.minecraft.util.profiling.jfr.JfrListener.stop(dumpPath); }

}