package yarnwrap.client.realms.exception;
public class RealmsDefaultUncaughtExceptionHandler { public net.minecraft.client.realms.exception.RealmsDefaultUncaughtExceptionHandler wrapperContained; public RealmsDefaultUncaughtExceptionHandler(net.minecraft.client.realms.exception.RealmsDefaultUncaughtExceptionHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger logger() { return wrapperContained.logger; }
// public void logger(org.slf4j.Logger value) { wrapperContained.logger = value; }
public RealmsDefaultUncaughtExceptionHandler(org.slf4j.Logger logger) { this.wrapperContained = new net.minecraft.client.realms.exception.RealmsDefaultUncaughtExceptionHandler(logger); }
public void uncaughtException(java.lang.Thread t,java.lang.Throwable e) { wrapperContained.uncaughtException(t,e); }

}