package yarnwrap.util.profiling.jfr;
public class JfrProfile { public net.minecraft.util.profiling.jfr.JfrProfile wrapperContained; public JfrProfile(net.minecraft.util.profiling.jfr.JfrProfile wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object threadAllocationMap() { return wrapperContained.threadAllocationMap; }
// // public void threadAllocationMap(Object value) { wrapperContained.threadAllocationMap = value; }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetReadStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetReadStatistics); }
// public void packetReadStatistics(yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics value) { wrapperContained.packetReadStatistics = value.wrapperContained; }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetSentStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetSentStatistics); }
// public void packetSentStatistics(yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics value) { wrapperContained.packetSentStatistics = value.wrapperContained; }
// public Object fileWriteStatistics() { return wrapperContained.fileWriteStatistics; }
// // public void fileWriteStatistics(Object value) { wrapperContained.fileWriteStatistics = value; }
// public Object fileReadStatistics() { return wrapperContained.fileReadStatistics; }
// // public void fileReadStatistics(Object value) { wrapperContained.fileReadStatistics = value; }
// public java.util.List chunkGenerationSamples() { return wrapperContained.chunkGenerationSamples; }
// public void chunkGenerationSamples(java.util.List value) { wrapperContained.chunkGenerationSamples = value; }
// public java.time.Instant startTime() { return wrapperContained.startTime; }
// public void startTime(java.time.Instant value) { wrapperContained.startTime = value; }
// public java.time.Instant endTime() { return wrapperContained.endTime; }
// public void endTime(java.time.Instant value) { wrapperContained.endTime = value; }
// public java.time.Duration duration() { return wrapperContained.duration; }
// public void duration(java.time.Duration value) { wrapperContained.duration = value; }
// public java.time.Duration worldGenDuration() { return wrapperContained.worldGenDuration; }
// public void worldGenDuration(java.time.Duration value) { wrapperContained.worldGenDuration = value; }
// public java.util.List serverTickTimeSamples() { return wrapperContained.serverTickTimeSamples; }
// public void serverTickTimeSamples(java.util.List value) { wrapperContained.serverTickTimeSamples = value; }
// public java.util.List cpuLoadSamples() { return wrapperContained.cpuLoadSamples; }
// public void cpuLoadSamples(java.util.List value) { wrapperContained.cpuLoadSamples = value; }
// public Object gcHeapSummaryStatistics() { return wrapperContained.gcHeapSummaryStatistics; }
// // public void gcHeapSummaryStatistics(Object value) { wrapperContained.gcHeapSummaryStatistics = value; }
// public Object threadAllocationMap() { return wrapperContained.threadAllocationMap(); }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetReadStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetReadStatistics()); }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetSentStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetSentStatistics()); }
// public Object fileWriteStatistics() { return wrapperContained.fileWriteStatistics(); }
// public Object fileReadStatistics() { return wrapperContained.fileReadStatistics(); }
// public java.util.List chunkGenerationSamples() { return wrapperContained.chunkGenerationSamples(); }
// public java.time.Instant startTime() { return wrapperContained.startTime(); }
// public java.time.Instant endTime() { return wrapperContained.endTime(); }
// public java.time.Duration duration() { return wrapperContained.duration(); }
// public java.time.Duration worldGenDuration() { return wrapperContained.worldGenDuration(); }
// public java.util.List serverTickTimeSamples() { return wrapperContained.serverTickTimeSamples(); }
// public java.util.List cpuLoadSamples() { return wrapperContained.cpuLoadSamples(); }
// public Object gcHeapSummaryStatistics() { return wrapperContained.gcHeapSummaryStatistics(); }
public java.util.List getChunkGenerationSampleStatistics() { return wrapperContained.getChunkGenerationSampleStatistics(); }
public java.lang.String toJson() { return wrapperContained.toJson(); }

}