package yarnwrap.world.biome.source;
public class BiomeSupplier { public net.minecraft.world.biome.source.BiomeSupplier wrapperContained; public BiomeSupplier(net.minecraft.world.biome.source.BiomeSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry getBiome(int x,int y,int z,Object noise) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(x,y,z,noise)); }
// public static yarnwrap.registry.entry.RegistryEntry getBiome(int x,int y,int z,Object noise, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.biome.source.BiomeSupplier.getBiome(x,y,z,noise)); }

}