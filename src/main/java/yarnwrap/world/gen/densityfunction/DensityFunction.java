package yarnwrap.world.gen.densityfunction;
public class DensityFunction { public net.minecraft.world.gen.densityfunction.DensityFunction wrapperContained; public DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.densityfunction.DensityFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.densityfunction.DensityFunction.CODEC = value; }

// public com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return wrapperContained.REGISTRY_ENTRY_CODEC; }
// public void REGISTRY_ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return net.minecraft.world.gen.densityfunction.DensityFunction.REGISTRY_ENTRY_CODEC; }
// public static void REGISTRY_ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.densityfunction.DensityFunction.REGISTRY_ENTRY_CODEC = value; }

// public com.mojang.serialization.Codec FUNCTION_CODEC() { return wrapperContained.FUNCTION_CODEC; }
// public void FUNCTION_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FUNCTION_CODEC = value; }
public static com.mojang.serialization.Codec FUNCTION_CODEC() { return net.minecraft.world.gen.densityfunction.DensityFunction.FUNCTION_CODEC; }
// public static void FUNCTION_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.densityfunction.DensityFunction.FUNCTION_CODEC = value; }

// public double sample(Object pos) { return wrapperContained.sample(pos); }
// public static double sample(Object pos, ) { return net.minecraft.world.gen.densityfunction.DensityFunction.sample(pos); }
public yarnwrap.world.gen.densityfunction.DensityFunction clamp(double min,double max) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.clamp(min,max)); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction clamp(double min,double max, ) { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.clamp(min,max)); }
// public yarnwrap.world.gen.densityfunction.DensityFunction apply(Object visitor) { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.apply(visitor)); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction apply(Object visitor, ) { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.apply(visitor)); }
// public void fill(double densities,Object[] applier) { wrapperContained.fill(densities,applier); }
// public static void fill(double densities,Object[] applier, ) { net.minecraft.world.gen.densityfunction.DensityFunction.fill(densities,applier); }
public yarnwrap.world.gen.densityfunction.DensityFunction abs() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.abs()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction abs() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.abs()); }
public yarnwrap.world.gen.densityfunction.DensityFunction square() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.square()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction square() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.square()); }
public yarnwrap.world.gen.densityfunction.DensityFunction cube() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.cube()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction cube() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.cube()); }
public yarnwrap.world.gen.densityfunction.DensityFunction halfNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.halfNegative()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction halfNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.halfNegative()); }
public yarnwrap.world.gen.densityfunction.DensityFunction quarterNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.quarterNegative()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction quarterNegative() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.quarterNegative()); }
public yarnwrap.world.gen.densityfunction.DensityFunction squeeze() { return new yarnwrap.world.gen.densityfunction.DensityFunction(wrapperContained.squeeze()); }
// public static yarnwrap.world.gen.densityfunction.DensityFunction squeeze() { return new yarnwrap.world.gen.densityfunction.DensityFunction(net.minecraft.world.gen.densityfunction.DensityFunction.squeeze()); }
// public yarnwrap.registry.entry.RegistryEntry method_41061(yarnwrap.world.gen.densityfunction.DensityFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_41061(function.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_41061(yarnwrap.world.gen.densityfunction.DensityFunction function, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.densityfunction.DensityFunction.method_41061(function.wrapperContained)); }
public yarnwrap.util.dynamic.CodecHolder getCodecHolder() { return new yarnwrap.util.dynamic.CodecHolder(wrapperContained.getCodecHolder()); }
// public static yarnwrap.util.dynamic.CodecHolder getCodecHolder() { return new yarnwrap.util.dynamic.CodecHolder(net.minecraft.world.gen.densityfunction.DensityFunction.getCodecHolder()); }

}