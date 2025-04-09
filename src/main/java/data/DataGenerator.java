package yarnwrap.data;
public class DataGenerator { public net.minecraft.data.DataGenerator wrapperContained; public DataGenerator(net.minecraft.data.DataGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map runningProviders() { return wrapperContained.runningProviders; }
// public yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(wrapperContained.gameVersion); }
// public boolean ignoreCache() { return wrapperContained.ignoreCache; }
// public java.nio.file.Path outputPath() { return wrapperContained.outputPath; }
// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public java.util.Set providerNames() { return wrapperContained.providerNames; }
// public void run() { wrapperContained.run(); }
public Object createVanillaPack(boolean shouldRun) { return wrapperContained.createVanillaPack(shouldRun); }
public Object createVanillaSubPack(boolean shouldRun,java.lang.String packName) { return wrapperContained.createVanillaSubPack(shouldRun,packName); }

}