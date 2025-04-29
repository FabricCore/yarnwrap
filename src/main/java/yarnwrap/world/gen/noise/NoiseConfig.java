package yarnwrap.world.gen.noise;
public class NoiseConfig { public net.minecraft.world.gen.noise.NoiseConfig wrapperContained; public NoiseConfig(net.minecraft.world.gen.noise.NoiseConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.RandomSplitter randomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.randomDeriver); }
// public void randomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.randomDeriver = value.wrapperContained; }
// public static yarnwrap.util.math.random.RandomSplitter randomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.randomDeriver); }
// public static void randomDeriver(yarnwrap.util.math.random.RandomSplitter value, ) { net.minecraft.world.gen.noise.NoiseConfig.randomDeriver = value.wrapperContained; }

// public yarnwrap.registry.RegistryEntryLookup noiseParametersRegistry() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.noiseParametersRegistry); }
// public void noiseParametersRegistry(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.noiseParametersRegistry = value.wrapperContained; }
// public static yarnwrap.registry.RegistryEntryLookup noiseParametersRegistry() { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.world.gen.noise.NoiseConfig.noiseParametersRegistry); }
// public static void noiseParametersRegistry(yarnwrap.registry.RegistryEntryLookup value, ) { net.minecraft.world.gen.noise.NoiseConfig.noiseParametersRegistry = value.wrapperContained; }

// public yarnwrap.world.gen.noise.NoiseRouter noiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.noiseRouter); }
// public void noiseRouter(yarnwrap.world.gen.noise.NoiseRouter value) { wrapperContained.noiseRouter = value.wrapperContained; }
// public static yarnwrap.world.gen.noise.NoiseRouter noiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(net.minecraft.world.gen.noise.NoiseConfig.noiseRouter); }
// public static void noiseRouter(yarnwrap.world.gen.noise.NoiseRouter value, ) { net.minecraft.world.gen.noise.NoiseConfig.noiseRouter = value.wrapperContained; }

// public Object multiNoiseSampler() { return wrapperContained.multiNoiseSampler; }
// // public void multiNoiseSampler(Object value) { wrapperContained.multiNoiseSampler = value; }
// // public static Object multiNoiseSampler() { return net.minecraft.world.gen.noise.NoiseConfig.multiNoiseSampler; }
// // public static void multiNoiseSampler(Object value, ) { net.minecraft.world.gen.noise.NoiseConfig.multiNoiseSampler = value; }

// public yarnwrap.world.gen.surfacebuilder.SurfaceBuilder surfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(wrapperContained.surfaceBuilder); }
// public void surfaceBuilder(yarnwrap.world.gen.surfacebuilder.SurfaceBuilder value) { wrapperContained.surfaceBuilder = value.wrapperContained; }
// public static yarnwrap.world.gen.surfacebuilder.SurfaceBuilder surfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(net.minecraft.world.gen.noise.NoiseConfig.surfaceBuilder); }
// public static void surfaceBuilder(yarnwrap.world.gen.surfacebuilder.SurfaceBuilder value, ) { net.minecraft.world.gen.noise.NoiseConfig.surfaceBuilder = value.wrapperContained; }

// public yarnwrap.util.math.random.RandomSplitter aquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.aquiferRandomDeriver); }
// public void aquiferRandomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.aquiferRandomDeriver = value.wrapperContained; }
// public static yarnwrap.util.math.random.RandomSplitter aquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.aquiferRandomDeriver); }
// public static void aquiferRandomDeriver(yarnwrap.util.math.random.RandomSplitter value, ) { net.minecraft.world.gen.noise.NoiseConfig.aquiferRandomDeriver = value.wrapperContained; }

// public yarnwrap.util.math.random.RandomSplitter oreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.oreRandomDeriver); }
// public void oreRandomDeriver(yarnwrap.util.math.random.RandomSplitter value) { wrapperContained.oreRandomDeriver = value.wrapperContained; }
// public static yarnwrap.util.math.random.RandomSplitter oreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.oreRandomDeriver); }
// public static void oreRandomDeriver(yarnwrap.util.math.random.RandomSplitter value, ) { net.minecraft.world.gen.noise.NoiseConfig.oreRandomDeriver = value.wrapperContained; }

// public java.util.Map noises() { return wrapperContained.noises; }
// public void noises(java.util.Map value) { wrapperContained.noises = value; }
// public static java.util.Map noises() { return net.minecraft.world.gen.noise.NoiseConfig.noises; }
// public static void noises(java.util.Map value, ) { net.minecraft.world.gen.noise.NoiseConfig.noises = value; }

// public java.util.Map randomDerivers() { return wrapperContained.randomDerivers; }
// public void randomDerivers(java.util.Map value) { wrapperContained.randomDerivers = value; }
// public static java.util.Map randomDerivers() { return net.minecraft.world.gen.noise.NoiseConfig.randomDerivers; }
// public static void randomDerivers(java.util.Map value, ) { net.minecraft.world.gen.noise.NoiseConfig.randomDerivers = value; }

