package yarnwrap.world.gen.placementmodifier;
public class SquarePlacementModifier { public net.minecraft.world.gen.placementmodifier.SquarePlacementModifier wrapperContained; public SquarePlacementModifier(net.minecraft.world.gen.placementmodifier.SquarePlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public void MODIFIER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MODIFIER_CODEC = value; }
// public yarnwrap.world.gen.placementmodifier.SquarePlacementModifier INSTANCE() { return new yarnwrap.world.gen.placementmodifier.SquarePlacementModifier(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.gen.placementmodifier.SquarePlacementModifier value) { wrapperContained.INSTANCE = value.wrapperContained; }
public yarnwrap.world.gen.placementmodifier.SquarePlacementModifier of() { return new yarnwrap.world.gen.placementmodifier.SquarePlacementModifier(wrapperContained.of()); }

}