package yarnwrap.client.session.telemetry;
public class PerformanceMetricsEvent { public net.minecraft.client.session.telemetry.PerformanceMetricsEvent wrapperContained; public PerformanceMetricsEvent(net.minecraft.client.session.telemetry.PerformanceMetricsEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MAX_MEMORY_KB() { return wrapperContained.MAX_MEMORY_KB; }
// public it.unimi.dsi.fastutil.longs.LongList frameRateSamples() { return wrapperContained.frameRateSamples; }
// public it.unimi.dsi.fastutil.longs.LongList renderTimeSamples() { return wrapperContained.renderTimeSamples; }
// public it.unimi.dsi.fastutil.longs.LongList usedMemorySamples() { return wrapperContained.usedMemorySamples; }
// public long toKilos(long bytes) { return wrapperContained.toKilos(bytes); }
// public void clearSamples() { wrapperContained.clearSamples(); }
// public void sampleUsedMemory() { wrapperContained.sampleUsedMemory(); }

}