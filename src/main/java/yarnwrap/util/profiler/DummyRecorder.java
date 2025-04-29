package yarnwrap.util.profiler;
public class DummyRecorder { public net.minecraft.util.profiler.DummyRecorder wrapperContained; public DummyRecorder(net.minecraft.util.profiler.DummyRecorder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.Recorder INSTANCE() { return new yarnwrap.util.profiler.Recorder(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiler.Recorder value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.profiler.Recorder INSTANCE() { return new yarnwrap.util.profiler.Recorder(net.minecraft.util.profiler.DummyRecorder.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.profiler.Recorder value, ) { net.minecraft.util.profiler.DummyRecorder.INSTANCE = value.wrapperContained; }


}