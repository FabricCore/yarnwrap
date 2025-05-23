package yarnwrap.registry.entry;
public class LazyRegistryEntryReference { public net.minecraft.registry.entry.LazyRegistryEntryReference wrapperContained; public LazyRegistryEntryReference(net.minecraft.registry.entry.LazyRegistryEntryReference wrapperContained) { this.wrapperContained = wrapperContained; }

public LazyRegistryEntryReference(yarnwrap.registry.RegistryKey key) { this.wrapperContained = new net.minecraft.registry.entry.LazyRegistryEntryReference(key.wrapperContained); }
public LazyRegistryEntryReference(yarnwrap.registry.entry.RegistryEntry entry) { this.wrapperContained = new net.minecraft.registry.entry.LazyRegistryEntryReference(entry.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec) { return wrapperContained.createCodec(registryRef.wrapperContained,entryCodec); }
// public static com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec, ) { return net.minecraft.registry.entry.LazyRegistryEntryReference.createCodec(registryRef.wrapperContained,entryCodec); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registryRef,yarnwrap.network.codec.PacketCodec entryPacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(registryRef.wrapperContained,entryPacketCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registryRef,yarnwrap.network.codec.PacketCodec entryPacketCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.registry.entry.LazyRegistryEntryReference.createPacketCodec(registryRef.wrapperContained,entryPacketCodec.wrapperContained)); }
// public java.util.Optional resolveEntry(Object registries) { return wrapperContained.resolveEntry(registries); }
// public static java.util.Optional resolveEntry(Object registries, ) { return net.minecraft.registry.entry.LazyRegistryEntryReference.resolveEntry(registries); }
public java.util.Optional resolveValue(yarnwrap.registry.Registry registry) { return wrapperContained.resolveValue(registry.wrapperContained); }
// public static java.util.Optional resolveValue(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.entry.LazyRegistryEntryReference.resolveValue(registry.wrapperContained); }
public java.util.Optional getKey() { return wrapperContained.getKey(); }
// public static java.util.Optional getKey() { return net.minecraft.registry.entry.LazyRegistryEntryReference.getKey(); }
// public yarnwrap.registry.entry.RegistryEntry method_67386(Object entry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_67386(entry)); }
// public static yarnwrap.registry.entry.RegistryEntry method_67386(Object entry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.registry.entry.LazyRegistryEntryReference.method_67386(entry)); }
// public java.util.Optional method_67387(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.method_67387(entry.wrapperContained); }
// public static java.util.Optional method_67387(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.registry.entry.LazyRegistryEntryReference.method_67387(entry.wrapperContained); }
// public java.util.Optional method_67388(Object key) { return wrapperContained.method_67388(key); }
// public static java.util.Optional method_67388(Object key, ) { return net.minecraft.registry.entry.LazyRegistryEntryReference.method_67388(key); }

}