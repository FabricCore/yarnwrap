package yarnwrap.world.gen.densityfunction;
public class DensityFunction { public net.minecraft.world.gen.densityfunction.DensityFunction wrapperContained; public DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return wrapperContained.REGISTRY_ENTRY_CODEC; }
public com.mojang.serialization.Codec FUNCTION_CODEC() { return wrapperContained.FUNCTION_CODEC; }
// public double sample(Object pos) { return wrapperContained.sample(pos); }
public yarnwrap.world.gen.densityfunction.DensityFunction clamp(double min,double max) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.clamp(min,max)); }
// public yarnwrap.world.gen.densityfunction.DensityFunction apply(Object visitor) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.apply(visitor)); }
// public void fill(double densities,Object[] applier) { wrapperContained.fill(densities,applier); }
public yarnwrap.world.gen.densityfunction.DensityFunction abs() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.abs()); }
public yarnwrap.world.gen.densityfunction.DensityFunction square() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.square()); }
public yarnwrap.world.gen.densityfunction.DensityFunction cube() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.cube()); }
public yarnwrap.world.gen.densityfunction.DensityFunction halfNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.halfNegative()); }
public yarnwrap.world.gen.densityfunction.DensityFunction quarterNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.quarterNegative()); }
public yarnwrap.world.gen.densityfunction.DensityFunction squeeze() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.squeeze()); }
public yarnwrap.util.dynamic.CodecHolder getCodecHolder() { return new yarnwrap.util.dynamic.CodecHolder(wrapperContained.getCodecHolder()); }

}