package yarnwrap.util.profiling.jfr;
public class JfrProfiler { public net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained; public JfrProfiler(net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String MINECRAFT() { return wrapperContained.MINECRAFT; }
public java.lang.String WORLD_GENERATION() { return wrapperContained.WORLD_GENERATION; }
public java.lang.String TICKING() { return wrapperContained.TICKING; }
public java.lang.String NETWORK() { return wrapperContained.NETWORK; }
// public java.util.List EVENTS() { return wrapperContained.EVENTS; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String CONFIG_PATH() { return wrapperContained.CONFIG_PATH; }
// public java.time.format.DateTimeFormatter DATE_TIME_FORMAT() { return wrapperContained.DATE_TIME_FORMAT; }
// public jdk.jfr.Recording currentRecording() { return wrapperContained.currentRecording; }
// public yarnwrap.util.profiling.jfr.JfrProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.INSTANCE); }
// public float tickTime() { return wrapperContained.tickTime; }
// public java.util.Map summaryRecorderByAddress() { return wrapperContained.summaryRecorderByAddress; }
public java.lang.String STORAGE() { return wrapperContained.STORAGE; }
// public boolean start(java.io.Reader reader,yarnwrap.util.profiling.jfr.InstanceType instanceType) { return wrapperContained.start(reader,instanceType.wrapperContained); }
// public void addListener() { wrapperContained.addListener(); }
public yarnwrap.util.profiling.jfr.JfrProfiler getInstance() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.getInstance()); }
// public Object getOrCreateSummaryRecorder(java.net.SocketAddress address) { return wrapperContained.getOrCreateSummaryRecorder(address); }

}