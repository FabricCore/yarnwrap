package yarnwrap.world.gen.placementmodifier;
public class NoiseBasedCountPlacementModifier { public net.minecraft.world.gen.placementmodifier.NoiseBasedCountPlacementModifier wrapperContained; public NoiseBasedCountPlacementModifier(net.minecraft.world.gen.placementmodifier.NoiseBasedCountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double noiseOffset() { return wrapperContained.noiseOffset; }
// public double noiseFactor() { return wrapperContained.noiseFactor; }
// public int noiseToCountRatio() { return wrapperContained.noiseToCountRatio; }
public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
public yarnwrap.world.gen.placementmodifier.NoiseBasedCountPlacementModifier of(int noiseToCountRatio,double noiseFactor,double noiseOffset) { return new yarnwrap.world.gen.placementmodifier.NoiseBasedCountPlacementModifier(wrapperContained.of(noiseToCountRatio,noiseFactor,noiseOffset)); }

}