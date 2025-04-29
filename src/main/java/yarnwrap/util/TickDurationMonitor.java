package yarnwrap.util;
public class TickDurationMonitor { public net.minecraft.util.TickDurationMonitor wrapperContained; public TickDurationMonitor(net.minecraft.util.TickDurationMonitor wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.TickDurationMonitor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.TickDurationMonitor.LOGGER = value; }

// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public static java.util.function.LongSupplier timeGetter() { return net.minecraft.util.TickDurationMonitor.timeGetter; }
// public static void timeGetter(java.util.function.LongSupplier value, ) { net.minecraft.util.TickDurationMonitor.timeGetter = value; }

// public long overtime() { return wrapperContained.overtime; }
// public void overtime(long value) { wrapperContained.overtime = value; }
// public static long overtime() { return net.minecraft.util.TickDurationMonitor.overtime; }
// public static void overtime(long value, ) { net.minecraft.util.TickDurationMonitor.overtime = value; }

// public int tickCount() { return wrapperContained.tickCount; }
// public void tickCount(int value) { wrapperContained.tickCount = value; }
// public static int tickCount() { return net.minecraft.util.TickDurationMonitor.tickCount; }
// public static void tickCount(int value, ) { net.minecraft.util.TickDurationMonitor.tickCount = value; }

// public java.io.File tickResultsDirectory() { return wrapperContained.tickResultsDirectory; }
// public void tickResultsDirectory(java.io.File value) { wrapperContained.tickResultsDirectory = value; }
// public static java.io.File tickResultsDirectory() { return net.minecraft.util.TickDurationMonitor.tickResultsDirectory; }
// public static void tickResultsDirectory(java.io.File value, ) { net.minecraft.util.TickDurationMonitor.tickResultsDirectory = value; }

// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.ReadableProfiler value) { wrapperContained.profiler = value.wrapperContained; }
// public static yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(net.minecraft.util.TickDurationMonitor.profiler); }
// public static void profiler(yarnwrap.util.profiler.ReadableProfiler value, ) { net.minecraft.util.TickDurationMonitor.profiler = value.wrapperContained; }

public TickDurationMonitor(java.util.function.LongSupplier timeGetter,java.lang.String filename,long overtime) { this.wrapperContained = new net.minecraft.util.TickDurationMonitor(timeGetter,filename,overtime); }
public yarnwrap.util.profiler.Profiler nextProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.nextProfiler()); }
// public static yarnwrap.util.profiler.Profiler nextProfiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.TickDurationMonitor.nextProfiler()); }
// public yarnwrap.util.profiler.Profiler tickProfiler(yarnwrap.util.profiler.Profiler profiler,yarnwrap.util.TickDurationMonitor monitor) { return new yarnwrap.util.profiler.Profiler(wrapperContained.tickProfiler(profiler.wrapperContained,monitor.wrapperContained)); }
// public static yarnwrap.util.profiler.Profiler tickProfiler(yarnwrap.util.profiler.Profiler profiler,yarnwrap.util.TickDurationMonitor monitor, ) { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.TickDurationMonitor.tickProfiler(profiler.wrapperContained,monitor.wrapperContained)); }
// public yarnwrap.util.TickDurationMonitor create(java.lang.String name) { return new yarnwrap.util.TickDurationMonitor(wrapperContained.create(name)); }
// public static yarnwrap.util.TickDurationMonitor create(java.lang.String name, ) { return new yarnwrap.util.TickDurationMonitor(net.minecraft.util.TickDurationMonitor.create(name)); }
public void endTick() { wrapperContained.endTick(); }
// public static void endTick() { net.minecraft.util.TickDurationMonitor.endTick(); }

}