package yarnwrap.util.profiling.jfr;
public class JfrProfiler { public net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained; public JfrProfiler(net.minecraft.util.profiling.jfr.JfrProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String MINECRAFT() { return wrapperContained.MINECRAFT; }
// public void MINECRAFT(java.lang.String value) { wrapperContained.MINECRAFT = value; }
public static java.lang.String MINECRAFT() { return net.minecraft.util.profiling.jfr.JfrProfiler.MINECRAFT; }
// public static void MINECRAFT(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.MINECRAFT = value; }

// public java.lang.String WORLD_GENERATION() { return wrapperContained.WORLD_GENERATION; }
// public void WORLD_GENERATION(java.lang.String value) { wrapperContained.WORLD_GENERATION = value; }
public static java.lang.String WORLD_GENERATION() { return net.minecraft.util.profiling.jfr.JfrProfiler.WORLD_GENERATION; }
// public static void WORLD_GENERATION(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.WORLD_GENERATION = value; }

// public java.lang.String TICKING() { return wrapperContained.TICKING; }
// public void TICKING(java.lang.String value) { wrapperContained.TICKING = value; }
public static java.lang.String TICKING() { return net.minecraft.util.profiling.jfr.JfrProfiler.TICKING; }
// public static void TICKING(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.TICKING = value; }

// public java.lang.String NETWORK() { return wrapperContained.NETWORK; }
// public void NETWORK(java.lang.String value) { wrapperContained.NETWORK = value; }
public static java.lang.String NETWORK() { return net.minecraft.util.profiling.jfr.JfrProfiler.NETWORK; }
// public static void NETWORK(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.NETWORK = value; }

// public java.util.List EVENTS() { return wrapperContained.EVENTS; }
// public void EVENTS(java.util.List value) { wrapperContained.EVENTS = value; }
// public static java.util.List EVENTS() { return net.minecraft.util.profiling.jfr.JfrProfiler.EVENTS; }
// public static void EVENTS(java.util.List value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.EVENTS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiling.jfr.JfrProfiler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.LOGGER = value; }

// public java.lang.String CONFIG_PATH() { return wrapperContained.CONFIG_PATH; }
// public void CONFIG_PATH(java.lang.String value) { wrapperContained.CONFIG_PATH = value; }
// public static java.lang.String CONFIG_PATH() { return net.minecraft.util.profiling.jfr.JfrProfiler.CONFIG_PATH; }
// public static void CONFIG_PATH(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.CONFIG_PATH = value; }

// public java.time.format.DateTimeFormatter DATE_TIME_FORMAT() { return wrapperContained.DATE_TIME_FORMAT; }
// public void DATE_TIME_FORMAT(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMAT = value; }
// public static java.time.format.DateTimeFormatter DATE_TIME_FORMAT() { return net.minecraft.util.profiling.jfr.JfrProfiler.DATE_TIME_FORMAT; }
// public static void DATE_TIME_FORMAT(java.time.format.DateTimeFormatter value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.DATE_TIME_FORMAT = value; }

// public jdk.jfr.Recording currentRecording() { return wrapperContained.currentRecording; }
// public void currentRecording(jdk.jfr.Recording value) { wrapperContained.currentRecording = value; }
// public static jdk.jfr.Recording currentRecording() { return net.minecraft.util.profiling.jfr.JfrProfiler.currentRecording; }
// public static void currentRecording(jdk.jfr.Recording value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.currentRecording = value; }

// public yarnwrap.util.profiling.jfr.JfrProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.profiling.jfr.JfrProfiler value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.util.profiling.jfr.JfrProfiler INSTANCE() { return new yarnwrap.util.profiling.jfr.JfrProfiler(net.minecraft.util.profiling.jfr.JfrProfiler.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.profiling.jfr.JfrProfiler value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.INSTANCE = value.wrapperContained; }

// public float tickTime() { return wrapperContained.tickTime; }
// public void tickTime(float value) { wrapperContained.tickTime = value; }
// public static float tickTime() { return net.minecraft.util.profiling.jfr.JfrProfiler.tickTime; }
// public static void tickTime(float value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.tickTime = value; }

// public java.util.Map summaryRecorderByAddress() { return wrapperContained.summaryRecorderByAddress; }
// public void summaryRecorderByAddress(java.util.Map value) { wrapperContained.summaryRecorderByAddress = value; }
// public static java.util.Map summaryRecorderByAddress() { return net.minecraft.util.profiling.jfr.JfrProfiler.summaryRecorderByAddress; }
// public static void summaryRecorderByAddress(java.util.Map value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.summaryRecorderByAddress = value; }

// public java.lang.String STORAGE() { return wrapperContained.STORAGE; }
// public void STORAGE(java.lang.String value) { wrapperContained.STORAGE = value; }
public static java.lang.String STORAGE() { return net.minecraft.util.profiling.jfr.JfrProfiler.STORAGE; }
// public static void STORAGE(java.lang.String value, ) { net.minecraft.util.profiling.jfr.JfrProfiler.STORAGE = value; }

// public void method_37982(yarnwrap.util.profiling.jfr.InstanceType recording) { wrapperContained.method_37982(recording.wrapperContained); }
// public static void method_37982(yarnwrap.util.profiling.jfr.InstanceType recording, ) { net.minecraft.util.profiling.jfr.JfrProfiler.method_37982(recording.wrapperContained); }
// public boolean start(java.io.Reader reader,yarnwrap.util.profiling.jfr.InstanceType instanceType) { return wrapperContained.start(reader,instanceType.wrapperContained); }
// public static boolean start(java.io.Reader reader,yarnwrap.util.profiling.jfr.InstanceType instanceType, ) { return net.minecraft.util.profiling.jfr.JfrProfiler.start(reader,instanceType.wrapperContained); }
// public void addListener() { wrapperContained.addListener(); }
// public static void addListener() { net.minecraft.util.profiling.jfr.JfrProfiler.addListener(); }
// public yarnwrap.util.profiling.jfr.JfrProfiler getInstance() { return new yarnwrap.util.profiling.jfr.JfrProfiler(wrapperContained.getInstance()); }
public static yarnwrap.util.profiling.jfr.JfrProfiler getInstance() { return new yarnwrap.util.profiling.jfr.JfrProfiler(net.minecraft.util.profiling.jfr.JfrProfiler.getInstance()); }
// public Object getOrCreateSummaryRecorder(java.net.SocketAddress address) { return wrapperContained.getOrCreateSummaryRecorder(address); }
// public static Object getOrCreateSummaryRecorder(java.net.SocketAddress address, ) { return net.minecraft.util.profiling.jfr.JfrProfiler.getOrCreateSummaryRecorder(address); }

}