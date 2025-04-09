package yarnwrap.world.biome.source;
public class TheEndBiomeSource { public net.minecraft.world.biome.source.TheEndBiomeSource wrapperContained; public TheEndBiomeSource(net.minecraft.world.biome.source.TheEndBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry centerBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.centerBiome); }
// public yarnwrap.registry.entry.RegistryEntry highlandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.highlandsBiome); }
// public yarnwrap.registry.entry.RegistryEntry midlandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.midlandsBiome); }
// public yarnwrap.registry.entry.RegistryEntry smallIslandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.smallIslandsBiome); }
// public yarnwrap.registry.entry.RegistryEntry barrensBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.barrensBiome); }
public yarnwrap.world.biome.source.TheEndBiomeSource createVanilla(yarnwrap.registry.RegistryEntryLookup biomeLookup) { return new yarnwrap.world.biome.source.TheEndBiomeSource(wrapperContained.createVanilla(biomeLookup.wrapperContained)); }

}