package yarnwrap.util.profiling.jfr.sample;
public class CpuLoadSample { public net.minecraft.util.profiling.jfr.sample.CpuLoadSample wrapperContained; public CpuLoadSample(net.minecraft.util.profiling.jfr.sample.CpuLoadSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public double jvm() { return wrapperContained.jvm; }
// public void jvm(double value) { wrapperContained.jvm = value; }
// public double userJvm() { return wrapperContained.userJvm; }
// public void userJvm(double value) { wrapperContained.userJvm = value; }
// public double system() { return wrapperContained.system; }
// public void system(double value) { wrapperContained.system = value; }
// public double jvm() { return wrapperContained.jvm(); }
// public double userJvm() { return wrapperContained.userJvm(); }
// public double system() { return wrapperContained.system(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.profiling.jfr.sample.CpuLoadSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.CpuLoadSample(wrapperContained.fromEvent(event)); }

}