package yarnwrap.client.render.chunk;
public class ChunkRendererRegion { public net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained; public ChunkRendererRegion(net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// // public net.minecraft.client.render.chunk.RenderedChunk[] chunks() { return wrapperContained.chunks; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public int chunkXOffset() { return wrapperContained.chunkXOffset; }
// public int chunkZOffset() { return wrapperContained.chunkZOffset; }
// public yarnwrap.client.render.chunk.RenderedChunk getRenderedChunk(int x,int z) { return new yarnwrap.client.render.chunk.RenderedChunk(wrapperContained.getRenderedChunk(x,z)); }
public int getIndex(int xOffset,int zOffset,int x,int z) { return wrapperContained.getIndex(xOffset,zOffset,x,z); }

}