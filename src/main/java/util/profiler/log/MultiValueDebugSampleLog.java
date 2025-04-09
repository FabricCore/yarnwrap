package yarnwrap.util.profiler.log;
public class MultiValueDebugSampleLog { public net.minecraft.util.profiler.log.MultiValueDebugSampleLog wrapperContained; public MultiValueDebugSampleLog(net.minecraft.util.profiler.log.MultiValueDebugSampleLog wrapperContained) { this.wrapperContained = wrapperContained; }

public long get(int index) { return wrapperContained.get(index); }
public long get(int index,int dimension) { return wrapperContained.get(index,dimension); }
public int getDimension() { return wrapperContained.getDimension(); }
public int getLength() { return wrapperContained.getLength(); }
public void clear() { wrapperContained.clear(); }

}