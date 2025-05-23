package yarnwrap.world.biome.source;
public class CheckerboardBiomeSource { public net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained; public CheckerboardBiomeSource(net.minecraft.world.biome.source.CheckerboardBiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public int gridSize() { return wrapperContained.gridSize; }
// public void gridSize(int value) { wrapperContained.gridSize = value; }
// public static int gridSize() { return net.minecraft.world.biome.source.CheckerboardBiomeSource.gridSize; }
// public static void gridSize(int value, ) { net.minecraft.world.biome.source.CheckerboardBiomeSource.gridSize = value; }

// public yarnwrap.registry.entry.RegistryEntryList biomeArray() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.biomeArray); }
// public void biomeArray(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.biomeArray = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList biomeArray() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.biome.source.CheckerboardBiomeSource.biomeArray); }
// public static void biomeArray(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.world.biome.source.CheckerboardBiomeSource.biomeArray = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.biome.source.CheckerboardBiomeSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.biome.source.CheckerboardBiomeSource.CODEC = value; }

// public int scale() { return wrapperContained.scale; }
// public void scale(int value) { wrapperContained.scale = value; }
// public static int scale() { return net.minecraft.world.biome.source.CheckerboardBiomeSource.scale; }
// public static void scale(int value, ) { net.minecraft.world.biome.source.CheckerboardBiomeSource.scale = value; }

public CheckerboardBiomeSource(yarnwrap.registry.entry.RegistryEntryList biomes,int size) { this.wrapperContained = new net.minecraft.world.biome.source.CheckerboardBiomeSource(biomes.wrapperContained,size); }
// public java.lang.Integer method_28453(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource) { return wrapperContained.method_28453(biomeSource.wrapperContained); }
// public static java.lang.Integer method_28453(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource, ) { return net.minecraft.world.biome.source.CheckerboardBiomeSource.method_28453(biomeSource.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28454(Object instance) { return wrapperContained.method_28454(instance); }
// public static com.mojang.datafixers.kinds.App method_28454(Object instance, ) { return net.minecraft.world.biome.source.CheckerboardBiomeSource.method_28454(instance); }
// public yarnwrap.registry.entry.RegistryEntryList method_28455(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_28455(biomeSource.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_28455(yarnwrap.world.biome.source.CheckerboardBiomeSource biomeSource, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.biome.source.CheckerboardBiomeSource.method_28455(biomeSource.wrapperContained)); }

}