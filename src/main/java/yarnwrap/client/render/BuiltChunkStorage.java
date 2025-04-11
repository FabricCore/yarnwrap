package yarnwrap.client.render;
public class BuiltChunkStorage { public net.minecraft.client.render.BuiltChunkStorage wrapperContained; public BuiltChunkStorage(net.minecraft.client.render.BuiltChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public int sizeZ() { return wrapperContained.sizeZ; }
// public void sizeZ(int value) { wrapperContained.sizeZ = value; }
// public int sizeX() { return wrapperContained.sizeX; }
// public void sizeX(int value) { wrapperContained.sizeX = value; }
// public int sizeY() { return wrapperContained.sizeY; }
// public void sizeY(int value) { wrapperContained.sizeY = value; }
public Object chunks() { return wrapperContained.chunks; }
// public void chunks(Object value) { wrapperContained.chunks = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
public BuiltChunkStorage(yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder,yarnwrap.world.World world,int viewDistance,yarnwrap.client.render.WorldRenderer worldRenderer) { this.wrapperContained = new net.minecraft.client.render.BuiltChunkStorage(chunkBuilder.wrapperContained,world.wrapperContained,viewDistance,worldRenderer.wrapperContained); }
public void scheduleRebuild(int x,int y,int z,boolean important) { wrapperContained.scheduleRebuild(x,y,z,important); }
// public Object getRenderedChunk(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRenderedChunk(pos.wrapperContained); }
// public void createChunks(yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder) { wrapperContained.createChunks(chunkBuilder.wrapperContained); }
// public void setViewDistance(int viewDistance) { wrapperContained.setViewDistance(viewDistance); }
// public int getChunkIndex(int x,int y,int z) { return wrapperContained.getChunkIndex(x,y,z); }
public void clear() { wrapperContained.clear(); }
public void updateCameraPosition(double x,double z) { wrapperContained.updateCameraPosition(x,z); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
public yarnwrap.world.HeightLimitView getWorld() { return new yarnwrap.world.HeightLimitView(wrapperContained.getWorld()); }

}