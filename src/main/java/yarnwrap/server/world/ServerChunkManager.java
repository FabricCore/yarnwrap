package yarnwrap.server.world;
public class ServerChunkManager { public net.minecraft.server.world.ServerChunkManager wrapperContained; public ServerChunkManager(net.minecraft.server.world.ServerChunkManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.server.world.ServerLightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public static yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(net.minecraft.server.world.ServerChunkManager.lightingProvider); }
// public static void lightingProvider(yarnwrap.server.world.ServerLightingProvider value, ) { net.minecraft.server.world.ServerChunkManager.lightingProvider = value.wrapperContained; }

// public long lastTickTime() { return wrapperContained.lastTickTime; }
// public void lastTickTime(long value) { wrapperContained.lastTickTime = value; }
// public static long lastTickTime() { return net.minecraft.server.world.ServerChunkManager.lastTickTime; }
// public static void lastTickTime(long value, ) { net.minecraft.server.world.ServerChunkManager.lastTickTime = value; }

// public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public void spawnMonsters(boolean value) { wrapperContained.spawnMonsters = value; }
// public static boolean spawnMonsters() { return net.minecraft.server.world.ServerChunkManager.spawnMonsters; }
// public static void spawnMonsters(boolean value, ) { net.minecraft.server.world.ServerChunkManager.spawnMonsters = value; }

// public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
// public void spawnAnimals(boolean value) { wrapperContained.spawnAnimals = value; }
// public static boolean spawnAnimals() { return net.minecraft.server.world.ServerChunkManager.spawnAnimals; }
// public static void spawnAnimals(boolean value, ) { net.minecraft.server.world.ServerChunkManager.spawnAnimals = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.world.ServerChunkManager.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.server.world.ServerChunkManager.world = value.wrapperContained; }

// public yarnwrap.server.world.ChunkLevelManager levelManager() { return new yarnwrap.server.world.ChunkLevelManager(wrapperContained.levelManager); }
// public void levelManager(yarnwrap.server.world.ChunkLevelManager value) { wrapperContained.levelManager = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkLevelManager levelManager() { return new yarnwrap.server.world.ChunkLevelManager(net.minecraft.server.world.ServerChunkManager.levelManager); }
// public static void levelManager(yarnwrap.server.world.ChunkLevelManager value, ) { net.minecraft.server.world.ServerChunkManager.levelManager = value.wrapperContained; }

// public java.lang.Thread serverThread() { return wrapperContained.serverThread; }
// public void serverThread(java.lang.Thread value) { wrapperContained.serverThread = value; }
// public static java.lang.Thread serverThread() { return net.minecraft.server.world.ServerChunkManager.serverThread; }
// public static void serverThread(java.lang.Thread value, ) { net.minecraft.server.world.ServerChunkManager.serverThread = value; }

public yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(wrapperContained.chunkLoadingManager); }
// public void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value) { wrapperContained.chunkLoadingManager = value.wrapperContained; }
// public static yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager() { return new yarnwrap.server.world.ServerChunkLoadingManager(net.minecraft.server.world.ServerChunkManager.chunkLoadingManager); }
// public static void chunkLoadingManager(yarnwrap.server.world.ServerChunkLoadingManager value, ) { net.minecraft.server.world.ServerChunkManager.chunkLoadingManager = value.wrapperContained; }

// public yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.persistentStateManager); }
// public void persistentStateManager(yarnwrap.world.PersistentStateManager value) { wrapperContained.persistentStateManager = value.wrapperContained; }
// public static yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(net.minecraft.server.world.ServerChunkManager.persistentStateManager); }
// public static void persistentStateManager(yarnwrap.world.PersistentStateManager value, ) { net.minecraft.server.world.ServerChunkManager.persistentStateManager = value.wrapperContained; }

// public Object mainThreadExecutor() { return wrapperContained.mainThreadExecutor; }
// // public void mainThreadExecutor(Object value) { wrapperContained.mainThreadExecutor = value; }
// // public static Object mainThreadExecutor() { return net.minecraft.server.world.ServerChunkManager.mainThreadExecutor; }
// // public static void mainThreadExecutor(Object value, ) { net.minecraft.server.world.ServerChunkManager.mainThreadExecutor = value; }

// public long[] chunkPosCache() { return wrapperContained.chunkPosCache; }
// public void chunkPosCache(long[] value) { wrapperContained.chunkPosCache = value; }
// public static long[] chunkPosCache() { return net.minecraft.server.world.ServerChunkManager.chunkPosCache; }
// public static void chunkPosCache(long[] value, ) { net.minecraft.server.world.ServerChunkManager.chunkPosCache = value; }

