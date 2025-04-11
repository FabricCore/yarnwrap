package yarnwrap.util.profiler;
public class TickTimeTracker { public net.minecraft.util.profiler.TickTimeTracker wrapperContained; public TickTimeTracker(net.minecraft.util.profiler.TickTimeTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public java.util.function.IntSupplier tickGetter() { return wrapperContained.tickGetter; }
// public void tickGetter(java.util.function.IntSupplier value) { wrapperContained.tickGetter = value; }
// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.ReadableProfiler value) { wrapperContained.profiler = value.wrapperContained; }
public boolean isActive() { return wrapperContained.isActive(); }
public void disable() { wrapperContained.disable(); }
public void enable() { wrapperContained.enable(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
public yarnwrap.util.profiler.ProfileResult getResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.getResult()); }

}