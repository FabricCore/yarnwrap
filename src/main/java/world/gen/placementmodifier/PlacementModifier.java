package yarnwrap.world.gen.placementmodifier;
public class PlacementModifier { public net.minecraft.world.gen.placementmodifier.PlacementModifier wrapperContained; public PlacementModifier(net.minecraft.world.gen.placementmodifier.PlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.util.stream.Stream getPositions(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositions(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }
public yarnwrap.world.gen.placementmodifier.PlacementModifierType getType() { return new yarnwrap.world.gen.placementmodifier.PlacementModifierType(wrapperContained.getType()); }

}