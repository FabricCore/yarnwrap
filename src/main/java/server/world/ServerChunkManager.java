package yarnwrap.server.world;
public class ServerChunkManager { public net.minecraft.server.world.ServerChunkManager wrapperContained; public ServerChunkManager(net.minecraft.server.world.ServerChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider); }
// public long lastMobSpawningTime() { return wrapperContained.lastMobSpawningTime; }
// public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public java.util.List CHUNK_STATUSES() { return wrapperContained.CHUNK_STATUSES; }
// public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.ticketManager); }
// public java.lang.Thread serverThread() { return wrapperContained.serverThread; }
public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.persistentStateManager); }
// public Object mainThreadExecutor() { return wrapperContained.mainThreadExecutor; }
// public long[] chunkPosCache() { return wrapperContained.chunkPosCache; }
// public net.minecraft.world.chunk.ChunkStatus[] chunkStatusCache() { return wrapperContained.chunkStatusCache; }
// public net.minecraft.world.chunk.Chunk[] chunkCache() { return wrapperContained.chunkCache; }
// public Object spawnInfo() { return wrapperContained.spawnInfo; }
// public int CACHE_SIZE() { return wrapperContained.CACHE_SIZE; }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
public void updatePosition(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updatePosition(player.wrapperContained); }
public void markForUpdate(yarnwrap.util.math.BlockPos pos) { wrapperContained.markForUpdate(pos.wrapperContained); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public java.util.concurrent.CompletableFuture getChunkFuture(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return wrapperContained.getChunkFuture(chunkX,chunkZ,leastStatus.wrapperContained,create); }
public void applyViewDistance(int watchDistance) { wrapperContained.applyViewDistance(watchDistance); }
// public void tickChunks() { wrapperContained.tickChunks(); }
// public boolean updateChunks() { return wrapperContained.updateChunks(); }
public void addTicket(yarnwrap.server.world.ChunkTicketType ticketType,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.addTicket(ticketType.wrapperContained,pos.wrapperContained,radius,argument); }
public void save(boolean flush) { wrapperContained.save(flush); }
public java.util.concurrent.CompletableFuture getChunkFutureSyncOnMainThread(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return wrapperContained.getChunkFutureSyncOnMainThread(chunkX,chunkZ,leastStatus.wrapperContained,create); }
public void removeTicket(yarnwrap.server.world.ChunkTicketType ticketType,yarnwrap.util.math.ChunkPos pos,int radius,java.lang.Object argument) { wrapperContained.removeTicket(ticketType.wrapperContained,pos.wrapperContained,radius,argument); }
public int getTotalChunksLoadedCount() { return wrapperContained.getTotalChunksLoadedCount(); }
public yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.getPersistentStateManager()); }
public void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public boolean isMissingForLevel(yarnwrap.server.world.ChunkHolder holder,int maxLevel) { return wrapperContained.isMissingForLevel(holder.wrapperContained,maxLevel); }
public void unloadEntity(yarnwrap.entity.Entity entity) { wrapperContained.unloadEntity(entity.wrapperContained); }
public void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
public void loadEntity(yarnwrap.entity.Entity entity) { wrapperContained.loadEntity(entity.wrapperContained); }
public boolean executeQueuedTasks() { return wrapperContained.executeQueuedTasks(); }
public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
// public void initChunkCaches() { wrapperContained.initChunkCaches(); }
public int getPendingTasks() { return wrapperContained.getPendingTasks(); }
// public void putInCache(long pos,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.putInCache(pos,chunk.wrapperContained,status.wrapperContained); }
public java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkLoadingDebugInfo(pos.wrapperContained); }
// public void ifChunkLoaded(long pos,java.util.function.Consumer chunkConsumer) { wrapperContained.ifChunkLoaded(pos,chunkConsumer); }
public Object getSpawnInfo() { return wrapperContained.getSpawnInfo(); }
public boolean isTickingFutureReady(long pos) { return wrapperContained.isTickingFutureReady(pos); }
public void applySimulationDistance(int simulationDistance) { wrapperContained.applySimulationDistance(simulationDistance); }
public yarnwrap.world.storage.NbtScannable getChunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.getChunkIoWorker()); }
public void removePersistentTickets() { wrapperContained.removePersistentTickets(); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.getStructurePlacementCalculator()); }

}