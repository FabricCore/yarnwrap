package yarnwrap.registry;
public class RegistryKey { public net.minecraft.registry.RegistryKey wrapperContained; public RegistryKey(net.minecraft.registry.RegistryKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.ConcurrentMap INSTANCES() { return wrapperContained.INSTANCES; }
// public void INSTANCES(java.util.concurrent.ConcurrentMap value) { wrapperContained.INSTANCES = value; }
// public static java.util.concurrent.ConcurrentMap INSTANCES() { return net.minecraft.registry.RegistryKey.INSTANCES; }
// public static void INSTANCES(java.util.concurrent.ConcurrentMap value, ) { net.minecraft.registry.RegistryKey.INSTANCES = value; }

// public yarnwrap.util.Identifier registry() { return new yarnwrap.util.Identifier(wrapperContained.registry); }
// public void registry(yarnwrap.util.Identifier value) { wrapperContained.registry = value.wrapperContained; }
// public static yarnwrap.util.Identifier registry() { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryKey.registry); }
// public static void registry(yarnwrap.util.Identifier value, ) { net.minecraft.registry.RegistryKey.registry = value.wrapperContained; }

// public yarnwrap.util.Identifier value() { return new yarnwrap.util.Identifier(wrapperContained.value); }
// public void value(yarnwrap.util.Identifier value) { wrapperContained.value = value.wrapperContained; }
// public static yarnwrap.util.Identifier value() { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryKey.value); }
// public static void value(yarnwrap.util.Identifier value, ) { net.minecraft.registry.RegistryKey.value = value.wrapperContained; }

// public RegistryKey(yarnwrap.util.Identifier registry,yarnwrap.util.Identifier value) { this.wrapperContained = new net.minecraft.registry.RegistryKey(registry.wrapperContained,value.wrapperContained); }
public yarnwrap.util.Identifier getValue() { return new yarnwrap.util.Identifier(wrapperContained.getValue()); }
// public static yarnwrap.util.Identifier getValue() { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryKey.getValue()); }
// public yarnwrap.registry.RegistryKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier value) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(registry.wrapperContained,value.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey of(yarnwrap.registry.RegistryKey registry,yarnwrap.util.Identifier value, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.of(registry.wrapperContained,value.wrapperContained)); }
// public yarnwrap.registry.RegistryKey ofRegistry(yarnwrap.util.Identifier registry) { return new yarnwrap.registry.RegistryKey(wrapperContained.ofRegistry(registry.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey ofRegistry(yarnwrap.util.Identifier registry, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.ofRegistry(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier registry,yarnwrap.util.Identifier value) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(registry.wrapperContained,value.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier registry,yarnwrap.util.Identifier value, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.of(registry.wrapperContained,value.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_29182(Object pair) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_29182(pair)); }
// public static yarnwrap.registry.RegistryKey method_29182(Object pair, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.method_29182(pair)); }
public boolean isOf(yarnwrap.registry.RegistryKey registry) { return wrapperContained.isOf(registry.wrapperContained); }
// public static boolean isOf(yarnwrap.registry.RegistryKey registry, ) { return net.minecraft.registry.RegistryKey.isOf(registry.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registry) { return wrapperContained.createCodec(registry.wrapperContained); }
// public static com.mojang.serialization.Codec createCodec(yarnwrap.registry.RegistryKey registry, ) { return net.minecraft.registry.RegistryKey.createCodec(registry.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_39155(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_39155(id.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_39155(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.method_39155(id.wrapperContained)); }
public java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.tryCast(registryRef.wrapperContained); }
// public static java.util.Optional tryCast(yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.registry.RegistryKey.tryCast(registryRef.wrapperContained); }
public yarnwrap.util.Identifier getRegistry() { return new yarnwrap.util.Identifier(wrapperContained.getRegistry()); }
// public static yarnwrap.util.Identifier getRegistry() { return new yarnwrap.util.Identifier(net.minecraft.registry.RegistryKey.getRegistry()); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(registry.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.registry.RegistryKey registry, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.registry.RegistryKey.createPacketCodec(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_56039(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_56039(id.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_56039(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.method_56039(id.wrapperContained)); }
public yarnwrap.registry.RegistryKey getRegistryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.getRegistryRef()); }
// public static yarnwrap.registry.RegistryKey getRegistryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.RegistryKey.getRegistryRef()); }

}