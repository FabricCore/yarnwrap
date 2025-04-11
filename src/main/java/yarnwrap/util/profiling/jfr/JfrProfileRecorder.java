package yarnwrap.util.profiling.jfr;
public class JfrProfileRecorder { public net.minecraft.util.profiling.jfr.JfrProfileRecorder wrapperContained; public JfrProfileRecorder(net.minecraft.util.profiling.jfr.JfrProfileRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant startTime() { return wrapperContained.startTime; }
// public void startTime(java.time.Instant value) { wrapperContained.startTime = value; }
// public java.time.Instant endTime() { return wrapperContained.endTime; }
// public void endTime(java.time.Instant value) { wrapperContained.endTime = value; }
// public java.util.List chunkGenerationSamples() { return wrapperContained.chunkGenerationSamples; }
// public void chunkGenerationSamples(java.util.List value) { wrapperContained.chunkGenerationSamples = value; }
// public java.util.List cpuLoadSamples() { return wrapperContained.cpuLoadSamples; }
// public void cpuLoadSamples(java.util.List value) { wrapperContained.cpuLoadSamples = value; }
// public java.util.Map receivedPacketsToCounter() { return wrapperContained.receivedPacketsToCounter; }
// public void receivedPacketsToCounter(java.util.Map value) { wrapperContained.receivedPacketsToCounter = value; }
// public java.util.Map sentPacketsToCounter() { return wrapperContained.sentPacketsToCounter; }
// public void sentPacketsToCounter(java.util.Map value) { wrapperContained.sentPacketsToCounter = value; }
// public java.util.List fileWriteSamples() { return wrapperContained.fileWriteSamples; }
// public void fileWriteSamples(java.util.List value) { wrapperContained.fileWriteSamples = value; }
// public java.util.List fileReadSamples() { return wrapperContained.fileReadSamples; }
// public void fileReadSamples(java.util.List value) { wrapperContained.fileReadSamples = value; }
// public int gcCount() { return wrapperContained.gcCount; }
// public void gcCount(int value) { wrapperContained.gcCount = value; }
// public java.time.Duration gcDuration() { return wrapperContained.gcDuration; }
// public void gcDuration(java.time.Duration value) { wrapperContained.gcDuration = value; }
// public java.util.List gcHeapSummarySamples() { return wrapperContained.gcHeapSummarySamples; }
// public void gcHeapSummarySamples(java.util.List value) { wrapperContained.gcHeapSummarySamples = value; }
// public java.util.List threadAllocationStatisticsSamples() { return wrapperContained.threadAllocationStatisticsSamples; }
// public void threadAllocationStatisticsSamples(java.util.List value) { wrapperContained.threadAllocationStatisticsSamples = value; }
// public java.util.List serverTickTimeSamples() { return wrapperContained.serverTickTimeSamples; }
// public void serverTickTimeSamples(java.util.List value) { wrapperContained.serverTickTimeSamples = value; }
// public java.time.Duration worldGenDuration() { return wrapperContained.worldGenDuration; }
// public void worldGenDuration(java.time.Duration value) { wrapperContained.worldGenDuration = value; }
// public java.util.Map chunkRegionReadCounter() { return wrapperContained.chunkRegionReadCounter; }
// public void chunkRegionReadCounter(java.util.Map value) { wrapperContained.chunkRegionReadCounter = value; }
// public java.util.Map chunkRegionWriteCounter() { return wrapperContained.chunkRegionWriteCounter; }
// public void chunkRegionWriteCounter(java.util.Map value) { wrapperContained.chunkRegionWriteCounter = value; }
// public JfrProfileRecorder(java.util.stream.Stream events) { this.wrapperContained = new net.minecraft.util.profiling.jfr.JfrProfileRecorder(events); }
// public yarnwrap.util.profiling.jfr.JfrProfile createProfile() { return new yarnwrap.util.profiling.jfr.JfrProfile(wrapperContained.createProfile()); }
public yarnwrap.util.profiling.jfr.JfrProfile readProfile(java.nio.file.Path path) { return new yarnwrap.util.profiling.jfr.JfrProfile(wrapperContained.readProfile(path)); }
// public void handleEvents(java.util.stream.Stream events) { wrapperContained.handleEvents(events); }
// public void method_38003(jdk.jfr.consumer.RecordedEvent event) { wrapperContained.method_38003(event); }
// public void addFileIoSample(jdk.jfr.consumer.RecordedEvent event,java.util.List samples,java.lang.String bytesKey) { wrapperContained.addFileIoSample(event,samples,bytesKey); }
// public Object method_39432(yarnwrap.util.profiling.jfr.sample.PacketSample packet) { return wrapperContained.method_39432(packet.wrapperContained); }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics createNetworkIoStatistics(java.time.Duration duration,java.util.Map packetsToCounter) { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.createNetworkIoStatistics(duration,packetsToCounter)); }
// public com.mojang.datafixers.util.Pair method_39434(Object entry) { return wrapperContained.method_39434(entry); }
// public void addPacket(jdk.jfr.consumer.RecordedEvent event,int bytes,java.util.Map packetsToCounter) { wrapperContained.addPacket(event,bytes,packetsToCounter); }
// public Object method_56981(yarnwrap.util.profiling.jfr.sample.ChunkRegionSample chunk) { return wrapperContained.method_56981(chunk.wrapperContained); }
// public void addChunkRegionEvent(jdk.jfr.consumer.RecordedEvent event,int bytes,java.util.Map chunksToCounter) { wrapperContained.addChunkRegionEvent(event,bytes,chunksToCounter); }

}