package yarnwrap.util.profiler;
public class Profiler { public net.minecraft.util.profiler.Profiler wrapperContained; public Profiler(net.minecraft.util.profiler.Profiler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String ROOT_NAME() { return wrapperContained.ROOT_NAME; }
public void push(java.lang.String location) { wrapperContained.push(location); }
public void push(java.util.function.Supplier locationGetter) { wrapperContained.push(locationGetter); }
public void swap(java.util.function.Supplier locationGetter) { wrapperContained.swap(locationGetter); }
public void swap(java.lang.String location) { wrapperContained.swap(location); }
public void pop() { wrapperContained.pop(); }
public void startTick() { wrapperContained.startTick(); }
public void endTick() { wrapperContained.endTick(); }
public void visit(java.lang.String marker,int num) { wrapperContained.visit(marker,num); }
public void visit(java.util.function.Supplier markerGetter,int num) { wrapperContained.visit(markerGetter,num); }
// public yarnwrap.util.profiler.Profiler union(yarnwrap.util.profiler.Profiler a,yarnwrap.util.profiler.Profiler b) { return new yarnwrap.util.profiler.Profiler(wrapperContained.union(a.wrapperContained,b.wrapperContained)); }
public void markSampleType(yarnwrap.util.profiler.SampleType type) { wrapperContained.markSampleType(type.wrapperContained); }
public void visit(java.util.function.Supplier markerGetter) { wrapperContained.visit(markerGetter); }
public void visit(java.lang.String marker) { wrapperContained.visit(marker); }

}