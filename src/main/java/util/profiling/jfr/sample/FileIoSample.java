package yarnwrap.util.profiling.jfr.sample;
public class FileIoSample { public net.minecraft.util.profiling.jfr.sample.FileIoSample wrapperContained; public FileIoSample(net.minecraft.util.profiling.jfr.sample.FileIoSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration duration() { return wrapperContained.duration; }
// public java.lang.String path() { return wrapperContained.path; }
// public long bytes() { return wrapperContained.bytes; }
// public java.time.Duration duration() { return wrapperContained.duration(); }
// public java.lang.String path() { return wrapperContained.path(); }
// public long bytes() { return wrapperContained.bytes(); }
public Object toStatistics(java.time.Duration duration,java.util.List samples) { return wrapperContained.toStatistics(duration,samples); }

}