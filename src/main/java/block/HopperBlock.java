package yarnwrap.block;
public class HopperBlock { public net.minecraft.block.HopperBlock wrapperContained; public HopperBlock(net.minecraft.block.HopperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_SHAPE); }
// public yarnwrap.util.shape.VoxelShape OUTSIDE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTSIDE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_RAYCAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape DOWN_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_RAYCAST_SHAPE); }
public yarnwrap.state.property.BooleanProperty ENABLED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ENABLED); }
// public yarnwrap.util.shape.VoxelShape MIDDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.MIDDLE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_RAYCAST_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_RAYCAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_RAYCAST_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape INSIDE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.INSIDE_SHAPE); }
// public void updateEnabled(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateEnabled(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}