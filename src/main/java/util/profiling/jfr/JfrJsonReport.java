package yarnwrap.util.profiling.jfr;
public class JfrJsonReport { public net.minecraft.util.profiling.jfr.JfrJsonReport wrapperContained; public JfrJsonReport(net.minecraft.util.profiling.jfr.JfrJsonReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public java.lang.String BYTES_PER_SECOND() { return wrapperContained.BYTES_PER_SECOND; }
// public java.lang.String COUNT() { return wrapperContained.COUNT; }
// public java.lang.String DURATION_NANOS_TOTAL() { return wrapperContained.DURATION_NANOS_TOTAL; }
// public java.lang.String TOTAL_BYTES() { return wrapperContained.TOTAL_BYTES; }
// public java.lang.String COUNT_PER_SECOND() { return wrapperContained.COUNT_PER_SECOND; }
public java.lang.String toString(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.toString(profile.wrapperContained); }
// public com.google.gson.JsonElement collectFileIoSection(Object statistics) { return wrapperContained.collectFileIoSection(statistics); }
// public com.google.gson.JsonElement collectHeapSection(Object statistics) { return wrapperContained.collectHeapSection(statistics); }
// public com.google.gson.JsonElement collectPacketSection(yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics statistics,java.util.function.BiConsumer callback) { return wrapperContained.collectPacketSection(statistics.wrapperContained,callback); }
// public com.google.gson.JsonElement collectThreadAllocationSection(Object statistics) { return wrapperContained.collectThreadAllocationSection(statistics); }
// public com.google.gson.JsonElement collectChunkGenSection(java.util.List statistics) { return wrapperContained.collectChunkGenSection(statistics); }
// public com.google.gson.JsonElement collectFileIoSection(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.collectFileIoSection(profile.wrapperContained); }
// public com.google.gson.JsonElement collectServerTickSection(java.util.List samples) { return wrapperContained.collectServerTickSection(samples); }
// public com.google.gson.JsonElement collectNetworkSection(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.collectNetworkSection(profile.wrapperContained); }
// public com.google.gson.JsonElement collectCpuPercentSection(java.util.List samples) { return wrapperContained.collectCpuPercentSection(samples); }
// public void addChunkData(yarnwrap.util.profiling.jfr.sample.ChunkRegionSample chunk,com.google.gson.JsonObject json) { wrapperContained.addChunkData(chunk.wrapperContained,json); }
// public void addPacketData(yarnwrap.util.profiling.jfr.sample.PacketSample packet,com.google.gson.JsonObject json) { wrapperContained.addPacketData(packet.wrapperContained,json); }

}