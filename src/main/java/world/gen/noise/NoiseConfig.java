package yarnwrap.world.gen.noise;
public class NoiseConfig { public net.minecraft.world.gen.noise.NoiseConfig wrapperContained; public NoiseConfig(net.minecraft.world.gen.noise.NoiseConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.RandomSplitter randomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.randomDeriver); }
// public yarnwrap.registry.RegistryEntryLookup noiseParametersRegistry() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.noiseParametersRegistry); }
// public yarnwrap.world.gen.noise.NoiseRouter noiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.noiseRouter); }
// public Object multiNoiseSampler() { return wrapperContained.multiNoiseSampler; }
// public yarnwrap.world.gen.surfacebuilder.SurfaceBuilder surfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(wrapperContained.surfaceBuilder); }
// public yarnwrap.util.math.random.RandomSplitter aquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.aquiferRandomDeriver); }
// public yarnwrap.util.math.random.RandomSplitter oreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.oreRandomDeriver); }
// public java.util.Map noises() { return wrapperContained.noises; }
// public java.util.Map randomDerivers() { return wrapperContained.randomDerivers; }
public yarnwrap.world.gen.noise.NoiseConfig create(yarnwrap.world.gen.chunk.ChunkGeneratorSettings chunkGeneratorSettings,yarnwrap.registry.RegistryEntryLookup noiseParametersLookup,long legacyWorldSeed) { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.create(chunkGeneratorSettings.wrapperContained,noiseParametersLookup.wrapperContained,legacyWorldSeed)); }
// public yarnwrap.world.gen.noise.NoiseConfig create(Object registryLookup,yarnwrap.registry.RegistryKey chunkGeneratorSettingsKey,long legacyWorldSeed) { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.create(registryLookup,chunkGeneratorSettingsKey.wrapperContained,legacyWorldSeed)); }
public yarnwrap.util.math.noise.DoublePerlinNoiseSampler getOrCreateSampler(yarnwrap.registry.RegistryKey noiseParametersKey) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.getOrCreateSampler(noiseParametersKey.wrapperContained)); }
public yarnwrap.util.math.random.RandomSplitter getOrCreateRandomDeriver(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getOrCreateRandomDeriver(id.wrapperContained)); }
public yarnwrap.world.gen.noise.NoiseRouter getNoiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.getNoiseRouter()); }
public Object getMultiNoiseSampler() { return wrapperContained.getMultiNoiseSampler(); }
public yarnwrap.world.gen.surfacebuilder.SurfaceBuilder getSurfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(wrapperContained.getSurfaceBuilder()); }
public yarnwrap.util.math.random.RandomSplitter getAquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getAquiferRandomDeriver()); }
public yarnwrap.util.math.random.RandomSplitter getOreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getOreRandomDeriver()); }

}