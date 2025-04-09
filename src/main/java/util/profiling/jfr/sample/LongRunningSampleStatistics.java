package yarnwrap.util.profiling.jfr.sample;
public class LongRunningSampleStatistics { public net.minecraft.util.profiling.jfr.sample.LongRunningSampleStatistics wrapperContained; public LongRunningSampleStatistics(net.minecraft.util.profiling.jfr.sample.LongRunningSampleStatistics wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiling.jfr.sample.LongRunningSample fastestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.fastestSample); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample slowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.slowestSample); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample secondSlowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.secondSlowestSample); }
// public int count() { return wrapperContained.count; }
// public java.util.Map quantiles() { return wrapperContained.quantiles; }
// public java.time.Duration totalDuration() { return wrapperContained.totalDuration; }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample fastestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.fastestSample()); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample slowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.slowestSample()); }
// public yarnwrap.util.profiling.jfr.sample.LongRunningSample secondSlowestSample() { return new yarnwrap.util.profiling.jfr.sample.LongRunningSample(wrapperContained.secondSlowestSample()); }
// public int count() { return wrapperContained.count(); }
// public java.util.Map quantiles() { return wrapperContained.quantiles(); }
// public java.time.Duration totalDuration() { return wrapperContained.totalDuration(); }
public yarnwrap.util.profiling.jfr.sample.LongRunningSampleStatistics fromSamples(java.util.List samples) { return new yarnwrap.util.profiling.jfr.sample.LongRunningSampleStatistics(wrapperContained.fromSamples(samples)); }

}