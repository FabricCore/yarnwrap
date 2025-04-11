package yarnwrap.world.gen.placementmodifier;
public class HeightmapPlacementModifier { public net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained; public HeightmapPlacementModifier(net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public Object heightmap() { return wrapperContained.heightmap; }
// // public void heightmap(Object value) { wrapperContained.heightmap = value; }
// public yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier of(Object heightmap) { return new yarnwrap.world.gen.placementmodifier.HeightmapPlacementModifier(wrapperContained.of(heightmap)); }

}