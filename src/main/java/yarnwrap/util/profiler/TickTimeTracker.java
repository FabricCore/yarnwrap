package yarnwrap.util.profiler;
public class TickTimeTracker { public net.minecraft.util.profiler.TickTimeTracker wrapperContained; public TickTimeTracker(net.minecraft.util.profiler.TickTimeTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public static java.util.function.LongSupplier timeGetter() { return net.minecraft.util.profiler.TickTimeTracker.timeGetter; }
// public static void timeGetter(java.util.function.LongSupplier value, ) { net.minecraft.util.profiler.TickTimeTracker.timeGetter = value; }

// public java.util.function.IntSupplier tickGetter() { return wrapperContained.tickGetter; }
// public void tickGetter(java.util.function.IntSupplier value) { wrapperContained.tickGetter = value; }
// public static java.util.function.IntSupplier tickGetter() { return net.minecraft.util.profiler.TickTimeTracker.tickGetter; }
// public static void tickGetter(java.util.function.IntSupplier value, ) { net.minecraft.util.profiler.TickTimeTracker.tickGetter = value; }

// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.ReadableProfiler value) { wrapperContained.profiler = value.wrapperContained; }
// public static yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(net.minecraft.util.profiler.TickTimeTracker.profiler); }
// public static void profiler(yarnwrap.util.profiler.ReadableProfiler value, ) { net.minecraft.util.profiler.TickTimeTracker.profiler = value.wrapperContained; }

// public java.util.function.BooleanSupplier timeoutDisabled() { return wrapperContained.timeoutDisabled; }
// public void timeoutDisabled(java.util.function.BooleanSupplier value) { wrapperContained.timeoutDisabled = value; }
// public static java.util.function.BooleanSupplier timeoutDisabled() { return net.minecraft.util.profiler.TickTimeTracker.timeoutDisabled; }
// public static void timeoutDisabled(java.util.function.BooleanSupplier value, ) { net.minecraft.util.profiler.TickTimeTracker.timeoutDisabled = value; }

public TickTimeTracker(java.util.function.LongSupplier timeGetter,java.util.function.IntSupplier tickGetter,java.util.function.BooleanSupplier timeoutDisabled) { this.wrapperContained = new net.minecraft.util.profiler.TickTimeTracker(timeGetter,tickGetter,timeoutDisabled); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.util.profiler.TickTimeTracker.isActive(); }
public void disable() { wrapperContained.disable(); }
// public static void disable() { net.minecraft.util.profiler.TickTimeTracker.disable(); }
public void enable() { wrapperContained.enable(); }
// public static void enable() { net.minecraft.util.profiler.TickTimeTracker.enable(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
// public static yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.TickTimeTracker.getProfiler()); }
public yarnwrap.util.profiler.ProfileResult getResult() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.getResult()); }
// public static yarnwrap.util.profiler.ProfileResult getResult() { return new yarnwrap.util.profiler.ProfileResult(net.minecraft.util.profiler.TickTimeTracker.getResult()); }

}