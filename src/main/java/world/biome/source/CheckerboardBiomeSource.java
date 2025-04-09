package yarnwrap.world.biome.source;
public class CheckerboardBiomeSource { public net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained; public CheckerboardBiomeSource(net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int scale() { return wrapperContained.scale; }
// public int gridSize() { return wrapperContained.gridSize; }
// public yarnwrap.registry.entry.RegistryEntryList biomeArray() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.biomeArray); }

}