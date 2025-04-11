package yarnwrap.world.gen.feature;
public class SmallDripstoneFeature { public net.minecraft.world.gen.feature.SmallDripstoneFeature wrapperContained; public SmallDripstoneFeature(net.minecraft.world.gen.feature.SmallDripstoneFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public void generateDripstoneBlocks(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.SmallDripstoneFeatureConfig config) { wrapperContained.generateDripstoneBlocks(world.wrapperContained,random.wrapperContained,pos.wrapperContained,config.wrapperContained); }
// public java.util.Optional getDirection(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.getDirection(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}