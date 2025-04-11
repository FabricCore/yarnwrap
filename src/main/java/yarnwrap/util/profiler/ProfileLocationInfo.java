package yarnwrap.util.profiler;
public class ProfileLocationInfo { public net.minecraft.util.profiler.ProfileLocationInfo wrapperContained; public ProfileLocationInfo(net.minecraft.util.profiler.ProfileLocationInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public long getTotalTime() { return wrapperContained.getTotalTime(); }
public long getVisitCount() { return wrapperContained.getVisitCount(); }
public it.unimi.dsi.fastutil.objects.Object2LongMap getCounts() { return wrapperContained.getCounts(); }
public long getMaxTime() { return wrapperContained.getMaxTime(); }

}