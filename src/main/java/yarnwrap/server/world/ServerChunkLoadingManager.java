package yarnwrap.server.world;
public class ServerChunkLoadingManager { public net.minecraft.server.world.ServerChunkLoadingManager wrapperContained; public ServerChunkLoadingManager(net.minecraft.server.world.ServerChunkLoadingManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ServerChunkLoadingManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ServerChunkLoadingManager.LOGGER = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap currentChunkHolders() { return wrapperContained.currentChunkHolders; }
// public void currentChunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.currentChunkHolders = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap currentChunkHolders() { return net.minecraft.server.world.ServerChunkLoadingManager.currentChunkHolders; }
// public static void currentChunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.currentChunkHolders = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.world.ServerChunkLoadingManager.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.server.world.ServerChunkLoadingManager.world = value.wrapperContained; }

// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.server.world.ServerLightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public static yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(net.minecraft.server.world.ServerChunkLoadingManager.lightingProvider); }
// public static void lightingProvider(yarnwrap.server.world.ServerLightingProvider value, ) { net.minecraft.server.world.ServerChunkLoadingManager.lightingProvider = value.wrapperContained; }

// public yarnwrap.util.thread.ThreadExecutor mainThreadExecutor() { return new yarnwrap.util.thread.ThreadExecutor(wrapperContained.mainThreadExecutor); }
// public void mainThreadExecutor(yarnwrap.util.thread.ThreadExecutor value) { wrapperContained.mainThreadExecutor = value.wrapperContained; }
// public static yarnwrap.util.thread.ThreadExecutor mainThreadExecutor() { return new yarnwrap.util.thread.ThreadExecutor(net.minecraft.server.world.ServerChunkLoadingManager.mainThreadExecutor); }
// public static void mainThreadExecutor(yarnwrap.util.thread.ThreadExecutor value, ) { net.minecraft.server.world.ServerChunkLoadingManager.mainThreadExecutor = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunkHolders() { return wrapperContained.chunkHolders; }
// public void chunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.chunkHolders = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunkHolders() { return net.minecraft.server.world.ServerChunkLoadingManager.chunkHolders; }
// public static void chunkHolders(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunkHolders = value; }

// public it.unimi.dsi.fastutil.longs.LongSet unloadedChunks() { return wrapperContained.unloadedChunks; }
// public void unloadedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.unloadedChunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet unloadedChunks() { return net.minecraft.server.world.ServerChunkLoadingManager.unloadedChunks; }
// public static void unloadedChunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ServerChunkLoadingManager.unloadedChunks = value; }

// public boolean chunkHolderListDirty() { return wrapperContained.chunkHolderListDirty; }
// public void chunkHolderListDirty(boolean value) { wrapperContained.chunkHolderListDirty = value; }
// public static boolean chunkHolderListDirty() { return net.minecraft.server.world.ServerChunkLoadingManager.chunkHolderListDirty; }
// public static void chunkHolderListDirty(boolean value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunkHolderListDirty = value; }

// public Object levelManager() { return wrapperContained.levelManager; }
// // public void levelManager(Object value) { wrapperContained.levelManager = value; }
// // public static Object levelManager() { return net.minecraft.server.world.ServerChunkLoadingManager.levelManager; }
// // public static void levelManager(Object value, ) { net.minecraft.server.world.ServerChunkLoadingManager.levelManager = value; }

// public java.util.concurrent.atomic.AtomicInteger totalChunksLoadedCount() { return wrapperContained.totalChunksLoadedCount; }
// public void totalChunksLoadedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.totalChunksLoadedCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger totalChunksLoadedCount() { return net.minecraft.server.world.ServerChunkLoadingManager.totalChunksLoadedCount; }
// public static void totalChunksLoadedCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.server.world.ServerChunkLoadingManager.totalChunksLoadedCount = value; }

// public yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener() { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.worldGenerationProgressListener); }
// public void worldGenerationProgressListener(yarnwrap.server.WorldGenerationProgressListener value) { wrapperContained.worldGenerationProgressListener = value.wrapperContained; }
// public static yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener() { return new yarnwrap.server.WorldGenerationProgressListener(net.minecraft.server.world.ServerChunkLoadingManager.worldGenerationProgressListener); }
// public static void worldGenerationProgressListener(yarnwrap.server.WorldGenerationProgressListener value, ) { net.minecraft.server.world.ServerChunkLoadingManager.worldGenerationProgressListener = value.wrapperContained; }

// public java.util.function.Supplier persistentStateManagerFactory() { return wrapperContained.persistentStateManagerFactory; }
// public void persistentStateManagerFactory(java.util.function.Supplier value) { wrapperContained.persistentStateManagerFactory = value; }
// public static java.util.function.Supplier persistentStateManagerFactory() { return net.minecraft.server.world.ServerChunkLoadingManager.persistentStateManagerFactory; }
// public static void persistentStateManagerFactory(java.util.function.Supplier value, ) { net.minecraft.server.world.ServerChunkLoadingManager.persistentStateManagerFactory = value; }

// public java.lang.String saveDir() { return wrapperContained.saveDir; }
// public void saveDir(java.lang.String value) { wrapperContained.saveDir = value; }
// public static java.lang.String saveDir() { return net.minecraft.server.world.ServerChunkLoadingManager.saveDir; }
// public static void saveDir(java.lang.String value, ) { net.minecraft.server.world.ServerChunkLoadingManager.saveDir = value; }

// public yarnwrap.server.world.PlayerChunkWatchingManager playerChunkWatchingManager() { return new yarnwrap.server.world.PlayerChunkWatchingManager(wrapperContained.playerChunkWatchingManager); }
// public void playerChunkWatchingManager(yarnwrap.server.world.PlayerChunkWatchingManager value) { wrapperContained.playerChunkWatchingManager = value.wrapperContained; }
// public static yarnwrap.server.world.PlayerChunkWatchingManager playerChunkWatchingManager() { return new yarnwrap.server.world.PlayerChunkWatchingManager(net.minecraft.server.world.ServerChunkLoadingManager.playerChunkWatchingManager); }
// public static void playerChunkWatchingManager(yarnwrap.server.world.PlayerChunkWatchingManager value, ) { net.minecraft.server.world.ServerChunkLoadingManager.playerChunkWatchingManager = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap entityTrackers() { return wrapperContained.entityTrackers; }
// public void entityTrackers(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.entityTrackers = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap entityTrackers() { return net.minecraft.server.world.ServerChunkLoadingManager.entityTrackers; }
// public static void entityTrackers(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.entityTrackers = value; }

// public int watchDistance() { return wrapperContained.watchDistance; }
// public void watchDistance(int value) { wrapperContained.watchDistance = value; }
// public static int watchDistance() { return net.minecraft.server.world.ServerChunkLoadingManager.watchDistance; }
// public static void watchDistance(int value, ) { net.minecraft.server.world.ServerChunkLoadingManager.watchDistance = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunksToUnload() { return wrapperContained.chunksToUnload; }
// public void chunksToUnload(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.chunksToUnload = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap chunksToUnload() { return net.minecraft.server.world.ServerChunkLoadingManager.chunksToUnload; }
// public static void chunksToUnload(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunksToUnload = value; }

// public yarnwrap.world.poi.PointOfInterestStorage pointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.pointOfInterestStorage); }
// public void pointOfInterestStorage(yarnwrap.world.poi.PointOfInterestStorage value) { wrapperContained.pointOfInterestStorage = value.wrapperContained; }
// public static yarnwrap.world.poi.PointOfInterestStorage pointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(net.minecraft.server.world.ServerChunkLoadingManager.pointOfInterestStorage); }
// public static void pointOfInterestStorage(yarnwrap.world.poi.PointOfInterestStorage value, ) { net.minecraft.server.world.ServerChunkLoadingManager.pointOfInterestStorage = value.wrapperContained; }

// public java.util.Queue unloadTaskQueue() { return wrapperContained.unloadTaskQueue; }
// public void unloadTaskQueue(java.util.Queue value) { wrapperContained.unloadTaskQueue = value; }
// public static java.util.Queue unloadTaskQueue() { return net.minecraft.server.world.ServerChunkLoadingManager.unloadTaskQueue; }
// public static void unloadTaskQueue(java.util.Queue value, ) { net.minecraft.server.world.ServerChunkLoadingManager.unloadTaskQueue = value; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap chunkToType() { return wrapperContained.chunkToType; }
// public void chunkToType(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.chunkToType = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ByteMap chunkToType() { return net.minecraft.server.world.ServerChunkLoadingManager.chunkToType; }
// public static void chunkToType(it.unimi.dsi.fastutil.longs.Long2ByteMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunkToType = value; }

// public yarnwrap.world.chunk.ChunkStatusChangeListener chunkStatusChangeListener() { return new yarnwrap.world.chunk.ChunkStatusChangeListener(wrapperContained.chunkStatusChangeListener); }
// public void chunkStatusChangeListener(yarnwrap.world.chunk.ChunkStatusChangeListener value) { wrapperContained.chunkStatusChangeListener = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatusChangeListener chunkStatusChangeListener() { return new yarnwrap.world.chunk.ChunkStatusChangeListener(net.minecraft.server.world.ServerChunkLoadingManager.chunkStatusChangeListener); }
// public static void chunkStatusChangeListener(yarnwrap.world.chunk.ChunkStatusChangeListener value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunkStatusChangeListener = value.wrapperContained; }

// public int FORCED_CHUNK_LEVEL() { return wrapperContained.FORCED_CHUNK_LEVEL; }
// public void FORCED_CHUNK_LEVEL(int value) { wrapperContained.FORCED_CHUNK_LEVEL = value; }
public static int FORCED_CHUNK_LEVEL() { return net.minecraft.server.world.ServerChunkLoadingManager.FORCED_CHUNK_LEVEL; }
// public static void FORCED_CHUNK_LEVEL(int value, ) { net.minecraft.server.world.ServerChunkLoadingManager.FORCED_CHUNK_LEVEL = value; }

// public byte PROTO_CHUNK() { return wrapperContained.PROTO_CHUNK; }
// public void PROTO_CHUNK(byte value) { wrapperContained.PROTO_CHUNK = value; }
// public static byte PROTO_CHUNK() { return net.minecraft.server.world.ServerChunkLoadingManager.PROTO_CHUNK; }
// public static void PROTO_CHUNK(byte value, ) { net.minecraft.server.world.ServerChunkLoadingManager.PROTO_CHUNK = value; }

// public byte UNMARKED_CHUNK() { return wrapperContained.UNMARKED_CHUNK; }
// public void UNMARKED_CHUNK(byte value) { wrapperContained.UNMARKED_CHUNK = value; }
// public static byte UNMARKED_CHUNK() { return net.minecraft.server.world.ServerChunkLoadingManager.UNMARKED_CHUNK; }
// public static void UNMARKED_CHUNK(byte value, ) { net.minecraft.server.world.ServerChunkLoadingManager.UNMARKED_CHUNK = value; }

// public byte LEVEL_CHUNK() { return wrapperContained.LEVEL_CHUNK; }
// public void LEVEL_CHUNK(byte value) { wrapperContained.LEVEL_CHUNK = value; }
// public static byte LEVEL_CHUNK() { return net.minecraft.server.world.ServerChunkLoadingManager.LEVEL_CHUNK; }
// public static void LEVEL_CHUNK(byte value, ) { net.minecraft.server.world.ServerChunkLoadingManager.LEVEL_CHUNK = value; }

// public int DEFAULT_VIEW_DISTANCE() { return wrapperContained.DEFAULT_VIEW_DISTANCE; }
// public void DEFAULT_VIEW_DISTANCE(int value) { wrapperContained.DEFAULT_VIEW_DISTANCE = value; }
public static int DEFAULT_VIEW_DISTANCE() { return net.minecraft.server.world.ServerChunkLoadingManager.DEFAULT_VIEW_DISTANCE; }
// public static void DEFAULT_VIEW_DISTANCE(int value, ) { net.minecraft.server.world.ServerChunkLoadingManager.DEFAULT_VIEW_DISTANCE = value; }

// public yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.noiseConfig); }
// public void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value) { wrapperContained.noiseConfig = value.wrapperContained; }
// public static yarnwrap.world.gen.noise.NoiseConfig noiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.server.world.ServerChunkLoadingManager.noiseConfig); }
// public static void noiseConfig(yarnwrap.world.gen.noise.NoiseConfig value, ) { net.minecraft.server.world.ServerChunkLoadingManager.noiseConfig = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator structurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.structurePlacementCalculator); }
// public void structurePlacementCalculator(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator value) { wrapperContained.structurePlacementCalculator = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator structurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(net.minecraft.server.world.ServerChunkLoadingManager.structurePlacementCalculator); }
// public static void structurePlacementCalculator(yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator value, ) { net.minecraft.server.world.ServerChunkLoadingManager.structurePlacementCalculator = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkGenerationContext generationContext() { return new yarnwrap.world.chunk.ChunkGenerationContext(wrapperContained.generationContext); }
// public void generationContext(yarnwrap.world.chunk.ChunkGenerationContext value) { wrapperContained.generationContext = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkGenerationContext generationContext() { return new yarnwrap.world.chunk.ChunkGenerationContext(net.minecraft.server.world.ServerChunkLoadingManager.generationContext); }
// public static void generationContext(yarnwrap.world.chunk.ChunkGenerationContext value, ) { net.minecraft.server.world.ServerChunkLoadingManager.generationContext = value.wrapperContained; }

// public yarnwrap.server.world.OptionalChunk UNLOADED_CHUNKS() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED_CHUNKS); }
// public void UNLOADED_CHUNKS(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED_CHUNKS = value.wrapperContained; }
// public static yarnwrap.server.world.OptionalChunk UNLOADED_CHUNKS() { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.UNLOADED_CHUNKS); }
// public static void UNLOADED_CHUNKS(yarnwrap.server.world.OptionalChunk value, ) { net.minecraft.server.world.ServerChunkLoadingManager.UNLOADED_CHUNKS = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture UNLOADED_CHUNKS_FUTURE() { return wrapperContained.UNLOADED_CHUNKS_FUTURE; }
// public void UNLOADED_CHUNKS_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_CHUNKS_FUTURE = value; }
// public static java.util.concurrent.CompletableFuture UNLOADED_CHUNKS_FUTURE() { return net.minecraft.server.world.ServerChunkLoadingManager.UNLOADED_CHUNKS_FUTURE; }
// public static void UNLOADED_CHUNKS_FUTURE(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ServerChunkLoadingManager.UNLOADED_CHUNKS_FUTURE = value; }

// public java.util.List loaders() { return wrapperContained.loaders; }
// public void loaders(java.util.List value) { wrapperContained.loaders = value; }
// public static java.util.List loaders() { return net.minecraft.server.world.ServerChunkLoadingManager.loaders; }
// public static void loaders(java.util.List value, ) { net.minecraft.server.world.ServerChunkLoadingManager.loaders = value; }

// public it.unimi.dsi.fastutil.longs.Long2LongMap chunkToNextSaveTimeMs() { return wrapperContained.chunkToNextSaveTimeMs; }
// public void chunkToNextSaveTimeMs(it.unimi.dsi.fastutil.longs.Long2LongMap value) { wrapperContained.chunkToNextSaveTimeMs = value; }
// public static it.unimi.dsi.fastutil.longs.Long2LongMap chunkToNextSaveTimeMs() { return net.minecraft.server.world.ServerChunkLoadingManager.chunkToNextSaveTimeMs; }
// public static void chunkToNextSaveTimeMs(it.unimi.dsi.fastutil.longs.Long2LongMap value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunkToNextSaveTimeMs = value; }

// public yarnwrap.server.world.ChunkTaskScheduler worldGenScheduler() { return new yarnwrap.server.world.ChunkTaskScheduler(wrapperContained.worldGenScheduler); }
// public void worldGenScheduler(yarnwrap.server.world.ChunkTaskScheduler value) { wrapperContained.worldGenScheduler = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTaskScheduler worldGenScheduler() { return new yarnwrap.server.world.ChunkTaskScheduler(net.minecraft.server.world.ServerChunkLoadingManager.worldGenScheduler); }
// public static void worldGenScheduler(yarnwrap.server.world.ChunkTaskScheduler value, ) { net.minecraft.server.world.ServerChunkLoadingManager.worldGenScheduler = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTaskScheduler lightScheduler() { return new yarnwrap.server.world.ChunkTaskScheduler(wrapperContained.lightScheduler); }
// public void lightScheduler(yarnwrap.server.world.ChunkTaskScheduler value) { wrapperContained.lightScheduler = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTaskScheduler lightScheduler() { return new yarnwrap.server.world.ChunkTaskScheduler(net.minecraft.server.world.ServerChunkLoadingManager.lightScheduler); }
// public static void lightScheduler(yarnwrap.server.world.ChunkTaskScheduler value, ) { net.minecraft.server.world.ServerChunkLoadingManager.lightScheduler = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet chunksToSave() { return wrapperContained.chunksToSave; }
// public void chunksToSave(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.chunksToSave = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet chunksToSave() { return net.minecraft.server.world.ServerChunkLoadingManager.chunksToSave; }
// public static void chunksToSave(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunksToSave = value; }

// public java.util.concurrent.atomic.AtomicInteger chunksBeingSavedCount() { return wrapperContained.chunksBeingSavedCount; }
// public void chunksBeingSavedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.chunksBeingSavedCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger chunksBeingSavedCount() { return net.minecraft.server.world.ServerChunkLoadingManager.chunksBeingSavedCount; }
// public static void chunksBeingSavedCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.server.world.ServerChunkLoadingManager.chunksBeingSavedCount = value; }

// public yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(wrapperContained.ticketManager); }
// public void ticketManager(yarnwrap.server.world.ChunkTicketManager value) { wrapperContained.ticketManager = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketManager ticketManager() { return new yarnwrap.server.world.ChunkTicketManager(net.minecraft.server.world.ServerChunkLoadingManager.ticketManager); }
// public static void ticketManager(yarnwrap.server.world.ChunkTicketManager value, ) { net.minecraft.server.world.ServerChunkLoadingManager.ticketManager = value.wrapperContained; }

// public ServerChunkLoadingManager(yarnwrap.server.world.ServerWorld world,Object session,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.structure.StructureTemplateManager structureTemplateManager,java.util.concurrent.Executor executor,yarnwrap.util.thread.ThreadExecutor mainThreadExecutor,yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener,yarnwrap.world.chunk.ChunkStatusChangeListener chunkStatusChangeListener,java.util.function.Supplier persistentStateManagerFactory,yarnwrap.server.world.ChunkTicketManager ticketManager,int viewDistance,boolean dsync) { this.wrapperContained = new net.minecraft.server.world.ServerChunkLoadingManager(world.wrapperContained,session,dataFixer,structureTemplateManager.wrapperContained,executor,mainThreadExecutor.wrapperContained,chunkProvider.wrapperContained,chunkGenerator.wrapperContained,worldGenerationProgressListener.wrapperContained,chunkStatusChangeListener.wrapperContained,persistentStateManagerFactory,ticketManager.wrapperContained,viewDistance,dsync); }
// public yarnwrap.server.world.ServerLightingProvider getLightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.getLightingProvider()); }
// public static yarnwrap.server.world.ServerLightingProvider getLightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(net.minecraft.server.world.ServerChunkLoadingManager.getLightingProvider()); }
// public void setViewDistance(int watchDistance) { wrapperContained.setViewDistance(watchDistance); }
// public static void setViewDistance(int watchDistance, ) { net.minecraft.server.world.ServerChunkLoadingManager.setViewDistance(watchDistance); }
// public yarnwrap.server.world.ChunkHolder getChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getChunkHolder(pos)); }
// public static yarnwrap.server.world.ChunkHolder getChunkHolder(long pos, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ServerChunkLoadingManager.getChunkHolder(pos)); }
// public yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.setLevel(pos,level,holder.wrapperContained)); }
// public static yarnwrap.server.world.ChunkHolder setLevel(long pos,int level,yarnwrap.server.world.ChunkHolder holder, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ServerChunkLoadingManager.setLevel(pos,level,holder.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getRegion(yarnwrap.server.world.ChunkHolder centerChunk,int margin,java.util.function.IntFunction distanceToStatus) { return wrapperContained.getRegion(centerChunk.wrapperContained,margin,distanceToStatus); }
// public static java.util.concurrent.CompletableFuture getRegion(yarnwrap.server.world.ChunkHolder centerChunk,int margin,java.util.function.IntFunction distanceToStatus, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getRegion(centerChunk.wrapperContained,margin,distanceToStatus); }
// public boolean save(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.save(chunk.wrapperContained); }
// public static boolean save(yarnwrap.world.chunk.Chunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.save(chunk.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_17230(yarnwrap.server.world.OptionalChunk chunk) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_17230(chunk.wrapperContained)); }
// public static yarnwrap.server.world.OptionalChunk method_17230(yarnwrap.server.world.OptionalChunk chunk, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_17230(chunk.wrapperContained)); }
// public yarnwrap.world.chunk.WorldChunk method_17232(java.util.List chunks) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.method_17232(chunks)); }
// public static yarnwrap.world.chunk.WorldChunk method_17232(java.util.List chunks, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_17232(chunks)); }
// public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.world.ServerChunkLoadingManager.tick(shouldKeepTicking); }
public java.util.concurrent.CompletableFuture makeChunkTickable(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkTickable(holder.wrapperContained); }
// public static java.util.concurrent.CompletableFuture makeChunkTickable(yarnwrap.server.world.ChunkHolder holder, ) { return net.minecraft.server.world.ServerChunkLoadingManager.makeChunkTickable(holder.wrapperContained); }
// public void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendWatchPackets(player.wrapperContained); }
// public static void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendWatchPackets(player.wrapperContained); }
// public void save(boolean flush) { wrapperContained.save(flush); }
// public static void save(boolean flush, ) { net.minecraft.server.world.ServerChunkLoadingManager.save(flush); }
// public boolean updateHolderMap() { return wrapperContained.updateHolderMap(); }
// public static boolean updateHolderMap() { return net.minecraft.server.world.ServerChunkLoadingManager.updateHolderMap(); }
// public yarnwrap.world.chunk.ChunkStatus method_17245(int distance) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.method_17245(distance)); }
// public static yarnwrap.world.chunk.ChunkStatus method_17245(int distance, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.server.world.ServerChunkLoadingManager.method_17245(distance)); }
public java.util.concurrent.CompletableFuture makeChunkEntitiesTickable(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkEntitiesTickable(holder.wrapperContained); }
// public static java.util.concurrent.CompletableFuture makeChunkEntitiesTickable(yarnwrap.server.world.ChunkHolder holder, ) { return net.minecraft.server.world.ServerChunkLoadingManager.makeChunkEntitiesTickable(holder.wrapperContained); }
public int getTotalChunksLoadedCount() { return wrapperContained.getTotalChunksLoadedCount(); }
// public static int getTotalChunksLoadedCount() { return net.minecraft.server.world.ServerChunkLoadingManager.getTotalChunksLoadedCount(); }
// public yarnwrap.world.chunk.ChunkStatus method_17254(int distance) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.method_17254(distance)); }
// public static yarnwrap.world.chunk.ChunkStatus method_17254(int distance, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.server.world.ServerChunkLoadingManager.method_17254(distance)); }
// public yarnwrap.server.world.ChunkHolder getCurrentChunkHolder(long pos) { return new yarnwrap.server.world.ChunkHolder(wrapperContained.getCurrentChunkHolder(pos)); }
// public static yarnwrap.server.world.ChunkHolder getCurrentChunkHolder(long pos, ) { return new yarnwrap.server.world.ChunkHolder(net.minecraft.server.world.ServerChunkLoadingManager.getCurrentChunkHolder(pos)); }
public int getLoadedChunkCount() { return wrapperContained.getLoadedChunkCount(); }
// public static int getLoadedChunkCount() { return net.minecraft.server.world.ServerChunkLoadingManager.getLoadedChunkCount(); }
public yarnwrap.server.world.ChunkLevelManager getLevelManager() { return new yarnwrap.server.world.ChunkLevelManager(wrapperContained.getLevelManager()); }
// public static yarnwrap.server.world.ChunkLevelManager getLevelManager() { return new yarnwrap.server.world.ChunkLevelManager(net.minecraft.server.world.ServerChunkLoadingManager.getLevelManager()); }
// public java.lang.Iterable entryIterator() { return wrapperContained.entryIterator(); }
// public static java.lang.Iterable entryIterator() { return net.minecraft.server.world.ServerChunkLoadingManager.entryIterator(); }
// public java.util.function.IntSupplier getCompletedLevelSupplier(long pos) { return wrapperContained.getCompletedLevelSupplier(pos); }
// public static java.util.function.IntSupplier getCompletedLevelSupplier(long pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getCompletedLevelSupplier(pos); }
// public void loadEntity(yarnwrap.entity.Entity entity) { wrapperContained.loadEntity(entity.wrapperContained); }
// public static void loadEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerChunkLoadingManager.loadEntity(entity.wrapperContained); }
public void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public static void sendToOtherNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendToOtherNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public double getSquaredDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
// public static double getSquaredDistance(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getSquaredDistance(pos.wrapperContained); }
public void updatePosition(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updatePosition(player.wrapperContained); }
// public static void updatePosition(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerChunkLoadingManager.updatePosition(player.wrapperContained); }
// public void handlePlayerAddedOrRemoved(yarnwrap.server.network.ServerPlayerEntity player,boolean added) { wrapperContained.handlePlayerAddedOrRemoved(player.wrapperContained,added); }
// public static void handlePlayerAddedOrRemoved(yarnwrap.server.network.ServerPlayerEntity player,boolean added, ) { net.minecraft.server.world.ServerChunkLoadingManager.handlePlayerAddedOrRemoved(player.wrapperContained,added); }
// public void unloadEntity(yarnwrap.entity.Entity entity) { wrapperContained.unloadEntity(entity.wrapperContained); }
// public static void unloadEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerChunkLoadingManager.unloadEntity(entity.wrapperContained); }
// public void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet) { wrapperContained.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public static void sendToNearbyPlayers(yarnwrap.entity.Entity entity,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendToNearbyPlayers(entity.wrapperContained,packet.wrapperContained); }
// public boolean doesNotGenerateChunks(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.doesNotGenerateChunks(player.wrapperContained); }
// public static boolean doesNotGenerateChunks(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.world.ServerChunkLoadingManager.doesNotGenerateChunks(player.wrapperContained); }
// public void tickEntityMovement() { wrapperContained.tickEntityMovement(); }
// public static void tickEntityMovement() { net.minecraft.server.world.ServerChunkLoadingManager.tickEntityMovement(); }
// public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
// public static yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(net.minecraft.server.world.ServerChunkLoadingManager.getPointOfInterestStorage()); }
// public void tryUnloadChunk(long pos,yarnwrap.server.world.ChunkHolder chunk) { wrapperContained.tryUnloadChunk(pos,chunk.wrapperContained); }
// public static void tryUnloadChunk(long pos,yarnwrap.server.world.ChunkHolder chunk, ) { net.minecraft.server.world.ServerChunkLoadingManager.tryUnloadChunk(pos,chunk.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_20577(yarnwrap.server.world.OptionalChunk optionalChunks) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_20577(optionalChunks.wrapperContained)); }
// public static yarnwrap.server.world.OptionalChunk method_20577(yarnwrap.server.world.OptionalChunk optionalChunks, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_20577(optionalChunks.wrapperContained)); }
// public void method_20578(org.apache.commons.lang3.mutable.MutableBoolean chunk) { wrapperContained.method_20578(chunk); }
// public static void method_20578(org.apache.commons.lang3.mutable.MutableBoolean chunk, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_20578(chunk); }
// public boolean method_20582(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.method_20582(chunk.wrapperContained); }
// public static boolean method_20582(yarnwrap.world.chunk.Chunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_20582(chunk.wrapperContained); }
// public yarnwrap.world.chunk.Chunk method_20584(yarnwrap.server.world.ChunkHolder holder) { return new yarnwrap.world.chunk.Chunk(wrapperContained.method_20584(holder.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk method_20584(yarnwrap.server.world.ChunkHolder holder, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.server.world.ServerChunkLoadingManager.method_20584(holder.wrapperContained)); }
// public void method_20604(yarnwrap.server.world.ChunkHolder void_,java.lang.Void throwable) { wrapperContained.method_20604(void_.wrapperContained,throwable); }
// public static void method_20604(yarnwrap.server.world.ChunkHolder void_,java.lang.Void throwable, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_20604(void_.wrapperContained,throwable); }
// public void unloadChunks(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.unloadChunks(shouldKeepTicking); }
// public static void unloadChunks(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.world.ServerChunkLoadingManager.unloadChunks(shouldKeepTicking); }
// public java.util.concurrent.CompletableFuture loadChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.loadChunk(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture loadChunk(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.loadChunk(pos.wrapperContained); }
// public void updateWatchedSection(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.updateWatchedSection(player.wrapperContained); }
// public static void updateWatchedSection(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerChunkLoadingManager.updateWatchedSection(player.wrapperContained); }
// public void dump(java.io.Writer writer) { wrapperContained.dump(writer); }
// public static void dump(java.io.Writer writer, ) { net.minecraft.server.world.ServerChunkLoadingManager.dump(writer); }
// public java.util.Optional method_21620(yarnwrap.world.chunk.Chunk chunk) { return wrapperContained.method_21620(chunk.wrapperContained); }
// public static java.util.Optional method_21620(yarnwrap.world.chunk.Chunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_21620(chunk.wrapperContained); }
// public java.lang.Integer method_21621(yarnwrap.world.chunk.WorldChunk chunk) { return wrapperContained.method_21621(chunk.wrapperContained); }
// public static java.lang.Integer method_21621(yarnwrap.world.chunk.WorldChunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_21621(chunk.wrapperContained); }
// public java.lang.String getFutureStatus(java.util.concurrent.CompletableFuture future) { return wrapperContained.getFutureStatus(future); }
// public static java.lang.String getFutureStatus(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getFutureStatus(future); }
public java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getChunkLoadingDebugInfo(chunkPos.wrapperContained); }
// public static java.lang.String getChunkLoadingDebugInfo(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getChunkLoadingDebugInfo(chunkPos.wrapperContained); }
// public byte mark(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkType type) { return wrapperContained.mark(pos.wrapperContained,type.wrapperContained); }
// public static byte mark(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.ChunkType type, ) { return net.minecraft.server.world.ServerChunkLoadingManager.mark(pos.wrapperContained,type.wrapperContained); }
// public void markAsProtoChunk(yarnwrap.util.math.ChunkPos pos) { wrapperContained.markAsProtoChunk(pos.wrapperContained); }
// public static void markAsProtoChunk(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkLoadingManager.markAsProtoChunk(pos.wrapperContained); }
// public boolean isLevelChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isLevelChunk(pos.wrapperContained); }
// public static boolean isLevelChunk(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.isLevelChunk(pos.wrapperContained); }
// public void onChunkStatusChange(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.onChunkStatusChange(chunkPos.wrapperContained,levelType.wrapperContained); }
// public static void onChunkStatusChange(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType, ) { net.minecraft.server.world.ServerChunkLoadingManager.onChunkStatusChange(chunkPos.wrapperContained,levelType.wrapperContained); }
// public yarnwrap.world.chunk.WorldChunk method_31416(java.util.List chunks) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.method_31416(chunks)); }
// public static yarnwrap.world.chunk.WorldChunk method_31416(java.util.List chunks, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_31416(chunks)); }
public java.util.concurrent.CompletableFuture makeChunkAccessible(yarnwrap.server.world.ChunkHolder holder) { return wrapperContained.makeChunkAccessible(holder.wrapperContained); }
// public static java.util.concurrent.CompletableFuture makeChunkAccessible(yarnwrap.server.world.ChunkHolder holder, ) { return net.minecraft.server.world.ServerChunkLoadingManager.makeChunkAccessible(holder.wrapperContained); }
public java.lang.String getSaveDir() { return wrapperContained.getSaveDir(); }
// public static java.lang.String getSaveDir() { return net.minecraft.server.world.ServerChunkLoadingManager.getSaveDir(); }
// public yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getChunkGenerator()); }
// public static yarnwrap.world.gen.chunk.ChunkGenerator getChunkGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.server.world.ServerChunkLoadingManager.getChunkGenerator()); }
public java.util.List getPlayersWatchingChunk(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getPlayersWatchingChunk(pos.wrapperContained); }
// public static java.util.List getPlayersWatchingChunk(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getPlayersWatchingChunk(pos.wrapperContained); }
// public boolean canTickChunk(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { return wrapperContained.canTickChunk(player.wrapperContained,pos.wrapperContained); }
// public static boolean canTickChunk(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.canTickChunk(player.wrapperContained,pos.wrapperContained); }
// public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
// public static boolean shouldTick(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.shouldTick(pos.wrapperContained); }
// public java.lang.Integer method_39220(yarnwrap.world.chunk.WorldChunk chunk) { return wrapperContained.method_39220(chunk.wrapperContained); }
// public static java.lang.Integer method_39220(yarnwrap.world.chunk.WorldChunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_39220(chunk.wrapperContained); }
// public java.lang.Integer method_39221(yarnwrap.world.chunk.WorldChunk chunk) { return wrapperContained.method_39221(chunk.wrapperContained); }
// public static java.lang.Integer method_39221(yarnwrap.world.chunk.WorldChunk chunk, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_39221(chunk.wrapperContained); }
// public boolean save(yarnwrap.server.world.ChunkHolder chunkHolder,long currentTime) { return wrapperContained.save(chunkHolder.wrapperContained,currentTime); }
// public static boolean save(yarnwrap.server.world.ChunkHolder chunkHolder,long currentTime, ) { return net.minecraft.server.world.ServerChunkLoadingManager.save(chunkHolder.wrapperContained,currentTime); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public static boolean shouldDelayShutdown() { return net.minecraft.server.world.ServerChunkLoadingManager.shouldDelayShutdown(); }
public yarnwrap.util.crash.CrashException crash(java.lang.IllegalStateException exception,java.lang.String details) { return new yarnwrap.util.crash.CrashException(wrapperContained.crash(exception,details)); }
// public static yarnwrap.util.crash.CrashException crash(java.lang.IllegalStateException exception,java.lang.String details, ) { return new yarnwrap.util.crash.CrashException(net.minecraft.server.world.ServerChunkLoadingManager.crash(exception,details)); }
// public void method_40068(java.lang.StringBuilder chunkHolder) { wrapperContained.method_40068(chunkHolder); }
// public static void method_40068(java.lang.StringBuilder chunkHolder, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_40068(chunkHolder); }
// public void method_40069(java.lang.StringBuilder pair) { wrapperContained.method_40069(pair); }
// public static void method_40069(java.lang.StringBuilder pair, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_40069(pair); }
// public yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.getNoiseConfig()); }
// public static yarnwrap.world.gen.noise.NoiseConfig getNoiseConfig() { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.server.world.ServerChunkLoadingManager.getNoiseConfig()); }
// public yarnwrap.world.chunk.Chunk method_43374(yarnwrap.util.math.ChunkPos throwable) { return new yarnwrap.world.chunk.Chunk(wrapperContained.method_43374(throwable.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk method_43374(yarnwrap.util.math.ChunkPos throwable, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.server.world.ServerChunkLoadingManager.method_43374(throwable.wrapperContained)); }
// public yarnwrap.world.chunk.Chunk method_43375(yarnwrap.util.math.ChunkPos nbt) { return new yarnwrap.world.chunk.Chunk(wrapperContained.method_43375(nbt.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk method_43375(yarnwrap.util.math.ChunkPos nbt, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.server.world.ServerChunkLoadingManager.method_43375(nbt.wrapperContained)); }
// public yarnwrap.world.chunk.Chunk recoverFromException(java.lang.Throwable throwable,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.recoverFromException(throwable,chunkPos.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk recoverFromException(java.lang.Throwable throwable,yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.server.world.ServerChunkLoadingManager.recoverFromException(throwable,chunkPos.wrapperContained)); }
// public java.util.Optional method_43377(java.util.Optional nbt) { return wrapperContained.method_43377(nbt); }
// public static java.util.Optional method_43377(java.util.Optional nbt, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_43377(nbt); }
// public yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.updateChunkNbt(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.server.world.ServerChunkLoadingManager.updateChunkNbt(nbt.wrapperContained)); }
// public yarnwrap.world.chunk.Chunk getProtoChunk(yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getProtoChunk(chunkPos.wrapperContained)); }
// public static yarnwrap.world.chunk.Chunk getProtoChunk(yarnwrap.util.math.ChunkPos chunkPos, ) { return new yarnwrap.world.chunk.Chunk(net.minecraft.server.world.ServerChunkLoadingManager.getProtoChunk(chunkPos.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getUpdatedChunkNbt(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getUpdatedChunkNbt(chunkPos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture getUpdatedChunkNbt(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getUpdatedChunkNbt(chunkPos.wrapperContained); }
// public yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(wrapperContained.getStructurePlacementCalculator()); }
// public static yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator getStructurePlacementCalculator() { return new yarnwrap.world.gen.chunk.placement.StructurePlacementCalculator(net.minecraft.server.world.ServerChunkLoadingManager.getStructurePlacementCalculator()); }
// public void method_49420(yarnwrap.server.network.ServerPlayerEntity player,java.util.List chunksx) { wrapperContained.method_49420(player.wrapperContained,chunksx); }
// public static void method_49420(yarnwrap.server.network.ServerPlayerEntity player,java.util.List chunksx, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_49420(player.wrapperContained,chunksx); }
public void sendChunkBiomePackets(java.util.List chunks) { wrapperContained.sendChunkBiomePackets(chunks); }
// public static void sendChunkBiomePackets(java.util.List chunks, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendChunkBiomePackets(chunks); }
// public java.util.List method_49422(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_49422(player.wrapperContained); }
// public static java.util.List method_49422(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_49422(player.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_51282(yarnwrap.server.world.OptionalChunk chunk) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_51282(chunk.wrapperContained)); }
// public static yarnwrap.server.world.OptionalChunk method_51282(yarnwrap.server.world.OptionalChunk chunk, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_51282(chunk.wrapperContained)); }
// public java.lang.Object method_51834(yarnwrap.server.world.OptionalChunk chunk,java.lang.Throwable throwable) { return wrapperContained.method_51834(chunk.wrapperContained,throwable); }
// public static java.lang.Object method_51834(yarnwrap.server.world.OptionalChunk chunk,java.lang.Throwable throwable, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_51834(chunk.wrapperContained,throwable); }
// public boolean isTracked(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ) { return wrapperContained.isTracked(player.wrapperContained,chunkX,chunkZ); }
// public static boolean isTracked(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ, ) { return net.minecraft.server.world.ServerChunkLoadingManager.isTracked(player.wrapperContained,chunkX,chunkZ); }
// public void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ChunkFilter chunkFilter) { wrapperContained.sendWatchPackets(player.wrapperContained,chunkFilter.wrapperContained); }
// public static void sendWatchPackets(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.server.network.ChunkFilter chunkFilter, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendWatchPackets(player.wrapperContained,chunkFilter.wrapperContained); }
// public void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.track(player.wrapperContained,pos.wrapperContained); }
// public static void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkLoadingManager.track(player.wrapperContained,pos.wrapperContained); }
// public void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.track(player.wrapperContained,chunk.wrapperContained); }
// public static void track(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ServerChunkLoadingManager.track(player.wrapperContained,chunk.wrapperContained); }
// public int getViewDistance(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.getViewDistance(player.wrapperContained); }
// public static int getViewDistance(yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.world.ServerChunkLoadingManager.getViewDistance(player.wrapperContained); }
// public boolean isOnTrackEdge(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ) { return wrapperContained.isOnTrackEdge(player.wrapperContained,chunkX,chunkZ); }
// public static boolean isOnTrackEdge(yarnwrap.server.network.ServerPlayerEntity player,int chunkX,int chunkZ, ) { return net.minecraft.server.world.ServerChunkLoadingManager.isOnTrackEdge(player.wrapperContained,chunkX,chunkZ); }
// public void untrack(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.untrack(player.wrapperContained,pos.wrapperContained); }
// public static void untrack(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkLoadingManager.untrack(player.wrapperContained,pos.wrapperContained); }
// public void method_52354(yarnwrap.server.network.ServerPlayerEntity chunkPos) { wrapperContained.method_52354(chunkPos.wrapperContained); }
// public static void method_52354(yarnwrap.server.network.ServerPlayerEntity chunkPos, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_52354(chunkPos.wrapperContained); }
// public void method_52355(yarnwrap.server.network.ServerPlayerEntity chunkPos) { wrapperContained.method_52355(chunkPos.wrapperContained); }
// public static void method_52355(yarnwrap.server.network.ServerPlayerEntity chunkPos, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_52355(chunkPos.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_53683(yarnwrap.server.world.ChunkHolder optionalChunk) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_53683(optionalChunk.wrapperContained)); }
// public static yarnwrap.server.world.OptionalChunk method_53683(yarnwrap.server.world.ChunkHolder optionalChunk, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_53683(optionalChunk.wrapperContained)); }
public void forceLighting(yarnwrap.util.math.ChunkPos centerPos,int radius) { wrapperContained.forceLighting(centerPos.wrapperContained,radius); }
// public static void forceLighting(yarnwrap.util.math.ChunkPos centerPos,int radius, ) { net.minecraft.server.world.ServerChunkLoadingManager.forceLighting(centerPos.wrapperContained,radius); }
// public void sendToPlayers(yarnwrap.server.world.ChunkHolder chunkHolder,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.sendToPlayers(chunkHolder.wrapperContained,chunk.wrapperContained); }
// public static void sendToPlayers(yarnwrap.server.world.ChunkHolder chunkHolder,yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ServerChunkLoadingManager.sendToPlayers(chunkHolder.wrapperContained,chunk.wrapperContained); }
public yarnwrap.world.chunk.WorldChunk getPostProcessedChunk(long pos) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getPostProcessedChunk(pos)); }
// public static yarnwrap.world.chunk.WorldChunk getPostProcessedChunk(long pos, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ServerChunkLoadingManager.getPostProcessedChunk(pos)); }
// public void method_53689(yarnwrap.util.math.ChunkPos pos) { wrapperContained.method_53689(pos.wrapperContained); }
// public static void method_53689(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_53689(pos.wrapperContained); }
// public java.lang.Object method_57120(yarnwrap.util.math.ChunkPos exception) { return wrapperContained.method_57120(exception.wrapperContained); }
// public static java.lang.Object method_57120(yarnwrap.util.math.ChunkPos exception, ) { return net.minecraft.server.world.ServerChunkLoadingManager.method_57120(exception.wrapperContained); }
// public void schedule(yarnwrap.world.chunk.ChunkLoader loader) { wrapperContained.schedule(loader.wrapperContained); }
// public static void schedule(yarnwrap.world.chunk.ChunkLoader loader, ) { net.minecraft.server.world.ServerChunkLoadingManager.schedule(loader.wrapperContained); }
// public yarnwrap.server.world.OptionalChunk method_60449(java.util.List chunks) { return new yarnwrap.server.world.OptionalChunk(wrapperContained.method_60449(chunks)); }
// public static yarnwrap.server.world.OptionalChunk method_60449(java.util.List chunks, ) { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_60449(chunks)); }
// public yarnwrap.world.chunk.WorldChunk method_61257(yarnwrap.server.world.ChunkHolder chunks) { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.method_61257(chunks.wrapperContained)); }
// public static yarnwrap.world.chunk.WorldChunk method_61257(yarnwrap.server.world.ChunkHolder chunks, ) { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ServerChunkLoadingManager.method_61257(chunks.wrapperContained)); }
// public boolean isAnyPlayerTicking(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isAnyPlayerTicking(pos.wrapperContained); }
// public static boolean isAnyPlayerTicking(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerChunkLoadingManager.isAnyPlayerTicking(pos.wrapperContained); }
// public void updateLevel(yarnwrap.util.math.ChunkPos pos,java.util.function.IntSupplier levelGetter,int targetLevel,java.util.function.IntConsumer levelSetter) { wrapperContained.updateLevel(pos.wrapperContained,levelGetter,targetLevel,levelSetter); }
// public static void updateLevel(yarnwrap.util.math.ChunkPos pos,java.util.function.IntSupplier levelGetter,int targetLevel,java.util.function.IntConsumer levelSetter, ) { net.minecraft.server.world.ServerChunkLoadingManager.updateLevel(pos.wrapperContained,levelGetter,targetLevel,levelSetter); }
// public void saveChunks(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.saveChunks(shouldKeepTicking); }
// public static void saveChunks(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.world.ServerChunkLoadingManager.saveChunks(shouldKeepTicking); }
// public void markChunkNeedsSaving(yarnwrap.util.math.ChunkPos pos) { wrapperContained.markChunkNeedsSaving(pos.wrapperContained); }
// public static void markChunkNeedsSaving(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.world.ServerChunkLoadingManager.markChunkNeedsSaving(pos.wrapperContained); }
// public void collectSpawningChunks(java.util.List chunks) { wrapperContained.collectSpawningChunks(chunks); }
// public static void collectSpawningChunks(java.util.List chunks, ) { net.minecraft.server.world.ServerChunkLoadingManager.collectSpawningChunks(chunks); }
// public void forEachBlockTickingChunk(java.util.function.Consumer chunkConsumer) { wrapperContained.forEachBlockTickingChunk(chunkConsumer); }
// public static void forEachBlockTickingChunk(java.util.function.Consumer chunkConsumer, ) { net.minecraft.server.world.ServerChunkLoadingManager.forEachBlockTickingChunk(chunkConsumer); }
// public void method_67499(java.util.function.Consumer chunkPos) { wrapperContained.method_67499(chunkPos); }
// public static void method_67499(java.util.function.Consumer chunkPos, ) { net.minecraft.server.world.ServerChunkLoadingManager.method_67499(chunkPos); }

}