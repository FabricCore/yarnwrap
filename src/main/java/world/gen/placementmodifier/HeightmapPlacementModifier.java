package yarnwrap.world.gen.placementmodifier;
public class HeightmapPlacementModifier { public net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained; public HeightmapPlacementModifier(net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public Object heightmap() { return wrapperContained.heightmap; }
// public yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier of(Object heightmap) { return new yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier(wrapperContained.of(heightmap)); }

}