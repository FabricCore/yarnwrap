package yarnwrap.client.render.chunk;
public class ChunkRendererRegion { public net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained; public ChunkRendererRegion(net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// // public net.minecraft.client.render.chunk.RenderedChunk[] chunks() { return wrapperContained.chunks; }
// // public void chunks(net.minecraft.client.render.chunk.RenderedChunk[] value) { wrapperContained.chunks = value; }
// // public static net.minecraft.client.render.chunk.RenderedChunk[] chunks() { return net.minecraft.client.render.chunk.ChunkRendererRegion.chunks; }
// // public static void chunks(net.minecraft.client.render.chunk.RenderedChunk[] value, ) { net.minecraft.client.render.chunk.ChunkRendererRegion.chunks = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.render.chunk.ChunkRendererRegion.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.render.chunk.ChunkRendererRegion.world = value.wrapperContained; }

// public int chunkXOffset() { return wrapperContained.chunkXOffset; }
// public void chunkXOffset(int value) { wrapperContained.chunkXOffset = value; }
// public static int chunkXOffset() { return net.minecraft.client.render.chunk.ChunkRendererRegion.chunkXOffset; }
// public static void chunkXOffset(int value, ) { net.minecraft.client.render.chunk.ChunkRendererRegion.chunkXOffset = value; }

// public int chunkZOffset() { return wrapperContained.chunkZOffset; }
// public void chunkZOffset(int value) { wrapperContained.chunkZOffset = value; }
// public static int chunkZOffset() { return net.minecraft.client.render.chunk.ChunkRendererRegion.chunkZOffset; }
// public static void chunkZOffset(int value, ) { net.minecraft.client.render.chunk.ChunkRendererRegion.chunkZOffset = value; }

// public ChunkRendererRegion(yarnwrap.world.World world,int chunkX,int chunkZ,net.minecraft.client.render.chunk.RenderedChunk[] chunks) { this.wrapperContained = new net.minecraft.client.render.chunk.ChunkRendererRegion(world.wrapperContained,chunkX,chunkZ,chunks); }
// public yarnwrap.client.render.chunk.RenderedChunk getRenderedChunk(int x,int z) { return new yarnwrap.client.render.chunk.RenderedChunk(wrapperContained.getRenderedChunk(x,z)); }
// public static yarnwrap.client.render.chunk.RenderedChunk getRenderedChunk(int x,int z, ) { return new yarnwrap.client.render.chunk.RenderedChunk(net.minecraft.client.render.chunk.ChunkRendererRegion.getRenderedChunk(x,z)); }
// public int getIndex(int xOffset,int zOffset,int x,int z) { return wrapperContained.getIndex(xOffset,zOffset,x,z); }
// public static int getIndex(int xOffset,int zOffset,int x,int z, ) { return net.minecraft.client.render.chunk.ChunkRendererRegion.getIndex(xOffset,zOffset,x,z); }

}