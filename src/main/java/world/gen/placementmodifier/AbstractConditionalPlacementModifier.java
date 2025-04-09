package yarnwrap.world.gen.placementmodifier;
public class AbstractConditionalPlacementModifier { public net.minecraft.world.gen.placementmodifier.AbstractConditionalPlacementModifier wrapperContained; public AbstractConditionalPlacementModifier(net.minecraft.world.gen.placementmodifier.AbstractConditionalPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean shouldPlace(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldPlace(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}