package yarnwrap.util.profiler;
public class DebugRecorder { public net.minecraft.util.profiler.DebugRecorder wrapperContained; public DebugRecorder(net.minecraft.util.profiler.DebugRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer globalDumpConsumer() { return wrapperContained.globalDumpConsumer; }
// public yarnwrap.util.profiler.TickTimeTracker timeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(wrapperContained.timeTracker); }
// public java.util.concurrent.Executor dumpExecutor() { return wrapperContained.dumpExecutor; }
// public yarnwrap.util.profiler.RecordDumper dumper() { return new yarnwrap.util.profiler.RecordDumper(wrapperContained.dumper); }
// public java.util.function.Consumer resultConsumer() { return wrapperContained.resultConsumer; }
// public java.util.function.Consumer dumpConsumer() { return wrapperContained.dumpConsumer; }
// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public long endTime() { return wrapperContained.endTime; }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public boolean stopping() { return wrapperContained.stopping; }
public int MAX_DURATION_IN_SECONDS() { return wrapperContained.MAX_DURATION_IN_SECONDS; }
// public java.util.Map deviations() { return wrapperContained.deviations; }
// public yarnwrap.util.profiler.SamplerSource samplerSource() { return new yarnwrap.util.profiler.SamplerSource(wrapperContained.samplerSource); }
// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void checkState() { wrapperContained.checkState(); }
// public void dump(yarnwrap.util.profiler.ProfileResult result) { wrapperContained.dump(result.wrapperContained); }
public void setGlobalDumpConsumer(java.util.function.Consumer consumer) { wrapperContained.setGlobalDumpConsumer(consumer); }
public yarnwrap.util.profiler.DebugRecorder of(yarnwrap.util.profiler.SamplerSource source,java.util.function.LongSupplier timeGetter,java.util.concurrent.Executor dumpExecutor,yarnwrap.util.profiler.RecordDumper dumper,java.util.function.Consumer resultConsumer,java.util.function.Consumer dumpConsumer) { return new yarnwrap.util.profiler.DebugRecorder(wrapperContained.of(source.wrapperContained,timeGetter,dumpExecutor,dumper.wrapperContained,resultConsumer,dumpConsumer)); }
// public void forceStop(java.util.Collection samplers) { wrapperContained.forceStop(samplers); }

}