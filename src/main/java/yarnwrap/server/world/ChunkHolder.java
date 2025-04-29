package yarnwrap.server.world;
public class ChunkHolder { public net.minecraft.server.world.ChunkHolder wrapperContained; public ChunkHolder(net.minecraft.server.world.ChunkHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.server.world.ChunkHolder.level; }
// public static void level(int value, ) { net.minecraft.server.world.ChunkHolder.level = value; }

// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.server.world.ChunkHolder.lightingProvider); }
// public static void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value, ) { net.minecraft.server.world.ChunkHolder.lightingProvider = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture entityTickingFuture() { return wrapperContained.entityTickingFuture; }
// public void entityTickingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.entityTickingFuture = value; }
// public static java.util.concurrent.CompletableFuture entityTickingFuture() { return net.minecraft.server.world.ChunkHolder.entityTickingFuture; }
// public static void entityTickingFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.entityTickingFuture = value; }

// public java.util.BitSet skyLightUpdateBits() { return wrapperContained.skyLightUpdateBits; }
// public void skyLightUpdateBits(java.util.BitSet value) { wrapperContained.skyLightUpdateBits = value; }
// public static java.util.BitSet skyLightUpdateBits() { return net.minecraft.server.world.ChunkHolder.skyLightUpdateBits; }
// public static void skyLightUpdateBits(java.util.BitSet value, ) { net.minecraft.server.world.ChunkHolder.skyLightUpdateBits = value; }

// public java.util.BitSet blockLightUpdateBits() { return wrapperContained.blockLightUpdateBits; }
// public void blockLightUpdateBits(java.util.BitSet value) { wrapperContained.blockLightUpdateBits = value; }
// public static java.util.BitSet blockLightUpdateBits() { return net.minecraft.server.world.ChunkHolder.blockLightUpdateBits; }
// public static void blockLightUpdateBits(java.util.BitSet value, ) { net.minecraft.server.world.ChunkHolder.blockLightUpdateBits = value; }

// public yarnwrap.server.world.OptionalChunk UNLOADED_WORLD_CHUNK() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED_WORLD_CHUNK); }
// public void UNLOADED_WORLD_CHUNK(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED_WORLD_CHUNK = value.wrapperContained; }
public static yarnwrap.server.world.OptionalChunk UNLOADED_WORLD_CHUNK() { return new yarnwrap.server.world.OptionalChunk(net.minecraft.server.world.ChunkHolder.UNLOADED_WORLD_CHUNK); }
// public static void UNLOADED_WORLD_CHUNK(yarnwrap.server.world.OptionalChunk value, ) { net.minecraft.server.world.ChunkHolder.UNLOADED_WORLD_CHUNK = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture UNLOADED_WORLD_CHUNK_FUTURE() { return wrapperContained.UNLOADED_WORLD_CHUNK_FUTURE; }
// public void UNLOADED_WORLD_CHUNK_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_WORLD_CHUNK_FUTURE = value; }
// public static java.util.concurrent.CompletableFuture UNLOADED_WORLD_CHUNK_FUTURE() { return net.minecraft.server.world.ChunkHolder.UNLOADED_WORLD_CHUNK_FUTURE; }
// public static void UNLOADED_WORLD_CHUNK_FUTURE(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.UNLOADED_WORLD_CHUNK_FUTURE = value; }

// public java.util.concurrent.CompletableFuture accessibleFuture() { return wrapperContained.accessibleFuture; }
// public void accessibleFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.accessibleFuture = value; }
// public static java.util.concurrent.CompletableFuture accessibleFuture() { return net.minecraft.server.world.ChunkHolder.accessibleFuture; }
// public static void accessibleFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.accessibleFuture = value; }

// public int lastTickLevel() { return wrapperContained.lastTickLevel; }
// public void lastTickLevel(int value) { wrapperContained.lastTickLevel = value; }
// public static int lastTickLevel() { return net.minecraft.server.world.ChunkHolder.lastTickLevel; }
// public static void lastTickLevel(int value, ) { net.minecraft.server.world.ChunkHolder.lastTickLevel = value; }

// public int completedLevel() { return wrapperContained.completedLevel; }
// public void completedLevel(int value) { wrapperContained.completedLevel = value; }
// public static int completedLevel() { return net.minecraft.server.world.ChunkHolder.completedLevel; }
// public static void completedLevel(int value, ) { net.minecraft.server.world.ChunkHolder.completedLevel = value; }

// public Object levelUpdateListener() { return wrapperContained.levelUpdateListener; }
// // public void levelUpdateListener(Object value) { wrapperContained.levelUpdateListener = value; }
// // public static Object levelUpdateListener() { return net.minecraft.server.world.ChunkHolder.levelUpdateListener; }
// // public static void levelUpdateListener(Object value, ) { net.minecraft.server.world.ChunkHolder.levelUpdateListener = value; }

// public Object playersWatchingChunkProvider() { return wrapperContained.playersWatchingChunkProvider; }
// // public void playersWatchingChunkProvider(Object value) { wrapperContained.playersWatchingChunkProvider = value; }
// // public static Object playersWatchingChunkProvider() { return net.minecraft.server.world.ChunkHolder.playersWatchingChunkProvider; }
// // public static void playersWatchingChunkProvider(Object value, ) { net.minecraft.server.world.ChunkHolder.playersWatchingChunkProvider = value; }

// public boolean accessible() { return wrapperContained.accessible; }
// public void accessible(boolean value) { wrapperContained.accessible = value; }
// public static boolean accessible() { return net.minecraft.server.world.ChunkHolder.accessible; }
// public static void accessible(boolean value, ) { net.minecraft.server.world.ChunkHolder.accessible = value; }

// public java.util.concurrent.CompletableFuture tickingFuture() { return wrapperContained.tickingFuture; }
// public void tickingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.tickingFuture = value; }
// public static java.util.concurrent.CompletableFuture tickingFuture() { return net.minecraft.server.world.ChunkHolder.tickingFuture; }
// public static void tickingFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.tickingFuture = value; }

// public boolean pendingBlockUpdates() { return wrapperContained.pendingBlockUpdates; }
// public void pendingBlockUpdates(boolean value) { wrapperContained.pendingBlockUpdates = value; }
// public static boolean pendingBlockUpdates() { return net.minecraft.server.world.ChunkHolder.pendingBlockUpdates; }
// public static void pendingBlockUpdates(boolean value, ) { net.minecraft.server.world.ChunkHolder.pendingBlockUpdates = value; }

// public it.unimi.dsi.fastutil.shorts.ShortSet[] blockUpdatesBySection() { return wrapperContained.blockUpdatesBySection; }
// public void blockUpdatesBySection(it.unimi.dsi.fastutil.shorts.ShortSet[] value) { wrapperContained.blockUpdatesBySection = value; }
// public static it.unimi.dsi.fastutil.shorts.ShortSet[] blockUpdatesBySection() { return net.minecraft.server.world.ChunkHolder.blockUpdatesBySection; }
// public static void blockUpdatesBySection(it.unimi.dsi.fastutil.shorts.ShortSet[] value, ) { net.minecraft.server.world.ChunkHolder.blockUpdatesBySection = value; }

// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(net.minecraft.server.world.ChunkHolder.world); }
// public static void world(yarnwrap.world.HeightLimitView value, ) { net.minecraft.server.world.ChunkHolder.world = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture levelIncreaseFuture() { return wrapperContained.levelIncreaseFuture; }
// public void levelIncreaseFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.levelIncreaseFuture = value; }
// public static java.util.concurrent.CompletableFuture levelIncreaseFuture() { return net.minecraft.server.world.ChunkHolder.levelIncreaseFuture; }
// public static void levelIncreaseFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.levelIncreaseFuture = value; }

// public java.util.concurrent.CompletableFuture postProcessingFuture() { return wrapperContained.postProcessingFuture; }
// public void postProcessingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.postProcessingFuture = value; }
// public static java.util.concurrent.CompletableFuture postProcessingFuture() { return net.minecraft.server.world.ChunkHolder.postProcessingFuture; }
// public static void postProcessingFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.postProcessingFuture = value; }

// public java.util.concurrent.CompletableFuture savingFuture() { return wrapperContained.savingFuture; }
// public void savingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.savingFuture = value; }
// public static java.util.concurrent.CompletableFuture savingFuture() { return net.minecraft.server.world.ChunkHolder.savingFuture; }
// public static void savingFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.world.ChunkHolder.savingFuture = value; }

// public ChunkHolder(yarnwrap.util.math.ChunkPos pos,int level,yarnwrap.world.HeightLimitView world,yarnwrap.world.chunk.light.LightingProvider lightingProvider,Object levelUpdateListener,Object playersWatchingChunkProvider) { this.wrapperContained = new net.minecraft.server.world.ChunkHolder(pos.wrapperContained,level,world.wrapperContained,lightingProvider.wrapperContained,levelUpdateListener,playersWatchingChunkProvider); }
// public void sendPacketToPlayers(java.util.List players,yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacketToPlayers(players,packet.wrapperContained); }
// public static void sendPacketToPlayers(java.util.List players,yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.world.ChunkHolder.sendPacketToPlayers(players,packet.wrapperContained); }
// public void method_13996(yarnwrap.network.packet.Packet player) { wrapperContained.method_13996(player.wrapperContained); }
// public static void method_13996(yarnwrap.network.packet.Packet player, ) { net.minecraft.server.world.ChunkHolder.method_13996(player.wrapperContained); }
public java.util.concurrent.CompletableFuture getSavingFuture() { return wrapperContained.getSavingFuture(); }
// public static java.util.concurrent.CompletableFuture getSavingFuture() { return net.minecraft.server.world.ChunkHolder.getSavingFuture(); }
public void markForBlockUpdate(yarnwrap.util.math.BlockPos pos) { wrapperContained.markForBlockUpdate(pos.wrapperContained); }
// public static void markForBlockUpdate(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.world.ChunkHolder.markForBlockUpdate(pos.wrapperContained); }
public java.util.concurrent.CompletableFuture getEntityTickingFuture() { return wrapperContained.getEntityTickingFuture(); }
// public static java.util.concurrent.CompletableFuture getEntityTickingFuture() { return net.minecraft.server.world.ChunkHolder.getEntityTickingFuture(); }
public void flushUpdates(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.flushUpdates(chunk.wrapperContained); }
// public static void flushUpdates(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ChunkHolder.flushUpdates(chunk.wrapperContained); }
// public void updateFutures(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.Executor executor) { wrapperContained.updateFutures(chunkLoadingManager.wrapperContained,executor); }
// public static void updateFutures(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.Executor executor, ) { net.minecraft.server.world.ChunkHolder.updateFutures(chunkLoadingManager.wrapperContained,executor); }
// public void sendBlockEntityUpdatePacket(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendBlockEntityUpdatePacket(players,world.wrapperContained,pos.wrapperContained); }
// public static void sendBlockEntityUpdatePacket(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.world.ChunkHolder.sendBlockEntityUpdatePacket(players,world.wrapperContained,pos.wrapperContained); }
public void markForLightUpdate(yarnwrap.world.LightType lightType,int y) { wrapperContained.markForLightUpdate(lightType.wrapperContained,y); }
// public static void markForLightUpdate(yarnwrap.world.LightType lightType,int y, ) { net.minecraft.server.world.ChunkHolder.markForLightUpdate(lightType.wrapperContained,y); }
public void setLevel(int level) { wrapperContained.setLevel(level); }
// public static void setLevel(int level, ) { net.minecraft.server.world.ChunkHolder.setLevel(level); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk()); }
// public static yarnwrap.world.chunk.WorldChunk getWorldChunk() { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ChunkHolder.getWorldChunk()); }
public java.util.concurrent.CompletableFuture getTickingFuture() { return wrapperContained.getTickingFuture(); }
// public static java.util.concurrent.CompletableFuture getTickingFuture() { return net.minecraft.server.world.ChunkHolder.getTickingFuture(); }
// public void setCompletedLevel(int level) { wrapperContained.setCompletedLevel(level); }
// public static void setCompletedLevel(int level, ) { net.minecraft.server.world.ChunkHolder.setCompletedLevel(level); }
public boolean isAccessible() { return wrapperContained.isAccessible(); }
// public static boolean isAccessible() { return net.minecraft.server.world.ChunkHolder.isAccessible(); }
public void updateAccessibleStatus() { wrapperContained.updateAccessibleStatus(); }
// public static void updateAccessibleStatus() { net.minecraft.server.world.ChunkHolder.updateAccessibleStatus(); }
public java.util.concurrent.CompletableFuture getAccessibleFuture() { return wrapperContained.getAccessibleFuture(); }
// public static java.util.concurrent.CompletableFuture getAccessibleFuture() { return net.minecraft.server.world.ChunkHolder.getAccessibleFuture(); }
// public void tryUpdateBlockEntityAt(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.tryUpdateBlockEntityAt(players,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void tryUpdateBlockEntityAt(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.server.world.ChunkHolder.tryUpdateBlockEntityAt(players,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void method_30312(java.util.List pos,yarnwrap.world.World state) { wrapperContained.method_30312(pos,state.wrapperContained); }
// public static void method_30312(java.util.List pos,yarnwrap.world.World state, ) { net.minecraft.server.world.ChunkHolder.method_30312(pos,state.wrapperContained); }
// public void decreaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.decreaseLevel(chunkLoadingManager.wrapperContained,target.wrapperContained); }
// public static void decreaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.server.world.ChunkLevelType target, ) { net.minecraft.server.world.ChunkHolder.decreaseLevel(chunkLoadingManager.wrapperContained,target.wrapperContained); }
// public void increaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.CompletableFuture chunkFuture,java.util.concurrent.Executor executor,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.increaseLevel(chunkLoadingManager.wrapperContained,chunkFuture,executor,target.wrapperContained); }
// public static void increaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.CompletableFuture chunkFuture,java.util.concurrent.Executor executor,yarnwrap.server.world.ChunkLevelType target, ) { net.minecraft.server.world.ChunkHolder.increaseLevel(chunkLoadingManager.wrapperContained,chunkFuture,executor,target.wrapperContained); }
// public void method_31410(java.util.concurrent.CompletableFuture chunk) { wrapperContained.method_31410(chunk); }
// public static void method_31410(java.util.concurrent.CompletableFuture chunk, ) { net.minecraft.server.world.ChunkHolder.method_31410(chunk); }
// public java.lang.Object method_39966(java.lang.Object thenResult) { return wrapperContained.method_39966(thenResult); }
// public static java.lang.Object method_39966(java.lang.Object thenResult, ) { return net.minecraft.server.world.ChunkHolder.method_39966(thenResult); }
// public void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture) { wrapperContained.combineSavingFuture(savingFuture); }
// public static void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture, ) { net.minecraft.server.world.ChunkHolder.combineSavingFuture(savingFuture); }
public void combinePostProcessingFuture(java.util.concurrent.CompletableFuture postProcessingFuture) { wrapperContained.combinePostProcessingFuture(postProcessingFuture); }
// public static void combinePostProcessingFuture(java.util.concurrent.CompletableFuture postProcessingFuture, ) { net.minecraft.server.world.ChunkHolder.combinePostProcessingFuture(postProcessingFuture); }
public java.util.concurrent.CompletableFuture getPostProcessingFuture() { return wrapperContained.getPostProcessingFuture(); }
// public static java.util.concurrent.CompletableFuture getPostProcessingFuture() { return net.minecraft.server.world.ChunkHolder.getPostProcessingFuture(); }
public yarnwrap.world.chunk.WorldChunk getPostProcessedChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getPostProcessedChunk()); }
// public static yarnwrap.world.chunk.WorldChunk getPostProcessedChunk() { return new yarnwrap.world.chunk.WorldChunk(net.minecraft.server.world.ChunkHolder.getPostProcessedChunk()); }
// public void method_57117(java.util.concurrent.CompletableFuture optionalChunk) { wrapperContained.method_57117(optionalChunk); }
// public static void method_57117(java.util.concurrent.CompletableFuture optionalChunk, ) { net.minecraft.server.world.ChunkHolder.method_57117(optionalChunk); }
public boolean isSavable() { return wrapperContained.isSavable(); }
// public static boolean isSavable() { return net.minecraft.server.world.ChunkHolder.isSavable(); }

}