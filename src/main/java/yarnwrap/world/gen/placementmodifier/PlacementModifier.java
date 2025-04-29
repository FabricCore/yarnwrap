package yarnwrap.world.gen.placementmodifier;
public class PlacementModifier { public net.minecraft.world.gen.placementmodifier.PlacementModifier wrapperContained; public PlacementModifier(net.minecraft.world.gen.placementmodifier.PlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.placementmodifier.PlacementModifier.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.placementmodifier.PlacementModifier.CODEC = value; }

public java.util.stream.Stream getPositions(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositions(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public static java.util.stream.Stream getPositions(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.placementmodifier.PlacementModifier.getPositions(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }
public yarnwrap.world.gen.placementmodifier.PlacementModifierType getType() { return new yarnwrap.world.gen.placementmodifier.PlacementModifierType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.placementmodifier.PlacementModifierType getType() { return new yarnwrap.world.gen.placementmodifier.PlacementModifierType(net.minecraft.world.gen.placementmodifier.PlacementModifier.getType()); }

}