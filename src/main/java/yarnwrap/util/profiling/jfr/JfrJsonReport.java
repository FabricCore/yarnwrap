package yarnwrap.util.profiling.jfr;
public class JfrJsonReport { public net.minecraft.util.profiling.jfr.JfrJsonReport wrapperContained; public JfrJsonReport(net.minecraft.util.profiling.jfr.JfrJsonReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public void gson(com.google.gson.Gson value) { wrapperContained.gson = value; }
// public java.lang.String BYTES_PER_SECOND() { return wrapperContained.BYTES_PER_SECOND; }
// public void BYTES_PER_SECOND(java.lang.String value) { wrapperContained.BYTES_PER_SECOND = value; }
// public java.lang.String COUNT() { return wrapperContained.COUNT; }
// public void COUNT(java.lang.String value) { wrapperContained.COUNT = value; }
// public java.lang.String DURATION_NANOS_TOTAL() { return wrapperContained.DURATION_NANOS_TOTAL; }
// public void DURATION_NANOS_TOTAL(java.lang.String value) { wrapperContained.DURATION_NANOS_TOTAL = value; }
// public java.lang.String TOTAL_BYTES() { return wrapperContained.TOTAL_BYTES; }
// public void TOTAL_BYTES(java.lang.String value) { wrapperContained.TOTAL_BYTES = value; }
// public java.lang.String COUNT_PER_SECOND() { return wrapperContained.COUNT_PER_SECOND; }
// public void COUNT_PER_SECOND(java.lang.String value) { wrapperContained.COUNT_PER_SECOND = value; }
public java.lang.String toString(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.toString(profile.wrapperContained); }
// public com.google.gson.JsonElement method_38011(yarnwrap.util.profiling.jfr.sample.ChunkGenerationSample sample) { return wrapperContained.method_38011(sample.wrapperContained); }
// public com.google.gson.JsonElement collectFileIoSection(Object statistics) { return wrapperContained.collectFileIoSection(statistics); }
// public com.google.gson.JsonElement collectHeapSection(Object statistics) { return wrapperContained.collectHeapSection(statistics); }
// public com.google.gson.JsonElement collectPacketSection(yarnwrap.util.profiling.jfr.sample.NetworkIoStatistics statistics,java.util.function.BiConsumer callback) { return wrapperContained.collectPacketSection(statistics.wrapperContained,callback); }
// public com.google.gson.JsonElement collectThreadAllocationSection(Object statistics) { return wrapperContained.collectThreadAllocationSection(statistics); }
// public void method_38016(com.google.gson.JsonArray topContributor) { wrapperContained.method_38016(topContributor); }
// public void method_38017(com.google.gson.JsonArray threadName,java.lang.String allocation) { wrapperContained.method_38017(threadName,allocation); }
// public void method_38018(com.google.gson.JsonObject json) { wrapperContained.method_38018(json); }
// public void method_38019(com.google.gson.JsonObject json) { wrapperContained.method_38019(json); }
// public void method_38020(com.google.gson.JsonObject quantile,java.lang.Integer value) { wrapperContained.method_38020(quantile,value); }
// public double method_38021(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_38021(pair); }
// public void method_38022(java.lang.String json) { wrapperContained.method_38022(json); }
// public com.google.gson.JsonElement collectChunkGenSection(java.util.List statistics) { return wrapperContained.collectChunkGenSection(statistics); }
// public com.google.gson.JsonObject method_38024(java.util.List samplesx,java.util.function.ToDoubleFunction valueGetter) { return wrapperContained.method_38024(samplesx,valueGetter); }
// public com.google.gson.JsonElement collectFileIoSection(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.collectFileIoSection(profile.wrapperContained); }
// public void method_38026(com.google.gson.JsonArray pair) { wrapperContained.method_38026(pair); }
// public void method_38027(com.google.gson.JsonObject quantile,java.lang.Integer value) { wrapperContained.method_38027(quantile,value); }
// public com.google.gson.JsonElement collectServerTickSection(java.util.List samples) { return wrapperContained.collectServerTickSection(samples); }
// public com.google.gson.JsonElement collectNetworkSection(yarnwrap.util.profiling.jfr.JfrProfile profile) { return wrapperContained.collectNetworkSection(profile.wrapperContained); }
// public com.google.gson.JsonElement collectCpuPercentSection(java.util.List samples) { return wrapperContained.collectCpuPercentSection(samples); }
// public double method_38664(yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample sample) { return wrapperContained.method_38664(sample.wrapperContained); }
// public void addChunkData(yarnwrap.util.profiling.jfr.sample.ChunkRegionSample chunk,com.google.gson.JsonObject json) { wrapperContained.addChunkData(chunk.wrapperContained,json); }
// public void addPacketData(yarnwrap.util.profiling.jfr.sample.PacketSample packet,com.google.gson.JsonObject json) { wrapperContained.addPacketData(packet.wrapperContained,json); }

}