package yarnwrap;
public class Bootstrap { public net.minecraft.Bootstrap wrapperContained; public Bootstrap(net.minecraft.Bootstrap wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public static boolean initialized() { return net.minecraft.Bootstrap.initialized; }
// public static void initialized(boolean value, ) { net.minecraft.Bootstrap.initialized = value; }

// public java.io.PrintStream SYSOUT() { return wrapperContained.SYSOUT; }
// public void SYSOUT(java.io.PrintStream value) { wrapperContained.SYSOUT = value; }
public static java.io.PrintStream SYSOUT() { return net.minecraft.Bootstrap.SYSOUT; }
// public static void SYSOUT(java.io.PrintStream value, ) { net.minecraft.Bootstrap.SYSOUT = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.Bootstrap.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.Bootstrap.LOGGER = value; }

// public java.util.concurrent.atomic.AtomicLong LOAD_TIME() { return wrapperContained.LOAD_TIME; }
// public void LOAD_TIME(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.LOAD_TIME = value; }
public static java.util.concurrent.atomic.AtomicLong LOAD_TIME() { return net.minecraft.Bootstrap.LOAD_TIME; }
// public static void LOAD_TIME(java.util.concurrent.atomic.AtomicLong value, ) { net.minecraft.Bootstrap.LOAD_TIME = value; }

// public void println(java.lang.String str) { wrapperContained.println(str); }
// public static void println(java.lang.String str, ) { net.minecraft.Bootstrap.println(str); }
// public void collectMissingTranslations(java.lang.Iterable registry,java.util.function.Function keyExtractor,java.util.Set translationKeys) { wrapperContained.collectMissingTranslations(registry,keyExtractor,translationKeys); }
// public static void collectMissingTranslations(java.lang.Iterable registry,java.util.function.Function keyExtractor,java.util.Set translationKeys, ) { net.minecraft.Bootstrap.collectMissingTranslations(registry,keyExtractor,translationKeys); }
// public void method_12850(java.util.function.Function object) { wrapperContained.method_12850(object); }
// public static void method_12850(java.util.function.Function object, ) { net.minecraft.Bootstrap.method_12850(object); }
// public void initialize() { wrapperContained.initialize(); }
public static void initialize() { net.minecraft.Bootstrap.initialize(); }
// public void setOutputStreams() { wrapperContained.setOutputStreams(); }
// public static void setOutputStreams() { net.minecraft.Bootstrap.setOutputStreams(); }
// public java.lang.String method_17595(yarnwrap.util.Identifier stat) { return wrapperContained.method_17595(stat.wrapperContained); }
// public static java.lang.String method_17595(yarnwrap.util.Identifier stat, ) { return net.minecraft.Bootstrap.method_17595(stat.wrapperContained); }
// public java.util.Set getMissingTranslations() { return wrapperContained.getMissingTranslations(); }
public static java.util.Set getMissingTranslations() { return net.minecraft.Bootstrap.getMissingTranslations(); }
// public void logMissing() { wrapperContained.logMissing(); }
public static void logMissing() { net.minecraft.Bootstrap.logMissing(); }
// public void collectMissingGameRuleTranslations(java.util.Set translations) { wrapperContained.collectMissingGameRuleTranslations(translations); }
// public static void collectMissingGameRuleTranslations(java.util.Set translations, ) { net.minecraft.Bootstrap.collectMissingGameRuleTranslations(translations); }
// public void ensureBootstrapped(java.util.function.Supplier callerGetter) { wrapperContained.ensureBootstrapped(callerGetter); }
// public static void ensureBootstrapped(java.util.function.Supplier callerGetter, ) { net.minecraft.Bootstrap.ensureBootstrapped(callerGetter); }
// public void method_36236(java.lang.String key) { wrapperContained.method_36236(key); }
// public static void method_36236(java.lang.String key, ) { net.minecraft.Bootstrap.method_36236(key); }
// public java.lang.RuntimeException createNotBootstrappedException(java.util.function.Supplier callerGetter) { return wrapperContained.createNotBootstrappedException(callerGetter); }
// public static java.lang.RuntimeException createNotBootstrappedException(java.util.function.Supplier callerGetter, ) { return net.minecraft.Bootstrap.createNotBootstrappedException(callerGetter); }

}