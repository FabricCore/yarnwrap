package yarnwrap.world.chunk;
public class ChunkManager { public net.minecraft.world.chunk.ChunkManager wrapperContained; public ChunkManager(net.minecraft.world.chunk.ChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.Chunk getChunk(int x,int z,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(x,z,leastStatus.wrapperContained,create)); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
public boolean isChunkLoaded(int x,int z) { return wrapperContained.isChunkLoaded(x,z); }
public void setChunkForced(yarnwrap.util.math.ChunkPos pos,boolean forced) { wrapperContained.setChunkForced(pos.wrapperContained,forced); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ,boolean create) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(chunkX,chunkZ,create)); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking,boolean tickChunks) { wrapperContained.tick(shouldKeepTicking,tickChunks); }
public void setMobSpawnOptions(boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.setMobSpawnOptions(spawnMonsters,spawnAnimals); }
public yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.getLightingProvider()); }
public int getLoadedChunkCount() { return wrapperContained.getLoadedChunkCount(); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk(chunkX,chunkZ)); }

}