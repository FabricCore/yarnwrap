package yarnwrap.block;
public class FenceGateBlock { public net.minecraft.block.FenceGateBlock wrapperContained; public FenceGateBlock(net.minecraft.block.FenceGateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape IN_WALL_X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_X_AXIS_SHAPE); }
// public void IN_WALL_X_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.IN_WALL_X_AXIS_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SHAPE); }
// public void X_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_AXIS_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_CULL_SHAPE); }
// public void Z_AXIS_CULL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_AXIS_CULL_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_AXIS_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_COLLISION_SHAPE); }
// public void X_AXIS_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_AXIS_COLLISION_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape IN_WALL_Z_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_Z_AXIS_CULL_SHAPE); }
// public void IN_WALL_Z_AXIS_CULL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.IN_WALL_Z_AXIS_CULL_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SHAPE); }
// public void Z_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_AXIS_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_CULL_SHAPE); }
// public void X_AXIS_CULL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_AXIS_CULL_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty IN_WALL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.IN_WALL); }
// public void IN_WALL(yarnwrap.state.property.BooleanProperty value) { wrapperContained.IN_WALL = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape IN_WALL_Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_Z_AXIS_SHAPE); }
// public void IN_WALL_Z_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.IN_WALL_Z_AXIS_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape IN_WALL_X_AXIS_CULL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.IN_WALL_X_AXIS_CULL_SHAPE); }
// public void IN_WALL_X_AXIS_CULL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.IN_WALL_X_AXIS_CULL_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_COLLISION_SHAPE); }
// public void Z_AXIS_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_AXIS_COLLISION_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SIDES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SIDES_SHAPE); }
// public void Z_AXIS_SIDES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_AXIS_SIDES_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SIDES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SIDES_SHAPE); }
// public void X_AXIS_SIDES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_AXIS_SIDES_SHAPE = value.wrapperContained; }
// public yarnwrap.block.WoodType type() { return new yarnwrap.block.WoodType(wrapperContained.type); }
// public void type(yarnwrap.block.WoodType value) { wrapperContained.type = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public FenceGateBlock(yarnwrap.block.WoodType type,Object settings) { this.wrapperContained = new net.minecraft.block.FenceGateBlock(type.wrapperContained,settings); }
// public boolean isWall(yarnwrap.block.BlockState state) { return wrapperContained.isWall(state.wrapperContained); }
public boolean canWallConnect(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side) { return wrapperContained.canWallConnect(state.wrapperContained,side.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54013(Object instance) { return wrapperContained.method_54013(instance); }
// public yarnwrap.block.WoodType method_54014(yarnwrap.block.FenceGateBlock block) { return new yarnwrap.block.WoodType(wrapperContained.method_54014(block.wrapperContained)); }

}