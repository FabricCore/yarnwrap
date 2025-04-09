package yarnwrap.world.gen.placementmodifier;
public class BlockFilterPlacementModifier { public net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier wrapperContained; public BlockFilterPlacementModifier(net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate predicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.predicate); }
public yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier of(yarnwrap.world.gen.blockpredicate.BlockPredicate predicate) { return new yarnwrap.world.gen.placementmodifier.BlockFilterPlacementModifier(wrapperContained.of(predicate.wrapperContained)); }

}