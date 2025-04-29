package yarnwrap.registry;
public class RegistryPair { public net.minecraft.registry.RegistryPair wrapperContained; public RegistryPair(net.minecraft.registry.RegistryPair wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional entry() { return wrapperContained.entry; }
// public void entry(java.util.Optional value) { wrapperContained.entry = value; }
// public static java.util.Optional entry() { return net.minecraft.registry.RegistryPair.entry; }
// public static void entry(java.util.Optional value, ) { net.minecraft.registry.RegistryPair.entry = value; }

public RegistryPair(yarnwrap.registry.RegistryKey key) { this.wrapperContained = new net.minecraft.registry.RegistryPair(key.wrapperContained); }
public RegistryPair(yarnwrap.registry.entry.RegistryEntry entry) { this.wrapperContained = new net.minecraft.registry.RegistryPair(entry.wrapperContained); }
// public java.util.Optional entry() { return wrapperContained.entry(); }
// // public static java.util.Optional entry() { return net.minecraft.registry.RegistryPair.entry(); }
public com.mojang.datafixers.util.Either asEither() { return wrapperContained.asEither(); }
// public static com.mojang.datafixers.util.Either asEither() { return net.minecraft.registry.RegistryPair.asEither(); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec) { return wrapperContained.createCodec(registryRef.wrapperContained,entryCodec); }
// public static com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec, ) { return net.minecraft.registry.RegistryPair.createCodec(registryRef.wrapperContained,entryCodec); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registryRef,yarnwrap.network.codec.PacketCodec entryPacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(registryRef.wrapperContained,entryPacketCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registryRef,yarnwrap.network.codec.PacketCodec entryPacketCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.registry.RegistryPair.createPacketCodec(registryRef.wrapperContained,entryPacketCodec.wrapperContained)); }
// public yarnwrap.registry.RegistryPair create(com.mojang.datafixers.util.Either entryOrKey) { return new yarnwrap.registry.RegistryPair(wrapperContained.create(entryOrKey)); }
// public static yarnwrap.registry.RegistryPair create(com.mojang.datafixers.util.Either entryOrKey, ) { return new yarnwrap.registry.RegistryPair(net.minecraft.registry.RegistryPair.create(entryOrKey)); }
// public java.util.Optional getEntry(Object registryLookup) { return wrapperContained.getEntry(registryLookup); }
// public static java.util.Optional getEntry(Object registryLookup, ) { return net.minecraft.registry.RegistryPair.getEntry(registryLookup); }
public java.util.Optional getValue(yarnwrap.registry.Registry registry) { return wrapperContained.getValue(registry.wrapperContained); }
// public static java.util.Optional getValue(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.RegistryPair.getValue(registry.wrapperContained); }

}