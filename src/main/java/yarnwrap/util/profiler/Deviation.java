package yarnwrap.util.profiler;
public class Deviation { public net.minecraft.util.profiler.Deviation wrapperContained; public Deviation(net.minecraft.util.profiler.Deviation wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.Instant instant() { return wrapperContained.instant; }
// public void instant(java.time.Instant value) { wrapperContained.instant = value; }
public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
public yarnwrap.util.profiler.ProfileResult result() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.result); }
// public void result(yarnwrap.util.profiler.ProfileResult value) { wrapperContained.result = value.wrapperContained; }

}