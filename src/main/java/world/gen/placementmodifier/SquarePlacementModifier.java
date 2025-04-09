package yarnwrap.world.gen.placementmodifier;
public class SquarePlacementModifier { public net.minecraft.world.gen.placementmodifier.SquarePlacementModifier wrapperContained; public SquarePlacementModifier(net.minecraft.world.gen.placementmodifier.SquarePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.world.gen.placementmodifier.SquarePlacementModifier INSTANCE() { return new yarnwrap.world.gen.placementmodifier.SquarePlacementModifier(wrapperContained.INSTANCE); }
public yarnwrap.world.gen.placementmodifier.SquarePlacementModifier of() { return new yarnwrap.world.gen.placementmodifier.SquarePlacementModifier(wrapperContained.of()); }

}