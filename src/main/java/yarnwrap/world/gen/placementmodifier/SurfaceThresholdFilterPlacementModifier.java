package yarnwrap.world.gen.placementmodifier;
public class SurfaceThresholdFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier wrapperContained; public SurfaceThresholdFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public Object heightmap() { return wrapperContained.heightmap; }
// // public void heightmap(Object value) { wrapperContained.heightmap = value; }
// public int min() { return wrapperContained.min; }
// public void min(int value) { wrapperContained.min = value; }
// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public yarnwrap.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier of(Object heightmap,int min,int max) { return new yarnwrap.world.gen.placementmodifier.SurfaceThresholdFilterPlacementModifier(wrapperContained.of(heightmap,min,max)); }

}