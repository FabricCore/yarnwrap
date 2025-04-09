package yarnwrap.world.biome.source;
public class BiomeAccess { public net.minecraft.world.biome.source.BiomeAccess wrapperContained; public BiomeAccess(net.minecraft.world.biome.source.BiomeAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object storage() { return wrapperContained.storage; }
// public long seed() { return wrapperContained.seed; }
public int CHUNK_CENTER_OFFSET() { return wrapperContained.CHUNK_CENTER_OFFSET; }
public yarnwrap.registry.entry.RegistryEntry getBiome(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(pos.wrapperContained)); }
public yarnwrap.registry.entry.RegistryEntry getBiomeForNoiseGen(int biomeX,int biomeY,int biomeZ) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiomeForNoiseGen(biomeX,biomeY,biomeZ)); }
public yarnwrap.registry.entry.RegistryEntry getBiomeForNoiseGen(double x,double y,double z) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiomeForNoiseGen(x,y,z)); }
public yarnwrap.registry.entry.RegistryEntry getBiomeForNoiseGen(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiomeForNoiseGen(pos.wrapperContained)); }
public long hashSeed(long seed) { return wrapperContained.hashSeed(seed); }
// public yarnwrap.world.biome.source.BiomeAccess withSource(Object storage) { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.withSource(storage)); }

}