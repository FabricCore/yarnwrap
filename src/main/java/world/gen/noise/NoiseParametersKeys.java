package yarnwrap.world.gen.noise;
public class NoiseParametersKeys { public net.minecraft.world.gen.noise.NoiseParametersKeys wrapperContained; public NoiseParametersKeys(net.minecraft.world.gen.noise.NoiseParametersKeys wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public yarnwrap.util.math.noise.DoublePerlinNoiseSampler createNoiseSampler(yarnwrap.registry.RegistryEntryLookup noiseParametersLookup,yarnwrap.util.math.random.RandomSplitter splitter,yarnwrap.registry.RegistryKey key) { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.createNoiseSampler(noiseParametersLookup.wrapperContained,splitter.wrapperContained,key.wrapperContained)); }

}