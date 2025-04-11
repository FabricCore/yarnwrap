package yarnwrap.client.world;
public class BiomeColorCache { public net.minecraft.client.world.BiomeColorCache wrapperContained; public BiomeColorCache(net.minecraft.client.world.BiomeColorCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal last() { return wrapperContained.last; }
// public void last(java.lang.ThreadLocal value) { wrapperContained.last = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap colors() { return wrapperContained.colors; }
// public void colors(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.colors = value; }
// public java.util.concurrent.locks.ReentrantReadWriteLock lock() { return wrapperContained.lock; }
// public void lock(java.util.concurrent.locks.ReentrantReadWriteLock value) { wrapperContained.lock = value; }
// public int MAX_ENTRY_SIZE() { return wrapperContained.MAX_ENTRY_SIZE; }
// public void MAX_ENTRY_SIZE(int value) { wrapperContained.MAX_ENTRY_SIZE = value; }
// public java.util.function.ToIntFunction colorFactory() { return wrapperContained.colorFactory; }
// public void colorFactory(java.util.function.ToIntFunction value) { wrapperContained.colorFactory = value; }
public BiomeColorCache(java.util.function.ToIntFunction colorFactory) { this.wrapperContained = new net.minecraft.client.world.BiomeColorCache(colorFactory); }
public void reset() { wrapperContained.reset(); }
public void reset(int chunkX,int chunkZ) { wrapperContained.reset(chunkX,chunkZ); }
public int getBiomeColor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBiomeColor(pos.wrapperContained); }
// public Object getColorArray(int chunkX,int chunkZ) { return wrapperContained.getColorArray(chunkX,chunkZ); }

}