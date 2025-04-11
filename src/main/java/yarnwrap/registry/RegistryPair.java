package yarnwrap.registry;
public class RegistryPair { public net.minecraft.registry.RegistryPair wrapperContained; public RegistryPair(net.minecraft.registry.RegistryPair wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional entry() { return wrapperContained.entry; }
// public void entry(java.util.Optional value) { wrapperContained.entry = value; }
public RegistryPair(yarnwrap.registry.RegistryKey key) { this.wrapperContained = new net.minecraft.registry.RegistryPair(key.wrapperContained); }
public RegistryPair(yarnwrap.registry.entry.RegistryEntry entry) { this.wrapperContained = new net.minecraft.registry.RegistryPair(entry.wrapperContained); }
// public java.util.Optional entry() { return wrapperContained.entry(); }
public com.mojang.datafixers.util.Either asEither() { return wrapperContained.asEither(); }
public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registryRef,com.mojang.serialization.Codec entryCodec) { return wrapperContained.createCodec(registryRef.wrapperContained,entryCodec); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registryRef,yarnwrap.network.codec.PacketCodec entryPacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(registryRef.wrapperContained,entryPacketCodec.wrapperContained)); }
public yarnwrap.registry.RegistryPair create(com.mojang.datafixers.util.Either entryOrKey) { return new yarnwrap.registry.RegistryPair(wrapperContained.create(entryOrKey)); }
// public java.util.Optional getEntry(Object registryLookup) { return wrapperContained.getEntry(registryLookup); }
public java.util.Optional getValue(yarnwrap.registry.Registry registry) { return wrapperContained.getValue(registry.wrapperContained); }

}