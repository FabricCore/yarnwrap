package yarnwrap.block;
public class DragonEggBlock { public net.minecraft.block.DragonEggBlock wrapperContained; public DragonEggBlock(net.minecraft.block.DragonEggBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void teleport(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.teleport(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}