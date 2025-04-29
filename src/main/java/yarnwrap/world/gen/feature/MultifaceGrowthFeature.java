package yarnwrap.world.gen.feature;
public class MultifaceGrowthFeature { public net.minecraft.world.gen.feature.MultifaceGrowthFeature wrapperContained; public MultifaceGrowthFeature(net.minecraft.world.gen.feature.MultifaceGrowthFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config,yarnwrap.util.math.random.Random random,java.util.List directions) { return wrapperContained.generate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,config.wrapperContained,random.wrapperContained,directions); }
// public static boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config,yarnwrap.util.math.random.Random random,java.util.List directions, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeature.generate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,config.wrapperContained,random.wrapperContained,directions); }
// public boolean isAirOrWater(yarnwrap.block.BlockState state) { return wrapperContained.isAirOrWater(state.wrapperContained); }
// public static boolean isAirOrWater(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeature.isAirOrWater(state.wrapperContained); }

}