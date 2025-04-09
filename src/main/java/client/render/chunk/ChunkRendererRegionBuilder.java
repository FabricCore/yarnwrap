package yarnwrap.client.render.chunk;
public class ChunkRendererRegionBuilder { public net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained; public ChunkRendererRegionBuilder(net.minecraft.client.render.chunk.ChunkRendererRegionBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunks() { return wrapperContained.chunks; }
public yarnwrap.client.render.chunk.ChunkRendererRegion build(yarnwrap.world.World world,yarnwrap.util.math.ChunkSectionPos sectionPos) { return new yarnwrap.client.render.chunk.ChunkRendererRegion(wrapperContained.build(world.wrapperContained,sectionPos.wrapperContained)); }
// public Object computeClientChunk(yarnwrap.world.World world,int chunkX,int chunkZ) { return wrapperContained.computeClientChunk(world.wrapperContained,chunkX,chunkZ); }

}