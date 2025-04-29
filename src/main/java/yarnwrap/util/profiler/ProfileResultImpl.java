package yarnwrap.util.profiler;
public class ProfileResultImpl { public net.minecraft.util.profiler.ProfileResultImpl wrapperContained; public ProfileResultImpl(net.minecraft.util.profiler.ProfileResultImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int endTick() { return wrapperContained.endTick; }
// public void endTick(int value) { wrapperContained.endTick = value; }
// public static int endTick() { return net.minecraft.util.profiler.ProfileResultImpl.endTick; }
// public static void endTick(int value, ) { net.minecraft.util.profiler.ProfileResultImpl.endTick = value; }

// public int startTick() { return wrapperContained.startTick; }
// public void startTick(int value) { wrapperContained.startTick = value; }
// public static int startTick() { return net.minecraft.util.profiler.ProfileResultImpl.startTick; }
// public static void startTick(int value, ) { net.minecraft.util.profiler.ProfileResultImpl.startTick = value; }

// public long endTime() { return wrapperContained.endTime; }
// public void endTime(long value) { wrapperContained.endTime = value; }
// public static long endTime() { return net.minecraft.util.profiler.ProfileResultImpl.endTime; }
// public static void endTime(long value, ) { net.minecraft.util.profiler.ProfileResultImpl.endTime = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.util.profiler.ProfileResultImpl.startTime; }
// public static void startTime(long value, ) { net.minecraft.util.profiler.ProfileResultImpl.startTime = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.profiler.ProfileResultImpl.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.profiler.ProfileResultImpl.LOGGER = value; }

// public int tickDuration() { return wrapperContained.tickDuration; }
// public void tickDuration(int value) { wrapperContained.tickDuration = value; }
// public static int tickDuration() { return net.minecraft.util.profiler.ProfileResultImpl.tickDuration; }
// public static void tickDuration(int value, ) { net.minecraft.util.profiler.ProfileResultImpl.tickDuration = value; }

// public yarnwrap.util.profiler.ProfileLocationInfo EMPTY_INFO() { return new yarnwrap.util.profiler.ProfileLocationInfo(wrapperContained.EMPTY_INFO); }
// public void EMPTY_INFO(yarnwrap.util.profiler.ProfileLocationInfo value) { wrapperContained.EMPTY_INFO = value.wrapperContained; }
// public static yarnwrap.util.profiler.ProfileLocationInfo EMPTY_INFO() { return new yarnwrap.util.profiler.ProfileLocationInfo(net.minecraft.util.profiler.ProfileResultImpl.EMPTY_INFO); }
// public static void EMPTY_INFO(yarnwrap.util.profiler.ProfileLocationInfo value, ) { net.minecraft.util.profiler.ProfileResultImpl.EMPTY_INFO = value.wrapperContained; }

// public com.google.common.base.Splitter SPLITTER() { return wrapperContained.SPLITTER; }
// public void SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SPLITTER = value; }
// public static com.google.common.base.Splitter SPLITTER() { return net.minecraft.util.profiler.ProfileResultImpl.SPLITTER; }
// public static void SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.util.profiler.ProfileResultImpl.SPLITTER = value; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public static java.util.Comparator COMPARATOR() { return net.minecraft.util.profiler.ProfileResultImpl.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.util.profiler.ProfileResultImpl.COMPARATOR = value; }

// public java.util.Map locationInfos() { return wrapperContained.locationInfos; }
// public void locationInfos(java.util.Map value) { wrapperContained.locationInfos = value; }
// public static java.util.Map locationInfos() { return net.minecraft.util.profiler.ProfileResultImpl.locationInfos; }
// public static void locationInfos(java.util.Map value, ) { net.minecraft.util.profiler.ProfileResultImpl.locationInfos = value; }

public ProfileResultImpl(java.util.Map locationInfos,long startTime,int startTick,long endTime,int endTick) { this.wrapperContained = new net.minecraft.util.profiler.ProfileResultImpl(locationInfos,startTime,startTick,endTime,endTick); }
// public void appendTiming(int level,java.lang.String name,java.lang.StringBuilder sb) { wrapperContained.appendTiming(level,name,sb); }
// public static void appendTiming(int level,java.lang.String name,java.lang.StringBuilder sb, ) { net.minecraft.util.profiler.ProfileResultImpl.appendTiming(level,name,sb); }
// public java.lang.String asString(long timeSpan,int tickSpan) { return wrapperContained.asString(timeSpan,tickSpan); }
// public static java.lang.String asString(long timeSpan,int tickSpan, ) { return net.minecraft.util.profiler.ProfileResultImpl.asString(timeSpan,tickSpan); }
// public void method_24252(int entry) { wrapperContained.method_24252(entry); }
// public static void method_24252(int entry, ) { net.minecraft.util.profiler.ProfileResultImpl.method_24252(entry); }
// public void appendCounter(int depth,java.lang.String name,Object info,int tickSpan,java.lang.StringBuilder sb) { wrapperContained.appendCounter(depth,name,info,tickSpan,sb); }
// public static void appendCounter(int depth,java.lang.String name,Object info,int tickSpan,java.lang.StringBuilder sb, ) { net.minecraft.util.profiler.ProfileResultImpl.appendCounter(depth,name,info,tickSpan,sb); }
// public boolean isSubpath(java.lang.String parent,java.lang.String path) { return wrapperContained.isSubpath(parent,path); }
// public static boolean isSubpath(java.lang.String parent,java.lang.String path, ) { return net.minecraft.util.profiler.ProfileResultImpl.isSubpath(parent,path); }
// public java.lang.StringBuilder indent(java.lang.StringBuilder sb,int size) { return wrapperContained.indent(sb,size); }
// public static java.lang.StringBuilder indent(java.lang.StringBuilder sb,int size, ) { return net.minecraft.util.profiler.ProfileResultImpl.indent(sb,size); }
// public void method_24257(java.lang.StringBuilder name,int info) { wrapperContained.method_24257(name,info); }
// public static void method_24257(java.lang.StringBuilder name,int info, ) { net.minecraft.util.profiler.ProfileResultImpl.method_24257(name,info); }
// public void method_24258(java.lang.StringBuilder marker,int count) { wrapperContained.method_24258(marker,count); }
// public static void method_24258(java.lang.StringBuilder marker,int count, ) { net.minecraft.util.profiler.ProfileResultImpl.method_24258(marker,count); }
// public void method_24259(java.util.Map location,java.lang.String info) { wrapperContained.method_24259(location,info); }
// public static void method_24259(java.util.Map location,java.lang.String info, ) { net.minecraft.util.profiler.ProfileResultImpl.method_24259(location,info); }
// public void appendCounterDump(java.util.Map counters,java.lang.StringBuilder sb,int tickSpan) { wrapperContained.appendCounterDump(counters,sb,tickSpan); }
// public static void appendCounterDump(java.util.Map counters,java.lang.StringBuilder sb,int tickSpan, ) { net.minecraft.util.profiler.ProfileResultImpl.appendCounterDump(counters,sb,tickSpan); }
// public void method_24261(java.util.Map marker,java.util.List count) { wrapperContained.method_24261(marker,count); }
// public static void method_24261(java.util.Map marker,java.util.List count, ) { net.minecraft.util.profiler.ProfileResultImpl.method_24261(marker,count); }
// public yarnwrap.util.profiler.ProfileLocationInfo getInfo(java.lang.String path) { return new yarnwrap.util.profiler.ProfileLocationInfo(wrapperContained.getInfo(path)); }
// public static yarnwrap.util.profiler.ProfileLocationInfo getInfo(java.lang.String path, ) { return new yarnwrap.util.profiler.ProfileLocationInfo(net.minecraft.util.profiler.ProfileResultImpl.getInfo(path)); }
// public Object method_24263(java.lang.String k) { return wrapperContained.method_24263(k); }
// public static Object method_24263(java.lang.String k, ) { return net.minecraft.util.profiler.ProfileResultImpl.method_24263(k); }
// public java.util.Map setupCounters() { return wrapperContained.setupCounters(); }
// public static java.util.Map setupCounters() { return net.minecraft.util.profiler.ProfileResultImpl.setupCounters(); }

}