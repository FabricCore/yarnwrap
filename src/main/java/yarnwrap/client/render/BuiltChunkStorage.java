package yarnwrap.client.render;
public class BuiltChunkStorage { public net.minecraft.client.render.BuiltChunkStorage wrapperContained; public BuiltChunkStorage(net.minecraft.client.render.BuiltChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.render.BuiltChunkStorage.worldRenderer); }
// public static void worldRenderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.render.BuiltChunkStorage.worldRenderer = value.wrapperContained; }

// public int sizeZ() { return wrapperContained.sizeZ; }
// public void sizeZ(int value) { wrapperContained.sizeZ = value; }
// public static int sizeZ() { return net.minecraft.client.render.BuiltChunkStorage.sizeZ; }
// public static void sizeZ(int value, ) { net.minecraft.client.render.BuiltChunkStorage.sizeZ = value; }

// public int sizeX() { return wrapperContained.sizeX; }
// public void sizeX(int value) { wrapperContained.sizeX = value; }
// public static int sizeX() { return net.minecraft.client.render.BuiltChunkStorage.sizeX; }
// public static void sizeX(int value, ) { net.minecraft.client.render.BuiltChunkStorage.sizeX = value; }

// public int sizeY() { return wrapperContained.sizeY; }
// public void sizeY(int value) { wrapperContained.sizeY = value; }
// public static int sizeY() { return net.minecraft.client.render.BuiltChunkStorage.sizeY; }
// public static void sizeY(int value, ) { net.minecraft.client.render.BuiltChunkStorage.sizeY = value; }

public Object chunks() { return wrapperContained.chunks; }
// public void chunks(Object value) { wrapperContained.chunks = value; }
// // public static Object chunks() { return net.minecraft.client.render.BuiltChunkStorage.chunks; }
// // public static void chunks(Object value, ) { net.minecraft.client.render.BuiltChunkStorage.chunks = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.client.render.BuiltChunkStorage.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.client.render.BuiltChunkStorage.world = value.wrapperContained; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.client.render.BuiltChunkStorage.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.client.render.BuiltChunkStorage.viewDistance = value; }

public BuiltChunkStorage(yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder,yarnwrap.world.World world,int viewDistance,yarnwrap.client.render.WorldRenderer worldRenderer) { this.wrapperContained = new net.minecraft.client.render.BuiltChunkStorage(chunkBuilder.wrapperContained,world.wrapperContained,viewDistance,worldRenderer.wrapperContained); }
public void scheduleRebuild(int x,int y,int z,boolean important) { wrapperContained.scheduleRebuild(x,y,z,important); }
// public static void scheduleRebuild(int x,int y,int z,boolean important, ) { net.minecraft.client.render.BuiltChunkStorage.scheduleRebuild(x,y,z,important); }
// public Object getRenderedChunk(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRenderedChunk(pos.wrapperContained); }
// public static Object getRenderedChunk(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.BuiltChunkStorage.getRenderedChunk(pos.wrapperContained); }
// public void createChunks(yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder) { wrapperContained.createChunks(chunkBuilder.wrapperContained); }
// public static void createChunks(yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder, ) { net.minecraft.client.render.BuiltChunkStorage.createChunks(chunkBuilder.wrapperContained); }
// public void setViewDistance(int viewDistance) { wrapperContained.setViewDistance(viewDistance); }
// public static void setViewDistance(int viewDistance, ) { net.minecraft.client.render.BuiltChunkStorage.setViewDistance(viewDistance); }
// public int getChunkIndex(int x,int y,int z) { return wrapperContained.getChunkIndex(x,y,z); }
// public static int getChunkIndex(int x,int y,int z, ) { return net.minecraft.client.render.BuiltChunkStorage.getChunkIndex(x,y,z); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.BuiltChunkStorage.clear(); }
public void updateCameraPosition(double x,double z) { wrapperContained.updateCameraPosition(x,z); }
// public static void updateCameraPosition(double x,double z, ) { net.minecraft.client.render.BuiltChunkStorage.updateCameraPosition(x,z); }
public int getViewDistance() { return wrapperContained.getViewDistance(); }
// public static int getViewDistance() { return net.minecraft.client.render.BuiltChunkStorage.getViewDistance(); }
public yarnwrap.world.HeightLimitView getWorld() { return new yarnwrap.world.HeightLimitView(wrapperContained.getWorld()); }
// public static yarnwrap.world.HeightLimitView getWorld() { return new yarnwrap.world.HeightLimitView(net.minecraft.client.render.BuiltChunkStorage.getWorld()); }

}