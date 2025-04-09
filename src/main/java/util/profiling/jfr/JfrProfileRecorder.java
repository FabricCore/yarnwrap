package yarnwrap.util.profiling.jfr;
public class JfrProfileRecorder { public net.minecraft.util.profiling.jfr.JfrProfileRecorder wrapperContained; public JfrProfileRecorder(net.minecraft.util.profiling.jfr.JfrProfileRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant startTime() { return wrapperContained.startTime; }
// public java.time.Instant endTime() { return wrapperContained.endTime; }
// public java.util.List chunkGenerationSamples() { return wrapperContained.chunkGenerationSamples; }
// public java.util.List cpuLoadSamples() { return wrapperContained.cpuLoadSamples; }
// public java.util.Map receivedPacketsToCounter() { return wrapperContained.receivedPacketsToCounter; }
// public java.util.Map sentPacketsToCounter() { return wrapperContained.sentPacketsToCounter; }
// public java.util.List fileWriteSamples() { return wrapperContained.fileWriteSamples; }
// public java.util.List fileReadSamples() { return wrapperContained.fileReadSamples; }
// public int gcCount() { return wrapperContained.gcCount; }
// public java.time.Duration gcDuration() { return wrapperContained.gcDuration; }
// public java.util.List gcHeapSummarySamples() { return wrapperContained.gcHeapSummarySamples; }
// public java.util.List threadAllocationStatisticsSamples() { return wrapperContained.threadAllocationStatisticsSamples; }
// public java.util.List serverTickTimeSamples() { return wrapperContained.serverTickTimeSamples; }
// public java.time.Duration worldGenDuration() { return wrapperContained.worldGenDuration; }
// public java.util.Map chunkRegionReadCounter() { return wrapperContained.chunkRegionReadCounter; }
// public java.util.Map chunkRegionWriteCounter() { return wrapperContained.chunkRegionWriteCounter; }
// public yarnwrap.util.profiling.jfr.JfrProfile createProfile() { return new yarnwrap.util.profiling.jfr.JfrProfile(wrapperContained.createProfile()); }
public yarnwrap.util.profiling.jfr.JfrProfile readProfile(java.nio.file.Path path) { return new yarnwrap.util.profiling.jfr.JfrProfile(wrapperContained.readProfile(path)); }
// public void handleEvents(java.util.stream.Stream events) { wrapperContained.handleEvents(events); }
// public void addFileIoSample(jdk.jfr.consumer.RecordedEvent event,java.util.List samples,java.lang.String bytesKey) { wrapperContained.addFileIoSample(event,samples,bytesKey); }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics createNetworkIoStatistics(java.time.Duration duration,java.util.Map packetsToCounter) { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.createNetworkIoStatistics(duration,packetsToCounter)); }
// public void addPacket(jdk.jfr.consumer.RecordedEvent event,int bytes,java.util.Map packetsToCounter) { wrapperContained.addPacket(event,bytes,packetsToCounter); }
// public void addChunkRegionEvent(jdk.jfr.consumer.RecordedEvent event,int bytes,java.util.Map chunksToCounter) { wrapperContained.addChunkRegionEvent(event,bytes,chunksToCounter); }

}