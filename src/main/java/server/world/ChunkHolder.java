package yarnwrap.server.world;
public class ChunkHolder { public net.minecraft.server.world.ChunkHolder wrapperContained; public ChunkHolder(net.minecraft.server.world.ChunkHolder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int level() { return wrapperContained.level; }
// public yarnwrap.world.chunk.light.LightingProvider lightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.lightingProvider); }
// public java.util.concurrent.CompletableFuture entityTickingFuture() { return wrapperContained.entityTickingFuture; }
// public java.util.BitSet skyLightUpdateBits() { return wrapperContained.skyLightUpdateBits; }
// public java.util.BitSet blockLightUpdateBits() { return wrapperContained.blockLightUpdateBits; }
public yarnwrap.server.world.OptionalChunk UNLOADED_WORLD_CHUNK() { return new yarnwrap.server.world.OptionalChunk(wrapperContained.UNLOADED_WORLD_CHUNK); }
// public java.util.concurrent.CompletableFuture UNLOADED_WORLD_CHUNK_FUTURE() { return wrapperContained.UNLOADED_WORLD_CHUNK_FUTURE; }
// public java.util.concurrent.CompletableFuture accessibleFuture() { return wrapperContained.accessibleFuture; }
// public int lastTickLevel() { return wrapperContained.lastTickLevel; }
// public int completedLevel() { return wrapperContained.completedLevel; }
// public Object levelUpdateListener() { return wrapperContained.levelUpdateListener; }
// public Object playersWatchingChunkProvider() { return wrapperContained.playersWatchingChunkProvider; }
// public boolean accessible() { return wrapperContained.accessible; }
// public java.util.concurrent.CompletableFuture tickingFuture() { return wrapperContained.tickingFuture; }
// public boolean pendingBlockUpdates() { return wrapperContained.pendingBlockUpdates; }
// public it.unimi.dsi.fastutil.shorts.ShortSet[] blockUpdatesBySection() { return wrapperContained.blockUpdatesBySection; }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public java.util.concurrent.CompletableFuture levelIncreaseFuture() { return wrapperContained.levelIncreaseFuture; }
// public java.util.concurrent.CompletableFuture postProcessingFuture() { return wrapperContained.postProcessingFuture; }
// public java.util.concurrent.CompletableFuture savingFuture() { return wrapperContained.savingFuture; }
// public void sendPacketToPlayers(java.util.List players,yarnwrap.network.packet.Packet packet) { wrapperContained.sendPacketToPlayers(players,packet.wrapperContained); }
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
// public void decreaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.decreaseLevel(chunkLoadingManager.wrapperContained,target.wrapperContained); }
// public void increaseLevel(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,java.util.concurrent.CompletableFuture chunkFuture,java.util.concurrent.Executor executor,yarnwrap.server.world.ChunkLevelType target) { wrapperContained.increaseLevel(chunkLoadingManager.wrapperContained,chunkFuture,executor,target.wrapperContained); }
// public void combineSavingFuture(java.util.concurrent.CompletableFuture savingFuture) { wrapperContained.combineSavingFuture(savingFuture); }
public void combinePostProcessingFuture(java.util.concurrent.CompletableFuture postProcessingFuture) { wrapperContained.combinePostProcessingFuture(postProcessingFuture); }
public java.util.concurrent.CompletableFuture getPostProcessingFuture() { return wrapperContained.getPostProcessingFuture(); }
public yarnwrap.world.chunk.WorldChunk getPostProcessedChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getPostProcessedChunk()); }
public boolean isSavable() { return wrapperContained.isSavable(); }

}