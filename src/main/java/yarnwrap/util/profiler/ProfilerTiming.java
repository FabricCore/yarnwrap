package yarnwrap.util.profiler;
public class ProfilerTiming { public net.minecraft.util.profiler.ProfilerTiming wrapperContained; public ProfilerTiming(net.minecraft.util.profiler.ProfilerTiming wrapperContained) { this.wrapperContained = wrapperContained; }

public double totalUsagePercentage() { return wrapperContained.totalUsagePercentage; }
// public void totalUsagePercentage(double value) { wrapperContained.totalUsagePercentage = value; }
// public static double totalUsagePercentage() { return net.minecraft.util.profiler.ProfilerTiming.totalUsagePercentage; }
// public static void totalUsagePercentage(double value, ) { net.minecraft.util.profiler.ProfilerTiming.totalUsagePercentage = value; }

public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.profiler.ProfilerTiming.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.profiler.ProfilerTiming.name = value; }

public double parentSectionUsagePercentage() { return wrapperContained.parentSectionUsagePercentage; }
// public void parentSectionUsagePercentage(double value) { wrapperContained.parentSectionUsagePercentage = value; }
// public static double parentSectionUsagePercentage() { return net.minecraft.util.profiler.ProfilerTiming.parentSectionUsagePercentage; }
// public static void parentSectionUsagePercentage(double value, ) { net.minecraft.util.profiler.ProfilerTiming.parentSectionUsagePercentage = value; }

public long visitCount() { return wrapperContained.visitCount; }
// public void visitCount(long value) { wrapperContained.visitCount = value; }
// public static long visitCount() { return net.minecraft.util.profiler.ProfilerTiming.visitCount; }
// public static void visitCount(long value, ) { net.minecraft.util.profiler.ProfilerTiming.visitCount = value; }

public ProfilerTiming(java.lang.String name,double parentUsagePercentage,double totalUsagePercentage,long visitCount) { this.wrapperContained = new net.minecraft.util.profiler.ProfilerTiming(name,parentUsagePercentage,totalUsagePercentage,visitCount); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public static int compareTo(java.lang.Object other, ) { return net.minecraft.util.profiler.ProfilerTiming.compareTo(other); }
public int getColor() { return wrapperContained.getColor(); }
// public static int getColor() { return net.minecraft.util.profiler.ProfilerTiming.getColor(); }

}