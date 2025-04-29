package yarnwrap.data;
public class DataCache { public net.minecraft.data.DataCache wrapperContained; public DataCache(net.minecraft.data.DataCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path root() { return wrapperContained.root; }
// public void root(java.nio.file.Path value) { wrapperContained.root = value; }
// public static java.nio.file.Path root() { return net.minecraft.data.DataCache.root; }
// public static void root(java.nio.file.Path value, ) { net.minecraft.data.DataCache.root = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.data.DataCache.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.DataCache.LOGGER = value; }

// public java.lang.String HEADER() { return wrapperContained.HEADER; }
// public void HEADER(java.lang.String value) { wrapperContained.HEADER = value; }
// public static java.lang.String HEADER() { return net.minecraft.data.DataCache.HEADER; }
// public static void HEADER(java.lang.String value, ) { net.minecraft.data.DataCache.HEADER = value; }

// public java.nio.file.Path cachePath() { return wrapperContained.cachePath; }
// public void cachePath(java.nio.file.Path value) { wrapperContained.cachePath = value; }
// public static java.nio.file.Path cachePath() { return net.minecraft.data.DataCache.cachePath; }
// public static void cachePath(java.nio.file.Path value, ) { net.minecraft.data.DataCache.cachePath = value; }

// public java.lang.String versionName() { return wrapperContained.versionName; }
// public void versionName(java.lang.String value) { wrapperContained.versionName = value; }
// public static java.lang.String versionName() { return net.minecraft.data.DataCache.versionName; }
// public static void versionName(java.lang.String value, ) { net.minecraft.data.DataCache.versionName = value; }

// public java.util.Set dataWriters() { return wrapperContained.dataWriters; }
// public void dataWriters(java.util.Set value) { wrapperContained.dataWriters = value; }
// public static java.util.Set dataWriters() { return net.minecraft.data.DataCache.dataWriters; }
// public static void dataWriters(java.util.Set value, ) { net.minecraft.data.DataCache.dataWriters = value; }

// public java.util.Set paths() { return wrapperContained.paths; }
// public void paths(java.util.Set value) { wrapperContained.paths = value; }
// public static java.util.Set paths() { return net.minecraft.data.DataCache.paths; }
// public static void paths(java.util.Set value, ) { net.minecraft.data.DataCache.paths = value; }

// public int totalSize() { return wrapperContained.totalSize; }
// public void totalSize(int value) { wrapperContained.totalSize = value; }
// public static int totalSize() { return net.minecraft.data.DataCache.totalSize; }
// public static void totalSize(int value, ) { net.minecraft.data.DataCache.totalSize = value; }

// public java.util.Map cachedDatas() { return wrapperContained.cachedDatas; }
// public void cachedDatas(java.util.Map value) { wrapperContained.cachedDatas = value; }
// public static java.util.Map cachedDatas() { return net.minecraft.data.DataCache.cachedDatas; }
// public static void cachedDatas(java.util.Map value, ) { net.minecraft.data.DataCache.cachedDatas = value; }

// public int totalCacheMissCount() { return wrapperContained.totalCacheMissCount; }
// public void totalCacheMissCount(int value) { wrapperContained.totalCacheMissCount = value; }
// public static int totalCacheMissCount() { return net.minecraft.data.DataCache.totalCacheMissCount; }
// public static void totalCacheMissCount(int value, ) { net.minecraft.data.DataCache.totalCacheMissCount = value; }

// public DataCache(java.nio.file.Path root,java.util.Collection providerNames,yarnwrap.GameVersion gameVersion) { this.wrapperContained = new net.minecraft.data.DataCache(root,providerNames,gameVersion.wrapperContained); }
// public void write() { wrapperContained.write(); }
// public static void write() { net.minecraft.data.DataCache.write(); }
public boolean isVersionDifferent(java.lang.String providerName) { return wrapperContained.isVersionDifferent(providerName); }
// public static boolean isVersionDifferent(java.lang.String providerName, ) { return net.minecraft.data.DataCache.isVersionDifferent(providerName); }
// public Object parseOrCreateCache(java.nio.file.Path root,java.nio.file.Path dataProviderPath) { return wrapperContained.parseOrCreateCache(root,dataProviderPath); }
// public static Object parseOrCreateCache(java.nio.file.Path root,java.nio.file.Path dataProviderPath, ) { return net.minecraft.data.DataCache.parseOrCreateCache(root,dataProviderPath); }
// public java.nio.file.Path getPath(java.lang.String providerName) { return wrapperContained.getPath(providerName); }
// public static java.nio.file.Path getPath(java.lang.String providerName, ) { return net.minecraft.data.DataCache.getPath(providerName); }
// public Object method_46568(Object void_) { return wrapperContained.method_46568(void_); }
// public static Object method_46568(Object void_, ) { return net.minecraft.data.DataCache.method_46568(void_); }
// public void store(Object runResult) { wrapperContained.store(runResult); }
// public static void store(Object runResult, ) { net.minecraft.data.DataCache.store(runResult); }
// public java.util.concurrent.CompletableFuture run(java.lang.String providerName,Object runner) { return wrapperContained.run(providerName,runner); }
// public static java.util.concurrent.CompletableFuture run(java.lang.String providerName,Object runner, ) { return net.minecraft.data.DataCache.run(providerName,runner); }
// public void method_46571(java.util.Set providerName,java.lang.String cachedData) { wrapperContained.method_46571(providerName,cachedData); }
// public static void method_46571(java.util.Set providerName,java.lang.String cachedData, ) { net.minecraft.data.DataCache.method_46571(providerName,cachedData); }

}