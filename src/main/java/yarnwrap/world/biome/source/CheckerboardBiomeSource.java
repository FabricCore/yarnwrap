package yarnwrap.world.biome.source;
public class CheckerboardBiomeSource { public net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained; public CheckerboardBiomeSource(net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int scale() { return wrapperContained.scale; }
// public void scale(int value) { wrapperContained.scale = value; }
// public int gridSize() { return wrapperContained.gridSize; }
// public void gridSize(int value) { wrapperContained.gridSize = value; }
// public yarnwrap.registry.entry.RegistryEntryList biomeArray() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.biomeArray); }
// public void biomeArray(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.biomeArray = value.wrapperContained; }

}