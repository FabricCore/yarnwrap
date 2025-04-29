package yarnwrap.data;
public class DataGenerator { public net.minecraft.data.DataGenerator wrapperContained; public DataGenerator(net.minecraft.data.DataGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.data.DataGenerator.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.DataGenerator.LOGGER = value; }

// public java.util.Map runningProviders() { return wrapperContained.runningProviders; }
// public void runningProviders(java.util.Map value) { wrapperContained.runningProviders = value; }
// public static java.util.Map runningProviders() { return net.minecraft.data.DataGenerator.runningProviders; }
// public static void runningProviders(java.util.Map value, ) { net.minecraft.data.DataGenerator.runningProviders = value; }

// public yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(wrapperContained.gameVersion); }
// public void gameVersion(yarnwrap.GameVersion value) { wrapperContained.gameVersion = value.wrapperContained; }
// public static yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(net.minecraft.data.DataGenerator.gameVersion); }
// public static void gameVersion(yarnwrap.GameVersion value, ) { net.minecraft.data.DataGenerator.gameVersion = value.wrapperContained; }

// public boolean ignoreCache() { return wrapperContained.ignoreCache; }
// public void ignoreCache(boolean value) { wrapperContained.ignoreCache = value; }
// public static boolean ignoreCache() { return net.minecraft.data.DataGenerator.ignoreCache; }
// public static void ignoreCache(boolean value, ) { net.minecraft.data.DataGenerator.ignoreCache = value; }

// public java.nio.file.Path outputPath() { return wrapperContained.outputPath; }
// public void outputPath(java.nio.file.Path value) { wrapperContained.outputPath = value; }
// public static java.nio.file.Path outputPath() { return net.minecraft.data.DataGenerator.outputPath; }
// public static void outputPath(java.nio.file.Path value, ) { net.minecraft.data.DataGenerator.outputPath = value; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.DataGenerator.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.DataGenerator.output = value.wrapperContained; }

// public java.util.Set providerNames() { return wrapperContained.providerNames; }
// public void providerNames(java.util.Set value) { wrapperContained.providerNames = value; }
// public static java.util.Set providerNames() { return net.minecraft.data.DataGenerator.providerNames; }
// public static void providerNames(java.util.Set value, ) { net.minecraft.data.DataGenerator.providerNames = value; }

public DataGenerator(java.nio.file.Path outputPath,yarnwrap.GameVersion gameVersion,boolean ignoreCache) { this.wrapperContained = new net.minecraft.data.DataGenerator(outputPath,gameVersion.wrapperContained,ignoreCache); }
// public void run() { wrapperContained.run(); }
// public static void run() { net.minecraft.data.DataGenerator.run(); }
// public void method_46563(yarnwrap.data.DataCache name,com.google.common.base.Stopwatch provider) { wrapperContained.method_46563(name.wrapperContained,provider); }
// public static void method_46563(yarnwrap.data.DataCache name,com.google.common.base.Stopwatch provider, ) { net.minecraft.data.DataGenerator.method_46563(name.wrapperContained,provider); }
public Object createVanillaPack(boolean shouldRun) { return wrapperContained.createVanillaPack(shouldRun); }
// public static Object createVanillaPack(boolean shouldRun, ) { return net.minecraft.data.DataGenerator.createVanillaPack(shouldRun); }
public Object createVanillaSubPack(boolean shouldRun,java.lang.String packName) { return wrapperContained.createVanillaSubPack(shouldRun,packName); }
// public static Object createVanillaSubPack(boolean shouldRun,java.lang.String packName, ) { return net.minecraft.data.DataGenerator.createVanillaSubPack(shouldRun,packName); }

}