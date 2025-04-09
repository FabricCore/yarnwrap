package yarnwrap.world.gen.stateprovider;
public class DualNoiseBlockStateProvider { public net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained; public DualNoiseBlockStateProvider(net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec DUAL_CODEC() { return wrapperContained.DUAL_CODEC; }
// public yarnwrap.util.dynamic.Range variety() { return new yarnwrap.util.dynamic.Range(wrapperContained.variety); }
// public Object slowNoiseParameters() { return wrapperContained.slowNoiseParameters; }
// public float slowScale() { return wrapperContained.slowScale; }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler slowNoiseSampler() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.slowNoiseSampler); }
// public double getSlowNoiseValue(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSlowNoiseValue(pos.wrapperContained); }

}