package yarnwrap.util.profiling.jfr;
public class JfrListener { public net.minecraft.util.profiling.jfr.JfrListener wrapperContained; public JfrListener(net.minecraft.util.profiling.jfr.JfrListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Runnable stopCallback() { return wrapperContained.stopCallback; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void log(java.util.function.Supplier logSupplier) { wrapperContained.log(logSupplier); }
// public void warn(java.util.function.Supplier logSupplier,java.lang.Throwable throwable) { wrapperContained.warn(logSupplier,throwable); }
public void stop(java.nio.file.Path dumpPath) { wrapperContained.stop(dumpPath); }

}