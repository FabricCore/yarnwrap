package yarnwrap.util;
public class TickDurationMonitor { public net.minecraft.util.TickDurationMonitor wrapperContained; public TickDurationMonitor(net.minecraft.util.TickDurationMonitor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public long overtime() { return wrapperContained.overtime; }
// public void overtime(long value) { wrapperContained.overtime = value; }
// public int tickCount() { return wrapperContained.tickCount; }
// public void tickCount(int value) { wrapperContained.tickCount = value; }
// public java.io.File tickResultsDirectory() { return wrapperContained.tickResultsDirectory; }
// public void tickResultsDirectory(java.io.File value) { wrapperContained.tickResultsDirectory = value; }
// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.ReadableProfiler value) { wrapperContained.profiler = value.wrapperContained; }
public yarnwrap.util.profiler.Profiler nextProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.nextProfiler()); }
public yarnwrap.util.profiler.Profiler tickProfiler(yarnwrap.util.profiler.Profiler profiler,yarnwrap.util.TickDurationMonitor monitor) { return new yarnwrap.util.profiler.Profiler(wrapperContained.tickProfiler(profiler.wrapperContained,monitor.wrapperContained)); }
public yarnwrap.util.TickDurationMonitor create(java.lang.String name) { return new yarnwrap.util.TickDurationMonitor(wrapperContained.create(name)); }
public void endTick() { wrapperContained.endTick(); }

}