package yarnwrap.util.logging;
public class UncaughtExceptionLogger { public net.minecraft.util.logging.UncaughtExceptionLogger wrapperContained; public UncaughtExceptionLogger(net.minecraft.util.logging.UncaughtExceptionLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger logger() { return wrapperContained.logger; }
// public void logger(org.slf4j.Logger value) { wrapperContained.logger = value; }
// public static org.slf4j.Logger logger() { return net.minecraft.util.logging.UncaughtExceptionLogger.logger; }
// public static void logger(org.slf4j.Logger value, ) { net.minecraft.util.logging.UncaughtExceptionLogger.logger = value; }

public UncaughtExceptionLogger(org.slf4j.Logger logger) { this.wrapperContained = new net.minecraft.util.logging.UncaughtExceptionLogger(logger); }
public void uncaughtException(java.lang.Thread thread,java.lang.Throwable throwable) { wrapperContained.uncaughtException(thread,throwable); }
// public static void uncaughtException(java.lang.Thread thread,java.lang.Throwable throwable, ) { net.minecraft.util.logging.UncaughtExceptionLogger.uncaughtException(thread,throwable); }

}