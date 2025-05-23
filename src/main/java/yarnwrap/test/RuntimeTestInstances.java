package yarnwrap.test;
public class RuntimeTestInstances { public net.minecraft.test.RuntimeTestInstances wrapperContained; public RuntimeTestInstances(net.minecraft.test.RuntimeTestInstances wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set INSTANCES() { return wrapperContained.INSTANCES; }
// public void INSTANCES(java.util.Set value) { wrapperContained.INSTANCES = value; }
// public static java.util.Set INSTANCES() { return net.minecraft.test.RuntimeTestInstances.INSTANCES; }
// public static void INSTANCES(java.util.Set value, ) { net.minecraft.test.RuntimeTestInstances.INSTANCES = value; }

// public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public static java.util.stream.Stream stream() { return net.minecraft.test.RuntimeTestInstances.stream(); }
// public void add(Object instance) { wrapperContained.add(instance); }
// public static void add(Object instance, ) { net.minecraft.test.RuntimeTestInstances.add(instance); }
// public void clear() { wrapperContained.clear(); }
public static void clear() { net.minecraft.test.RuntimeTestInstances.clear(); }

}