package yarnwrap.registry;
public class RegistryKey { public net.minecraft.registry.RegistryKey wrapperContained; public RegistryKey(net.minecraft.registry.RegistryKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.ConcurrentMap INSTANCES() { return wrapperContained.INSTANCES; }
// public yarnwrap.util.Identifier registry() { return new yarnwrap.util.Identifier(wrapperContained.registry); }
// public yarnwrap.util.Identifier value() { return new yarnwrap.util.Identifier(wrapperContained.value); }
public yarnwrap.util.Identifier getValue() { return new yarnwrap.util.Identifier(wrapperContained.getValue()); }
public yarnwrap.registry.RegistryKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier value) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(registry.wrapperContained,value.wrapperContained)); }
public yarnwrap.registry.RegistryKey ofRegistry(yarnwrap.util.Identifier registry) { return new yarnwrap.registry.RegistryKey(wrapperContained.ofRegistry(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier registry,yarnwrap.util.Identifier value) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(registry.wrapperContained,value.wrapperContained)); }
public boolean isOf(yarnwrap.registry.RegistryKey registry) { return wrapperContained.isOf(registry.wrapperContained); }
public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.createCodec(registry.wrapperContained); }
public java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.tryCast(registryRef.wrapperContained); }
public yarnwrap.util.Identifier getRegistry() { return new yarnwrap.util.Identifier(wrapperContained.getRegistry()); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(registry.wrapperContained)); }
public yarnwrap.registry.RegistryKey getRegistryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.getRegistryRef()); }

}