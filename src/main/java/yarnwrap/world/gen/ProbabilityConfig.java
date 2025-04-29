package yarnwrap.world.gen;
public class ProbabilityConfig { public net.minecraft.world.gen.ProbabilityConfig wrapperContained; public ProbabilityConfig(net.minecraft.world.gen.ProbabilityConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public static float probability() { return net.minecraft.world.gen.ProbabilityConfig.probability; }
// public static void probability(float value, ) { net.minecraft.world.gen.ProbabilityConfig.probability = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.ProbabilityConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.ProbabilityConfig.CODEC = value; }

public ProbabilityConfig(float probability) { this.wrapperContained = new net.minecraft.world.gen.ProbabilityConfig(probability); }
// public com.mojang.datafixers.kinds.App method_28748(Object instance) { return wrapperContained.method_28748(instance); }
// public static com.mojang.datafixers.kinds.App method_28748(Object instance, ) { return net.minecraft.world.gen.ProbabilityConfig.method_28748(instance); }

}