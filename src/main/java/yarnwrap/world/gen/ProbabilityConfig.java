package yarnwrap.world.gen;
public class ProbabilityConfig { public net.minecraft.world.gen.ProbabilityConfig wrapperContained; public ProbabilityConfig(net.minecraft.world.gen.ProbabilityConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}