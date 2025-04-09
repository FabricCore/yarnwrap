package yarnwrap.world.gen.stateprovider;
public class AbstractNoiseBlockStateProvider { public net.minecraft.world.gen.stateprovider.AbstractNoiseBlockStateProvider wrapperContained; public AbstractNoiseBlockStateProvider(net.minecraft.world.gen.stateprovider.AbstractNoiseBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public Object noiseParameters() { return wrapperContained.noiseParameters; }
// public float scale() { return wrapperContained.scale; }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler noiseSampler() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.noiseSampler); }
// public Object fillCodecFields(Object instance) { return wrapperContained.fillCodecFields(instance); }
// public double getNoiseValue(yarnwrap.util.math.BlockPos pos,double scale) { return wrapperContained.getNoiseValue(pos.wrapperContained,scale); }

}