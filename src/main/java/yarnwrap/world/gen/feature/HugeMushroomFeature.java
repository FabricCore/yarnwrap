package yarnwrap.world.gen.feature;
public class HugeMushroomFeature { public net.minecraft.world.gen.feature.HugeMushroomFeature wrapperContained; public HugeMushroomFeature(net.minecraft.world.gen.feature.HugeMushroomFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public int getCapSize(int capSize,int y) { return wrapperContained.getCapSize(capSize,y); }
// public boolean canGenerate(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int height,Object mutablePos,yarnwrap.world.gen.feature.HugeMushroomFeatureConfig config) { return wrapperContained.canGenerate(world.wrapperContained,pos.wrapperContained,height,mutablePos,config.wrapperContained); }
// public void generateCap(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos start,int y,Object mutable,yarnwrap.world.gen.feature.HugeMushroomFeatureConfig config) { wrapperContained.generateCap(world.wrapperContained,random.wrapperContained,start.wrapperContained,y,mutable,config.wrapperContained); }
// public void generateStem(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.world.gen.feature.HugeMushroomFeatureConfig config,int height,Object mutablePos) { wrapperContained.generateStem(world.wrapperContained,random.wrapperContained,pos.wrapperContained,config.wrapperContained,height,mutablePos); }
// public int getHeight(yarnwrap.util.math.random.Random random) { return wrapperContained.getHeight(random.wrapperContained); }

}