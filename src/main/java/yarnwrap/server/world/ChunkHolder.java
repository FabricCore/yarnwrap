package yarnwrap.server.world;
public class ChunkHolder { public net.minecraft.server.world.ChunkHolder wrapperContained; public ChunkHolder(net.minecraft.server.world.ChunkHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture entityTickingFuture() { return wrapperContained.entityTickingFuture; }
// public void entityTickingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.entityTickingFuture = value; }
// public java.util.BitSet skyLightUpdateBits() { return wrapperContained.skyLightUpdateBits; }
// public void skyLightUpdateBits(java.util.BitSet value) { wrapperContained.skyLightUpdateBits = value; }
// public java.util.BitSet blockLightUpdateBits() { return wrapperContained.blockLightUpdateBits; }
// public void blockLightUpdateBits(java.util.BitSet value) { wrapperContained.blockLightUpdateBits = value; }
public yarnwrap.server.world.OptionalChunk UNLOADED_WORLD_CHUNK() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED_WORLD_CHUNK); }
// public void UNLOADED_WORLD_CHUNK(yarnwrap.server.world.OptionalChunk value) { wrapperContained.UNLOADED_WORLD_CHUNK = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture UNLOADED_WORLD_CHUNK_FUTURE() { return wrapperContained.UNLOADED_WORLD_CHUNK_FUTURE; }
// public void UNLOADED_WORLD_CHUNK_FUTURE(java.util.concurrent.CompletableFuture value) { wrapperContained.UNLOADED_WORLD_CHUNK_FUTURE = value; }
// public java.util.concurrent.CompletableFuture accessibleFuture() { return wrapperContained.accessibleFuture; }
// public void accessibleFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.accessibleFuture = value; }
// public int lastTickLevel() { return wrapperContained.lastTickLevel; }
// public void lastTickLevel(int value) { wrapperContained.lastTickLevel = value; }
// public int completedLevel() { return wrapperContained.completedLevel; }
// public void completedLevel(int value) { wrapperContained.completedLevel = value; }
// public Object levelUpdateListener() { return wrapperContained.levelUpdateListener; }
// // public void levelUpdateListener(Object value) { wrapperContained.levelUpdateListener = value; }
// public Object playersWatchingChunkProvider() { return wrapperContained.playersWatchingChunkProvider; }
// // public void playersWatchingChunkProvider(Object value) { wrapperContained.playersWatchingChunkProvider = value; }
// public boolean accessible() { return wrapperContained.accessible; }
// public void accessible(boolean value) { wrapperContained.accessible = value; }
// public java.util.concurrent.CompletableFuture tickingFuture() { return wrapperContained.tickingFuture; }
// public void tickingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.tickingFuture = value; }
// public boolean pendingBlockUpdates() { return wrapperContained.pendingBlockUpdates; }
// public void pendingBlockUpdates(boolean value) { wrapperContained.pendingBlockUpdates = value; }
// public it.unimi.dsi.fastutil.shorts.ShortSet[] blockUpdatesBySection() { return wrapperContained.blockUpdatesBySection; }
// public void blockUpdatesBySection(it.unimi.dsi.fastutil.shorts.ShortSet[] value) { wrapperContained.blockUpdatesBySection = value; }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture levelIncreaseFuture() { return wrapperContained.levelIncreaseFuture; }
// public void levelIncreaseFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.levelIncreaseFuture = value; }
// public java.util.concurrent.CompletableFuture postProcessingFuture() { return wrapperContained.postProcessingFuture; }
// public void postProcessingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.postProcessingFuture = value; }
// public java.util.concurrent.CompletableFuture savingFuture() { return wrapperContained.savingFuture; }
// public void savingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.savingFuture = value; }
// public ChunkHolder(yarnwrap.util.math.ChunkPos pos,int level,yarnwrap.world.HeightLimitView world,yarnwrap.world.chunk.light.LightingProvider lightingProvider,Object levelUpdateListener,Object playersWatchingChunkProvider) { this.wrapperContained = new net.minecraft.server.world.ChunkHolder(pos.wrapperContained,level,world.wrapperContained,lightingProvider.wrapperContained,levelUpdateListener,playersWatchingChunkProvider); }
// public void sendPacketToPlayers(java.util.List players,yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacketToPlayers(players,packet.wrapperContained); }
// public void method_13996(yarnwrap.network.packet.Packet player) { wrapperContained.method_13996(player.wrapperContained); }
public java.util.concurrent.CompletableFuture getSavingFuture() { return wrapperContained.getSavingFuture(); }
public void markForBlockUpdate(yarnwrap.util.math.BlockPos pos) { wrapperContained.markForBlockUpdate(pos.wrapperContained); }
public java.util.concurrent.CompletableFuture getEntityTickingFuture() { return wrapperContained.getEntityTickingFuture(); }
public void flushUpdates(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.flushUpdates(chunk.wrapperContained); }
// public void updateFutures(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.Executor executor) { wrapperContained.updateFutures(chunkLoadingManager.wrapperContained,executor); }
// public void sendBlockEntityUpdatePacket(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendBlockEntityUpdatePacket(players,world.wrapperContained,pos.wrapperContained); }
public void markForLightUpdate(yarnwrap.world.LightType lightType,int y) { wrapperContained.markForLightUpdate(lightType.wrapperContained,y); }
public void setLevel(int level) { wrapperContained.setLevel(level); }
public yarnwrap.world.chunk.WorldChunk getWorldChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWorldChunk()); }
public java.util.concurrent.CompletableFuture getTickingFuture() { return wrapperContained.getTickingFuture(); }
// public void setCompletedLevel(int level) { wrapperContained.setCompletedLevel(level); }
public boolean isAccessible() { return wrapperContained.isAccessible(); }
public void updateAccessibleStatus() { wrapperContained.updateAccessibleStatus(); }
public java.util.concurrent.CompletableFuture getAccessibleFuture() { return wrapperContained.getAccessibleFuture(); }
// public void tryUpdateBlockEntityAt(java.util.List players,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.tryUpdateBlockEntityAt(players,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void method_30312(java.util.List pos,yarnwrap.world.World state) { wrapperContained.method_30312(pos,state.wrapperContained); }
// public void decreaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.decreaseLevel(chunkLoadingManager.wrapperContained,target.wrapperContained); }
// public void increaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.CompletableFuture chunkFuture,java.util.concurrent.Executor executor,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.increaseLevel(chunkLoadingManager.wrapperContained,chunkFuture,executor,target.wrapperContained); }
// public void method_31410(java.util.concurrent.CompletableFuture chunk) { wrapperContained.method_31410(chunk); }
// public java.lang.Object method_39966(java.lang.Object thenResult) { return wrapperContained.method_39966(thenResult); }
// public void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture) { wrapperContained.combineSavingFuture(savingFuture); }
public void combinePostProcessingFuture(java.util.concurrent.CompletableFuture postProcessingFuture) { wrapperContained.combinePostProcessingFuture(postProcessingFuture); }
public java.util.concurrent.CompletableFuture getPostProcessingFuture() { return wrapperContained.getPostProcessingFuture(); }
public yarnwrap.world.chunk.WorldChunk getPostProcessedChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getPostProcessedChunk()); }
// public void method_57117(java.util.concurrent.CompletableFuture optionalChunk) { wrapperContained.method_57117(optionalChunk); }
public boolean isSavable() { return wrapperContained.isSavable(); }

}