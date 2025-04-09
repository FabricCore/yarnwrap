package yarnwrap.util.profiler;
public class ProfilerTiming { public net.minecraft.util.profiler.ProfilerTiming wrapperContained; public ProfilerTiming(net.minecraft.util.profiler.ProfilerTiming wrapperContained) { this.wrapperContained = wrapperContained; }

public double totalUsagePercentage() { return wrapperContained.totalUsagePercentage; }
public java.lang.String name() { return wrapperContained.name; }
public double parentSectionUsagePercentage() { return wrapperContained.parentSectionUsagePercentage; }
public long visitCount() { return wrapperContained.visitCount; }
public int getColor() { return wrapperContained.getColor(); }

}