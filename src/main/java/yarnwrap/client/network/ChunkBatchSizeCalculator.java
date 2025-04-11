package yarnwrap.client.network;
public class ChunkBatchSizeCalculator { public net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained; public ChunkBatchSizeCalculator(net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public double averageNanosPerChunk() { return wrapperContained.averageNanosPerChunk; }
// public void averageNanosPerChunk(double value) { wrapperContained.averageNanosPerChunk = value; }
// public int sampleSize() { return wrapperContained.sampleSize; }
// public void sampleSize(int value) { wrapperContained.sampleSize = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
public void onStartChunkSend() { wrapperContained.onStartChunkSend(); }
public void onChunkSent(int batchSize) { wrapperContained.onChunkSent(batchSize); }
public float getDesiredChunksPerTick() { return wrapperContained.getDesiredChunksPerTick(); }

}