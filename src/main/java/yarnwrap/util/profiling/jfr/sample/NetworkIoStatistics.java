package yarnwrap.util.profiling.jfr.sample;
public class NetworkIoStatistics { public net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics wrapperContained; public NetworkIoStatistics(net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object combinedStatistics() { return wrapperContained.combinedStatistics; }
// // public void combinedStatistics(Object value) { wrapperContained.combinedStatistics = value; }
// // public static Object combinedStatistics() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.combinedStatistics; }
// // public static void combinedStatistics(Object value, ) { net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.combinedStatistics = value; }

// public java.util.List topContributors() { return wrapperContained.topContributors; }
// public void topContributors(java.util.List value) { wrapperContained.topContributors = value; }
// public static java.util.List topContributors() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.topContributors; }
// public static void topContributors(java.util.List value, ) { net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.topContributors = value; }

// public java.time.Duration duration() { return wrapperContained.duration; }
// public void duration(java.time.Duration value) { wrapperContained.duration = value; }
// public static java.time.Duration duration() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.duration; }
// public static void duration(java.time.Duration value, ) { net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.duration = value; }

public NetworkIoStatistics(java.time.Duration duration,java.util.List packetsToStatistics) { this.wrapperContained = new net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics(duration,packetsToStatistics); }
public double getCountPerSecond() { return wrapperContained.getCountPerSecond(); }
// public static double getCountPerSecond() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.getCountPerSecond(); }
public double getBytesPerSecond() { return wrapperContained.getBytesPerSecond(); }
// public static double getBytesPerSecond() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.getBytesPerSecond(); }
public long getTotalCount() { return wrapperContained.getTotalCount(); }
// public static long getTotalCount() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.getTotalCount(); }
public long getTotalSize() { return wrapperContained.getTotalSize(); }
// public static long getTotalSize() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.getTotalSize(); }
public java.util.List getTopContributors() { return wrapperContained.getTopContributors(); }
// public static java.util.List getTopContributors() { return net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics.getTopContributors(); }

}