package yarnwrap.world;
public class SpawnDensityCapper { public net.minecraft.world.SpawnDensityCapper wrapperContained; public SpawnDensityCapper(net.minecraft.world.SpawnDensityCapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkPosToMobSpawnablePlayers() { return wrapperContained.chunkPosToMobSpawnablePlayers; }
// public void chunkPosToMobSpawnablePlayers(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.chunkPosToMobSpawnablePlayers = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkPosToMobSpawnablePlayers() { return net.minecraft.world.SpawnDensityCapper.chunkPosToMobSpawnablePlayers; }
// public static void chunkPosToMobSpawnablePlayers(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.SpawnDensityCapper.chunkPosToMobSpawnablePlayers = value; }

// public java.util.Map playersToDensityCap() { return wrapperContained.playersToDensityCap; }
// public void playersToDensityCap(java.util.Map value) { wrapperContained.playersToDensityCap = value; }
// public static java.util.Map playersToDensityCap() { return net.minecraft.world.SpawnDensityCapper.playersToDensityCap; }
// public static void playersToDensityCap(java.util.Map value, ) { net.minecraft.world.SpawnDensityCapper.playersToDensityCap = value; }

// public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public static yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(net.minecraft.world.SpawnDensityCapper.chunkLoadingManager); }
// public static void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value, ) { net.minecraft.world.SpawnDensityCapper.chunkLoadingManager = value.wrapperContained; }

public SpawnDensityCapper(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager) { this.wrapperContained = new net.minecraft.world.SpawnDensityCapper(chunkLoadingManager.wrapperContained); }
// public Object method_38083(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_38083(player.wrapperContained); }
// public static Object method_38083(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.world.SpawnDensityCapper.method_38083(player.wrapperContained); }
public boolean canSpawn(yarnwrap.entity.SpawnGroup spawnGroup,yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.canSpawn(spawnGroup.wrapperContained,chunkPos.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.SpawnGroup spawnGroup,yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.SpawnDensityCapper.canSpawn(spawnGroup.wrapperContained,chunkPos.wrapperContained); }
// public java.util.List getMobSpawnablePlayers(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getMobSpawnablePlayers(chunkPos.wrapperContained); }
// public static java.util.List getMobSpawnablePlayers(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.SpawnDensityCapper.getMobSpawnablePlayers(chunkPos.wrapperContained); }
// public java.util.List method_38086(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.method_38086(pos.wrapperContained); }
// public static java.util.List method_38086(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.SpawnDensityCapper.method_38086(pos.wrapperContained); }
public void increaseDensity(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.entity.SpawnGroup spawnGroup) { wrapperContained.increaseDensity(chunkPos.wrapperContained,spawnGroup.wrapperContained); }
// public static void increaseDensity(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.entity.SpawnGroup spawnGroup, ) { net.minecraft.world.SpawnDensityCapper.increaseDensity(chunkPos.wrapperContained,spawnGroup.wrapperContained); }

}