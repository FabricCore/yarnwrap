package yarnwrap.client.world;
public class BiomeColorCache { public net.minecraft.client.world.BiomeColorCache wrapperContained; public BiomeColorCache(net.minecraft.client.world.BiomeColorCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal last() { return wrapperContained.last; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap colors() { return wrapperContained.colors; }
// public java.util.concurrent.locks.ReentrantReadWriteLock lock() { return wrapperContained.lock; }
// public int MAX_ENTRY_SIZE() { return wrapperContained.MAX_ENTRY_SIZE; }
// public java.util.function.ToIntFunction colorFactory() { return wrapperContained.colorFactory; }
public void reset() { wrapperContained.reset(); }
public void reset(int chunkX,int chunkZ) { wrapperContained.reset(chunkX,chunkZ); }
public int getBiomeColor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBiomeColor(pos.wrapperContained); }
// public Object getColorArray(int chunkX,int chunkZ) { return wrapperContained.getColorArray(chunkX,chunkZ); }

}