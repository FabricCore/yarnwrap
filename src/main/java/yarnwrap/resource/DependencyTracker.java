package yarnwrap.resource;
public class DependencyTracker { public net.minecraft.resource.DependencyTracker wrapperContained; public DependencyTracker(net.minecraft.resource.DependencyTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map underlying() { return wrapperContained.underlying; }
// public void underlying(java.util.Map value) { wrapperContained.underlying = value; }
// public void method_51482(com.google.common.collect.Multimap key,java.lang.Object value) { wrapperContained.method_51482(key,value); }
// public boolean containsReverseDependency(com.google.common.collect.Multimap dependencies,java.lang.Object key,java.lang.Object dependency) { return wrapperContained.containsReverseDependency(dependencies,key,dependency); }
// public void traverse(com.google.common.collect.Multimap parentChild,java.util.Set visited,java.lang.Object rootKey,java.util.function.BiConsumer callback) { wrapperContained.traverse(parentChild,visited,rootKey,callback); }
// public void method_51485(com.google.common.collect.Multimap key) { wrapperContained.method_51485(key); }
// public yarnwrap.resource.DependencyTracker add(java.lang.Object key,Object value) { return new yarnwrap.resource.DependencyTracker(wrapperContained.add(key,value)); }
public void traverse(java.util.function.BiConsumer callback) { wrapperContained.traverse(callback); }
// public void method_51488(com.google.common.collect.Multimap key,java.lang.Object value) { wrapperContained.method_51488(key,value); }
// public void addDependency(com.google.common.collect.Multimap dependencies,java.lang.Object key,java.lang.Object dependency) { wrapperContained.addDependency(dependencies,key,dependency); }
// public void method_51490(com.google.common.collect.Multimap child) { wrapperContained.method_51490(child); }
// public void method_51491(com.google.common.collect.Multimap dependency) { wrapperContained.method_51491(dependency); }
// public void method_51492(com.google.common.collect.Multimap dependency) { wrapperContained.method_51492(dependency); }
// public boolean method_51493(com.google.common.collect.Multimap subdependency) { return wrapperContained.method_51493(subdependency); }

}