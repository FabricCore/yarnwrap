package yarnwrap.util.profiler.log;
public class DebugSampleLog { public net.minecraft.util.profiler.log.DebugSampleLog wrapperContained; public DebugSampleLog(net.minecraft.util.profiler.log.DebugSampleLog wrapperContained) { this.wrapperContained = wrapperContained; }

public void push(long value) { wrapperContained.push(value); }
public void push(long value,int column) { wrapperContained.push(value,column); }
// public void set(long values) { wrapperContained.set(values); }

}