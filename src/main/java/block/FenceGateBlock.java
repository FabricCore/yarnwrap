package yarnwrap.block;
public class FenceGateBlock { public net.minecraft.block.FenceGateBlock wrapperContained; public FenceGateBlock(net.minecraft.block.FenceGateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape IN_WALL_X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_X_AXIS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_CULL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_AXIS_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_COLLISION_SHAPE); }
// public yarnwrap.util.shape.VoxelShape IN_WALL_Z_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_Z_AXIS_CULL_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_CULL_SHAPE); }
public yarnwrap.state.property.BooleanProperty IN_WALL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.IN_WALL); }
// public yarnwrap.util.shape.VoxelShape IN_WALL_Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_Z_AXIS_SHAPE); }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public yarnwrap.util.shape.VoxelShape IN_WALL_X_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_X_AXIS_CULL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_COLLISION_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SIDES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SIDES_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SIDES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SIDES_SHAPE); }
// public yarnwrap.block.WoodType type() { return new yarnwrap.block.WoodType(wrapperContained.type); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean isWall(yarnwrap.block.BlockState state) { return wrapperContained.isWall(state.wrapperContained); }
public boolean canWallConnect(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side) { return wrapperContained.canWallConnect(state.wrapperContained,side.wrapperContained); }

}