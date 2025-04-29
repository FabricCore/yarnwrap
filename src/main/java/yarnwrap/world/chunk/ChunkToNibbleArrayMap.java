package yarnwrap.world.chunk;
public class ChunkToNibbleArrayMap { public net.minecraft.world.chunk.ChunkToNibbleArrayMap wrapperContained; public ChunkToNibbleArrayMap(net.minecraft.world.chunk.ChunkToNibbleArrayMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] cachePositions() { return wrapperContained.cachePositions; }
// public void cachePositions(long[] value) { wrapperContained.cachePositions = value; }
// public static long[] cachePositions() { return net.minecraft.world.chunk.ChunkToNibbleArrayMap.cachePositions; }
// public static void cachePositions(long[] value, ) { net.minecraft.world.chunk.ChunkToNibbleArrayMap.cachePositions = value; }

// public net.minecraft.world.chunk.ChunkNibbleArray[] cacheArrays() { return wrapperContained.cacheArrays; }
// public void cacheArrays(net.minecraft.world.chunk.ChunkNibbleArray[] value) { wrapperContained.cacheArrays = value; }
// public static net.minecraft.world.chunk.ChunkNibbleArray[] cacheArrays() { return net.minecraft.world.chunk.ChunkToNibbleArrayMap.cacheArrays; }
// public static void cacheArrays(net.minecraft.world.chunk.ChunkNibbleArray[] value, ) { net.minecraft.world.chunk.ChunkToNibbleArrayMap.cacheArrays = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap arrays() { return wrapperContained.arrays; }
// public void arrays(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.arrays = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap arrays() { return net.minecraft.world.chunk.ChunkToNibbleArrayMap.arrays; }
// public static void arrays(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.world.chunk.ChunkToNibbleArrayMap.arrays = value; }

// public boolean cacheEnabled() { return wrapperContained.cacheEnabled; }
// public void cacheEnabled(boolean value) { wrapperContained.cacheEnabled = value; }
// public static boolean cacheEnabled() { return net.minecraft.world.chunk.ChunkToNibbleArrayMap.cacheEnabled; }
// public static void cacheEnabled(boolean value, ) { net.minecraft.world.chunk.ChunkToNibbleArrayMap.cacheEnabled = value; }

// public ChunkToNibbleArrayMap(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap arrays) { this.wrapperContained = new net.minecraft.world.chunk.ChunkToNibbleArrayMap(arrays); }
public void put(long pos,yarnwrap.world.chunk.ChunkNibbleArray data) { wrapperContained.put(pos,data.wrapperContained); }
// public static void put(long pos,yarnwrap.world.chunk.ChunkNibbleArray data, ) { net.minecraft.world.chunk.ChunkToNibbleArrayMap.put(pos,data.wrapperContained); }
public yarnwrap.world.chunk.ChunkNibbleArray removeChunk(long chunkPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.removeChunk(chunkPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray removeChunk(long chunkPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.ChunkToNibbleArrayMap.removeChunk(chunkPos)); }
public yarnwrap.world.chunk.ChunkNibbleArray get(long chunkPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.get(chunkPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray get(long chunkPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.ChunkToNibbleArrayMap.get(chunkPos)); }
public yarnwrap.world.chunk.ChunkNibbleArray replaceWithCopy(long pos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.replaceWithCopy(pos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray replaceWithCopy(long pos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.ChunkToNibbleArrayMap.replaceWithCopy(pos)); }
public boolean containsKey(long chunkPos) { return wrapperContained.containsKey(chunkPos); }
// public static boolean containsKey(long chunkPos, ) { return net.minecraft.world.chunk.ChunkToNibbleArrayMap.containsKey(chunkPos); }
public yarnwrap.world.chunk.ChunkToNibbleArrayMap copy() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.copy()); }
// public static yarnwrap.world.chunk.ChunkToNibbleArrayMap copy() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(net.minecraft.world.chunk.ChunkToNibbleArrayMap.copy()); }
public void clearCache() { wrapperContained.clearCache(); }
// public static void clearCache() { net.minecraft.world.chunk.ChunkToNibbleArrayMap.clearCache(); }
public void disableCache() { wrapperContained.disableCache(); }
// public static void disableCache() { net.minecraft.world.chunk.ChunkToNibbleArrayMap.disableCache(); }

}