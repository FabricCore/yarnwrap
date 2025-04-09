package yarnwrap.world.gen.placementmodifier;
public class NoiseThresholdCountPlacementModifier { public net.minecraft.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier wrapperContained; public NoiseThresholdCountPlacementModifier(net.minecraft.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double noiseLevel() { return wrapperContained.noiseLevel; }
// public int aboveNoise() { return wrapperContained.aboveNoise; }
// public int belowNoise() { return wrapperContained.belowNoise; }
public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
public yarnwrap.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier of(double noiseLevel,int belowNoise,int aboveNoise) { return new yarnwrap.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier(wrapperContained.of(noiseLevel,belowNoise,aboveNoise)); }

}