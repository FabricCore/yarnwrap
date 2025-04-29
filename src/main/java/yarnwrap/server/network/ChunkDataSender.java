package yarnwrap.server.network;
public class ChunkDataSender { public net.minecraft.server.network.ChunkDataSender wrapperContained; public ChunkDataSender(net.minecraft.server.network.ChunkDataSender wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ChunkDataSender.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ChunkDataSender.LOGGER = value; }

// public it.unimi.dsi.fastutil.longs.LongSet chunks() { return wrapperContained.chunks; }
// public void chunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.chunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet chunks() { return net.minecraft.server.network.ChunkDataSender.chunks; }
// public static void chunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.network.ChunkDataSender.chunks = value; }

// public boolean local() { return wrapperContained.local; }
// public void local(boolean value) { wrapperContained.local = value; }
// public static boolean local() { return net.minecraft.server.network.ChunkDataSender.local; }
// public static void local(boolean value, ) { net.minecraft.server.network.ChunkDataSender.local = value; }

// public float desiredBatchSize() { return wrapperContained.desiredBatchSize; }
// public void desiredBatchSize(float value) { wrapperContained.desiredBatchSize = value; }
// public static float desiredBatchSize() { return net.minecraft.server.network.ChunkDataSender.desiredBatchSize; }
// public static void desiredBatchSize(float value, ) { net.minecraft.server.network.ChunkDataSender.desiredBatchSize = value; }

// public float pending() { return wrapperContained.pending; }
// public void pending(float value) { wrapperContained.pending = value; }
// public static float pending() { return net.minecraft.server.network.ChunkDataSender.pending; }
// public static void pending(float value, ) { net.minecraft.server.network.ChunkDataSender.pending = value; }

// public int unacknowledgedBatches() { return wrapperContained.unacknowledgedBatches; }
// public void unacknowledgedBatches(int value) { wrapperContained.unacknowledgedBatches = value; }
// public static int unacknowledgedBatches() { return net.minecraft.server.network.ChunkDataSender.unacknowledgedBatches; }
// public static void unacknowledgedBatches(int value, ) { net.minecraft.server.network.ChunkDataSender.unacknowledgedBatches = value; }

// public int maxUnacknowledgedBatches() { return wrapperContained.maxUnacknowledgedBatches; }
// public void maxUnacknowledgedBatches(int value) { wrapperContained.maxUnacknowledgedBatches = value; }
// public static int maxUnacknowledgedBatches() { return net.minecraft.server.network.ChunkDataSender.maxUnacknowledgedBatches; }
// public static void maxUnacknowledgedBatches(int value, ) { net.minecraft.server.network.ChunkDataSender.maxUnacknowledgedBatches = value; }

public ChunkDataSender(boolean local) { this.wrapperContained = new net.minecraft.server.network.ChunkDataSender(local); }
public void onAcknowledgeChunks(float desiredBatchSize) { wrapperContained.onAcknowledgeChunks(desiredBatchSize); }
// public static void onAcknowledgeChunks(float desiredBatchSize, ) { net.minecraft.server.network.ChunkDataSender.onAcknowledgeChunks(desiredBatchSize); }
public boolean isInNextBatch(long chunkPos) { return wrapperContained.isInNextBatch(chunkPos); }
// public static boolean isInNextBatch(long chunkPos, ) { return net.minecraft.server.network.ChunkDataSender.isInNextBatch(chunkPos); }
// public java.util.List makeBatch(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.util.math.ChunkPos playerPos) { return wrapperContained.makeBatch(chunkLoadingManager.wrapperContained,playerPos.wrapperContained); }
// public static java.util.List makeBatch(yarnwrap.server.world.ServerChunkLoadingManager chunkLoadingManager,yarnwrap.util.math.ChunkPos playerPos, ) { return net.minecraft.server.network.ChunkDataSender.makeBatch(chunkLoadingManager.wrapperContained,playerPos.wrapperContained); }
public void sendChunkBatches(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendChunkBatches(player.wrapperContained); }
// public static void sendChunkBatches(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.ChunkDataSender.sendChunkBatches(player.wrapperContained); }
public void unload(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos) { wrapperContained.unload(player.wrapperContained,pos.wrapperContained); }
// public static void unload(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.network.ChunkDataSender.unload(player.wrapperContained,pos.wrapperContained); }
// public void sendChunkData(yarnwrap.server.network.ServerPlayNetworkHandler handler,yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.sendChunkData(handler.wrapperContained,world.wrapperContained,chunk.wrapperContained); }
// public static void sendChunkData(yarnwrap.server.network.ServerPlayNetworkHandler handler,yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.network.ChunkDataSender.sendChunkData(handler.wrapperContained,world.wrapperContained,chunk.wrapperContained); }
// public int method_52389(yarnwrap.util.math.ChunkPos chunk) { return wrapperContained.method_52389(chunk.wrapperContained); }
// public static int method_52389(yarnwrap.util.math.ChunkPos chunk, ) { return net.minecraft.server.network.ChunkDataSender.method_52389(chunk.wrapperContained); }
public void add(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.add(chunk.wrapperContained); }
// public static void add(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.network.ChunkDataSender.add(chunk.wrapperContained); }

}