package yarnwrap.client.network;
public class ChunkBatchSizeCalculator { public net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained; public ChunkBatchSizeCalculator(net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public double averageNanosPerChunk() { return wrapperContained.averageNanosPerChunk; }
// public int sampleSize() { return wrapperContained.sampleSize; }
// public long startTime() { return wrapperContained.startTime; }
public void onStartChunkSend() { wrapperContained.onStartChunkSend(); }
public void onChunkSent(int batchSize) { wrapperContained.onChunkSent(batchSize); }
public float getDesiredChunksPerTick() { return wrapperContained.getDesiredChunksPerTick(); }

}