package yarnwrap.block;
public class AbstractCauldronBlock { public net.minecraft.block.AbstractCauldronBlock wrapperContained; public AbstractCauldronBlock(net.minecraft.block.AbstractCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractCauldronBlock.OUTLINE_SHAPE); }
// public static void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractCauldronBlock.OUTLINE_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.RAYCAST_SHAPE); }
// public void RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.RAYCAST_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractCauldronBlock.RAYCAST_SHAPE); }
// public static void RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractCauldronBlock.RAYCAST_SHAPE = value.wrapperContained; }

// public Object behaviorMap() { return wrapperContained.behaviorMap; }
// // public void behaviorMap(Object value) { wrapperContained.behaviorMap = value; }
// // public static Object behaviorMap() { return net.minecraft.block.AbstractCauldronBlock.behaviorMap; }
// // public static void behaviorMap(Object value, ) { net.minecraft.block.AbstractCauldronBlock.behaviorMap = value; }

// public AbstractCauldronBlock(Object settings,Object behaviorMap) { this.wrapperContained = new net.minecraft.block.AbstractCauldronBlock(settings,behaviorMap); }
// public double getFluidHeight(yarnwrap.block.BlockState state) { return wrapperContained.getFluidHeight(state.wrapperContained); }
// public static double getFluidHeight(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractCauldronBlock.getFluidHeight(state.wrapperContained); }
// public boolean isEntityTouchingFluid(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isEntityTouchingFluid(state.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public static boolean isEntityTouchingFluid(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity, ) { return net.minecraft.block.AbstractCauldronBlock.isEntityTouchingFluid(state.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public void fillFromDripstone(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid) { wrapperContained.fillFromDripstone(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained); }
// public static void fillFromDripstone(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid, ) { net.minecraft.block.AbstractCauldronBlock.fillFromDripstone(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained); }
// public boolean canBeFilledByDripstone(yarnwrap.fluid.Fluid fluid) { return wrapperContained.canBeFilledByDripstone(fluid.wrapperContained); }
// public static boolean canBeFilledByDripstone(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.block.AbstractCauldronBlock.canBeFilledByDripstone(fluid.wrapperContained); }
public boolean isFull(yarnwrap.block.BlockState state) { return wrapperContained.isFull(state.wrapperContained); }
// public static boolean isFull(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractCauldronBlock.isFull(state.wrapperContained); }

}