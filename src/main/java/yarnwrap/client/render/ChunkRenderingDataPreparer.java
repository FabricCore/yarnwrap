package yarnwrap.client.render;
public class ChunkRenderingDataPreparer { public net.minecraft.client.render.ChunkRenderingDataPreparer wrapperContained; public ChunkRenderingDataPreparer(net.minecraft.client.render.ChunkRenderingDataPreparer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.ChunkRenderingDataPreparer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.LOGGER = value; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.client.render.ChunkRenderingDataPreparer.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.DIRECTIONS = value; }

// public int DEFAULT_SECTION_DISTANCE() { return wrapperContained.DEFAULT_SECTION_DISTANCE; }
// public void DEFAULT_SECTION_DISTANCE(int value) { wrapperContained.DEFAULT_SECTION_DISTANCE = value; }
// public static int DEFAULT_SECTION_DISTANCE() { return net.minecraft.client.render.ChunkRenderingDataPreparer.DEFAULT_SECTION_DISTANCE; }
// public static void DEFAULT_SECTION_DISTANCE(int value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.DEFAULT_SECTION_DISTANCE = value; }

// public double CHUNK_INNER_DIAGONAL_LENGTH() { return wrapperContained.CHUNK_INNER_DIAGONAL_LENGTH; }
// public void CHUNK_INNER_DIAGONAL_LENGTH(double value) { wrapperContained.CHUNK_INNER_DIAGONAL_LENGTH = value; }
// public static double CHUNK_INNER_DIAGONAL_LENGTH() { return net.minecraft.client.render.ChunkRenderingDataPreparer.CHUNK_INNER_DIAGONAL_LENGTH; }
// public static void CHUNK_INNER_DIAGONAL_LENGTH(double value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.CHUNK_INNER_DIAGONAL_LENGTH = value; }

// public boolean terrainUpdateScheduled() { return wrapperContained.terrainUpdateScheduled; }
// public void terrainUpdateScheduled(boolean value) { wrapperContained.terrainUpdateScheduled = value; }
// public static boolean terrainUpdateScheduled() { return net.minecraft.client.render.ChunkRenderingDataPreparer.terrainUpdateScheduled; }
// public static void terrainUpdateScheduled(boolean value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.terrainUpdateScheduled = value; }

// public java.util.concurrent.Future terrainUpdateFuture() { return wrapperContained.terrainUpdateFuture; }
// public void terrainUpdateFuture(java.util.concurrent.Future value) { wrapperContained.terrainUpdateFuture = value; }
// public static java.util.concurrent.Future terrainUpdateFuture() { return net.minecraft.client.render.ChunkRenderingDataPreparer.terrainUpdateFuture; }
// public static void terrainUpdateFuture(java.util.concurrent.Future value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.terrainUpdateFuture = value; }

// public yarnwrap.client.render.BuiltChunkStorage builtChunkStorage() { return new yarnwrap.client.render.BuiltChunkStorage(wrapperContained.builtChunkStorage); }
// public void builtChunkStorage(yarnwrap.client.render.BuiltChunkStorage value) { wrapperContained.builtChunkStorage = value.wrapperContained; }
// public static yarnwrap.client.render.BuiltChunkStorage builtChunkStorage() { return new yarnwrap.client.render.BuiltChunkStorage(net.minecraft.client.render.ChunkRenderingDataPreparer.builtChunkStorage); }
// public static void builtChunkStorage(yarnwrap.client.render.BuiltChunkStorage value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.builtChunkStorage = value.wrapperContained; }

// public java.util.concurrent.atomic.AtomicReference state() { return wrapperContained.state; }
// public void state(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.state = value; }
// public static java.util.concurrent.atomic.AtomicReference state() { return net.minecraft.client.render.ChunkRenderingDataPreparer.state; }
// public static void state(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.state = value; }

// public java.util.concurrent.atomic.AtomicReference events() { return wrapperContained.events; }
// public void events(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.events = value; }
// public static java.util.concurrent.atomic.AtomicReference events() { return net.minecraft.client.render.ChunkRenderingDataPreparer.events; }
// public static void events(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.events = value; }

// public java.util.concurrent.atomic.AtomicBoolean needsUpdate() { return wrapperContained.needsUpdate; }
// public void needsUpdate(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.needsUpdate = value; }
// public static java.util.concurrent.atomic.AtomicBoolean needsUpdate() { return net.minecraft.client.render.ChunkRenderingDataPreparer.needsUpdate; }
// public static void needsUpdate(java.util.concurrent.atomic.AtomicBoolean value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.needsUpdate = value; }

// public int SECTION_DISTANCE() { return wrapperContained.SECTION_DISTANCE; }
// public void SECTION_DISTANCE(int value) { wrapperContained.SECTION_DISTANCE = value; }
// public static int SECTION_DISTANCE() { return net.minecraft.client.render.ChunkRenderingDataPreparer.SECTION_DISTANCE; }
// public static void SECTION_DISTANCE(int value, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.SECTION_DISTANCE = value; }

public void scheduleTerrainUpdate() { wrapperContained.scheduleTerrainUpdate(); }
// public static void scheduleTerrainUpdate() { net.minecraft.client.render.ChunkRenderingDataPreparer.scheduleTerrainUpdate(); }
public void addNeighbors(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.addNeighbors(chunkPos.wrapperContained); }
// public static void addNeighbors(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.addNeighbors(chunkPos.wrapperContained); }
// public void scheduleLater(yarnwrap.client.render.Camera camera) { wrapperContained.scheduleLater(camera.wrapperContained); }
// public static void scheduleLater(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.scheduleLater(camera.wrapperContained); }
// public void addNeighbors(Object events,yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.addNeighbors(events,chunkPos.wrapperContained); }
// public static void addNeighbors(Object events,yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.addNeighbors(events,chunkPos.wrapperContained); }
// public void scheduleNew() { wrapperContained.scheduleNew(); }
// public static void scheduleNew() { net.minecraft.client.render.ChunkRenderingDataPreparer.scheduleNew(); }
// public void method_52824(Object info) { wrapperContained.method_52824(info); }
// public static void method_52824(Object info, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.method_52824(info); }
// public void update(Object pos,yarnwrap.util.math.Vec3d cullChunks) { wrapperContained.update(pos,cullChunks.wrapperContained); }
// public static void update(Object pos,yarnwrap.util.math.Vec3d cullChunks, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.update(pos,cullChunks.wrapperContained); }
public void setStorage(yarnwrap.client.render.BuiltChunkStorage storage) { wrapperContained.setStorage(storage.wrapperContained); }
// public static void setStorage(yarnwrap.client.render.BuiltChunkStorage storage, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.setStorage(storage.wrapperContained); }
// public void schedulePropagationFrom(Object builtChunk) { wrapperContained.schedulePropagationFrom(builtChunk); }
// public static void schedulePropagationFrom(Object builtChunk, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.schedulePropagationFrom(builtChunk); }
public void collectChunks(yarnwrap.client.render.Frustum frustum,java.util.List builtChunks,java.util.List nearbyChunks) { wrapperContained.collectChunks(frustum.wrapperContained,builtChunks,nearbyChunks); }
// public static void collectChunks(yarnwrap.client.render.Frustum frustum,java.util.List builtChunks,java.util.List nearbyChunks, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.collectChunks(frustum.wrapperContained,builtChunks,nearbyChunks); }
// public Object getRenderedChunk(long sectionPos,Object chunk,yarnwrap.util.math.Direction direction) { return wrapperContained.getRenderedChunk(sectionPos,chunk,direction.wrapperContained); }
// public static Object getRenderedChunk(long sectionPos,Object chunk,yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.render.ChunkRenderingDataPreparer.getRenderedChunk(sectionPos,chunk,direction.wrapperContained); }
// public boolean isWithinViewDistance(long centerSectionPos,long otherSectionPos) { return wrapperContained.isWithinViewDistance(centerSectionPos,otherSectionPos); }
// public static boolean isWithinViewDistance(long centerSectionPos,long otherSectionPos, ) { return net.minecraft.client.render.ChunkRenderingDataPreparer.isWithinViewDistance(centerSectionPos,otherSectionPos); }
// public void updateTerrain(boolean cullChunks,yarnwrap.client.render.Camera camera,yarnwrap.util.math.Vec3d cameraPos,it.unimi.dsi.fastutil.longs.LongOpenHashSet activeSections) { wrapperContained.updateTerrain(cullChunks,camera.wrapperContained,cameraPos.wrapperContained,activeSections); }
// public static void updateTerrain(boolean cullChunks,yarnwrap.client.render.Camera camera,yarnwrap.util.math.Vec3d cameraPos,it.unimi.dsi.fastutil.longs.LongOpenHashSet activeSections, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.updateTerrain(cullChunks,camera.wrapperContained,cameraPos.wrapperContained,activeSections); }
public void updateSectionOcclusionGraph(boolean cullChunks,yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,java.util.List builtChunk,it.unimi.dsi.fastutil.longs.LongOpenHashSet activeSections) { wrapperContained.updateSectionOcclusionGraph(cullChunks,camera.wrapperContained,frustum.wrapperContained,builtChunk,activeSections); }
// public static void updateSectionOcclusionGraph(boolean cullChunks,yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,java.util.List builtChunk,it.unimi.dsi.fastutil.longs.LongOpenHashSet activeSections, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.updateSectionOcclusionGraph(cullChunks,camera.wrapperContained,frustum.wrapperContained,builtChunk,activeSections); }
// public void updateNow(boolean frustum,yarnwrap.client.render.Frustum builtChunks,java.util.List cameraPos,yarnwrap.util.math.Vec3d activeSections) { wrapperContained.updateNow(frustum,builtChunks.wrapperContained,cameraPos,activeSections.wrapperContained); }
// public static void updateNow(boolean frustum,yarnwrap.client.render.Frustum builtChunks,java.util.List cameraPos,yarnwrap.util.math.Vec3d activeSections, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.updateNow(frustum,builtChunks.wrapperContained,cameraPos,activeSections.wrapperContained); }
public boolean updateFrustum() { return wrapperContained.updateFrustum(); }
// public static boolean updateFrustum() { return net.minecraft.client.render.ChunkRenderingDataPreparer.updateFrustum(); }
// public Object getInfo(Object chunk) { return wrapperContained.getInfo(chunk); }
// public static Object getInfo(Object chunk, ) { return net.minecraft.client.render.ChunkRenderingDataPreparer.getInfo(chunk); }
// public void method_62924(java.util.List node,java.util.List skipVisibilityCheck,Object depth,boolean nearCenter) { wrapperContained.method_62924(node,skipVisibilityCheck,depth,nearCenter); }
// public static void method_62924(java.util.List node,java.util.List skipVisibilityCheck,Object depth,boolean nearCenter, ) { net.minecraft.client.render.ChunkRenderingDataPreparer.method_62924(node,skipVisibilityCheck,depth,nearCenter); }
public yarnwrap.client.render.chunk.Octree getOctree() { return new yarnwrap.client.render.chunk.Octree(wrapperContained.getOctree()); }
// public static yarnwrap.client.render.chunk.Octree getOctree() { return new yarnwrap.client.render.chunk.Octree(net.minecraft.client.render.ChunkRenderingDataPreparer.getOctree()); }

}