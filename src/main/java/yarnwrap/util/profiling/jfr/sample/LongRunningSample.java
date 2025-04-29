package yarnwrap.util.profiling.jfr.sample;
public class LongRunningSample { public net.minecraft.util.profiling.jfr.sample.LongRunningSample wrapperContained; public LongRunningSample(net.minecraft.util.profiling.jfr.sample.LongRunningSample wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.Duration duration() { return wrapperContained.duration(); }
// public static java.time.Duration duration() { return net.minecraft.util.profiling.jfr.sample.LongRunningSample.duration(); }

}