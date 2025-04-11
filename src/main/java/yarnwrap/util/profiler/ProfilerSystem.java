package yarnwrap.util.profiler;
public class ProfilerSystem { public net.minecraft.util.profiler.ProfilerSystem wrapperContained; public ProfilerSystem(net.minecraft.util.profiler.ProfilerSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startTick() { return wrapperContained.startTick; }
// public void startTick(int value) { wrapperContained.startTick = value; }
// public it.unimi.dsi.fastutil.longs.LongList timeList() { return wrapperContained.timeList; }
// public void timeList(it.unimi.dsi.fastutil.longs.LongList value) { wrapperContained.timeList = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public boolean tickStarted() { return wrapperContained.tickStarted; }
// public void tickStarted(boolean value) { wrapperContained.tickStarted = value; }
// public java.lang.String fullPath() { return wrapperContained.fullPath; }
// public void fullPath(java.lang.String value) { wrapperContained.fullPath = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List path() { return wrapperContained.path; }
// public void path(java.util.List value) { wrapperContained.path = value; }
// public java.util.function.IntSupplier endTickGetter() { return wrapperContained.endTickGetter; }
// public void endTickGetter(java.util.function.IntSupplier value) { wrapperContained.endTickGetter = value; }
// public long TIMEOUT_NANOSECONDS() { return wrapperContained.TIMEOUT_NANOSECONDS; }
// public void TIMEOUT_NANOSECONDS(long value) { wrapperContained.TIMEOUT_NANOSECONDS = value; }
// public boolean checkTimeout() { return wrapperContained.checkTimeout; }
// public void checkTimeout(boolean value) { wrapperContained.checkTimeout = value; }
// public java.util.Map locationInfos() { return wrapperContained.locationInfos; }
// public void locationInfos(java.util.Map value) { wrapperContained.locationInfos = value; }
// public Object currentInfo() { return wrapperContained.currentInfo; }
// // public void currentInfo(Object value) { wrapperContained.currentInfo = value; }
// public java.util.function.LongSupplier timeGetter() { return wrapperContained.timeGetter; }
// public void timeGetter(java.util.function.LongSupplier value) { wrapperContained.timeGetter = value; }
// public java.util.Set sampleTypes() { return wrapperContained.sampleTypes; }
// public void sampleTypes(java.util.Set value) { wrapperContained.sampleTypes = value; }
public ProfilerSystem(java.util.function.LongSupplier timeGetter,java.util.function.IntSupplier tickGetter,boolean checkTimeout) { this.wrapperContained = new net.minecraft.util.profiler.ProfilerSystem(timeGetter,tickGetter,checkTimeout); }
// public Object method_24245(java.lang.String k) { return wrapperContained.method_24245(k); }
// public Object getCurrentInfo() { return wrapperContained.getCurrentInfo(); }

}