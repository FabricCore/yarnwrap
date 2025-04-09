package yarnwrap.world.gen.feature;
public class IcebergFeature { public net.minecraft.world.gen.feature.IcebergFeature wrapperContained; public IcebergFeature(net.minecraft.world.gen.feature.IcebergFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isAirBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAirBelow(world.wrapperContained,pos.wrapperContained); }
// public int decreaseValueNearTop(int y,int height,int value) { return wrapperContained.decreaseValueNearTop(y,height,value); }
// public boolean isSnowOrIce(yarnwrap.block.BlockState state) { return wrapperContained.isSnowOrIce(state.wrapperContained); }
// public void clearSnowAbove(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.clearSnowAbove(world.wrapperContained,pos.wrapperContained); }
// public double getDistance(int x,int z,yarnwrap.util.math.BlockPos pos,int divisor1,int divisor2,double randomSine) { return wrapperContained.getDistance(x,z,pos.wrapperContained,divisor1,divisor2,randomSine); }
// public void placeBlockOrSnow(yarnwrap.util.math.BlockPos pos,yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,int heightRemaining,int height,boolean lessSnow,boolean placeSnow,yarnwrap.block.BlockState state) { wrapperContained.placeBlockOrSnow(pos.wrapperContained,world.wrapperContained,random.wrapperContained,heightRemaining,height,lessSnow,placeSnow,state.wrapperContained); }
// public void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,int height,int offsetX,int offsetY,int offsetZ,int randomSine,int placeSnow,boolean state) { wrapperContained.placeAt(world.wrapperContained,random.wrapperContained,pos.wrapperContained,height,offsetX,offsetY,offsetZ,randomSine,placeSnow,state); }

}