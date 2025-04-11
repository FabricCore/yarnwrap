package yarnwrap.fluid;
public class LavaFluid { public net.minecraft.fluid.LavaFluid wrapperContained; public LavaFluid(net.minecraft.fluid.LavaFluid wrapperContained) { this.wrapperContained = wrapperContained; }

public float MIN_HEIGHT_TO_REPLACE() { return wrapperContained.MIN_HEIGHT_TO_REPLACE; }
// public void MIN_HEIGHT_TO_REPLACE(float value) { wrapperContained.MIN_HEIGHT_TO_REPLACE = value; }
// public boolean hasBurnableBlock(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBurnableBlock(world.wrapperContained,pos.wrapperContained); }
// public void playExtinguishEvent(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playExtinguishEvent(world.wrapperContained,pos.wrapperContained); }
// public boolean canLightFire(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canLightFire(world.wrapperContained,pos.wrapperContained); }

}