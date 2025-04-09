package yarnwrap.util.logging;
public class UncaughtExceptionLogger { public net.minecraft.util.logging.UncaughtExceptionLogger wrapperContained; public UncaughtExceptionLogger(net.minecraft.util.logging.UncaughtExceptionLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger logger() { return wrapperContained.logger; }

}