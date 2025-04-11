package yarnwrap.util.profiler;
public class ProfilerTiming { public net.minecraft.util.profiler.ProfilerTiming wrapperContained; public ProfilerTiming(net.minecraft.util.profiler.ProfilerTiming wrapperContained) { this.wrapperContained = wrapperContained; }

public double totalUsagePercentage() { return wrapperContained.totalUsagePercentage; }
// public void totalUsagePercentage(double value) { wrapperContained.totalUsagePercentage = value; }
public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public double parentSectionUsagePercentage() { return wrapperContained.parentSectionUsagePercentage; }
// public void parentSectionUsagePercentage(double value) { wrapperContained.parentSectionUsagePercentage = value; }
public long visitCount() { return wrapperContained.visitCount; }
// public void visitCount(long value) { wrapperContained.visitCount = value; }
public ProfilerTiming(java.lang.String name,double parentUsagePercentage,double totalUsagePercentage,long visitCount) { this.wrapperContained = new net.minecraft.util.profiler.ProfilerTiming(name,parentUsagePercentage,totalUsagePercentage,visitCount); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
public int getColor() { return wrapperContained.getColor(); }

}