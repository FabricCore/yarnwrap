package yarnwrap.util.profiler;
public class MultiValueDebugSampleLogImpl { public net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained; public MultiValueDebugSampleLogImpl(net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained) { this.wrapperContained = wrapperContained; }

public int LOG_SIZE() { return wrapperContained.LOG_SIZE; }
// public void LOG_SIZE(int value) { wrapperContained.LOG_SIZE = value; }
// public long[][] multiValues() { return wrapperContained.multiValues; }
// public void multiValues(long[][] value) { wrapperContained.multiValues = value; }
// public int start() { return wrapperContained.start; }
// public void start(int value) { wrapperContained.start = value; }
// public int length() { return wrapperContained.length; }
// public void length(int value) { wrapperContained.length = value; }
// public int wrap(int index) { return wrapperContained.wrap(index); }

}