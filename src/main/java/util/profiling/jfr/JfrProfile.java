package yarnwrap.util.profiling.jfr;
public class JfrProfile { public net.minecraft.util.profiling.jfr.JfrProfile wrapperContained; public JfrProfile(net.minecraft.util.profiling.jfr.JfrProfile wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object threadAllocationMap() { return wrapperContained.threadAllocationMap; }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetReadStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetReadStatistics); }
// public yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics packetSentStatistics() { return new yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics(wrapperContained.packetSentStatistics); }
// public Object fileWriteStatistics() { return wrapperContained.fileWriteStatistics; }
// public Object fileReadStatistics() { return wrapperContained.fileReadStatistics; }
// public java.util.List chunkGenerationSamples() { return wrapperContained.chunkGenerationSamples; }
// public java.time.Instant startTime() { return wrapperContained.startTime; }
// public java.time.Instant endTime() { return wrapperContained.endTime; }
// public java.time.Duration duration() { return wrapperContained.duration; }
// public java.time.Duration worldGenDuration() { return wrapperContained.worldGenDuration; }
// public java.util.List serverTickTimeSamples() { return wrapperContained.serverTickTimeSamples; }
// public java.util.List cpuLoadSamples() { return wrapperContained.cpuLoadSamples; }
// public Object gcHeapSummaryStatistics() { return wrapperContained.gcHeapSummaryStatistics; }
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