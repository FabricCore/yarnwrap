package yarnwrap.registry;
public class ContextSwappableRegistryLookup { public net.minecraft.registry.ContextSwappableRegistryLookup wrapperContained; public ContextSwappableRegistryLookup(net.minecraft.registry.ContextSwappableRegistryLookup wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object delegate() { return wrapperContained.delegate; }
// // public void delegate(Object value) { wrapperContained.delegate = value; }
// // public static Object delegate() { return net.minecraft.registry.ContextSwappableRegistryLookup.delegate; }
// // public static void delegate(Object value, ) { net.minecraft.registry.ContextSwappableRegistryLookup.delegate = value; }

// public Object entryLookupImpl() { return wrapperContained.entryLookupImpl; }
// // public void entryLookupImpl(Object value) { wrapperContained.entryLookupImpl = value; }
// // public static Object entryLookupImpl() { return net.minecraft.registry.ContextSwappableRegistryLookup.entryLookupImpl; }
// // public static void entryLookupImpl(Object value, ) { net.minecraft.registry.ContextSwappableRegistryLookup.entryLookupImpl = value; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public static java.util.Map entries() { return net.minecraft.registry.ContextSwappableRegistryLookup.entries; }
// public static void entries(java.util.Map value, ) { net.minecraft.registry.ContextSwappableRegistryLookup.entries = value; }

// public java.util.Map tags() { return wrapperContained.tags; }
// public void tags(java.util.Map value) { wrapperContained.tags = value; }
// public static java.util.Map tags() { return net.minecraft.registry.ContextSwappableRegistryLookup.tags; }
// public static void tags(java.util.Map value, ) { net.minecraft.registry.ContextSwappableRegistryLookup.tags = value; }

// public ContextSwappableRegistryLookup(Object delegate) { this.wrapperContained = new net.minecraft.registry.ContextSwappableRegistryLookup(delegate); }
public yarnwrap.registry.ContextSwapper createContextSwapper() { return new yarnwrap.registry.ContextSwapper(wrapperContained.createContextSwapper()); }
// public static yarnwrap.registry.ContextSwapper createContextSwapper() { return new yarnwrap.registry.ContextSwapper(net.minecraft.registry.ContextSwappableRegistryLookup.createContextSwapper()); }
public yarnwrap.registry.RegistryOps createRegistryOps(com.mojang.serialization.DynamicOps delegateOps) { return new yarnwrap.registry.RegistryOps(wrapperContained.createRegistryOps(delegateOps)); }
// public static yarnwrap.registry.RegistryOps createRegistryOps(com.mojang.serialization.DynamicOps delegateOps, ) { return new yarnwrap.registry.RegistryOps(net.minecraft.registry.ContextSwappableRegistryLookup.createRegistryOps(delegateOps)); }
public boolean hasEntries() { return wrapperContained.hasEntries(); }
// public static boolean hasEntries() { return net.minecraft.registry.ContextSwappableRegistryLookup.hasEntries(); }

}