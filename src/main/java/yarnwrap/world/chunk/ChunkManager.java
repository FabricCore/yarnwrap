package yarnwrap.world.chunk;
public class ChunkManager { public net.minecraft.world.chunk.ChunkManager wrapperContained; public ChunkManager(net.minecraft.world.chunk.ChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.Chunk getChunk(int x,int z,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(x,z,leastStatus.wrapperContained,create)); }
// public static yarnwrap.world.chunk.Chunk getChunk(int x,int z,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.chunk.ChunkManager.getChunk(x,z,leastStatus.wrapperContained,create)); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.world.chunk.ChunkManager.getDebugString(); }
public boolean isChunkLoaded(int x,int z) { return wrapperContained.isChunkLoaded(x,z); }
// public static boolean isChunkLoaded(int x,int z, ) { return net.minecraft.world.chunk.ChunkManager.isChunkLoaded(x,z); }
public void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced) { wrapperContained.setChunkForced(pos.wrapperContained,forced); }
// public static void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced, ) { net.minecraft.world.chunk.ChunkManager.setChunkForced(pos.wrapperContained,forced); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ,boolean create) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(chunkX,chunkZ,create)); }
// public static yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ,boolean create, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.world.chunk.ChunkManager.getWorldChunk(chunkX,chunkZ,create)); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking,boolean tickChunks) { wrapperContained.tick(shouldKeepTicking,tickChunks); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking,boolean tickChunks, ) { net.minecraft.world.chunk.ChunkManager.tick(shouldKeepTicking,tickChunks); }
public void setMobSpawnOptions(boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.setMobSpawnOptions(spawnMonsters,spawnAnimals); }
// public static void setMobSpawnOptions(boolean spawnMonsters,boolean spawnAnimals, ) { net.minecraft.world.chunk.ChunkManager.setMobSpawnOptions(spawnMonsters,spawnAnimals); }
public yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.getLightingProvider()); }
// public static yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.world.chunk.ChunkManager.getLightingProvider()); }
public int getLoadedChunkCount() { return wrapperContained.getLoadedChunkCount(); }
// public static int getLoadedChunkCount() { return net.minecraft.world.chunk.ChunkManager.getLoadedChunkCount(); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(chunkX,chunkZ)); }
// public static yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.world.chunk.ChunkManager.getWorldChunk(chunkX,chunkZ)); }

}