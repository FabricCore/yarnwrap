package yarnwrap.block.entity;
public class BlockEntityTicker { public net.minecraft.block.entity.BlockEntityTicker wrapperContained; public BlockEntityTicker(net.minecraft.block.entity.BlockEntityTicker wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BlockEntity blockEntity, ) { net.minecraft.block.entity.BlockEntityTicker.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}