package yarnwrap.util.profiling.jfr.sample;
public class ServerTickTimeSample { public net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample wrapperContained; public ServerTickTimeSample(net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant time() { return wrapperContained.time; }
// public void time(java.time.Instant value) { wrapperContained.time = value; }
// public java.time.Duration averageTickMs() { return wrapperContained.averageTickMs; }
// public void averageTickMs(java.time.Duration value) { wrapperContained.averageTickMs = value; }
// public java.time.Instant time() { return wrapperContained.time(); }
// public java.time.Duration averageTickMs() { return wrapperContained.averageTickMs(); }
public yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample(wrapperContained.fromEvent(event)); }

}