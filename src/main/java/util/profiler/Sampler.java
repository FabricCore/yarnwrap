package yarnwrap.util.profiler;
public class Sampler { public net.minecraft.util.profiler.Sampler wrapperContained; public Sampler(net.minecraft.util.profiler.Sampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.SampleType type() { return new yarnwrap.util.profiler.SampleType(wrapperContained.type); }
// public java.util.function.DoubleSupplier retriever() { return wrapperContained.retriever; }
// public io.netty.buffer.ByteBuf valueBuffer() { return wrapperContained.valueBuffer; }
// public boolean active() { return wrapperContained.active; }
// public java.lang.Runnable startAction() { return wrapperContained.startAction; }
// public Object deviationChecker() { return wrapperContained.deviationChecker; }
// public java.lang.String name() { return wrapperContained.name; }
// public io.netty.buffer.ByteBuf ticksBuffer() { return wrapperContained.ticksBuffer; }
// public double currentSample() { return wrapperContained.currentSample; }
public yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.DoubleSupplier retriever) { return new yarnwrap.util.profiler.Sampler(wrapperContained.create(name,type.wrapperContained,retriever)); }
public yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.lang.Object context,java.util.function.ToDoubleFunction retriever) { return new yarnwrap.util.profiler.Sampler(wrapperContained.create(name,type.wrapperContained,context,retriever)); }
public Object builder(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.ToDoubleFunction retriever,java.lang.Object context) { return wrapperContained.builder(name,type.wrapperContained,retriever,context); }
public void start() { wrapperContained.start(); }
public void sample(int tick) { wrapperContained.sample(tick); }
public void stop() { wrapperContained.stop(); }
// public void ensureActive() { wrapperContained.ensureActive(); }
// public java.util.function.DoubleSupplier getRetriever() { return wrapperContained.getRetriever(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.util.profiler.SampleType getType() { return new yarnwrap.util.profiler.SampleType(wrapperContained.getType()); }
public Object collectData() { return wrapperContained.collectData(); }
public boolean hasDeviated() { return wrapperContained.hasDeviated(); }

}