package yarnwrap.util.profiler;
public class Sampler { public net.minecraft.util.profiler.Sampler wrapperContained; public Sampler(net.minecraft.util.profiler.Sampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.SampleType type() { return new yarnwrap.util.profiler.SampleType(wrapperContained.type); }
// public void type(yarnwrap.util.profiler.SampleType value) { wrapperContained.type = value.wrapperContained; }
// public java.util.function.DoubleSupplier retriever() { return wrapperContained.retriever; }
// public void retriever(java.util.function.DoubleSupplier value) { wrapperContained.retriever = value; }
// public io.netty.buffer.ByteBuf valueBuffer() { return wrapperContained.valueBuffer; }
// public void valueBuffer(io.netty.buffer.ByteBuf value) { wrapperContained.valueBuffer = value; }
// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public java.lang.Runnable startAction() { return wrapperContained.startAction; }
// public void startAction(java.lang.Runnable value) { wrapperContained.startAction = value; }
// public Object deviationChecker() { return wrapperContained.deviationChecker; }
// // public void deviationChecker(Object value) { wrapperContained.deviationChecker = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public io.netty.buffer.ByteBuf ticksBuffer() { return wrapperContained.ticksBuffer; }
// public void ticksBuffer(io.netty.buffer.ByteBuf value) { wrapperContained.ticksBuffer = value; }
// public double currentSample() { return wrapperContained.currentSample; }
// public void currentSample(double value) { wrapperContained.currentSample = value; }
// public Sampler(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.DoubleSupplier retriever,java.lang.Runnable startAction,Object deviationChecker) { this.wrapperContained = new net.minecraft.util.profiler.Sampler(name,type.wrapperContained,retriever,startAction,deviationChecker); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
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