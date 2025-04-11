package yarnwrap.util.profiler;
public class ProfileResultImpl { public net.minecraft.util.profiler.ProfileResultImpl wrapperContained; public ProfileResultImpl(net.minecraft.util.profiler.ProfileResultImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int endTick() { return wrapperContained.endTick; }
// public void endTick(int value) { wrapperContained.endTick = value; }
// public int startTick() { return wrapperContained.startTick; }
// public void startTick(int value) { wrapperContained.startTick = value; }
// public long endTime() { return wrapperContained.endTime; }
// public void endTime(long value) { wrapperContained.endTime = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int tickDuration() { return wrapperContained.tickDuration; }
// public void tickDuration(int value) { wrapperContained.tickDuration = value; }
// public yarnwrap.util.profiler.ProfileLocationInfo EMPTY_INFO() { return new yarnwrap.util.profiler.ProfileLocationInfo(wrapperContained.EMPTY_INFO); }
// public void EMPTY_INFO(yarnwrap.util.profiler.ProfileLocationInfo value) { wrapperContained.EMPTY_INFO = value.wrapperContained; }
// public com.google.common.base.Splitter SPLITTER() { return wrapperContained.SPLITTER; }
// public void SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SPLITTER = value; }
// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public java.util.Map locationInfos() { return wrapperContained.locationInfos; }
// public void locationInfos(java.util.Map value) { wrapperContained.locationInfos = value; }
public ProfileResultImpl(java.util.Map locationInfos,long startTime,int startTick,long endTime,int endTick) { this.wrapperContained = new net.minecraft.util.profiler.ProfileResultImpl(locationInfos,startTime,startTick,endTime,endTick); }
// public void appendTiming(int level,java.lang.String name,java.lang.StringBuilder sb) { wrapperContained.appendTiming(level,name,sb); }
// public java.lang.String asString(long timeSpan,int tickSpan) { return wrapperContained.asString(timeSpan,tickSpan); }
// public void method_24252(int entry) { wrapperContained.method_24252(entry); }
// public void appendCounter(int depth,java.lang.String name,Object info,int tickSpan,java.lang.StringBuilder sb) { wrapperContained.appendCounter(depth,name,info,tickSpan,sb); }
// public boolean isSubpath(java.lang.String parent,java.lang.String path) { return wrapperContained.isSubpath(parent,path); }
// public java.lang.StringBuilder indent(java.lang.StringBuilder sb,int size) { return wrapperContained.indent(sb,size); }
// public void method_24257(java.lang.StringBuilder name,int info) { wrapperContained.method_24257(name,info); }
// public void method_24258(java.lang.StringBuilder marker,int count) { wrapperContained.method_24258(marker,count); }
// public void method_24259(java.util.Map location,java.lang.String info) { wrapperContained.method_24259(location,info); }
// public void appendCounterDump(java.util.Map counters,java.lang.StringBuilder sb,int tickSpan) { wrapperContained.appendCounterDump(counters,sb,tickSpan); }
// public void method_24261(java.util.Map marker,java.util.List count) { wrapperContained.method_24261(marker,count); }
// public yarnwrap.util.profiler.ProfileLocationInfo getInfo(java.lang.String path) { return new yarnwrap.util.profiler.ProfileLocationInfo(wrapperContained.getInfo(path)); }
// public Object method_24263(java.lang.String k) { return wrapperContained.method_24263(k); }
// public java.util.Map setupCounters() { return wrapperContained.setupCounters(); }

}