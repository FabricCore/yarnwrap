package yarnwrap.client.network;
public class ChunkBatchSizeCalculator { public net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained; public ChunkBatchSizeCalculator(net.minecraft.client.network.ChunkBatchSizeCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public double averageNanosPerChunk() { return wrapperContained.averageNanosPerChunk; }
// public void averageNanosPerChunk(double value) { wrapperContained.averageNanosPerChunk = value; }
// public static double averageNanosPerChunk() { return net.minecraft.client.network.ChunkBatchSizeCalculator.averageNanosPerChunk; }
// public static void averageNanosPerChunk(double value, ) { net.minecraft.client.network.ChunkBatchSizeCalculator.averageNanosPerChunk = value; }

// public int sampleSize() { return wrapperContained.sampleSize; }
// public void sampleSize(int value) { wrapperContained.sampleSize = value; }
// public static int sampleSize() { return net.minecraft.client.network.ChunkBatchSizeCalculator.sampleSize; }
// public static void sampleSize(int value, ) { net.minecraft.client.network.ChunkBatchSizeCalculator.sampleSize = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.client.network.ChunkBatchSizeCalculator.startTime; }
// public static void startTime(long value, ) { net.minecraft.client.network.ChunkBatchSizeCalculator.startTime = value; }

public void onStartChunkSend() { wrapperContained.onStartChunkSend(); }
// public static void onStartChunkSend() { net.minecraft.client.network.ChunkBatchSizeCalculator.onStartChunkSend(); }
public void onChunkSent(int batchSize) { wrapperContained.onChunkSent(batchSize); }
// public static void onChunkSent(int batchSize, ) { net.minecraft.client.network.ChunkBatchSizeCalculator.onChunkSent(batchSize); }
public float getDesiredChunksPerTick() { return wrapperContained.getDesiredChunksPerTick(); }
// public static float getDesiredChunksPerTick() { return net.minecraft.client.network.ChunkBatchSizeCalculator.getDesiredChunksPerTick(); }

}