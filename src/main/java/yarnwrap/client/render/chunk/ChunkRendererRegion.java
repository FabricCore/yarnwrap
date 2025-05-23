package yarnwrap.client.render.chunk;
public class ChunkRendererRegion { public net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained; public ChunkRendererRegion(net.minecraft.client.render.chunk.ChunkRendererRegion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.render.chunk.ChunkRendererRegion.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.render.chunk.ChunkRendererRegion.world = value.wrapperContained; }

// public ChunkRendererRegion(yarnwrap.world.World world,int chunkX,int chunkZ) { this.wrapperContained = new net.minecraft.client.render.chunk.ChunkRendererRegion(world.wrapperContained,chunkX,chunkZ); }
// public int getIndex(int xOffset,int zOffset) { return wrapperContained.getIndex(xOffset,zOffset); }
// public static int getIndex(int xOffset,int zOffset, ) { return net.minecraft.client.render.chunk.ChunkRendererRegion.getIndex(xOffset,zOffset); }

}