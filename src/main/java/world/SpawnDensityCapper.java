package yarnwrap.world;
public class SpawnDensityCapper { public net.minecraft.world.SpawnDensityCapper wrapperContained; public SpawnDensityCapper(net.minecraft.world.SpawnDensityCapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkPosToMobSpawnablePlayers() { return wrapperContained.chunkPosToMobSpawnablePlayers; }
// public java.util.Map playersToDensityCap() { return wrapperContained.playersToDensityCap; }
// public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
public boolean canSpawn(yarnwrap.entity.SpawnGroup spawnGroup,yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.canSpawn(spawnGroup.wrapperContained,chunkPos.wrapperContained); }
// public java.util.List getMobSpawnablePlayers(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getMobSpawnablePlayers(chunkPos.wrapperContained); }
public void increaseDensity(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.entity.SpawnGroup spawnGroup) { wrapperContained.increaseDensity(chunkPos.wrapperContained,spawnGroup.wrapperContained); }

}