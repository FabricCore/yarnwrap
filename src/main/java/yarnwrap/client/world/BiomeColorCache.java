package yarnwrap.client.world;
public class BiomeColorCache { public net.minecraft.client.world.BiomeColorCache wrapperContained; public BiomeColorCache(net.minecraft.client.world.BiomeColorCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal last() { return wrapperContained.last; }
// public void last(java.lang.ThreadLocal value) { wrapperContained.last = value; }
// public static java.lang.ThreadLocal last() { return net.minecraft.client.world.BiomeColorCache.last; }
// public static void last(java.lang.ThreadLocal value, ) { net.minecraft.client.world.BiomeColorCache.last = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap colors() { return wrapperContained.colors; }
// public void colors(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.colors = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap colors() { return net.minecraft.client.world.BiomeColorCache.colors; }
// public static void colors(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.client.world.BiomeColorCache.colors = value; }

// public java.util.concurrent.locks.ReentrantReadWriteLock lock() { return wrapperContained.lock; }
// public void lock(java.util.concurrent.locks.ReentrantReadWriteLock value) { wrapperContained.lock = value; }
// public static java.util.concurrent.locks.ReentrantReadWriteLock lock() { return net.minecraft.client.world.BiomeColorCache.lock; }
// public static void lock(java.util.concurrent.locks.ReentrantReadWriteLock value, ) { net.minecraft.client.world.BiomeColorCache.lock = value; }

// public int MAX_ENTRY_SIZE() { return wrapperContained.MAX_ENTRY_SIZE; }
// public void MAX_ENTRY_SIZE(int value) { wrapperContained.MAX_ENTRY_SIZE = value; }
// public static int MAX_ENTRY_SIZE() { return net.minecraft.client.world.BiomeColorCache.MAX_ENTRY_SIZE; }
// public static void MAX_ENTRY_SIZE(int value, ) { net.minecraft.client.world.BiomeColorCache.MAX_ENTRY_SIZE = value; }

// public java.util.function.ToIntFunction colorFactory() { return wrapperContained.colorFactory; }
// public void colorFactory(java.util.function.ToIntFunction value) { wrapperContained.colorFactory = value; }
// public static java.util.function.ToIntFunction colorFactory() { return net.minecraft.client.world.BiomeColorCache.colorFactory; }
// public static void colorFactory(java.util.function.ToIntFunction value, ) { net.minecraft.client.world.BiomeColorCache.colorFactory = value; }

public BiomeColorCache(java.util.function.ToIntFunction colorFactory) { this.wrapperContained = new net.minecraft.client.world.BiomeColorCache(colorFactory); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.world.BiomeColorCache.reset(); }
public void reset(int chunkX,int chunkZ) { wrapperContained.reset(chunkX,chunkZ); }
// public static void reset(int chunkX,int chunkZ, ) { net.minecraft.client.world.BiomeColorCache.reset(chunkX,chunkZ); }
public int getBiomeColor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBiomeColor(pos.wrapperContained); }
// public static int getBiomeColor(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.world.BiomeColorCache.getBiomeColor(pos.wrapperContained); }
// public Object getColorArray(int chunkX,int chunkZ) { return wrapperContained.getColorArray(chunkX,chunkZ); }
// public static Object getColorArray(int chunkX,int chunkZ, ) { return net.minecraft.client.world.BiomeColorCache.getColorArray(chunkX,chunkZ); }

}