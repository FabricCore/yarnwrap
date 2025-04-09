package yarnwrap.world.biome.source;
public class MultiNoiseBiomeSource { public net.minecraft.world.biome.source.MultiNoiseBiomeSource wrapperContained; public MultiNoiseBiomeSource(net.minecraft.world.biome.source.MultiNoiseBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CUSTOM_CODEC() { return wrapperContained.CUSTOM_CODEC; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.datafixers.util.Either biomeEntries() { return wrapperContained.biomeEntries; }
// public com.mojang.serialization.MapCodec BIOME_CODEC() { return wrapperContained.BIOME_CODEC; }
// public com.mojang.serialization.MapCodec PRESET_CODEC() { return wrapperContained.PRESET_CODEC; }
// public yarnwrap.registry.entry.RegistryEntry getBiomeAtPoint(Object point) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiomeAtPoint(point)); }
public boolean matchesInstance(yarnwrap.registry.RegistryKey parameterList) { return wrapperContained.matchesInstance(parameterList.wrapperContained); }
// public yarnwrap.world.biome.source.MultiNoiseBiomeSource create(Object biomeEntries) { return new yarnwrap.world.biome.source.MultiNoiseBiomeSource(wrapperContained.create(biomeEntries)); }
public yarnwrap.world.biome.source.MultiNoiseBiomeSource create(yarnwrap.registry.entry.RegistryEntry biomeEntries) { return new yarnwrap.world.biome.source.MultiNoiseBiomeSource(wrapperContained.create(biomeEntries.wrapperContained)); }
// public Object getBiomeEntries() { return wrapperContained.getBiomeEntries(); }

}