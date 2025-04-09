package yarnwrap.util.profiler;
public class DummyProfiler { public net.minecraft.util.profiler.DummyProfiler wrapperContained; public DummyProfiler(net.minecraft.util.profiler.DummyProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.profiler.DummyProfiler INSTANCE() { return new yarnwrap.util.profiler.DummyProfiler(wrapperContained.INSTANCE); }

}