package yarnwrap.world.biome.source;
public class FixedBiomeSource { public net.minecraft.world.biome.source.FixedBiomeSource wrapperContained; public FixedBiomeSource(net.minecraft.world.biome.source.FixedBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biome); }
// public void biome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.biome = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.biome.source.FixedBiomeSource.biome); }
// public static void biome(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.biome.source.FixedBiomeSource.biome = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.biome.source.FixedBiomeSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.biome.source.FixedBiomeSource.CODEC = value; }

public FixedBiomeSource(yarnwrap.registry.entry.RegistryEntry biome) { this.wrapperContained = new net.minecraft.world.biome.source.FixedBiomeSource(biome.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28456(yarnwrap.world.biome.source.FixedBiomeSource biomeSource) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28456(biomeSource.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28456(yarnwrap.world.biome.source.FixedBiomeSource biomeSource, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.biome.source.FixedBiomeSource.method_28456(biomeSource.wrapperContained)); }

}