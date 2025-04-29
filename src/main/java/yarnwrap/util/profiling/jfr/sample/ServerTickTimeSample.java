package yarnwrap.util.profiling.jfr.sample;
public class ServerTickTimeSample { public net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample wrapperContained; public ServerTickTimeSample(net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant time() { return wrapperContained.time; }
// public void time(java.time.Instant value) { wrapperContained.time = value; }
// public static java.time.Instant time() { return net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.time; }
// public static void time(java.time.Instant value, ) { net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.time = value; }

// public java.time.Duration averageTickMs() { return wrapperContained.averageTickMs; }
// public void averageTickMs(java.time.Duration value) { wrapperContained.averageTickMs = value; }
// public static java.time.Duration averageTickMs() { return net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.averageTickMs; }
// public static void averageTickMs(java.time.Duration value, ) { net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.averageTickMs = value; }

// public java.time.Instant time() { return wrapperContained.time(); }
// // public static java.time.Instant time() { return net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.time(); }
// public java.time.Duration averageTickMs() { return wrapperContained.averageTickMs(); }
// // public static java.time.Duration averageTickMs() { return net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.averageTickMs(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.equals(o); }
// public yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample(wrapperContained.fromEvent(event)); }
// public static yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample fromEvent(jdk.jfr.consumer.RecordedEvent event, ) { return new yarnwrap.util.profiling.jfr.sample.ServerTickTimeSample(net.minecraft.util.profiling.jfr.sample.ServerTickTimeSample.fromEvent(event)); }

}