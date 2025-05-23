package yarnwrap.block;
public class MossBlock { public net.minecraft.block.MossBlock wrapperContained; public MossBlock(net.minecraft.block.MossBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MossBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MossBlock.CODEC = value; }

// public yarnwrap.registry.RegistryKey feature() { return new yarnwrap.registry.RegistryKey(wrapperContained.feature); }
// public void feature(yarnwrap.registry.RegistryKey value) { wrapperContained.feature = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey feature() { return new yarnwrap.registry.RegistryKey(net.minecraft.block.MossBlock.feature); }
// public static void feature(yarnwrap.registry.RegistryKey value, ) { net.minecraft.block.MossBlock.feature = value.wrapperContained; }

// public MossBlock(yarnwrap.registry.RegistryKey feature,Object settings) { this.wrapperContained = new net.minecraft.block.MossBlock(feature.wrapperContained,settings); }
// public void method_64777(yarnwrap.server.world.ServerWorld entry) { wrapperContained.method_64777(entry.wrapperContained); }
// public static void method_64777(yarnwrap.server.world.ServerWorld entry, ) { net.minecraft.block.MossBlock.method_64777(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_64778(Object instance) { return wrapperContained.method_64778(instance); }
// public static com.mojang.datafixers.kinds.App method_64778(Object instance, ) { return net.minecraft.block.MossBlock.method_64778(instance); }
// public yarnwrap.registry.RegistryKey method_64779(yarnwrap.block.MossBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_64779(block.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_64779(yarnwrap.block.MossBlock block, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.block.MossBlock.method_64779(block.wrapperContained)); }
// public java.util.Optional method_64780(yarnwrap.registry.Registry registry) { return wrapperContained.method_64780(registry.wrapperContained); }
// public static java.util.Optional method_64780(yarnwrap.registry.Registry registry, ) { return net.minecraft.block.MossBlock.method_64780(registry.wrapperContained); }

}