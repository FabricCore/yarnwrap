package yarnwrap.world;
public class ChunkSectionCache { public net.minecraft.world.ChunkSectionCache wrapperContained; public ChunkSectionCache(net.minecraft.world.ChunkSectionCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.WorldAccess world() { return new yarnwrap.world.WorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.WorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap cache() { return wrapperContained.cache; }
// public void cache(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.cache = value; }
// public yarnwrap.world.chunk.ChunkSection cachedSection() { return new yarnwrap.world.chunk.ChunkSection(wrapperContained.cachedSection); }
// public void cachedSection(yarnwrap.world.chunk.ChunkSection value) { wrapperContained.cachedSection = value.wrapperContained; }
// public long sectionPos() { return wrapperContained.sectionPos; }
// public void sectionPos(long value) { wrapperContained.sectionPos = value; }
public yarnwrap.world.chunk.ChunkSection getSection(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.ChunkSection(wrapperContained.getSection(pos.wrapperContained)); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }

}