package yarnwrap;
public class Bootstrap { public net.minecraft.Bootstrap wrapperContained; public Bootstrap(net.minecraft.Bootstrap wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
public java.io.PrintStream SYSOUT() { return wrapperContained.SYSOUT; }
// public void SYSOUT(java.io.PrintStream value) { wrapperContained.SYSOUT = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.concurrent.atomic.AtomicLong LOAD_TIME() { return wrapperContained.LOAD_TIME; }
// public void LOAD_TIME(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.LOAD_TIME = value; }
public void println(java.lang.String str) { wrapperContained.println(str); }
// public void collectMissingTranslations(java.lang.Iterable registry,java.util.function.Function keyExtractor,java.util.Set translationKeys) { wrapperContained.collectMissingTranslations(registry,keyExtractor,translationKeys); }
// public void method_12850(java.util.function.Function object) { wrapperContained.method_12850(object); }
public void initialize() { wrapperContained.initialize(); }
// public void setOutputStreams() { wrapperContained.setOutputStreams(); }
// public java.lang.String method_17595(yarnwrap.util.Identifier stat) { return wrapperContained.method_17595(stat.wrapperContained); }
public java.util.Set getMissingTranslations() { return wrapperContained.getMissingTranslations(); }
public void logMissing() { wrapperContained.logMissing(); }
// public void collectMissingGameRuleTranslations(java.util.Set translations) { wrapperContained.collectMissingGameRuleTranslations(translations); }
public void ensureBootstrapped(java.util.function.Supplier callerGetter) { wrapperContained.ensureBootstrapped(callerGetter); }
// public void method_36236(java.lang.String key) { wrapperContained.method_36236(key); }
// public java.lang.RuntimeException createNotBootstrappedException(java.util.function.Supplier callerGetter) { return wrapperContained.createNotBootstrappedException(callerGetter); }

}