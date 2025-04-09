package yarnwrap.world.gen.placementmodifier;
public class BiomePlacementModifier { public net.minecraft.world.gen.placementmodifier.BiomePlacementModifier wrapperContained; public BiomePlacementModifier(net.minecraft.world.gen.placementmodifier.BiomePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.world.gen.placementmodifier.BiomePlacementModifier INSTANCE() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(wrapperContained.INSTANCE); }
public yarnwrap.world.gen.placementmodifier.BiomePlacementModifier of() { return new yarnwrap.world.gen.placementmodifier.BiomePlacementModifier(wrapperContained.of()); }

}