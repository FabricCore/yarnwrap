package yarnwrap.util.profiler;
public class Profilers { public net.minecraft.util.profiler.Profilers wrapperContained; public Profilers(net.minecraft.util.profiler.Profilers wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal TRACY_PROFILER() { return wrapperContained.TRACY_PROFILER; }
// public void TRACY_PROFILER(java.lang.ThreadLocal value) { wrapperContained.TRACY_PROFILER = value; }
// public static java.lang.ThreadLocal TRACY_PROFILER() { return net.minecraft.util.profiler.Profilers.TRACY_PROFILER; }
// public static void TRACY_PROFILER(java.lang.ThreadLocal value, ) { net.minecraft.util.profiler.Profilers.TRACY_PROFILER = value; }

// public java.lang.ThreadLocal BUILTIN_PROFILER() { return wrapperContained.BUILTIN_PROFILER; }
// public void BUILTIN_PROFILER(java.lang.ThreadLocal value) { wrapperContained.BUILTIN_PROFILER = value; }
// public static java.lang.ThreadLocal BUILTIN_PROFILER() { return net.minecraft.util.profiler.Profilers.BUILTIN_PROFILER; }
// public static void BUILTIN_PROFILER(java.lang.ThreadLocal value, ) { net.minecraft.util.profiler.Profilers.BUILTIN_PROFILER = value; }

// public java.util.concurrent.atomic.AtomicInteger ACTIVE_BUILTIN_PROFILER_COUNT() { return wrapperContained.ACTIVE_BUILTIN_PROFILER_COUNT; }
// public void ACTIVE_BUILTIN_PROFILER_COUNT(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.ACTIVE_BUILTIN_PROFILER_COUNT = value; }
// public static java.util.concurrent.atomic.AtomicInteger ACTIVE_BUILTIN_PROFILER_COUNT() { return net.minecraft.util.profiler.Profilers.ACTIVE_BUILTIN_PROFILER_COUNT; }
// public static void ACTIVE_BUILTIN_PROFILER_COUNT(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.util.profiler.Profilers.ACTIVE_BUILTIN_PROFILER_COUNT = value; }

// public yarnwrap.util.profiler.Profiler get() { return new yarnwrap.util.profiler.Profiler(wrapperContained.get()); }
public static yarnwrap.util.profiler.Profiler get() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.Profilers.get()); }
// public Object using(yarnwrap.util.profiler.Profiler profiler) { return wrapperContained.using(profiler.wrapperContained); }
// public static Object using(yarnwrap.util.profiler.Profiler profiler, ) { return net.minecraft.util.profiler.Profilers.using(profiler.wrapperContained); }
// public void deactivate() { wrapperContained.deactivate(); }
// public static void deactivate() { net.minecraft.util.profiler.Profilers.deactivate(); }
// public void activate(yarnwrap.util.profiler.Profiler profiler) { wrapperContained.activate(profiler.wrapperContained); }
// public static void activate(yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.util.profiler.Profilers.activate(profiler.wrapperContained); }
// public yarnwrap.util.profiler.Profiler getDefault() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getDefault()); }
// public static yarnwrap.util.profiler.Profiler getDefault() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.Profilers.getDefault()); }
// public yarnwrap.util.profiler.Profiler union(yarnwrap.util.profiler.Profiler builtinProfiler) { return new yarnwrap.util.profiler.Profiler(wrapperContained.union(builtinProfiler.wrapperContained)); }
// public static yarnwrap.util.profiler.Profiler union(yarnwrap.util.profiler.Profiler builtinProfiler, ) { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.Profilers.union(builtinProfiler.wrapperContained)); }

}