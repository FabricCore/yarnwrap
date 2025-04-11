package yarnwrap.util.profiling.jfr;
public class JfrProfiler { public net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained; public JfrProfiler(net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String MINECRAFT() { return wrapperContained.MINECRAFT; }
// public void MINECRAFT(java.lang.String value) { wrapperContained.MINECRAFT = value; }
public java.lang.String WORLD_GENERATION() { return wrapperContained.WORLD_GENERATION; }
// public void WORLD_GENERATION(java.lang.String value) { wrapperContained.WORLD_GENERATION = value; }
public java.lang.String TICKING() { return wrapperContained.TICKING; }
// public void TICKING(java.lang.String value) { wrapperContained.TICKING = value; }
public java.lang.String NETWORK() { return wrapperContained.NETWORK; }
// public void NETWORK(java.lang.String value) { wrapperContained.NETWORK = value; }
// public java.util.List EVENTS() { return wrapperContained.EVENTS; }
// public void EVENTS(java.util.List value) { wrapperContained.EVENTS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String CONFIG_PATH() { return wrapperContained.CONFIG_PATH; }
// public void CONFIG_PATH(java.lang.String value) { wrapperContained.CONFIG_PATH = value; }
// public java.time.format.DateTimeFormatter DATE_TIME_FORMAT() { return wrapperContained.DATE_TIME_FORMAT; }
// public void DATE_TIME_FORMAT(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMAT = value; }
// public jdk.jfr.Recording currentRecording() { return wrapperContained.currentRecording; }
// public void currentRecording(jdk.jfr.Recording value) { wrapperContained.currentRecording = value; }
// public yarnwrap.util.profiling.jfr.JfrProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiling.jfr.JfrProfiler value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public float tickTime() { return wrapperContained.tickTime; }
// public void tickTime(float value) { wrapperContained.tickTime = value; }
// public java.util.Map summaryRecorderByAddress() { return wrapperContained.summaryRecorderByAddress; }
// public void summaryRecorderByAddress(java.util.Map value) { wrapperContained.summaryRecorderByAddress = value; }
public java.lang.String STORAGE() { return wrapperContained.STORAGE; }
// public void STORAGE(java.lang.String value) { wrapperContained.STORAGE = value; }
// public void method_37982(yarnwrap.util.profiling.jfr.InstanceType recording) { wrapperContained.method_37982(recording.wrapperContained); }
// public boolean start(java.io.Reader reader,yarnwrap.util.profiling.jfr.InstanceType instanceType) { return wrapperContained.start(reader,instanceType.wrapperContained); }
// public void addListener() { wrapperContained.addListener(); }
public yarnwrap.util.profiling.jfr.JfrProfiler getInstance() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.getInstance()); }
// public Object getOrCreateSummaryRecorder(java.net.SocketAddress address) { return wrapperContained.getOrCreateSummaryRecorder(address); }

}