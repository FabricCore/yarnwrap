package yarnwrap.server.network;
public class ChunkDataSender { public net.minecraft.server.network.ChunkDataSender wrapperContained; public ChunkDataSender(net.minecraft.server.network.ChunkDataSender wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.longs.LongSet chunks() { return wrapperContained.chunks; }
// public boolean local() { return wrapperContained.local; }
// public float desiredBatchSize() { return wrapperContained.desiredBatchSize; }
// public float pending() { return wrapperContained.pending; }
// public int unacknowledgedBatches() { return wrapperContained.unacknowledgedBatches; }
// public int maxUnacknowledgedBatches() { return wrapperContained.maxUnacknowledgedBatches; }
public void onAcknowledgeChunks(float desiredBatchSize) { wrapperContained.onAcknowledgeChunks(desiredBatchSize); }
public boolean isInNextBatch(long chunkPos) { return wrapperContained.isInNextBatch(chunkPos); }
// public java.util.List makeBatch(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.util.math.ChunkPos playerPos) { return wrapperContained.makeBatch(chunkLoadingManager.wrapperContained,playerPos.wrapperContained); }
public void sendChunkBatches(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendChunkBatches(player.wrapperContained); }
public void unload(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.unload(player.wrapperContained,pos.wrapperContained); }
// public void sendChunkData(yarnwrap.server.network.ServerPlayNetworkHandler handler,yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.sendChunkData(handler.wrapperContained,world.wrapperContained,chunk.wrapperContained); }
public void add(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.add(chunk.wrapperContained); }

}