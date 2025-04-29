package yarnwrap.world;
public class ChunkSectionCache { public net.minecraft.world.ChunkSectionCache wrapperContained; public ChunkSectionCache(net.minecraft.world.ChunkSectionCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.WorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(net.minecraft.world.ChunkSectionCache.world); }
// public static void world(yarnwrap.world.WorldAccess value, ) { net.minecraft.world.ChunkSectionCache.world = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap cache() { return wrapperContained.cache; }
// public void cache(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.cache = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap cache() { return net.minecraft.world.ChunkSectionCache.cache; }
// public static void cache(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.ChunkSectionCache.cache = value; }

// public yarnwrap.world.chunk.ChunkSection cachedSection() { return new yarnwrap.world.chunk.ChunkSection(wrapperContained.cachedSection); }
// public void cachedSection(yarnwrap.world.chunk.ChunkSection value) { wrapperContained.cachedSection = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkSection cachedSection() { return new yarnwrap.world.chunk.ChunkSection(net.minecraft.world.ChunkSectionCache.cachedSection); }
// public static void cachedSection(yarnwrap.world.chunk.ChunkSection value, ) { net.minecraft.world.ChunkSectionCache.cachedSection = value.wrapperContained; }

// public long sectionPos() { return wrapperContained.sectionPos; }
// public void sectionPos(long value) { wrapperContained.sectionPos = value; }
// public static long sectionPos() { return net.minecraft.world.ChunkSectionCache.sectionPos; }
// public static void sectionPos(long value, ) { net.minecraft.world.ChunkSectionCache.sectionPos = value; }

public ChunkSectionCache(yarnwrap.world.WorldAccess world) { this.wrapperContained = new net.minecraft.world.ChunkSectionCache(world.wrapperContained); }
public yarnwrap.world.chunk.ChunkSection getSection(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.ChunkSection(wrapperContained.getSection(pos.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkSection getSection(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.chunk.ChunkSection(net.minecraft.world.ChunkSectionCache.getSection(pos.wrapperContained)); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.world.ChunkSectionCache.getBlockState(pos.wrapperContained)); }

}