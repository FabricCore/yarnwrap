package yarnwrap.util.profiling.jfr.sample;
public class ThreadAllocationStatisticsSample { public net.minecraft.util.profiling.jfr.sample.ThreadAllocationStatisticsSample wrapperContained; public ThreadAllocationStatisticsSample(net.minecraft.util.profiling.jfr.sample.ThreadAllocationStatisticsSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant time() { return wrapperContained.time; }
// public java.lang.String threadName() { return wrapperContained.threadName; }
// public long allocated() { return wrapperContained.allocated; }
// public java.lang.String UNKNOWN() { return wrapperContained.UNKNOWN; }
// public java.time.Instant time() { return wrapperContained.time(); }
// public java.lang.String threadName() { return wrapperContained.threadName(); }
// public long allocated() { return wrapperContained.allocated(); }
public Object toAllocationMap(java.util.List samples) { return wrapperContained.toAllocationMap(samples); }
public yarnwrap.util.profiling.jfr.sample.ThreadAllocationStatisticsSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ThreadAllocationStatisticsSample(wrapperContained.fromEvent(event)); }

}