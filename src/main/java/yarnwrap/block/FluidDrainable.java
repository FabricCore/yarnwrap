package yarnwrap.block;
public class FluidDrainable { public net.minecraft.block.FluidDrainable wrapperContained; public FluidDrainable(net.minecraft.block.FluidDrainable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional getBucketFillSound() { return wrapperContained.getBucketFillSound(); }
// public static java.util.Optional getBucketFillSound() { return net.minecraft.block.FluidDrainable.getBucketFillSound(); }
public yarnwrap.item.ItemStack tryDrainFluid(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.item.ItemStack(wrapperContained.tryDrainFluid(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.item.ItemStack tryDrainFluid(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.FluidDrainable.tryDrainFluid(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }

}