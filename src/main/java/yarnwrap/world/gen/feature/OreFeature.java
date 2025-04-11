package yarnwrap.world.gen.feature;
public class OreFeature { public net.minecraft.world.gen.feature.OreFeature wrapperContained; public OreFeature(net.minecraft.world.gen.feature.OreFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean generateVeinPart(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.feature.OreFeatureConfig config,double startX,double endX,double startZ,double endZ,double startY,double endY,int x,int y,int z,int horizontalSize,int verticalSize) { return wrapperContained.generateVeinPart(world.wrapperContained,random.wrapperContained,config.wrapperContained,startX,endX,startZ,endZ,startY,endY,x,y,z,horizontalSize,verticalSize); }
// public boolean shouldPlace(yarnwrap.block.BlockState state,java.util.function.Function posToState,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.feature.OreFeatureConfig config,Object target,Object pos) { return wrapperContained.shouldPlace(state.wrapperContained,posToState,random.wrapperContained,config.wrapperContained,target,pos); }
// public boolean shouldNotDiscard(yarnwrap.util.math.random.Random random,float chance) { return wrapperContained.shouldNotDiscard(random.wrapperContained,chance); }

}