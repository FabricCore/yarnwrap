package yarnwrap.world.biome.source;
public class FixedBiomeSource { public net.minecraft.world.biome.source.FixedBiomeSource wrapperContained; public FixedBiomeSource(net.minecraft.world.biome.source.FixedBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biome); }

}