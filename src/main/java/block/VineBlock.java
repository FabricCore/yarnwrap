package yarnwrap.block;
public class VineBlock { public net.minecraft.block.VineBlock wrapperContained; public VineBlock(net.minecraft.block.VineBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public java.util.Map shapesByState() { return wrapperContained.shapesByState; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.BlockState getGrownState(yarnwrap.block.BlockState above,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.getGrownState(above.wrapperContained,state.wrapperContained,random.wrapperContained)); }
public boolean shouldConnectTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.shouldConnectTo(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public int getAdjacentBlockCount(yarnwrap.block.BlockState state) { return wrapperContained.getAdjacentBlockCount(state.wrapperContained); }
// public boolean hasAdjacentBlocks(yarnwrap.block.BlockState state) { return wrapperContained.hasAdjacentBlocks(state.wrapperContained); }
// public boolean canGrowAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getPlacementShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.state.property.BooleanProperty getFacingProperty(yarnwrap.util.math.Direction direction) { return new yarnwrap.state.property.BooleanProperty(wrapperContained.getFacingProperty(direction.wrapperContained)); }
// public boolean shouldHaveSide(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return wrapperContained.shouldHaveSide(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }
// public boolean hasHorizontalSide(yarnwrap.block.BlockState state) { return wrapperContained.hasHorizontalSide(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }

}