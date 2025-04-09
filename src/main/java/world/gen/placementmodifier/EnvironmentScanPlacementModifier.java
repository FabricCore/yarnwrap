package yarnwrap.world.gen.placementmodifier;
public class EnvironmentScanPlacementModifier { public net.minecraft.world.gen.placementmodifier.EnvironmentScanPlacementModifier wrapperContained; public EnvironmentScanPlacementModifier(net.minecraft.world.gen.placementmodifier.EnvironmentScanPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec MODIFIER_CODEC() { return wrapperContained.MODIFIER_CODEC; }
// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate targetPredicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.targetPredicate); }
// public yarnwrap.world.gen.blockpredicate.BlockPredicate allowedSearchPredicate() { return new yarnwrap.world.gen.blockpredicate.BlockPredicate(wrapperContained.allowedSearchPredicate); }
// public int maxSteps() { return wrapperContained.maxSteps; }
public yarnwrap.world.gen.placementmodifier.EnvironmentScanPlacementModifier of(yarnwrap.util.math.Direction direction,yarnwrap.world.gen.blockpredicate.BlockPredicate targetPredicate,int maxSteps) { return new yarnwrap.world.gen.placementmodifier.EnvironmentScanPlacementModifier(wrapperContained.of(direction.wrapperContained,targetPredicate.wrapperContained,maxSteps)); }
public yarnwrap.world.gen.placementmodifier.EnvironmentScanPlacementModifier of(yarnwrap.util.math.Direction direction,yarnwrap.world.gen.blockpredicate.BlockPredicate targetPredicate,yarnwrap.world.gen.blockpredicate.BlockPredicate allowedSearchPredicate,int maxSteps) { return new yarnwrap.world.gen.placementmodifier.EnvironmentScanPlacementModifier(wrapperContained.of(direction.wrapperContained,targetPredicate.wrapperContained,allowedSearchPredicate.wrapperContained,maxSteps)); }

}