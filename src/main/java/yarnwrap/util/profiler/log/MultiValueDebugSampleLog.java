package yarnwrap.util.profiler.log;
public class MultiValueDebugSampleLog { public net.minecraft.util.profiler.log.MultiValueDebugSampleLog wrapperContained; public MultiValueDebugSampleLog(net.minecraft.util.profiler.log.MultiValueDebugSampleLog wrapperContained) { this.wrapperContained = wrapperContained; }

public long get(int index) { return wrapperContained.get(index); }
// public static long get(int index, ) { return net.minecraft.util.profiler.log.MultiValueDebugSampleLog.get(index); }
public long get(int index,int dimension) { return wrapperContained.get(index,dimension); }
// public static long get(int index,int dimension, ) { return net.minecraft.util.profiler.log.MultiValueDebugSampleLog.get(index,dimension); }
public int getDimension() { return wrapperContained.getDimension(); }
// public static int getDimension() { return net.minecraft.util.profiler.log.MultiValueDebugSampleLog.getDimension(); }
public int getLength() { return wrapperContained.getLength(); }
// public static int getLength() { return net.minecraft.util.profiler.log.MultiValueDebugSampleLog.getLength(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.util.profiler.log.MultiValueDebugSampleLog.clear(); }

}