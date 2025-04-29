package yarnwrap.fluid;
public class LavaFluid { public net.minecraft.fluid.LavaFluid wrapperContained; public LavaFluid(net.minecraft.fluid.LavaFluid wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MIN_HEIGHT_TO_REPLACE() { return wrapperContained.MIN_HEIGHT_TO_REPLACE; }
// public void MIN_HEIGHT_TO_REPLACE(float value) { wrapperContained.MIN_HEIGHT_TO_REPLACE = value; }
public static float MIN_HEIGHT_TO_REPLACE() { return net.minecraft.fluid.LavaFluid.MIN_HEIGHT_TO_REPLACE; }
// public static void MIN_HEIGHT_TO_REPLACE(float value, ) { net.minecraft.fluid.LavaFluid.MIN_HEIGHT_TO_REPLACE = value; }

// public boolean hasBurnableBlock(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBurnableBlock(world.wrapperContained,pos.wrapperContained); }
// public static boolean hasBurnableBlock(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.fluid.LavaFluid.hasBurnableBlock(world.wrapperContained,pos.wrapperContained); }
// public void playExtinguishEvent(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playExtinguishEvent(world.wrapperContained,pos.wrapperContained); }
// public static void playExtinguishEvent(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.fluid.LavaFluid.playExtinguishEvent(world.wrapperContained,pos.wrapperContained); }
// public boolean canLightFire(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canLightFire(world.wrapperContained,pos.wrapperContained); }
// public static boolean canLightFire(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.fluid.LavaFluid.canLightFire(world.wrapperContained,pos.wrapperContained); }

}