package yarnwrap.world.gen.placementmodifier;
public class NoiseBasedCountPlacementModifier { public net.minecraft.world.gen.placementmodifier.NoiseBasedCountPlacementModifier wrapperContained; public NoiseBasedCountPlacementModifier(net.minecraft.world.gen.placementmodifier.NoiseBasedCountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public double noiseOffset() { return wrapperContained.noiseOffset; }
// public void noiseOffset(double value) { wrapperContained.noiseOffset = value; }
// public double noiseFactor() { return wrapperContained.noiseFactor; }
// public void noiseFactor(double value) { wrapperContained.noiseFactor = value; }
// public int noiseToCountRatio() { return wrapperContained.noiseToCountRatio; }
// public void noiseToCountRatio(int value) { wrapperContained.noiseToCountRatio = value; }
public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public NoiseBasedCountPlacementModifier(int noiseToCountRatio,double noiseFactor,double noiseOffset) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.NoiseBasedCountPlacementModifier(noiseToCountRatio,noiseFactor,noiseOffset); }
// public com.mojang.datafixers.kinds.App method_28939(Object instance) { return wrapperContained.method_28939(instance); }
public yarnwrap.world.gen.placementmodifier.NoiseBasedCountPlacementModifier of(int noiseToCountRatio,double noiseFactor,double noiseOffset) { return new yarnwrap.world.gen.placementmodifier.NoiseBasedCountPlacementModifier(wrapperContained.of(noiseToCountRatio,noiseFactor,noiseOffset)); }

}