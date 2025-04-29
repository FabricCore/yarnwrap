package yarnwrap.world.gen.placementmodifier;
public class AbstractCountPlacementModifier { public net.minecraft.world.gen.placementmodifier.AbstractCountPlacementModifier wrapperContained; public AbstractCountPlacementModifier(net.minecraft.world.gen.placementmodifier.AbstractCountPlacementModifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public int getCount(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getCount(random.wrapperContained,pos.wrapperContained); }
// public static int getCount(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.placementmodifier.AbstractCountPlacementModifier.getCount(random.wrapperContained,pos.wrapperContained); }

}