// public NoiseConfig(yarnwrap.world.gen.chunk.ChunkGeneratorSettings chunkGeneratorSettings,yarnwrap.registry.RegistryEntryLookup noiseParametersLookup,long seed) { this.wrapperContained = new net.minecraft.world.gen.noise.NoiseConfig(chunkGeneratorSettings.wrapperContained,noiseParametersLookup.wrapperContained,seed); }
// public yarnwrap.world.gen.noise.NoiseConfig create(yarnwrap.world.gen.chunk.ChunkGeneratorSettings chunkGeneratorSettings,yarnwrap.registry.RegistryEntryLookup noiseParametersLookup,long legacyWorldSeed) { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.create(chunkGeneratorSettings.wrapperContained,noiseParametersLookup.wrapperContained,legacyWorldSeed)); }
// public static yarnwrap.world.gen.noise.NoiseConfig create(yarnwrap.world.gen.chunk.ChunkGeneratorSettings chunkGeneratorSettings,yarnwrap.registry.RegistryEntryLookup noiseParametersLookup,long legacyWorldSeed, ) { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.world.gen.noise.NoiseConfig.create(chunkGeneratorSettings.wrapperContained,noiseParametersLookup.wrapperContained,legacyWorldSeed)); }
// public yarnwrap.world.gen.noise.NoiseConfig create(Object registryLookup,yarnwrap.registry.RegistryKey chunkGeneratorSettingsKey,long legacyWorldSeed) { return new yarnwrap.world.gen.noise.NoiseConfig(wrapperContained.create(registryLookup,chunkGeneratorSettingsKey.wrapperContained,legacyWorldSeed)); }
// public static yarnwrap.world.gen.noise.NoiseConfig create(Object registryLookup,yarnwrap.registry.RegistryKey chunkGeneratorSettingsKey,long legacyWorldSeed, ) { return new yarnwrap.world.gen.noise.NoiseConfig(net.minecraft.world.gen.noise.NoiseConfig.create(registryLookup,chunkGeneratorSettingsKey.wrapperContained,legacyWorldSeed)); }
public yarnwrap.util.math.noise.DoublePerlinNoiseSampler getOrCreateSampler(yarnwrap.registry.RegistryKey noiseParametersKey) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.getOrCreateSampler(noiseParametersKey.wrapperContained)); }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler getOrCreateSampler(yarnwrap.registry.RegistryKey noiseParametersKey, ) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.world.gen.noise.NoiseConfig.getOrCreateSampler(noiseParametersKey.wrapperContained)); }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler method_41559(yarnwrap.registry.RegistryKey key) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.method_41559(key.wrapperContained)); }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler method_41559(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.world.gen.noise.NoiseConfig.method_41559(key.wrapperContained)); }
public yarnwrap.util.math.random.RandomSplitter getOrCreateRandomDeriver(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getOrCreateRandomDeriver(id.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSplitter getOrCreateRandomDeriver(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.getOrCreateRandomDeriver(id.wrapperContained)); }
// public yarnwrap.util.math.random.RandomSplitter method_41561(yarnwrap.util.Identifier id2) { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.method_41561(id2.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSplitter method_41561(yarnwrap.util.Identifier id2, ) { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.method_41561(id2.wrapperContained)); }
public yarnwrap.world.gen.noise.NoiseRouter getNoiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.getNoiseRouter()); }
// public static yarnwrap.world.gen.noise.NoiseRouter getNoiseRouter() { return new yarnwrap.world.gen.noise.NoiseRouter(net.minecraft.world.gen.noise.NoiseConfig.getNoiseRouter()); }
public Object getMultiNoiseSampler() { return wrapperContained.getMultiNoiseSampler(); }
// public static Object getMultiNoiseSampler() { return net.minecraft.world.gen.noise.NoiseConfig.getMultiNoiseSampler(); }
public yarnwrap.world.gen.surfacebuilder.SurfaceBuilder getSurfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(wrapperContained.getSurfaceBuilder()); }
// public static yarnwrap.world.gen.surfacebuilder.SurfaceBuilder getSurfaceBuilder() { return new yarnwrap.world.gen.surfacebuilder.SurfaceBuilder(net.minecraft.world.gen.noise.NoiseConfig.getSurfaceBuilder()); }
public yarnwrap.util.math.random.RandomSplitter getAquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getAquiferRandomDeriver()); }
// public static yarnwrap.util.math.random.RandomSplitter getAquiferRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.getAquiferRandomDeriver()); }
public yarnwrap.util.math.random.RandomSplitter getOreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(wrapperContained.getOreRandomDeriver()); }
// public static yarnwrap.util.math.random.RandomSplitter getOreRandomDeriver() { return new yarnwrap.util.math.random.RandomSplitter(net.minecraft.world.gen.noise.NoiseConfig.getOreRandomDeriver()); }

}