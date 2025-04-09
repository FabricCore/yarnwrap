package yarnwrap.block;
public class TrapdoorBlock { public net.minecraft.block.TrapdoorBlock wrapperContained; public TrapdoorBlock(net.minecraft.block.TrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape OPEN_TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OPEN_TOP_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public yarnwrap.util.shape.VoxelShape OPEN_BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OPEN_BOTTOM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void playToggleSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.playToggleSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.getBlockSetType()); }
// public void flip(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.flip(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }

}