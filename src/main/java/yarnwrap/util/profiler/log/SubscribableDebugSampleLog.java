package yarnwrap.util.profiler.log;
public class SubscribableDebugSampleLog { public net.minecraft.util.profiler.log.SubscribableDebugSampleLog wrapperContained; public SubscribableDebugSampleLog(net.minecraft.util.profiler.log.SubscribableDebugSampleLog wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.SampleSubscriptionTracker tracker() { return new yarnwrap.server.SampleSubscriptionTracker(wrapperContained.tracker); }
// public void tracker(yarnwrap.server.SampleSubscriptionTracker value) { wrapperContained.tracker = value.wrapperContained; }
// public yarnwrap.util.profiler.log.DebugSampleType type() { return new yarnwrap.util.profiler.log.DebugSampleType(wrapperContained.type); }
// public void type(yarnwrap.util.profiler.log.DebugSampleType value) { wrapperContained.type = value.wrapperContained; }

}