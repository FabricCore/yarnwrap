package yarnwrap.util.profiler;
public class Sampler { public net.minecraft.util.profiler.Sampler wrapperContained; public Sampler(net.minecraft.util.profiler.Sampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.SampleType type() { return new yarnwrap.util.profiler.SampleType(wrapperContained.type); }
// public void type(yarnwrap.util.profiler.SampleType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.util.profiler.SampleType type() { return new yarnwrap.util.profiler.SampleType(net.minecraft.util.profiler.Sampler.type); }
// public static void type(yarnwrap.util.profiler.SampleType value, ) { net.minecraft.util.profiler.Sampler.type = value.wrapperContained; }

// public java.util.function.DoubleSupplier retriever() { return wrapperContained.retriever; }
// public void retriever(java.util.function.DoubleSupplier value) { wrapperContained.retriever = value; }
// public static java.util.function.DoubleSupplier retriever() { return net.minecraft.util.profiler.Sampler.retriever; }
// public static void retriever(java.util.function.DoubleSupplier value, ) { net.minecraft.util.profiler.Sampler.retriever = value; }

// public io.netty.buffer.ByteBuf valueBuffer() { return wrapperContained.valueBuffer; }
// public void valueBuffer(io.netty.buffer.ByteBuf value) { wrapperContained.valueBuffer = value; }
// public static io.netty.buffer.ByteBuf valueBuffer() { return net.minecraft.util.profiler.Sampler.valueBuffer; }
// public static void valueBuffer(io.netty.buffer.ByteBuf value, ) { net.minecraft.util.profiler.Sampler.valueBuffer = value; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.util.profiler.Sampler.active; }
// public static void active(boolean value, ) { net.minecraft.util.profiler.Sampler.active = value; }

// public java.lang.Runnable startAction() { return wrapperContained.startAction; }
// public void startAction(java.lang.Runnable value) { wrapperContained.startAction = value; }
// public static java.lang.Runnable startAction() { return net.minecraft.util.profiler.Sampler.startAction; }
// public static void startAction(java.lang.Runnable value, ) { net.minecraft.util.profiler.Sampler.startAction = value; }

// public Object deviationChecker() { return wrapperContained.deviationChecker; }
// // public void deviationChecker(Object value) { wrapperContained.deviationChecker = value; }
// // public static Object deviationChecker() { return net.minecraft.util.profiler.Sampler.deviationChecker; }
// // public static void deviationChecker(Object value, ) { net.minecraft.util.profiler.Sampler.deviationChecker = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.profiler.Sampler.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.profiler.Sampler.name = value; }

// public io.netty.buffer.ByteBuf ticksBuffer() { return wrapperContained.ticksBuffer; }
// public void ticksBuffer(io.netty.buffer.ByteBuf value) { wrapperContained.ticksBuffer = value; }
// public static io.netty.buffer.ByteBuf ticksBuffer() { return net.minecraft.util.profiler.Sampler.ticksBuffer; }
// public static void ticksBuffer(io.netty.buffer.ByteBuf value, ) { net.minecraft.util.profiler.Sampler.ticksBuffer = value; }

// public double currentSample() { return wrapperContained.currentSample; }
// public void currentSample(double value) { wrapperContained.currentSample = value; }
// public static double currentSample() { return net.minecraft.util.profiler.Sampler.currentSample; }
// public static void currentSample(double value, ) { net.minecraft.util.profiler.Sampler.currentSample = value; }

// public Sampler(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.DoubleSupplier retriever,java.lang.Runnable startAction,Object deviationChecker) { this.wrapperContained = new net.minecraft.util.profiler.Sampler(name,type.wrapperContained,retriever,startAction,deviationChecker); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.profiler.Sampler.equals(o); }
// public yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.DoubleSupplier retriever) { return new yarnwrap.util.profiler.Sampler(wrapperContained.create(name,type.wrapperContained,retriever)); }
// public static yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.DoubleSupplier retriever, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.Sampler.create(name,type.wrapperContained,retriever)); }
// public yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.lang.Object context,java.util.function.ToDoubleFunction retriever) { return new yarnwrap.util.profiler.Sampler(wrapperContained.create(name,type.wrapperContained,context,retriever)); }
// public static yarnwrap.util.profiler.Sampler create(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.lang.Object context,java.util.function.ToDoubleFunction retriever, ) { return new yarnwrap.util.profiler.Sampler(net.minecraft.util.profiler.Sampler.create(name,type.wrapperContained,context,retriever)); }
// public Object builder(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.ToDoubleFunction retriever,java.lang.Object context) { return wrapperContained.builder(name,type.wrapperContained,retriever,context); }
// public static Object builder(java.lang.String name,yarnwrap.util.profiler.SampleType type,java.util.function.ToDoubleFunction retriever,java.lang.Object context, ) { return net.minecraft.util.profiler.Sampler.builder(name,type.wrapperContained,retriever,context); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.util.profiler.Sampler.start(); }
public void sample(int tick) { wrapperContained.sample(tick); }
// public static void sample(int tick, ) { net.minecraft.util.profiler.Sampler.sample(tick); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.util.profiler.Sampler.stop(); }
// public void ensureActive() { wrapperContained.ensureActive(); }
// public static void ensureActive() { net.minecraft.util.profiler.Sampler.ensureActive(); }
// public java.util.function.DoubleSupplier getRetriever() { return wrapperContained.getRetriever(); }
// public static java.util.function.DoubleSupplier getRetriever() { return net.minecraft.util.profiler.Sampler.getRetriever(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.profiler.Sampler.getName(); }
public yarnwrap.util.profiler.SampleType getType() { return new yarnwrap.util.profiler.SampleType(wrapperContained.getType()); }
// public static yarnwrap.util.profiler.SampleType getType() { return new yarnwrap.util.profiler.SampleType(net.minecraft.util.profiler.Sampler.getType()); }
public Object collectData() { return wrapperContained.collectData(); }
// public static Object collectData() { return net.minecraft.util.profiler.Sampler.collectData(); }
public boolean hasDeviated() { return wrapperContained.hasDeviated(); }
// public static boolean hasDeviated() { return net.minecraft.util.profiler.Sampler.hasDeviated(); }

}