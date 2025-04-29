package yarnwrap.util.profiler;
public class ProfileLocationInfo { public net.minecraft.util.profiler.ProfileLocationInfo wrapperContained; public ProfileLocationInfo(net.minecraft.util.profiler.ProfileLocationInfo wrapperContained) { this.wrapperContained = wrapperContained; }

public long getTotalTime() { return wrapperContained.getTotalTime(); }
// public static long getTotalTime() { return net.minecraft.util.profiler.ProfileLocationInfo.getTotalTime(); }
public long getVisitCount() { return wrapperContained.getVisitCount(); }
// public static long getVisitCount() { return net.minecraft.util.profiler.ProfileLocationInfo.getVisitCount(); }
public it.unimi.dsi.fastutil.objects.Object2LongMap getCounts() { return wrapperContained.getCounts(); }
// public static it.unimi.dsi.fastutil.objects.Object2LongMap getCounts() { return net.minecraft.util.profiler.ProfileLocationInfo.getCounts(); }
public long getMaxTime() { return wrapperContained.getMaxTime(); }
// public static long getMaxTime() { return net.minecraft.util.profiler.ProfileLocationInfo.getMaxTime(); }

}