package yarnwrap.util.profiling.jfr.sample;
public class NetworkIoStatistics { public net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics wrapperContained; public NetworkIoStatistics(net.minecraft.util.profiling.jfr.sample.NetworkIoStatistics wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object combinedStatistics() { return wrapperContained.combinedStatistics; }
// // public void combinedStatistics(Object value) { wrapperContained.combinedStatistics = value; }
// public java.util.List topContributors() { return wrapperContained.topContributors; }
// public void topContributors(java.util.List value) { wrapperContained.topContributors = value; }
// public java.time.Duration duration() { return wrapperContained.duration; }
// public void duration(java.time.Duration value) { wrapperContained.duration = value; }
public double getCountPerSecond() { return wrapperContained.getCountPerSecond(); }
public double getBytesPerSecond() { return wrapperContained.getBytesPerSecond(); }
public long getTotalCount() { return wrapperContained.getTotalCount(); }
public long getTotalSize() { return wrapperContained.getTotalSize(); }
public java.util.List getTopContributors() { return wrapperContained.getTopContributors(); }

}