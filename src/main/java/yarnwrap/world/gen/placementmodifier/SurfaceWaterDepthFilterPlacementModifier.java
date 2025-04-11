package yarnwrap.world.gen.placementmodifier;
public class SurfaceWaterDepthFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier wrapperContained; public SurfaceWaterDepthFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public int maxWaterDepth() { return wrapperContained.maxWaterDepth; }
// public void maxWaterDepth(int value) { wrapperContained.maxWaterDepth = value; }
// public SurfaceWaterDepthFilterPlacementModifier(int maxWaterDepth) { this.wrapperContained = new net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier(maxWaterDepth); }
// public com.mojang.datafixers.kinds.App method_34386(Object instance) { return wrapperContained.method_34386(instance); }
public yarnwrap.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier of(int maxWaterDepth) { return new yarnwrap.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier(wrapperContained.of(maxWaterDepth)); }

}