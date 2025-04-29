package yarnwrap.client.render.chunk;
public class ChunkRendererRegionBuilder { public net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained; public ChunkRendererRegionBuilder(net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunks() { return wrapperContained.chunks; }
// public void chunks(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.chunks = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap chunks() { return net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.chunks; }
// public static void chunks(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.chunks = value; }

public yarnwrap.client.render.chunk.ChunkRendererRegion build(yarnwrap.world.World world,yarnwrap.util.math.ChunkSectionPos sectionPos) { return new yarnwrap.client.render.chunk.ChunkRendererRegion(wrapperContained.build(world.wrapperContained,sectionPos.wrapperContained)); }
// public static yarnwrap.client.render.chunk.ChunkRendererRegion build(yarnwrap.world.World world,yarnwrap.util.math.ChunkSectionPos sectionPos, ) { return new yarnwrap.client.render.chunk.ChunkRendererRegion(net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.build(world.wrapperContained,sectionPos.wrapperContained)); }
// public Object computeClientChunk(yarnwrap.world.World world,int chunkX,int chunkZ) { return wrapperContained.computeClientChunk(world.wrapperContained,chunkX,chunkZ); }
// public static Object computeClientChunk(yarnwrap.world.World world,int chunkX,int chunkZ, ) { return net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.computeClientChunk(world.wrapperContained,chunkX,chunkZ); }
// public Object method_60901(yarnwrap.world.World chunkPos) { return wrapperContained.method_60901(chunkPos.wrapperContained); }
// public static Object method_60901(yarnwrap.world.World chunkPos, ) { return net.minecraft.client.render.chunk.ChunkRendererRegionBuilder.method_60901(chunkPos.wrapperContained); }

}