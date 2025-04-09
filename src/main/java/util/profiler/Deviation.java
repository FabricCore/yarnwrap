package yarnwrap.util.profiler;
public class Deviation { public net.minecraft.util.profiler.Deviation wrapperContained; public Deviation(net.minecraft.util.profiler.Deviation wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.Instant instant() { return wrapperContained.instant; }
public int ticks() { return wrapperContained.ticks; }
public yarnwrap.util.profiler.ProfileResult result() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.result); }

}