// public net.minecraft.world.chunk.ChunkStatus[] chunkStatusCache() { return wrapperContained.chunkStatusCache; }
// public void chunkStatusCache(net.minecraft.world.chunk.ChunkStatus[] value) { wrapperContained.chunkStatusCache = value; }
// public static net.minecraft.world.chunk.ChunkStatus[] chunkStatusCache() { return net.minecraft.server.world.ServerChunkManager.chunkStatusCache; }
// public static void chunkStatusCache(net.minecraft.world.chunk.ChunkStatus[] value, ) { net.minecraft.server.world.ServerChunkManager.chunkStatusCache = value; }

// public net.minecraft.world.chunk.Chunk[] chunkCache() { return wrapperContained.chunkCache; }
// public void chunkCache(net.minecraft.world.chunk.Chunk[] value) { wrapperContained.chunkCache = value; }
// public static net.minecraft.world.chunk.Chunk[] chunkCache() { return net.minecraft.server.world.ServerChunkManager.chunkCache; }
// public static void chunkCache(net.minecraft.world.chunk.Chunk[] value, ) { net.minecraft.server.world.ServerChunkManager.chunkCache = value; }

// public Object spawnInfo() { return wrapperContained.spawnInfo; }
// // public void spawnInfo(Object value) { wrapperContained.spawnInfo = value; }
// // public static Object spawnInfo() { return net.minecraft.server.world.ServerChunkManager.spawnInfo; }
// // public static void spawnInfo(Object value, ) { net.minecraft.server.world.ServerChunkManager.spawnInfo = value; }

// public int CACHE_SIZE() { return wrapperContained.CACHE_SIZE; }
// public void CACHE_SIZE(int value) { wrapperContained.CACHE_SIZE = value; }
// public static int CACHE_SIZE() { return net.minecraft.server.world.ServerChunkManager.CACHE_SIZE; }
// public static void CACHE_SIZE(int value, ) { net.minecraft.server.world.ServerChunkManager.CACHE_SIZE = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ServerChunkManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ServerChunkManager.LOGGER = value; }

// public java.util.Set chunksToBroadcastUpdate() { return wrapperContained.chunksToBroadcastUpdate; }
// public void chunksToBroadcastUpdate(java.util.Set value) { wrapperContained.chunksToBroadcastUpdate = value; }
// public static java.util.Set chunksToBroadcastUpdate() { return net.minecraft.server.world.ServerChunkManager.chunksToBroadcastUpdate; }
// public static void chunksToBroadcastUpdate(java.util.Set value, ) { net.minecraft.server.world.ServerChunkManager.chunksToBroadcastUpdate = value; }

// public yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.ticketManager); }
// public void ticketManager(yarnwrap.server.world.ChunkTicketManager value) { wrapperContained.ticketManager = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(net.minecraft.server.world.ServerChunkManager.ticketManager); }
// public static void ticketManager(yarnwrap.server.world.ChunkTicketManager value, ) { net.minecraft.server.world.ServerChunkManager.ticketManager = value.wrapperContained; }

// public java.util.List spawningChunks() { return wrapperContained.spawningChunks; }
// public void spawningChunks(java.util.List value) { wrapperContained.spawningChunks = value; }
// public static java.util.List spawningChunks() { return net.minecraft.server.world.ServerChunkManager.spawningChunks; }
// public static void spawningChunks(java.util.List value, ) { net.minecraft.server.world.ServerChunkManager.spawningChunks = value; }

