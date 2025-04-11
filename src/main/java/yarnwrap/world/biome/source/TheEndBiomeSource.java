package yarnwrap.world.biome.source;
public class TheEndBiomeSource { public net.minecraft.world.biome.source.TheEndBiomeSource wrapperContained; public TheEndBiomeSource(net.minecraft.world.biome.source.TheEndBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry centerBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.centerBiome); }
// public void centerBiome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.centerBiome = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry highlandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.highlandsBiome); }
// public void highlandsBiome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.highlandsBiome = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry midlandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.midlandsBiome); }
// public void midlandsBiome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.midlandsBiome = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry smallIslandsBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.smallIslandsBiome); }
// public void smallIslandsBiome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.smallIslandsBiome = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry barrensBiome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.barrensBiome); }
// public void barrensBiome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.barrensBiome = value.wrapperContained; }
public yarnwrap.world.biome.source.TheEndBiomeSource createVanilla(yarnwrap.registry.RegistryEntryLookup biomeLookup) { return new yarnwrap.world.biome.source.TheEndBiomeSource(wrapperContained.createVanilla(biomeLookup.wrapperContained)); }

}