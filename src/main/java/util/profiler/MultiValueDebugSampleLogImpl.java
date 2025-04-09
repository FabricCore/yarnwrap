package yarnwrap.util.profiler;
public class MultiValueDebugSampleLogImpl { public net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained; public MultiValueDebugSampleLogImpl(net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained) { this.wrapperContained = wrapperContained; }

public int LOG_SIZE() { return wrapperContained.LOG_SIZE; }
// public long[][] multiValues() { return wrapperContained.multiValues; }
// public int start() { return wrapperContained.start; }
// public int length() { return wrapperContained.length; }
// public int wrap(int index) { return wrapperContained.wrap(index); }

}