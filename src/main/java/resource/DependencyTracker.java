package yarnwrap.resource;
public class DependencyTracker { public net.minecraft.resource.DependencyTracker wrapperContained; public DependencyTracker(net.minecraft.resource.DependencyTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map underlying() { return wrapperContained.underlying; }
// public boolean containsReverseDependency(com.google.common.collect.Multimap dependencies,java.lang.Object key,java.lang.Object dependency) { return wrapperContained.containsReverseDependency(dependencies,key,dependency); }
// public void traverse(com.google.common.collect.Multimap parentChild,java.util.Set visited,java.lang.Object rootKey,java.util.function.BiConsumer callback) { wrapperContained.traverse(parentChild,visited,rootKey,callback); }
// public yarnwrap.resource.DependencyTracker add(java.lang.Object key,Object value) { return new yarnwrap.resource.DependencyTracker(wrapperContained.add(key,value)); }
public void traverse(java.util.function.BiConsumer callback) { wrapperContained.traverse(callback); }
// public void addDependency(com.google.common.collect.Multimap dependencies,java.lang.Object key,java.lang.Object dependency) { wrapperContained.addDependency(dependencies,key,dependency); }

}