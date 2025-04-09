package yarnwrap.world.gen.placementmodifier;
public class SurfaceThresholdFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier wrapperContained; public SurfaceThresholdFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public Object heightmap() { return wrapperContained.heightmap; }
// public int min() { return wrapperContained.min; }
// public int max() { return wrapperContained.max; }
// public yarnwrap.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier of(Object heightmap,int min,int max) { return new yarnwrap.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier(wrapperContained.of(heightmap,min,max)); }

}