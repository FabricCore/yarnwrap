package yarnwrap.world.gen.feature;
public class DripstoneClusterFeature { public net.minecraft.world.gen.feature.DripstoneClusterFeature wrapperContained; public DripstoneClusterFeature(net.minecraft.world.gen.feature.DripstoneClusterFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public double dripstoneChance(int radiusX,int radiusZ,int localX,int localZ,yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.dripstoneChance(radiusX,radiusZ,localX,localZ,config.wrapperContained); }
// public boolean isStoneOrWater(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isStoneOrWater(world.wrapperContained,pos.wrapperContained); }
// public boolean canWaterSpawn(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canWaterSpawn(world.wrapperContained,pos.wrapperContained); }
// public void placeDripstoneBlocks(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,int height,yarnwrap.util.math.Direction direction) { wrapperContained.placeDripstoneBlocks(world.wrapperContained,pos.wrapperContained,height,direction.wrapperContained); }
// public void generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,int localX,int localZ,float wetness,double dripstoneChance,int height,float density,yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { wrapperContained.generate(world.wrapperContained,random.wrapperContained,pos.wrapperContained,localX,localZ,wetness,dripstoneChance,height,density,config.wrapperContained); }
// public float clampedGaussian(yarnwrap.util.math.random.Random random,float min,float max,float mean,float deviation) { return wrapperContained.clampedGaussian(random.wrapperContained,min,max,mean,deviation); }
// public int getHeight(yarnwrap.util.math.random.Random random,int localX,int localZ,float density,int height,yarnwrap.world.gen.feature.DripstoneClusterFeatureConfig config) { return wrapperContained.getHeight(random.wrapperContained,localX,localZ,density,height,config.wrapperContained); }
// public boolean isLava(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isLava(world.wrapperContained,pos.wrapperContained); }

}