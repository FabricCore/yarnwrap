package yarnwrap.util.profiler;
public class MultiValueDebugSampleLogImpl { public net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained; public MultiValueDebugSampleLogImpl(net.minecraft.util.profiler.MultiValueDebugSampleLogImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LOG_SIZE() { return wrapperContained.LOG_SIZE; }
// public void LOG_SIZE(int value) { wrapperContained.LOG_SIZE = value; }
public static int LOG_SIZE() { return net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.LOG_SIZE; }
// public static void LOG_SIZE(int value, ) { net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.LOG_SIZE = value; }

// public long[][] multiValues() { return wrapperContained.multiValues; }
// public void multiValues(long[][] value) { wrapperContained.multiValues = value; }
// public static long[][] multiValues() { return net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.multiValues; }
// public static void multiValues(long[][] value, ) { net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.multiValues = value; }

// public int start() { return wrapperContained.start; }
// public void start(int value) { wrapperContained.start = value; }
// public static int start() { return net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.start; }
// public static void start(int value, ) { net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.start = value; }

// public int length() { return wrapperContained.length; }
// public void length(int value) { wrapperContained.length = value; }
// public static int length() { return net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.length; }
// public static void length(int value, ) { net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.length = value; }

public MultiValueDebugSampleLogImpl(int dimensions) { this.wrapperContained = new net.minecraft.util.profiler.MultiValueDebugSampleLogImpl(dimensions); }
// public int wrap(int index) { return wrapperContained.wrap(index); }
// public static int wrap(int index, ) { return net.minecraft.util.profiler.MultiValueDebugSampleLogImpl.wrap(index); }

}