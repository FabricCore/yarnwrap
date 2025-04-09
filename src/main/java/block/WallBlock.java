package yarnwrap.block;
public class WallBlock { public net.minecraft.block.WallBlock wrapperContained; public WallBlock(net.minecraft.block.WallBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
public yarnwrap.state.property.EnumProperty EAST_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.EAST_SHAPE); }
public yarnwrap.state.property.EnumProperty NORTH_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.NORTH_SHAPE); }
public yarnwrap.state.property.EnumProperty SOUTH_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SOUTH_SHAPE); }
public yarnwrap.state.property.EnumProperty WEST_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WEST_SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public java.util.Map shapeMap() { return wrapperContained.shapeMap; }
// public java.util.Map collisionShapeMap() { return wrapperContained.collisionShapeMap; }
// public yarnwrap.util.shape.VoxelShape TALL_POST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TALL_POST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TALL_NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TALL_NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TALL_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TALL_SOUTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TALL_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TALL_WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TALL_EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TALL_EAST_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean shouldConnectTo(yarnwrap.block.BlockState state,boolean faceFullSquare,yarnwrap.util.math.Direction side) { return wrapperContained.shouldConnectTo(state.wrapperContained,faceFullSquare,side.wrapperContained); }
// public java.util.Map getShapeMap() { return wrapperContained.getShapeMap(); }
// public yarnwrap.block.BlockState getStateAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState) { return new yarnwrap.block.BlockState(wrapperContained.getStateAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained)); }
// public yarnwrap.block.BlockState getStateWith(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState,boolean north,boolean east,boolean south,boolean west) { return new yarnwrap.block.BlockState(wrapperContained.getStateWith(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained,north,east,south,west)); }
// public yarnwrap.block.BlockState getStateWithNeighbor(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos neighborPos,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithNeighbor(world.wrapperContained,pos.wrapperContained,state.wrapperContained,neighborPos.wrapperContained,neighborState.wrapperContained,direction.wrapperContained)); }
// public boolean isConnected(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property) { return wrapperContained.isConnected(state.wrapperContained,property.wrapperContained); }
// public yarnwrap.block.BlockState getStateWith(yarnwrap.block.BlockState state,boolean north,boolean east,boolean south,boolean west,yarnwrap.util.shape.VoxelShape aboveShape) { return new yarnwrap.block.BlockState(wrapperContained.getStateWith(state.wrapperContained,north,east,south,west,aboveShape.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getVoxelShape(yarnwrap.util.shape.VoxelShape base,yarnwrap.block.enums.WallShape wallShape,yarnwrap.util.shape.VoxelShape tall,yarnwrap.util.shape.VoxelShape low) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getVoxelShape(base.wrapperContained,wallShape.wrapperContained,tall.wrapperContained,low.wrapperContained)); }
// public boolean shouldUseTallShape(yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape) { return wrapperContained.shouldUseTallShape(aboveShape.wrapperContained,tallShape.wrapperContained); }
// public yarnwrap.block.enums.WallShape getWallShape(boolean connected,yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape) { return new yarnwrap.block.enums.WallShape(wrapperContained.getWallShape(connected,aboveShape.wrapperContained,tallShape.wrapperContained)); }
// public boolean shouldHavePost(yarnwrap.block.BlockState state,yarnwrap.block.BlockState aboveState,yarnwrap.util.shape.VoxelShape aboveShape) { return wrapperContained.shouldHavePost(state.wrapperContained,aboveState.wrapperContained,aboveShape.wrapperContained); }

}