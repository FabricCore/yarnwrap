package yarnwrap.util.logging;
public class UncaughtExceptionHandler { public net.minecraft.util.logging.UncaughtExceptionHandler wrapperContained; public UncaughtExceptionHandler(net.minecraft.util.logging.UncaughtExceptionHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger logger() { return wrapperContained.logger; }

}