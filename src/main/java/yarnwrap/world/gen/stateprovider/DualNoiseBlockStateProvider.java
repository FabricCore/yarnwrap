package yarnwrap.world.gen.stateprovider;
public class DualNoiseBlockStateProvider { public net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained; public DualNoiseBlockStateProvider(net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec DUAL_CODEC() { return wrapperContained.DUAL_CODEC; }
// public void DUAL_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.DUAL_CODEC = value; }
// public yarnwrap.util.dynamic.Range variety() { return new yarnwrap.util.dynamic.Range(wrapperContained.variety); }
// public void variety(yarnwrap.util.dynamic.Range value) { wrapperContained.variety = value.wrapperContained; }
// public Object slowNoiseParameters() { return wrapperContained.slowNoiseParameters; }
// // public void slowNoiseParameters(Object value) { wrapperContained.slowNoiseParameters = value; }
// public float slowScale() { return wrapperContained.slowScale; }
// public void slowScale(float value) { wrapperContained.slowScale = value; }
// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler slowNoiseSampler() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.slowNoiseSampler); }
// public void slowNoiseSampler(yarnwrap.util.math.noise.DoublePerlinNoiseSampler value) { wrapperContained.slowNoiseSampler = value.wrapperContained; }
// public double getSlowNoiseValue(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSlowNoiseValue(pos.wrapperContained); }

}