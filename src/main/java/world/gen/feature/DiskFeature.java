package yarnwrap.world.gen.feature;
public class DiskFeature { public net.minecraft.world.gen.feature.DiskFeature wrapperContained; public DiskFeature(net.minecraft.world.gen.feature.DiskFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean placeBlock(yarnwrap.world.gen.feature.DiskFeatureConfig config,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,int topY,int bottomY,Object pos) { return wrapperContained.placeBlock(config.wrapperContained,world.wrapperContained,random.wrapperContained,topY,bottomY,pos); }

}