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
public CheckerboardBiomeSource(yarnwrap.registry.entry.RegistryEntryList biomes,int size) { this.wrapperContained = new net.minecraft.world.biome.source.CheckerboardBiomeSource(biomes.wrapperContained,size); }
// public java.lang.Integer method_28453(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource) { return wrapperContained.method_28453(biomeSource.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28454(Object instance) { return wrapperContained.method_28454(instance); }
// public yarnwrap.registry.entry.RegistryEntryList method_28455(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_28455(biomeSource.wrapperContained)); }

}