package yarnwrap.world.gen.feature;
public class BlockPileFeature { public net.minecraft.world.gen.feature.BlockPileFeature wrapperContained; public BlockPileFeature(net.minecraft.world.gen.feature.BlockPileFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canPlace(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canPlace(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canPlace(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.world.gen.feature.BlockPileFeature.canPlace(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void addPileBlock(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.feature.BlockPileFeatureConfig config) { wrapperContained.addPileBlock(world.wrapperContained,pos.wrapperContained,random.wrapperContained,config.wrapperContained); }
// public static void addPileBlock(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.feature.BlockPileFeatureConfig config, ) { net.minecraft.world.gen.feature.BlockPileFeature.addPileBlock(world.wrapperContained,pos.wrapperContained,random.wrapperContained,config.wrapperContained); }

}