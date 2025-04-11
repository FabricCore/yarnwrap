package yarnwrap.util.profiling.jfr.sample;
public class FileIoSample { public net.minecraft.util.profiling.jfr.sample.FileIoSample wrapperContained; public FileIoSample(net.minecraft.util.profiling.jfr.sample.FileIoSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration duration() { return wrapperContained.duration; }
// public void duration(java.time.Duration value) { wrapperContained.duration = value; }
// public java.lang.String path() { return wrapperContained.path; }
// public void path(java.lang.String value) { wrapperContained.path = value; }
// public long bytes() { return wrapperContained.bytes; }
// public void bytes(long value) { wrapperContained.bytes = value; }
// public java.time.Duration duration() { return wrapperContained.duration(); }
// public java.lang.String path() { return wrapperContained.path(); }
// public long bytes() { return wrapperContained.bytes(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public long method_38033(yarnwrap.util.profiling.jfr.sample.FileIoSample sample) { return wrapperContained.method_38033(sample.wrapperContained); }
public Object toStatistics(java.time.Duration duration,java.util.List samples) { return wrapperContained.toStatistics(duration,samples); }
// public com.mojang.datafixers.util.Pair method_38035(Object entry) { return wrapperContained.method_38035(entry); }
// public java.lang.String method_38036(yarnwrap.util.profiling.jfr.sample.FileIoSample sample) { return wrapperContained.method_38036(sample.wrapperContained); }
// public boolean method_38037(yarnwrap.util.profiling.jfr.sample.FileIoSample sample) { return wrapperContained.method_38037(sample.wrapperContained); }
// public long method_38038(yarnwrap.util.profiling.jfr.sample.FileIoSample sample) { return wrapperContained.method_38038(sample.wrapperContained); }

}