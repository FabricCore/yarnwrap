package yarnwrap.util.profiler;
public class DummyProfiler { public net.minecraft.util.profiler.DummyProfiler wrapperContained; public DummyProfiler(net.minecraft.util.profiler.DummyProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.DummyProfiler INSTANCE() { return new yarnwrap.util.profiler.DummyProfiler(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiler.DummyProfiler value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.profiler.DummyProfiler INSTANCE() { return new yarnwrap.util.profiler.DummyProfiler(net.minecraft.util.profiler.DummyProfiler.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.profiler.DummyProfiler value, ) { net.minecraft.util.profiler.DummyProfiler.INSTANCE = value.wrapperContained; }


}