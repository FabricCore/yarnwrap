package yarnwrap.world.biome;
public class BiomeKeys { public net.minecraft.world.biome.BiomeKeys wrapperContained; public BiomeKeys(net.minecraft.world.biome.BiomeKeys wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey keyOf(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.keyOf(id)); }
// public static yarnwrap.registry.RegistryKey keyOf(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.biome.BiomeKeys.keyOf(id)); }

}