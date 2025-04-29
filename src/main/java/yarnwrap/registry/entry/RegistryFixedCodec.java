package yarnwrap.registry.entry;
public class RegistryFixedCodec { public net.minecraft.registry.entry.RegistryFixedCodec wrapperContained; public RegistryFixedCodec(net.minecraft.registry.entry.RegistryFixedCodec wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey registry() { return new yarnwrap.registry.RegistryKey(wrapperContained.registry); }
// public void registry(yarnwrap.registry.RegistryKey value) { wrapperContained.registry = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registry() { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.entry.RegistryFixedCodec.registry); }
// public static void registry(yarnwrap.registry.RegistryKey value, ) { net.minecraft.registry.entry.RegistryFixedCodec.registry = value.wrapperContained; }

// public RegistryFixedCodec(yarnwrap.registry.RegistryKey registry) { this.wrapperContained = new net.minecraft.registry.entry.RegistryFixedCodec(registry.wrapperContained); }
public com.mojang.serialization.DataResult decode(com.mojang.serialization.DynamicOps ops,java.lang.Object input) { return wrapperContained.decode(ops,input); }
// public static com.mojang.serialization.DataResult decode(com.mojang.serialization.DynamicOps ops,java.lang.Object input, ) { return net.minecraft.registry.entry.RegistryFixedCodec.decode(ops,input); }
public com.mojang.serialization.DataResult encode(java.lang.Object entry,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix) { return wrapperContained.encode(entry,ops,prefix); }
// public static com.mojang.serialization.DataResult encode(java.lang.Object entry,com.mojang.serialization.DynamicOps ops,java.lang.Object prefix, ) { return net.minecraft.registry.entry.RegistryFixedCodec.encode(entry,ops,prefix); }
// public com.mojang.serialization.DataResult method_40395(com.mojang.serialization.DynamicOps registryKey) { return wrapperContained.method_40395(registryKey); }
// public static com.mojang.serialization.DataResult method_40395(com.mojang.serialization.DynamicOps registryKey, ) { return net.minecraft.registry.entry.RegistryFixedCodec.method_40395(registryKey); }
// public com.mojang.serialization.DataResult method_40397(java.lang.Object value) { return wrapperContained.method_40397(value); }
// public static com.mojang.serialization.DataResult method_40397(java.lang.Object value, ) { return net.minecraft.registry.entry.RegistryFixedCodec.method_40397(value); }
// public yarnwrap.registry.entry.RegistryFixedCodec of(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.registry.entry.RegistryFixedCodec(wrapperContained.of(registry.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryFixedCodec of(yarnwrap.registry.RegistryKey registry, ) { return new yarnwrap.registry.entry.RegistryFixedCodec(net.minecraft.registry.entry.RegistryFixedCodec.of(registry.wrapperContained)); }
// public com.mojang.datafixers.util.Pair method_44141(com.mojang.datafixers.util.Pair value) { return wrapperContained.method_44141(value); }
// public static com.mojang.datafixers.util.Pair method_44141(com.mojang.datafixers.util.Pair value, ) { return net.minecraft.registry.entry.RegistryFixedCodec.method_44141(value); }
// public com.mojang.serialization.DataResult method_44142(java.util.Optional pair) { return wrapperContained.method_44142(pair); }
// public static com.mojang.serialization.DataResult method_44142(java.util.Optional pair, ) { return net.minecraft.registry.entry.RegistryFixedCodec.method_44142(pair); }

}