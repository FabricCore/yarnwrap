package yarnwrap.util.profiling.jfr.sample;
public class LongRunningSampleStatistics { public net.minecraft.util.profiling.jfr.sample.LongRunningSampleStatistics wrapperContained; public LongRunningSampleStatistics(net.minecraft.util.profiling.jfr.sample.LongRunningSampleStatistics wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiling.jfr.sample.LongRunningSample fastestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.fastestSample); }
// public void fastestSample(yarnwrap.util.profiling.jfr.sample.LongRunningSample value) { wrapperContained.fastestSample = value.wrapperContained; }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample slowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.slowestSample); }
// public void slowestSample(yarnwrap.util.profiling.jfr.sample.LongRunningSample value) { wrapperContained.slowestSample = value.wrapperContained; }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample secondSlowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.secondSlowestSample); }
// public void secondSlowestSample(yarnwrap.util.profiling.jfr.sample.LongRunningSample value) { wrapperContained.secondSlowestSample = value.wrapperContained; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public java.util.Map quantiles() { return wrapperContained.quantiles; }
// public void quantiles(java.util.Map value) { wrapperContained.quantiles = value; }
// public java.time.Duration totalDuration() { return wrapperContained.totalDuration; }
// public void totalDuration(java.time.Duration value) { wrapperContained.totalDuration = value; }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample fastestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.fastestSample()); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample slowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.slowestSample()); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample secondSlowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.secondSlowestSample()); }
// public int count() { return wrapperContained.count(); }
// public java.util.Map quantiles() { return wrapperContained.quantiles(); }
// public java.time.Duration totalDuration() { return wrapperContained.totalDuration(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public long method_38059(yarnwrap.util.profiling.jfr.sample.LongRunningSample sample) { return wrapperContained.method_38059(sample.wrapperContained); }
public yarnwrap.util.profiling.jfr.sample.LongRunningSampleStatistics fromSamples(java.util.List samples) { return new yarnwrap.util.profiling.jfr.sample.LongRunningSampleStatistics(wrapperContained.fromSamples(samples)); }

}