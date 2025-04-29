package yarnwrap.world.gen.stateprovider;
public class DualNoiseBlockStateProvider { public net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained; public DualNoiseBlockStateProvider(net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec DUAL_CODEC() { return wrapperContained.DUAL_CODEC; }
// public void DUAL_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.DUAL_CODEC = value; }
public static com.mojang.serialization.MapCodec DUAL_CODEC() { return net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.DUAL_CODEC; }
// public static void DUAL_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.DUAL_CODEC = value; }

// public yarnwrap.util.dynamic.Range variety() { return new yarnwrap.util.dynamic.Range(wrapperContained.variety); }
// public void variety(yarnwrap.util.dynamic.Range value) { wrapperContained.variety = value.wrapperContained; }
// public static yarnwrap.util.dynamic.Range variety() { return new yarnwrap.util.dynamic.Range(net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.variety); }
// public static void variety(yarnwrap.util.dynamic.Range value, ) { net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.variety = value.wrapperContained; }

// public Object slowNoiseParameters() { return wrapperContained.slowNoiseParameters; }
// // public void slowNoiseParameters(Object value) { wrapperContained.slowNoiseParameters = value; }
// // public static Object slowNoiseParameters() { return net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowNoiseParameters; }
// // public static void slowNoiseParameters(Object value, ) { net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowNoiseParameters = value; }

// public float slowScale() { return wrapperContained.slowScale; }
// public void slowScale(float value) { wrapperContained.slowScale = value; }
// public static float slowScale() { return net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowScale; }
// public static void slowScale(float value, ) { net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowScale = value; }

// public yarnwrap.util.math.noise.DoublePerlinNoiseSampler slowNoiseSampler() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(wrapperContained.slowNoiseSampler); }
// public void slowNoiseSampler(yarnwrap.util.math.noise.DoublePerlinNoiseSampler value) { wrapperContained.slowNoiseSampler = value.wrapperContained; }
// public static yarnwrap.util.math.noise.DoublePerlinNoiseSampler slowNoiseSampler() { return new yarnwrap.util.math.noise.DoublePerlinNoiseSampler(net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowNoiseSampler); }
// public static void slowNoiseSampler(yarnwrap.util.math.noise.DoublePerlinNoiseSampler value, ) { net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.slowNoiseSampler = value.wrapperContained; }

// public DualNoiseBlockStateProvider(yarnwrap.util.dynamic.Range variety,Object slowNoiseParameters,float slowScale,long seed,Object noiseParameters,float scale,java.util.List states) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider(variety.wrapperContained,slowNoiseParameters,slowScale,seed,noiseParameters,scale,states); }
// public double getSlowNoiseValue(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSlowNoiseValue(pos.wrapperContained); }
// public static double getSlowNoiseValue(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider.getSlowNoiseValue(pos.wrapperContained); }

}