// public ServerChunkManager(yarnwrap.server.world.ServerWorld world,Object session,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.structure.StructureTemplateManager structureTemplateManager,java.util.concurrent.Executor workerExecutor,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,int viewDistance,int simulationDistance,boolean dsync,yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener,yarnwrap.world.chunk.ChunkStatusChangeListener chunkStatusChangeListener,java.util.function.Supplier persistentStateManagerFactory) { this.wrapperContained = new net.minecraft.server.world.ServerChunkManager(world.wrapperContained,session,dataFixer,structureTemplateManager.wrapperContained,workerExecutor,chunkGenerator.wrapperContained,viewDistance,simulationDistance,dsync,worldGenerationProgressListener.wrapperContained,chunkStatusChangeListener.wrapperContained,persistentStateManagerFactory); }
public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
// public static yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.server.world.ServerChunkManager.getChunkGenerator()); }
public void updatePosition(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updatePosition(player.wrapperContained); }
// public static void updatePosition(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerChunkManager.updatePosition(player.wrapperContained); }
public void markForUpdate(yarnwrap.util.math.BlockPos pos) { wrapperContained.markForUpdate(pos.wrapperContained); }
// public static void markForUpdate(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.world.ServerChunkManager.markForUpdate(pos.wrapperContained); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public static yarnwrap.server.world.ChunkHolder getChunkHolder(long pos, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ServerChunkManager.getChunkHolder(pos)); }
// public java.util.concurrent.CompletableFuture getChunkFuture(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return wrapperContained.getChunkFuture(chunkX,chunkZ,leastStatus.wrapperContained,create); }
// public static java.util.concurrent.CompletableFuture getChunkFuture(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create, ) { return net.minecraft.server.world.ServerChunkManager.getChunkFuture(chunkX,chunkZ,leastStatus.wrapperContained,create); }
public void applyViewDistance(int watchDistance) { wrapperContained.applyViewDistance(watchDistance); }
// public static void applyViewDistance(int watchDistance, ) { net.minecraft.server.world.ServerChunkManager.applyViewDistance(watchDistance); }
// public java.util.concurrent.CompletionStage method_14159(java.util.concurrent.CompletableFuture future) { return wrapperContained.method_14159(future); }
// public static java.util.concurrent.CompletionStage method_14159(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.server.world.ServerChunkManager.method_14159(future); }
// public void tickChunks() { wrapperContained.tickChunks(); }
// public static void tickChunks() { net.minecraft.server.world.ServerChunkManager.tickChunks(); }
// public boolean updateChunks() { return wrapperContained.updateChunks(); }
// public static boolean updateChunks() { return net.minecraft.server.world.ServerChunkManager.updateChunks(); }
public void save(boolean flush) { wrapperContained.save(flush); }
// public static void save(boolean flush, ) { net.minecraft.server.world.ServerChunkManager.save(flush); }
public java.util.concurrent.CompletableFuture getChunkFutureSyncOnMainThread(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return wrapperContained.getChunkFutureSyncOnMainThread(chunkX,chunkZ,leastStatus.wrapperContained,create); }
// public static java.util.concurrent.CompletableFuture getChunkFutureSyncOnMainThread(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create, ) { return net.minecraft.server.world.ServerChunkManager.getChunkFutureSyncOnMainThread(chunkX,chunkZ,leastStatus.wrapperContained,create); }
public int getTotalChunksLoadedCount() { return wrapperContained.getTotalChunksLoadedCount(); }
// public static int getTotalChunksLoadedCount() { return net.minecraft.server.world.ServerChunkManager.getTotalChunksLoadedCount(); }
public yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.getPersistentStateManager()); }
// public static yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(net.minecraft.server.world.ServerChunkManager.getPersistentStateManager()); }
public void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public static void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.world.ServerChunkManager.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public boolean isMissingForLevel(yarnwrap.server.world.ChunkHolder holder,int maxLevel) { return wrapperContained.isMissingForLevel(holder.wrapperContained,maxLevel); }
// public static boolean isMissingForLevel(yarnwrap.server.world.ChunkHolder holder,int maxLevel, ) { return net.minecraft.server.world.ServerChunkManager.isMissingForLevel(holder.wrapperContained,maxLevel); }
public void unloadEntity(yarnwrap.entity.Entity entity) { wrapperContained.unloadEntity(entity.wrapperContained); }
// public static void unloadEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerChunkManager.unloadEntity(entity.wrapperContained); }
public void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public static void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.world.ServerChunkManager.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
public void loadEntity(yarnwrap.entity.Entity entity) { wrapperContained.loadEntity(entity.wrapperContained); }
// public static void loadEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerChunkManager.loadEntity(entity.wrapperContained); }
public boolean executeQueuedTasks() { return wrapperContained.executeQueuedTasks(); }
// public static boolean executeQueuedTasks() { return net.minecraft.server.world.ServerChunkManager.executeQueuedTasks(); }
public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
// public static yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(net.minecraft.server.world.ServerChunkManager.getPointOfInterestStorage()); }
// public void initChunkCaches() { wrapperContained.initChunkCaches(); }
// public static void initChunkCaches() { net.minecraft.server.world.ServerChunkManager.initChunkCaches(); }
public int getPendingTasks() { return wrapperContained.getPendingTasks(); }
// public static int getPendingTasks() { return net.minecraft.server.world.ServerChunkManager.getPendingTasks(); }
// public void putInCache(long pos,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.chunk.ChunkStatus status) { wrapperContained.putInCache(pos,chunk.wrapperContained,status.wrapperContained); }
// public static void putInCache(long pos,yarnwrap.world.chunk.Chunk chunk,yarnwrap.world.chunk.ChunkStatus status, ) { net.minecraft.server.world.ServerChunkManager.putInCache(pos,chunk.wrapperContained,status.wrapperContained); }
public java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChunkLoadingDebugInfo(pos.wrapperContained); }
// public static java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkManager.getChunkLoadingDebugInfo(pos.wrapperContained); }
// public void ifChunkLoaded(long pos,java.util.function.Consumer chunkConsumer) { wrapperContained.ifChunkLoaded(pos,chunkConsumer); }
// public static void ifChunkLoaded(long pos,java.util.function.Consumer chunkConsumer, ) { net.minecraft.server.world.ServerChunkManager.ifChunkLoaded(pos,chunkConsumer); }
public Object getSpawnInfo() { return wrapperContained.getSpawnInfo(); }
// public static Object getSpawnInfo() { return net.minecraft.server.world.ServerChunkManager.getSpawnInfo(); }
public boolean isTickingFutureReady(long pos) { return wrapperContained.isTickingFutureReady(pos); }
// public static boolean isTickingFutureReady(long pos, ) { return net.minecraft.server.world.ServerChunkManager.isTickingFutureReady(pos); }
public void applySimulationDistance(int simulationDistance) { wrapperContained.applySimulationDistance(simulationDistance); }
// public static void applySimulationDistance(int simulationDistance, ) { net.minecraft.server.world.ServerChunkManager.applySimulationDistance(simulationDistance); }
public yarnwrap.world.storage.NbtScannable getChunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.getChunkIoWorker()); }
// public static yarnwrap.world.storage.NbtScannable getChunkIoWorker() { return new yarnwrap.world.storage.NbtScannable(net.minecraft.server.world.ServerChunkManager.getChunkIoWorker()); }
public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
// public static yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.server.world.ServerChunkManager.getNoiseConfig()); }
public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.getStructurePlacementCalculator()); }
// public static yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(net.minecraft.server.world.ServerChunkManager.getStructurePlacementCalculator()); }
// public void broadcastUpdates(yarnwrap.util.profiler.Profiler profiler) { wrapperContained.broadcastUpdates(profiler.wrapperContained); }
// public static void broadcastUpdates(yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.server.world.ServerChunkManager.broadcastUpdates(profiler.wrapperContained); }
// public void tickChunks(yarnwrap.util.profiler.Profiler profiler,long timeDelta) { wrapperContained.tickChunks(profiler.wrapperContained,timeDelta); }
// public static void tickChunks(yarnwrap.util.profiler.Profiler profiler,long timeDelta, ) { net.minecraft.server.world.ServerChunkManager.tickChunks(profiler.wrapperContained,timeDelta); }
public void markForUpdate(yarnwrap.server.world.ChunkHolder chunkHolder) { wrapperContained.markForUpdate(chunkHolder.wrapperContained); }
// public static void markForUpdate(yarnwrap.server.world.ChunkHolder chunkHolder, ) { net.minecraft.server.world.ServerChunkManager.markForUpdate(chunkHolder.wrapperContained); }
public void addTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addTicket(ticket.wrapperContained,pos.wrapperContained); }
// public static void addTicket(yarnwrap.server.world.ChunkTicket ticket,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkManager.addTicket(ticket.wrapperContained,pos.wrapperContained); }
public void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius) { wrapperContained.addTicket(type.wrapperContained,pos.wrapperContained,radius); }
// public static void addTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius, ) { net.minecraft.server.world.ServerChunkManager.addTicket(type.wrapperContained,pos.wrapperContained,radius); }
public void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius) { wrapperContained.removeTicket(type.wrapperContained,pos.wrapperContained,radius); }
// public static void removeTicket(yarnwrap.server.world.ChunkTicketType type,yarnwrap.util.math.ChunkPos pos,int radius, ) { net.minecraft.server.world.ServerChunkManager.removeTicket(type.wrapperContained,pos.wrapperContained,radius); }
public void shutdown() { wrapperContained.shutdown(); }
// public static void shutdown() { net.minecraft.server.world.ServerChunkManager.shutdown(); }
// public void method_67501(int chunk) { wrapperContained.method_67501(chunk); }
// public static void method_67501(int chunk, ) { net.minecraft.server.world.ServerChunkManager.method_67501(chunk); }
// public void tickSpawningChunk(yarnwrap.world.chunk.WorldChunk chunk,long timeDelta,java.util.List spawnableGroups,Object info) { wrapperContained.tickSpawningChunk(chunk.wrapperContained,timeDelta,spawnableGroups,info); }
// public static void tickSpawningChunk(yarnwrap.world.chunk.WorldChunk chunk,long timeDelta,java.util.List spawnableGroups,Object info, ) { net.minecraft.server.world.ServerChunkManager.tickSpawningChunk(chunk.wrapperContained,timeDelta,spawnableGroups,info); }

}