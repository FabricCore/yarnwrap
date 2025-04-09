package yarnwrap;
public class Bootstrap { public net.minecraft.Bootstrap wrapperContained; public Bootstrap(net.minecraft.Bootstrap wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean initialized() { return wrapperContained.initialized; }
public java.io.PrintStream SYSOUT() { return wrapperContained.SYSOUT; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.concurrent.atomic.AtomicLong LOAD_TIME() { return wrapperContained.LOAD_TIME; }
public void println(java.lang.String str) { wrapperContained.println(str); }
// public void collectMissingTranslations(java.lang.Iterable registry,java.util.function.Function keyExtractor,java.util.Set translationKeys) { wrapperContained.collectMissingTranslations(registry,keyExtractor,translationKeys); }
public void initialize() { wrapperContained.initialize(); }
// public void setOutputStreams() { wrapperContained.setOutputStreams(); }
public java.util.Set getMissingTranslations() { return wrapperContained.getMissingTranslations(); }
public void logMissing() { wrapperContained.logMissing(); }
// public void collectMissingGameRuleTranslations(java.util.Set translations) { wrapperContained.collectMissingGameRuleTranslations(translations); }
public void ensureBootstrapped(java.util.function.Supplier callerGetter) { wrapperContained.ensureBootstrapped(callerGetter); }
// public java.lang.RuntimeException createNotBootstrappedException(java.util.function.Supplier callerGetter) { return wrapperContained.createNotBootstrappedException(callerGetter); }

}