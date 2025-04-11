package yarnwrap.block;
public class TrapdoorBlock { public net.minecraft.block.TrapdoorBlock wrapperContained; public TrapdoorBlock(net.minecraft.block.TrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape OPEN_TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OPEN_TOP_SHAPE); }
// public void OPEN_TOP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OPEN_TOP_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape OPEN_BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OPEN_BOTTOM_SHAPE); }
// public void OPEN_BOTTOM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OPEN_BOTTOM_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
// public void blockSetType(yarnwrap.block.BlockSetType value) { wrapperContained.blockSetType = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public TrapdoorBlock(yarnwrap.block.BlockSetType type,Object settings) { this.wrapperContained = new net.minecraft.block.TrapdoorBlock(type.wrapperContained,settings); }
// public void playToggleSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.playToggleSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public com.mojang.datafixers.kinds.App method_54058(Object instance) { return wrapperContained.method_54058(instance); }
// public yarnwrap.block.BlockSetType method_54059(yarnwrap.block.TrapdoorBlock block) { return new yarnwrap.block.BlockSetType(wrapperContained.method_54059(block.wrapperContained)); }
// public yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.getBlockSetType()); }
// public void flip(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.flip(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }

}