package yarnwrap.util.path;
public class CacheFiles { public net.minecraft.util.path.CacheFiles wrapperContained; public CacheFiles(net.minecraft.util.path.CacheFiles wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List findCacheFiles(java.nio.file.Path directory) { return wrapperContained.findCacheFiles(directory); }
public void clear(java.nio.file.Path directory,int maxRetained) { wrapperContained.clear(directory,maxRetained); }
// public java.util.List toCacheEntries(java.util.List files) { return wrapperContained.toCacheEntries(files); }

}