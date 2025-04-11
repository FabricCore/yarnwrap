package yarnwrap.block;
public class FluidFillable { public net.minecraft.block.FluidFillable wrapperContained; public FluidFillable(net.minecraft.block.FluidFillable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canFillWithFluid(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.fluid.Fluid fluid) { return wrapperContained.canFillWithFluid(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,fluid.wrapperContained); }
public boolean tryFillWithFluid(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.fluid.FluidState fluidState) { return wrapperContained.tryFillWithFluid(world.wrapperContained,pos.wrapperContained,state.wrapperContained,fluidState.wrapperContained); }

}