package yarnwrap.util.profiler;
public class Profiler { public net.minecraft.util.profiler.Profiler wrapperContained; public Profiler(net.minecraft.util.profiler.Profiler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String ROOT_NAME() { return wrapperContained.ROOT_NAME; }
// public void ROOT_NAME(java.lang.String value) { wrapperContained.ROOT_NAME = value; }
public static java.lang.String ROOT_NAME() { return net.minecraft.util.profiler.Profiler.ROOT_NAME; }
// public static void ROOT_NAME(java.lang.String value, ) { net.minecraft.util.profiler.Profiler.ROOT_NAME = value; }

public void push(java.lang.String location) { wrapperContained.push(location); }
// public static void push(java.lang.String location, ) { net.minecraft.util.profiler.Profiler.push(location); }
public void push(java.util.function.Supplier locationGetter) { wrapperContained.push(locationGetter); }
// public static void push(java.util.function.Supplier locationGetter, ) { net.minecraft.util.profiler.Profiler.push(locationGetter); }
public void swap(java.util.function.Supplier locationGetter) { wrapperContained.swap(locationGetter); }
// public static void swap(java.util.function.Supplier locationGetter, ) { net.minecraft.util.profiler.Profiler.swap(locationGetter); }
public void swap(java.lang.String location) { wrapperContained.swap(location); }
// public static void swap(java.lang.String location, ) { net.minecraft.util.profiler.Profiler.swap(location); }
public void pop() { wrapperContained.pop(); }
// public static void pop() { net.minecraft.util.profiler.Profiler.pop(); }
public void startTick() { wrapperContained.startTick(); }
// public static void startTick() { net.minecraft.util.profiler.Profiler.startTick(); }
public void endTick() { wrapperContained.endTick(); }
// public static void endTick() { net.minecraft.util.profiler.Profiler.endTick(); }
public void visit(java.lang.String marker,int num) { wrapperContained.visit(marker,num); }
// public static void visit(java.lang.String marker,int num, ) { net.minecraft.util.profiler.Profiler.visit(marker,num); }
public void visit(java.util.function.Supplier markerGetter,int num) { wrapperContained.visit(markerGetter,num); }
// public static void visit(java.util.function.Supplier markerGetter,int num, ) { net.minecraft.util.profiler.Profiler.visit(markerGetter,num); }
public void markSampleType(yarnwrap.util.profiler.SampleType type) { wrapperContained.markSampleType(type.wrapperContained); }
// public static void markSampleType(yarnwrap.util.profiler.SampleType type, ) { net.minecraft.util.profiler.Profiler.markSampleType(type.wrapperContained); }
public void visit(java.util.function.Supplier markerGetter) { wrapperContained.visit(markerGetter); }
// public static void visit(java.util.function.Supplier markerGetter, ) { net.minecraft.util.profiler.Profiler.visit(markerGetter); }
public void visit(java.lang.String marker) { wrapperContained.visit(marker); }
// public static void visit(java.lang.String marker, ) { net.minecraft.util.profiler.Profiler.visit(marker); }
public yarnwrap.util.profiler.ScopedProfiler scoped(java.util.function.Supplier nameSupplier) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.scoped(nameSupplier)); }
// public static yarnwrap.util.profiler.ScopedProfiler scoped(java.util.function.Supplier nameSupplier, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.Profiler.scoped(nameSupplier)); }
public yarnwrap.util.profiler.ScopedProfiler scoped(java.lang.String name) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.scoped(name)); }
// public static yarnwrap.util.profiler.ScopedProfiler scoped(java.lang.String name, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.Profiler.scoped(name)); }
public void setZoneColor(int color) { wrapperContained.setZoneColor(color); }
// public static void setZoneColor(int color, ) { net.minecraft.util.profiler.Profiler.setZoneColor(color); }
public void addZoneValue(long value) { wrapperContained.addZoneValue(value); }
// public static void addZoneValue(long value, ) { net.minecraft.util.profiler.Profiler.addZoneValue(value); }
// public yarnwrap.util.profiler.Profiler union(yarnwrap.util.profiler.Profiler first,yarnwrap.util.profiler.Profiler second) { return new yarnwrap.util.profiler.Profiler(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.util.profiler.Profiler union(yarnwrap.util.profiler.Profiler first,yarnwrap.util.profiler.Profiler second, ) { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.Profiler.union(first.wrapperContained,second.wrapperContained)); }
public void addZoneText(java.lang.String label) { wrapperContained.addZoneText(label); }
// public static void addZoneText(java.lang.String label, ) { net.minecraft.util.profiler.Profiler.addZoneText(label); }

}