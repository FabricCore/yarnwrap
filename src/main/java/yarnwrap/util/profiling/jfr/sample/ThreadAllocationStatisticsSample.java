package yarnwrap.util.profiling.jfr.sample;
public class ThreadAllocationStatisticsSample { public net.minecraft.util.profiling.jfr.sample.ThreadAllocationStatisticsSample wrapperContained; public ThreadAllocationStatisticsSample(net.minecraft.util.profiling.jfr.sample.ThreadAllocationStatisticsSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant time() { return wrapperContained.time; }
// public void time(java.time.Instant value) { wrapperContained.time = value; }
// public java.lang.String threadName() { return wrapperContained.threadName; }
// public void threadName(java.lang.String value) { wrapperContained.threadName = value; }
// public long allocated() { return wrapperContained.allocated; }
// public void allocated(long value) { wrapperContained.allocated = value; }
// public java.lang.String UNKNOWN() { return wrapperContained.UNKNOWN; }
// public void UNKNOWN(java.lang.String value) { wrapperContained.UNKNOWN = value; }
// public java.time.Instant time() { return wrapperContained.time(); }
// public java.lang.String threadName() { return wrapperContained.threadName(); }
// public long allocated() { return wrapperContained.allocated(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public java.lang.String method_38054(yarnwrap.util.profiling.jfr.sample.ThreadAllocationStatisticsSample sample) { return wrapperContained.method_38054(sample.wrapperContained); }
public Object toAllocationMap(java.util.List samples) { return wrapperContained.toAllocationMap(samples); }
// public void method_38056(java.util.Map threadName,java.lang.String groupedSamples) { wrapperContained.method_38056(threadName,groupedSamples); }
public yarnwrap.util.profiling.jfr.sample.ThreadAllocationStatisticsSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ThreadAllocationStatisticsSample(wrapperContained.fromEvent(event)); }

}