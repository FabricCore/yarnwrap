package yarnwrap.block;
public class AbstractCauldronBlock { public net.minecraft.block.AbstractCauldronBlock wrapperContained; public AbstractCauldronBlock(net.minecraft.block.AbstractCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.RAYCAST_SHAPE); }
// public Object behaviorMap() { return wrapperContained.behaviorMap; }
// public double getFluidHeight(yarnwrap.block.BlockState state) { return wrapperContained.getFluidHeight(state.wrapperContained); }
// public boolean isEntityTouchingFluid(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return wrapperContained.isEntityTouchingFluid(state.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public void fillFromDripstone(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid) { wrapperContained.fillFromDripstone(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained); }
// public boolean canBeFilledByDripstone(yarnwrap.fluid.Fluid fluid) { return wrapperContained.canBeFilledByDripstone(fluid.wrapperContained); }
public boolean isFull(yarnwrap.block.BlockState state) { return wrapperContained.isFull(state.wrapperContained); }

}