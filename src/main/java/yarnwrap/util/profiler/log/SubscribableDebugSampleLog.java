package yarnwrap.util.profiler.log;
public class SubscribableDebugSampleLog { public net.minecraft.util.profiler.log.SubscribableDebugSampleLog wrapperContained; public SubscribableDebugSampleLog(net.minecraft.util.profiler.log.SubscribableDebugSampleLog wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.SampleSubscriptionTracker tracker() { return new yarnwrap.server.SampleSubscriptionTracker(wrapperContained.tracker); }
// public void tracker(yarnwrap.server.SampleSubscriptionTracker value) { wrapperContained.tracker = value.wrapperContained; }
// public static yarnwrap.server.SampleSubscriptionTracker tracker() { return new yarnwrap.server.SampleSubscriptionTracker(net.minecraft.util.profiler.log.SubscribableDebugSampleLog.tracker); }
// public static void tracker(yarnwrap.server.SampleSubscriptionTracker value, ) { net.minecraft.util.profiler.log.SubscribableDebugSampleLog.tracker = value.wrapperContained; }

// public yarnwrap.util.profiler.log.DebugSampleType type() { return new yarnwrap.util.profiler.log.DebugSampleType(wrapperContained.type); }
// public void type(yarnwrap.util.profiler.log.DebugSampleType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.util.profiler.log.DebugSampleType type() { return new yarnwrap.util.profiler.log.DebugSampleType(net.minecraft.util.profiler.log.SubscribableDebugSampleLog.type); }
// public static void type(yarnwrap.util.profiler.log.DebugSampleType value, ) { net.minecraft.util.profiler.log.SubscribableDebugSampleLog.type = value.wrapperContained; }

public SubscribableDebugSampleLog(int size,yarnwrap.server.SampleSubscriptionTracker tracker,yarnwrap.util.profiler.log.DebugSampleType type) { this.wrapperContained = new net.minecraft.util.profiler.log.SubscribableDebugSampleLog(size,tracker.wrapperContained,type.wrapperContained); }
// public SubscribableDebugSampleLog(int size,yarnwrap.server.SampleSubscriptionTracker tracker,yarnwrap.util.profiler.log.DebugSampleType type,long defaults) { this.wrapperContained = new net.minecraft.util.profiler.log.SubscribableDebugSampleLog(size,tracker.wrapperContained,type.wrapperContained,defaults); }

}