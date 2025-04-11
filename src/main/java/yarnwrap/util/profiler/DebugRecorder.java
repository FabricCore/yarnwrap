package yarnwrap.util.profiler;
public class DebugRecorder { public net.minecraft.util.profiler.DebugRecorder wrapperContained; public DebugRecorder(net.minecraft.util.profiler.DebugRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer globalDumpConsumer() { return wrapperContained.globalDumpConsumer; }
// public void globalDumpConsumer(java.util.function.Consumer value) { wrapperContained.globalDumpConsumer = value; }
// public yarnwrap.util.profiler.TickTimeTracker timeTracker() { return new yarnwrap.util.profiler.TickTimeTracker(wrapperContained.timeTracker); }
// public void timeTracker(yarnwrap.util.profiler.TickTimeTracker value) { wrapperContained.timeTracker = value.wrapperContained; }
// public java.util.concurrent.Executor dumpExecutor() { return wrapperContained.dumpExecutor; }
// public void dumpExecutor(java.util.concurrent.Executor value) { wrapperContained.dumpExecutor = value; }
// public yarnwrap.util.profiler.RecordDumper dumper() { return new yarnwrap.util.profiler.RecordDumper(wrapperContained.dumper); }
// public void dumper(yarnwrap.util.profiler.RecordDumper value) { wrapperContained.dumper = value.wrapperContained; }
// public java.util.function.Consumer resultConsumer() { return wrapperContained.resultConsumer; }
// public void resultConsumer(java.util.function.Consumer value) { wrapperContained.resultConsumer = value; }
// public java.util.function.Consumer dumpConsumer() { return wrapperContained.dumpConsumer; }
// public void dumpConsumer(java.util.function.Consumer value) { wrapperContained.dumpConsumer = value; }
// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public long endTime() { return wrapperContained.endTime; }
// public void endTime(long value) { wrapperContained.endTime = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.util.profiler.ReadableProfiler profiler() { return new yarnwrap.util.profiler.ReadableProfiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.ReadableProfiler value) { wrapperContained.profiler = value.wrapperContained; }
// public boolean stopping() { return wrapperContained.stopping; }
// public void stopping(boolean value) { wrapperContained.stopping = value; }
public int MAX_DURATION_IN_SECONDS() { return wrapperContained.MAX_DURATION_IN_SECONDS; }
// public void MAX_DURATION_IN_SECONDS(int value) { wrapperContained.MAX_DURATION_IN_SECONDS = value; }
// public java.util.Map deviations() { return wrapperContained.deviations; }
// public void deviations(java.util.Map value) { wrapperContained.deviations = value; }
// public yarnwrap.util.profiler.SamplerSource samplerSource() { return new yarnwrap.util.profiler.SamplerSource(wrapperContained.samplerSource); }
// public void samplerSource(yarnwrap.util.profiler.SamplerSource value) { wrapperContained.samplerSource = value.wrapperContained; }
// public java.util.Set samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Set value) { wrapperContained.samplers = value; }
// public void checkState() { wrapperContained.checkState(); }
// public void dump(yarnwrap.util.profiler.ProfileResult result) { wrapperContained.dump(result.wrapperContained); }
public void setGlobalDumpConsumer(java.util.function.Consumer consumer) { wrapperContained.setGlobalDumpConsumer(consumer); }
public yarnwrap.util.profiler.DebugRecorder of(yarnwrap.util.profiler.SamplerSource source,java.util.function.LongSupplier timeGetter,java.util.concurrent.Executor dumpExecutor,yarnwrap.util.profiler.RecordDumper dumper,java.util.function.Consumer resultConsumer,java.util.function.Consumer dumpConsumer) { return new yarnwrap.util.profiler.DebugRecorder(wrapperContained.of(source.wrapperContained,timeGetter,dumpExecutor,dumper.wrapperContained,resultConsumer,dumpConsumer)); }
// public void forceStop(java.util.Collection samplers) { wrapperContained.forceStop(samplers); }

}