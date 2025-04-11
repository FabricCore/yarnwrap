package yarnwrap.world.gen.placementmodifier;
public class NoiseThresholdCountPlacementModifier { public net.minecraft.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier wrapperContained; public NoiseThresholdCountPlacementModifier(net.minecraft.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double noiseLevel() { return wrapperContained.noiseLevel; }
// public void noiseLevel(double value) { wrapperContained.noiseLevel = value; }
// public int aboveNoise() { return wrapperContained.aboveNoise; }
// public void aboveNoise(int value) { wrapperContained.aboveNoise = value; }
// public int belowNoise() { return wrapperContained.belowNoise; }
// public void belowNoise(int value) { wrapperContained.belowNoise = value; }
public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
public yarnwrap.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier of(double noiseLevel,int belowNoise,int aboveNoise) { return new yarnwrap.world.gen.placementmodifier.NoiseThresholdCountPlacementModifier(wrapperContained.of(noiseLevel,belowNoise,aboveNoise)); }

}