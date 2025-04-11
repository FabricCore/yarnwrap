package yarnwrap.util.profiling.jfr.sample;
public class GcHeapSummarySample { public net.minecraft.util.profiling.jfr.sample.GcHeapSummarySample wrapperContained; public GcHeapSummarySample(net.minecraft.util.profiling.jfr.sample.GcHeapSummarySample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant time() { return wrapperContained.time; }
// public void time(java.time.Instant value) { wrapperContained.time = value; }
// public long heapUsed() { return wrapperContained.heapUsed; }
// public void heapUsed(long value) { wrapperContained.heapUsed = value; }
// public Object summaryType() { return wrapperContained.summaryType; }
// // public void summaryType(Object value) { wrapperContained.summaryType = value; }
// public java.time.Instant time() { return wrapperContained.time(); }
// public long heapUsed() { return wrapperContained.heapUsed(); }
// public Object summaryType() { return wrapperContained.summaryType(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public Object toStatistics(java.time.Duration duration,java.util.List samples,java.time.Duration gcDuration,int count) { return wrapperContained.toStatistics(duration,samples,gcDuration,count); }
// public double getAllocatedBytesPerSecond(java.util.List samples) { return wrapperContained.getAllocatedBytesPerSecond(samples); }
public yarnwrap.util.profiling.jfr.sample.GcHeapSummarySample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.GcHeapSummarySample(wrapperContained.fromEvent(event)); }

}