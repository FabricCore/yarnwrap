package yarnwrap.data;
public class DataCache { public net.minecraft.data.DataCache wrapperContained; public DataCache(net.minecraft.data.DataCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path root() { return wrapperContained.root; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String HEADER() { return wrapperContained.HEADER; }
// public java.nio.file.Path cachePath() { return wrapperContained.cachePath; }
// public java.lang.String versionName() { return wrapperContained.versionName; }
// public java.util.Set dataWriters() { return wrapperContained.dataWriters; }
// public java.util.Set paths() { return wrapperContained.paths; }
// public int totalSize() { return wrapperContained.totalSize; }
// public java.util.Map cachedDatas() { return wrapperContained.cachedDatas; }
// public int totalCacheMissCount() { return wrapperContained.totalCacheMissCount; }
// public void write() { wrapperContained.write(); }
public boolean isVersionDifferent(java.lang.String providerName) { return wrapperContained.isVersionDifferent(providerName); }
// public Object parseOrCreateCache(java.nio.file.Path root,java.nio.file.Path dataProviderPath) { return wrapperContained.parseOrCreateCache(root,dataProviderPath); }
// public java.nio.file.Path getPath(java.lang.String providerName) { return wrapperContained.getPath(providerName); }
// public void store(Object runResult) { wrapperContained.store(runResult); }
// public java.util.concurrent.CompletableFuture run(java.lang.String providerName,Object runner) { return wrapperContained.run(providerName,runner); }

}