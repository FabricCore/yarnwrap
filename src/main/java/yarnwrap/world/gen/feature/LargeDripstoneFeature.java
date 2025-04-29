package yarnwrap.world.gen.feature;
public class LargeDripstoneFeature { public net.minecraft.world.gen.feature.LargeDripstoneFeature wrapperContained; public LargeDripstoneFeature(net.minecraft.world.gen.feature.LargeDripstoneFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object createGenerator(yarnwrap.util.math.BlockPos pos,boolean isStalagmite,yarnwrap.util.math.random.Random scale,int bluntness,yarnwrap.util.math.floatprovider.FloatProvider heightScale) { return wrapperContained.createGenerator(pos.wrapperContained,isStalagmite,scale.wrapperContained,bluntness,heightScale.wrapperContained); }
// public static Object createGenerator(yarnwrap.util.math.BlockPos pos,boolean isStalagmite,yarnwrap.util.math.random.Random scale,int bluntness,yarnwrap.util.math.floatprovider.FloatProvider heightScale, ) { return net.minecraft.world.gen.feature.LargeDripstoneFeature.createGenerator(pos.wrapperContained,isStalagmite,scale.wrapperContained,bluntness,heightScale.wrapperContained); }
// public void testGeneration(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,Object surface,Object wind) { wrapperContained.testGeneration(world.wrapperContained,pos.wrapperContained,surface,wind); }
// public static void testGeneration(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,Object surface,Object wind, ) { net.minecraft.world.gen.feature.LargeDripstoneFeature.testGeneration(world.wrapperContained,pos.wrapperContained,surface,wind); }

}