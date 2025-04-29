package yarnwrap.util.profiler;
public class Recorder { public net.minecraft.util.profiler.Recorder wrapperContained; public Recorder(net.minecraft.util.profiler.Recorder wrapperContained) { this.wrapperContained = wrapperContained; }

public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.util.profiler.Recorder.stop(); }
public void startTick() { wrapperContained.startTick(); }
// public static void startTick() { net.minecraft.util.profiler.Recorder.startTick(); }
public void endTick() { wrapperContained.endTick(); }
// public static void endTick() { net.minecraft.util.profiler.Recorder.endTick(); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.util.profiler.Recorder.isActive(); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
// public static yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.Recorder.getProfiler()); }
public void forceStop() { wrapperContained.forceStop(); }
// public static void forceStop() { net.minecraft.util.profiler.Recorder.forceStop(); }

}