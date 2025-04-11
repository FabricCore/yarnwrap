package yarnwrap.world.gen.noise;
public class NoiseConfig { public net.minecraft.world.gen.noise.NoiseConfig wrapperContained; public NoiseConfig(net.minecraft.world.gen.noise.NoiseConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.RandomSplitter randomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.randomDeriver); }
// public void randomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.randomDeriver = value.wrapperContained; }
// public yarnwrap.registry.RegistryEntryLookup noiseParametersRegistry() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.noiseParametersRegistry); }
// public void noiseParametersRegistry(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.noiseParametersRegistry = value.wrapperContained; }
// public yarnwrap.world.gen.noise.NoiseRouter noiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.noiseRouter); }
// public void noiseRouter(yarnwrap.world.gen.noise.NoiseRouter value) { wrapperContained.noiseRouter = value.wrapperContained; }
// public Object multiNoiseSampler() { return wrapperContained.multiNoiseSampler; }
// // public void multiNoiseSampler(Object value) { wrapperContained.multiNoiseSampler = value; }
// public yarnwrap.world.gen.surfacebuilder.SurfaceBuilder surfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(wrapperContained.surfaceBuilder); }
// public void surfaceBuilder(yarnwrap.world.gen.surfacebuilder.SurfaceBuilder value) { wrapperContained.surfaceBuilder = value.wrapperContained; }
// public yarnwrap.util.math.random.RandomSplitter aquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.aquiferRandomDeriver); }
// public void aquiferRandomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.aquiferRandomDeriver = value.wrapperContained; }
// public yarnwrap.util.math.random.RandomSplitter oreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.oreRandomDeriver); }
// public void oreRandomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.oreRandomDeriver = value.wrapperContained; }
// public java.util.Map noises() { return wrapperContained.noises; }
// public void noises(java.util.Map value) { wrapperContained.noises = value; }
// public java.util.Map randomDerivers() { return wrapperContained.randomDerivers; }
// public void randomDerivers(java.util.Map value) { wrapperContained.randomDerivers = value; }
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