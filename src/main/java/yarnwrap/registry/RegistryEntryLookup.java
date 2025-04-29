package yarnwrap.registry;
public class RegistryEntryLookup { public net.minecraft.registry.RegistryEntryLookup wrapperContained; public RegistryEntryLookup(net.minecraft.registry.RegistryEntryLookup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional getOptional(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOptional(tag.wrapperContained); }
// public static java.util.Optional getOptional(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.RegistryEntryLookup.getOptional(tag.wrapperContained); }
public Object getOrThrow(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrThrow(tag.wrapperContained); }
// public static Object getOrThrow(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.registry.RegistryEntryLookup.getOrThrow(tag.wrapperContained); }
public java.util.Optional getOptional(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOptional(key.wrapperContained); }
// public static java.util.Optional getOptional(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.RegistryEntryLookup.getOptional(key.wrapperContained); }
public Object getOrThrow(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOrThrow(key.wrapperContained); }
// public static Object getOrThrow(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.registry.RegistryEntryLookup.getOrThrow(key.wrapperContained); }

}