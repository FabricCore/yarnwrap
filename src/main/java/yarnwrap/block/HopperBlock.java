package yarnwrap.block;
public class HopperBlock { public net.minecraft.block.HopperBlock wrapperContained; public HopperBlock(net.minecraft.block.HopperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_SHAPE); }
// public void DOWN_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOWN_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape OUTSIDE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTSIDE_SHAPE); }
// public void OUTSIDE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTSIDE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_RAYCAST_SHAPE); }
// public void NORTH_RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_RAYCAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOWN_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_RAYCAST_SHAPE); }
// public void DOWN_RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOWN_RAYCAST_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty ENABLED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ENABLED); }
// public void ENABLED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ENABLED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape MIDDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.MIDDLE_SHAPE); }
// public void MIDDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.MIDDLE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_RAYCAST_SHAPE); }
// public void SOUTH_RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_RAYCAST_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public void TOP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public void DEFAULT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DEFAULT_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_RAYCAST_SHAPE); }
// public void EAST_RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_RAYCAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_RAYCAST_SHAPE); }
// public void WEST_RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_RAYCAST_SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.shape.VoxelShape INSIDE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.INSIDE_SHAPE); }
// public void INSIDE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.INSIDE_SHAPE = value.wrapperContained; }
// public void updateEnabled(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateEnabled(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}