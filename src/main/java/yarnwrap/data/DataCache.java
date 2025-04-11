package yarnwrap.data;
public class DataCache { public net.minecraft.data.DataCache wrapperContained; public DataCache(net.minecraft.data.DataCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path root() { return wrapperContained.root; }
// public void root(java.nio.file.Path value) { wrapperContained.root = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String HEADER() { return wrapperContained.HEADER; }
// public void HEADER(java.lang.String value) { wrapperContained.HEADER = value; }
// public java.nio.file.Path cachePath() { return wrapperContained.cachePath; }
// public void cachePath(java.nio.file.Path value) { wrapperContained.cachePath = value; }
// public java.lang.String versionName() { return wrapperContained.versionName; }
// public void versionName(java.lang.String value) { wrapperContained.versionName = value; }
// public java.util.Set dataWriters() { return wrapperContained.dataWriters; }
// public void dataWriters(java.util.Set value) { wrapperContained.dataWriters = value; }
// public java.util.Set paths() { return wrapperContained.paths; }
// public void paths(java.util.Set value) { wrapperContained.paths = value; }
// public int totalSize() { return wrapperContained.totalSize; }
// public void totalSize(int value) { wrapperContained.totalSize = value; }
// public java.util.Map cachedDatas() { return wrapperContained.cachedDatas; }
// public void cachedDatas(java.util.Map value) { wrapperContained.cachedDatas = value; }
// public int totalCacheMissCount() { return wrapperContained.totalCacheMissCount; }
// public void totalCacheMissCount(int value) { wrapperContained.totalCacheMissCount = value; }
// public void write() { wrapperContained.write(); }
public boolean isVersionDifferent(java.lang.String providerName) { return wrapperContained.isVersionDifferent(providerName); }
// public Object parseOrCreateCache(java.nio.file.Path root,java.nio.file.Path dataProviderPath) { return wrapperContained.parseOrCreateCache(root,dataProviderPath); }
// public java.nio.file.Path getPath(java.lang.String providerName) { return wrapperContained.getPath(providerName); }
// public void store(Object runResult) { wrapperContained.store(runResult); }
// public java.util.concurrent.CompletableFuture run(java.lang.String providerName,Object runner) { return wrapperContained.run(providerName,runner); }

}