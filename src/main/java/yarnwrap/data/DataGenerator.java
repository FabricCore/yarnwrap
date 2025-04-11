package yarnwrap.data;
public class DataGenerator { public net.minecraft.data.DataGenerator wrapperContained; public DataGenerator(net.minecraft.data.DataGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map runningProviders() { return wrapperContained.runningProviders; }
// public void runningProviders(java.util.Map value) { wrapperContained.runningProviders = value; }
// public yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(wrapperContained.gameVersion); }
// public void gameVersion(yarnwrap.GameVersion value) { wrapperContained.gameVersion = value.wrapperContained; }
// public boolean ignoreCache() { return wrapperContained.ignoreCache; }
// public void ignoreCache(boolean value) { wrapperContained.ignoreCache = value; }
// public java.nio.file.Path outputPath() { return wrapperContained.outputPath; }
// public void outputPath(java.nio.file.Path value) { wrapperContained.outputPath = value; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public java.util.Set providerNames() { return wrapperContained.providerNames; }
// public void providerNames(java.util.Set value) { wrapperContained.providerNames = value; }
// public void run() { wrapperContained.run(); }
public Object createVanillaPack(boolean shouldRun) { return wrapperContained.createVanillaPack(shouldRun); }
public Object createVanillaSubPack(boolean shouldRun,java.lang.String packName) { return wrapperContained.createVanillaSubPack(shouldRun,packName); }

}