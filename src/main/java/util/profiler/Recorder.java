package yarnwrap.util.profiler;
public class Recorder { public net.minecraft.util.profiler.Recorder wrapperContained; public Recorder(net.minecraft.util.profiler.Recorder wrapperContained) { this.wrapperContained = wrapperContained; }

public void stop() { wrapperContained.stop(); }
public void startTick() { wrapperContained.startTick(); }
public void endTick() { wrapperContained.endTick(); }
public boolean isActive() { return wrapperContained.isActive(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
public void forceStop() { wrapperContained.forceStop(); }

}