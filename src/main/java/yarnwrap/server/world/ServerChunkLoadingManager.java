package yarnwrap.server.world;
public class ServerChunkLoadingManager { public net.minecraft.server.world.ServerChunkLoadingManager wrapperContained; public ServerChunkLoadingManager(net.minecraft.server.world.ServerChunkLoadingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap currentChunkHolders() { return wrapperContained.currentChunkHolders; }
// public void currentChunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.currentChunkHolders = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.server.world.ServerLightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public yarnwrap.util.thread.ThreadExecutor mainThreadExecutor() { return new yarnwrap.util.thread.ThreadExecutor(wrapperContained.mainThreadExecutor); }
// public void mainThreadExecutor(yarnwrap.util.thread.ThreadExecutor value) { wrapperContained.mainThreadExecutor = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunkHolders() { return wrapperContained.chunkHolders; }
// public void chunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.chunkHolders = value; }
// public it.unimi.dsi.fastutil.longs.LongSet unloadedChunks() { return wrapperContained.unloadedChunks; }
// public void unloadedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.unloadedChunks = value; }
// public boolean chunkHolderListDirty() { return wrapperContained.chunkHolderListDirty; }
// public void chunkHolderListDirty(boolean value) { wrapperContained.chunkHolderListDirty = value; }
// public yarnwrap.server.world.ChunkTaskPrioritySystem chunkTaskPrioritySystem() { return new yarnwrap.server.world.ChunkTaskPrioritySystem(wrapperContained.chunkTaskPrioritySystem); }
// public void chunkTaskPrioritySystem(yarnwrap.server.world.ChunkTaskPrioritySystem value) { wrapperContained.chunkTaskPrioritySystem = value.wrapperContained; }
// public yarnwrap.util.thread.MessageListener worldGenExecutor() { return new yarnwrap.util.thread.MessageListener(wrapperContained.worldGenExecutor); }
// public void worldGenExecutor(yarnwrap.util.thread.MessageListener value) { wrapperContained.worldGenExecutor = value.wrapperContained; }
// public yarnwrap.util.thread.MessageListener mainExecutor() { return new yarnwrap.util.thread.MessageListener(wrapperContained.mainExecutor); }
// public void mainExecutor(yarnwrap.util.thread.MessageListener value) { wrapperContained.mainExecutor = value.wrapperContained; }
// public Object ticketManager() { return wrapperContained.ticketManager; }
// // public void ticketManager(Object value) { wrapperContained.ticketManager = value; }
// public java.util.concurrent.atomic.AtomicInteger totalChunksLoadedCount() { return wrapperContained.totalChunksLoadedCount; }
// public void totalChunksLoadedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.totalChunksLoadedCount = value; }
// public yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener() { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.worldGenerationProgressListener); }
// public void worldGenerationProgressListener(yarnwrap.server.WorldGenerationProgressListener value) { wrapperContained.worldGenerationProgressListener = value.wrapperContained; }
// public java.util.function.Supplier persistentStateManagerFactory() { return wrapperContained.persistentStateManagerFactory; }
// public void persistentStateManagerFactory(java.util.function.Supplier value) { wrapperContained.persistentStateManagerFactory = value; }
// public java.lang.String saveDir() { return wrapperContained.saveDir; }
// public void saveDir(java.lang.String value) { wrapperContained.saveDir = value; }
// public yarnwrap.server.world.PlayerChunkWatchingManager playerChunkWatchingManager() { return new yarnwrap.server.world.PlayerChunkWatchingManager(wrapperContained.playerChunkWatchingManager); }
// public void playerChunkWatchingManager(yarnwrap.server.world.PlayerChunkWatchingManager value) { wrapperContained.playerChunkWatchingManager = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap entityTrackers() { return wrapperContained.entityTrackers; }
// public void entityTrackers(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.entityTrackers = value; }
// public int watchDistance() { return wrapperContained.watchDistance; }
// public void watchDistance(int value) { wrapperContained.watchDistance = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunksToUnload() { return wrapperContained.chunksToUnload; }
// public void chunksToUnload(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.chunksToUnload = value; }
// public yarnwrap.world.poi.PointOfInterestStorage pointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.pointOfInterestStorage); }
// public void pointOfInterestStorage(yarnwrap.world.poi.PointOfInterestStorage value) { wrapperContained.pointOfInterestStorage = value.wrapperContained; }
// public java.util.Queue unloadTaskQueue() { return wrapperContained.unloadTaskQueue; }
// public void unloadTaskQueue(java.util.Queue value) { wrapperContained.unloadTaskQueue = value; }
// public it.unimi.dsi.fastutil.longs.Long2ByteMap chunkToType() { return wrapperContained.chunkToType; }
// public void chunkToType(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.chunkToType = value; }
// public yarnwrap.world.chunk.ChunkStatusChangeListener chunkStatusChangeListener() { return new yarnwrap.world.chunk.ChunkStatusChangeListener(wrapperContained.chunkStatusChangeListener); }
// public void chunkStatusChangeListener(yarnwrap.world.chunk.ChunkStatusChangeListener value) { wrapperContained.chunkStatusChangeListener = value.wrapperContained; }
// public byte PROTO_CHUNK() { return wrapperContained.PROTO_CHUNK; }
// public void PROTO_CHUNK(byte value) { wrapperContained.PROTO_CHUNK = value; }
// public byte UNMARKED_CHUNK() { return wrapperContained.UNMARKED_CHUNK; }
// public void UNMARKED_CHUNK(byte value) { wrapperContained.UNMARKED_CHUNK = value; }
// public byte LEVEL_CHUNK() { return wrapperContained.LEVEL_CHUNK; }
// public void LEVEL_CHUNK(byte value) { wrapperContained.LEVEL_CHUNK = value; }
public int DEFAULT_VIEW_DISTANCE() { return wrapperContained.DEFAULT_VIEW_DISTANCE; }
// public void DEFAULT_VIEW_DISTANCE(int value) { wrapperContained.DEFAULT_VIEW_DISTANCE = value; }
// public it.unimi.dsi.fastutil.longs.Long2LongMap chunkToNextSaveTimeMs() { return wrapperContained.chunkToNextSaveTimeMs; }
// public void chunkToNextSaveTimeMs(it.unimi.dsi.fastutil.longs.Long2LongMap value) { wrapperContained.chunkToNextSaveTimeMs = value; }
// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator structurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.structurePlacementCalculator); }
// public void structurePlacementCalculator(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator value) { wrapperContained.structurePlacementCalculator = value.wrapperContained; }
// public yarnwrap.world.chunk.ChunkGenerationContext generationContext() { return new yarnwrap.world.chunk.ChunkGenerationContext(wrapperContained.generationContext); }
// public void generationContext(yarnwrap.world.chunk.ChunkGenerationContext value) { wrapperContained.generationContext = value.wrapperContained; }
// public yarnwrap.server.world.OptionalChunk UNLOADED_CHUNKS() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED_CHUNKS); }
// public void UNLOADED_CHUNKS(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED_CHUNKS = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture UNLOADED_CHUNKS_FUTURE() { return wrapperContained.UNLOADED_CHUNKS_FUTURE; }
// public void UNLOADED_CHUNKS_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_CHUNKS_FUTURE = value; }
// public java.util.List loaders() { return wrapperContained.loaders; }
// public void loaders(java.util.List value) { wrapperContained.loaders = value; }
// public yarnwrap.server.world.ServerLightingProvider getLightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.getLightingProvider()); }
// public void setViewDistance(int watchDistance) { wrapperContained.setViewDistance(watchDistance); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.setLevel(pos,level,holder.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getRegion(yarnwrap.server.world.ChunkHolder centerChunk,int margin,java.util.function.IntFunction distanceToStatus) { return wrapperContained.getRegion(centerChunk.wrapperContained,margin,distanceToStatus); }
// public boolean save(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.save(chunk.wrapperContained); }
// public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
public java.util.concurrent.CompletableFuture makeChunkTickable(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkTickable(holder.wrapperContained); }
// public void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendWatchPackets(player.wrapperContained); }
// public void save(boolean flush) { wrapperContained.save(flush); }
// public boolean updateHolderMap() { return wrapperContained.updateHolderMap(); }
public java.util.concurrent.CompletableFuture makeChunkEntitiesTickable(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkEntitiesTickable(holder.wrapperContained); }
public int getTotalChunksLoadedCount() { return wrapperContained.getTotalChunksLoadedCount(); }
// public yarnwrap.server.world.ChunkHolder getCurrentChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getCurrentChunkHolder(pos)); }
public int getLoadedChunkCount() { return wrapperContained.getLoadedChunkCount(); }
public yarnwrap.server.world.ChunkTicketManager getTicketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.getTicketManager()); }
// public java.lang.Iterable entryIterator() { return wrapperContained.entryIterator(); }
// public java.util.function.IntSupplier getCompletedLevelSupplier(long pos) { return wrapperContained.getCompletedLevelSupplier(pos); }
// public void loadEntity(yarnwrap.entity.Entity entity) { wrapperContained.loadEntity(entity.wrapperContained); }
public void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public double getSquaredDistance(yarnwrap.util.math.ChunkPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.getSquaredDistance(pos.wrapperContained,entity.wrapperContained); }
public void updatePosition(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updatePosition(player.wrapperContained); }
// public void handlePlayerAddedOrRemoved(yarnwrap.server.network.ServerPlayerEntity player,boolean added) { wrapperContained.handlePlayerAddedOrRemoved(player.wrapperContained,added); }
// public void unloadEntity(yarnwrap.entity.Entity entity) { wrapperContained.unloadEntity(entity.wrapperContained); }
// public void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public boolean doesNotGenerateChunks(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.doesNotGenerateChunks(player.wrapperContained); }
// public void tickEntityMovement() { wrapperContained.tickEntityMovement(); }
// public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
// public void tryUnloadChunk(long pos,yarnwrap.server.world.ChunkHolder holder) { wrapperContained.tryUnloadChunk(pos,holder.wrapperContained); }
// public void unloadChunks(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.unloadChunks(shouldKeepTicking); }
// public java.util.concurrent.CompletableFuture loadChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.loadChunk(pos.wrapperContained); }
// public void updateWatchedSection(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updateWatchedSection(player.wrapperContained); }
// public void dump(java.io.Writer writer) { wrapperContained.dump(writer); }
// public java.lang.String getFutureStatus(java.util.concurrent.CompletableFuture future) { return wrapperContained.getFutureStatus(future); }
public java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getChunkLoadingDebugInfo(chunkPos.wrapperContained); }
// public byte mark(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkType type) { return wrapperContained.mark(pos.wrapperContained,type.wrapperContained); }
// public void markAsProtoChunk(yarnwrap.util.math.ChunkPos pos) { wrapperContained.markAsProtoChunk(pos.wrapperContained); }
// public boolean isLevelChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isLevelChunk(pos.wrapperContained); }
// public void onChunkStatusChange(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.onChunkStatusChange(chunkPos.wrapperContained,levelType.wrapperContained); }
public java.util.concurrent.CompletableFuture makeChunkAccessible(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkAccessible(holder.wrapperContained); }
public java.lang.String getSaveDir() { return wrapperContained.getSaveDir(); }
// public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
public java.util.List getPlayersWatchingChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getPlayersWatchingChunk(pos.wrapperContained); }
// public boolean canTickChunk(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { return wrapperContained.canTickChunk(player.wrapperContained,pos.wrapperContained); }
// public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
// public boolean save(yarnwrap.server.world.ChunkHolder chunkHolder) { return wrapperContained.save(chunkHolder.wrapperContained); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
public yarnwrap.util.crash.CrashException crash(java.lang.IllegalStateException exception,java.lang.String details) { return new yarnwrap.util.crash.CrashException(wrapperContained.crash(exception,details)); }
// public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
// public yarnwrap.world.chunk.Chunk recoverFromException(java.lang.Throwable throwable,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.recoverFromException(throwable,chunkPos.wrapperContained)); }
// public boolean containsStatus(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.containsStatus(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.updateChunkNbt(nbt.wrapperContained)); }
// public yarnwrap.world.chunk.Chunk getProtoChunk(yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getProtoChunk(chunkPos.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getUpdatedChunkNbt(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getUpdatedChunkNbt(chunkPos.wrapperContained); }
// public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.getStructurePlacementCalculator()); }
public void sendChunkBiomePackets(java.util.List chunks) { wrapperContained.sendChunkBiomePackets(chunks); }
// public boolean isTracked(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ) { return wrapperContained.isTracked(player.wrapperContained,chunkX,chunkZ); }
// public void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ChunkFilter chunkFilter) { wrapperContained.sendWatchPackets(player.wrapperContained,chunkFilter.wrapperContained); }
// public void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.track(player.wrapperContained,pos.wrapperContained); }
// public void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.track(player.wrapperContained,chunk.wrapperContained); }
// public int getViewDistance(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.getViewDistance(player.wrapperContained); }
// public boolean isOnTrackEdge(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ) { return wrapperContained.isOnTrackEdge(player.wrapperContained,chunkX,chunkZ); }
// public void untrack(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.untrack(player.wrapperContained,pos.wrapperContained); }
public void forceLighting(yarnwrap.util.math.ChunkPos centerPos,int radius) { wrapperContained.forceLighting(centerPos.wrapperContained,radius); }
// public void sendToPlayers(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.sendToPlayers(chunk.wrapperContained); }
public yarnwrap.world.chunk.WorldChunk getPostProcessedChunk(long pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getPostProcessedChunk(pos)); }
// public void schedule(yarnwrap.world.chunk.ChunkLoader chunkLoader) { wrapperContained.schedule(chunkLoader.wrapperContained); }

}