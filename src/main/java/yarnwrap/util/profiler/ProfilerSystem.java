package yarnwrap.util.profiler;
public class ProfilerSystem { public net.minecraft.util.profiler.ProfilerSystem wrapperContained; public ProfilerSystem(net.minecraft.util.profiler.ProfilerSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startTick() { return wrapperContained.startTick; }
// public void startTick(int value) { wrapperContained.startTick = value; }
// public static int startTick() { return net.minecraft.util.profiler.ProfilerSystem.startTick; }
// public static void startTick(int value, ) { net.minecraft.util.profiler.ProfilerSystem.startTick = value; }

// public it.unimi.dsi.fastutil.longs.LongList timeList() { return wrapperContained.timeList; }
// public void timeList(it.unimi.dsi.fastutil.longs.LongList value) { wrapperContained.timeList = value; }
// public static it.unimi.dsi.fastutil.longs.LongList timeList() { return net.minecraft.util.profiler.ProfilerSystem.timeList; }
// public static void timeList(it.unimi.dsi.fastutil.longs.LongList value, ) { net.minecraft.util.profiler.ProfilerSystem.timeList = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.util.profiler.ProfilerSystem.startTime; }
// public static void startTime(long value, ) { net.minecraft.util.profiler.ProfilerSystem.startTime = value; }

// public boolean tickStarted() { return wrapperContained.tickStarted; }
// public void tickStarted(boolean value) { wrapperContained.tickStarted = value; }
// public static boolean tickStarted() { return net.minecraft.util.profiler.ProfilerSystem.tickStarted; }
// public static void tickStarted(boolean value, ) { net.minecraft.util.profiler.ProfilerSystem.tickStarted = value; }

// public java.lang.String fullPath() { return wrapperContained.fullPath; }
// public void fullPath(java.lang.String value) { wrapperContained.fullPath = value; }
// public static java.lang.String fullPath() { return net.minecraft.util.profiler.ProfilerSystem.fullPath; }
// public static void fullPath(java.lang.String value, ) { net.minecraft.util.profiler.ProfilerSystem.fullPath = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiler.ProfilerSystem.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiler.ProfilerSystem.LOGGER = value; }

// public java.util.List path() { return wrapperContained.path; }
// public void path(java.util.List value) { wrapperContained.path = value; }
// public static java.util.List path() { return net.minecraft.util.profiler.ProfilerSystem.path; }
// public static void path(java.util.List value, ) { net.minecraft.util.profiler.ProfilerSystem.path = value; }

// public java.util.function.IntSupplier endTickGetter() { return wrapperContained.endTickGetter; }
// public void endTickGetter(java.util.function.IntSupplier value) { wrapperContained.endTickGetter = value; }
// public static java.util.function.IntSupplier endTickGetter() { return net.minecraft.util.profiler.ProfilerSystem.endTickGetter; }
// public static void endTickGetter(java.util.function.IntSupplier value, ) { net.minecraft.util.profiler.ProfilerSystem.endTickGetter = value; }

// public long TIMEOUT_NANOSECONDS() { return wrapperContained.TIMEOUT_NANOSECONDS; }
// public void TIMEOUT_NANOSECONDS(long value) { wrapperContained.TIMEOUT_NANOSECONDS = value; }
// public static long TIMEOUT_NANOSECONDS() { return net.minecraft.util.profiler.ProfilerSystem.TIMEOUT_NANOSECONDS; }
// public static void TIMEOUT_NANOSECONDS(long value, ) { net.minecraft.util.profiler.ProfilerSystem.TIMEOUT_NANOSECONDS = value; }

// public boolean checkTimeout() { return wrapperContained.checkTimeout; }
// public void checkTimeout(boolean value) { wrapperContained.checkTimeout = value; }
// public static boolean checkTimeout() { return net.minecraft.util.profiler.ProfilerSystem.checkTimeout; }
// public static void checkTimeout(boolean value, ) { net.minecraft.util.profiler.ProfilerSystem.checkTimeout = value; }

// public java.util.Map locationInfos() { return wrapperContained.locationInfos; }
// public void locationInfos(java.util.Map value) { wrapperContained.locationInfos = value; }
// public static java.util.Map locationInfos() { return net.minecraft.util.profiler.ProfilerSystem.locationInfos; }
// public static void locationInfos(java.util.Map value, ) { net.minecraft.util.profiler.ProfilerSystem.locationInfos = value; }

// public Object currentInfo() { return wrapperContained.currentInfo; }
// // public void currentInfo(Object value) { wrapperContained.currentInfo = value; }
// // public static Object currentInfo() { return net.minecraft.util.profiler.ProfilerSystem.currentInfo; }
// // public static void currentInfo(Object value, ) { net.minecraft.util.profiler.ProfilerSystem.currentInfo = value; }

// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public static java.util.function.LongSupplier timeGetter() { return net.minecraft.util.profiler.ProfilerSystem.timeGetter; }
// public static void timeGetter(java.util.function.LongSupplier value, ) { net.minecraft.util.profiler.ProfilerSystem.timeGetter = value; }

// public java.util.Set sampleTypes() { return wrapperContained.sampleTypes; }
// public void sampleTypes(java.util.Set value) { wrapperContained.sampleTypes = value; }
// public static java.util.Set sampleTypes() { return net.minecraft.util.profiler.ProfilerSystem.sampleTypes; }
// public static void sampleTypes(java.util.Set value, ) { net.minecraft.util.profiler.ProfilerSystem.sampleTypes = value; }

public ProfilerSystem(java.util.function.LongSupplier timeGetter,java.util.function.IntSupplier tickGetter,boolean checkTimeout) { this.wrapperContained = new net.minecraft.util.profiler.ProfilerSystem(timeGetter,tickGetter,checkTimeout); }
// public Object method_24245(java.lang.String k) { return wrapperContained.method_24245(k); }
// public static Object method_24245(java.lang.String k, ) { return net.minecraft.util.profiler.ProfilerSystem.method_24245(k); }
// public Object getCurrentInfo() { return wrapperContained.getCurrentInfo(); }
// public static Object getCurrentInfo() { return net.minecraft.util.profiler.ProfilerSystem.getCurrentInfo(); }

}