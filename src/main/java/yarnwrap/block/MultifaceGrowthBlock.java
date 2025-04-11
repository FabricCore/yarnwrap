package yarnwrap.block;
public class MultifaceGrowthBlock { public net.minecraft.block.MultifaceGrowthBlock wrapperContained; public MultifaceGrowthBlock(net.minecraft.block.MultifaceGrowthBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
// public void UP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_SHAPE); }
// public void DOWN_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOWN_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
// public java.util.Map SHAPES_FOR_DIRECTIONS() { return wrapperContained.SHAPES_FOR_DIRECTIONS; }
// public void SHAPES_FOR_DIRECTIONS(java.util.Map value) { wrapperContained.SHAPES_FOR_DIRECTIONS = value; }
// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public com.google.common.collect.ImmutableMap SHAPES() { return wrapperContained.SHAPES; }
// public void SHAPES(com.google.common.collect.ImmutableMap value) { wrapperContained.SHAPES = value; }
// public boolean hasAllHorizontalDirections() { return wrapperContained.hasAllHorizontalDirections; }
// public void hasAllHorizontalDirections(boolean value) { wrapperContained.hasAllHorizontalDirections = value; }
// public boolean canMirrorX() { return wrapperContained.canMirrorX; }
// public void canMirrorX(boolean value) { wrapperContained.canMirrorX = value; }
// public boolean canMirrorZ() { return wrapperContained.canMirrorZ; }
// public void canMirrorZ(boolean value) { wrapperContained.canMirrorZ = value; }
public boolean canGrowOn(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canGrowOn(world.wrapperContained,direction.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.block.BlockState method_33361(yarnwrap.block.BlockState direction) { return new yarnwrap.block.BlockState(wrapperContained.method_33361(direction.wrapperContained)); }
public yarnwrap.block.BlockState withDirection(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.BlockState(wrapperContained.withDirection(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public yarnwrap.block.BlockState disableDirection(yarnwrap.block.BlockState state,yarnwrap.state.property.BooleanProperty direction) { return new yarnwrap.block.BlockState(wrapperContained.disableDirection(state.wrapperContained,direction.wrapperContained)); }
public boolean hasDirection(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return wrapperContained.hasDirection(state.wrapperContained,direction.wrapperContained); }
// public yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,java.util.function.Function mirror) { return new yarnwrap.block.BlockState(wrapperContained.mirror(state.wrapperContained,mirror)); }
// public yarnwrap.block.BlockState withAllDirections(yarnwrap.state.StateManager stateManager) { return new yarnwrap.block.BlockState(wrapperContained.withAllDirections(stateManager.wrapperContained)); }
// public boolean canHaveDirection(yarnwrap.util.math.Direction direction) { return wrapperContained.canHaveDirection(direction.wrapperContained); }
// public void method_33370(java.util.EnumMap shapes) { wrapperContained.method_33370(shapes); }
// public boolean method_33372(yarnwrap.block.BlockState direction) { return wrapperContained.method_33372(direction.wrapperContained); }
public yarnwrap.state.property.BooleanProperty getProperty(yarnwrap.util.math.Direction direction) { return new yarnwrap.state.property.BooleanProperty(wrapperContained.getProperty(direction.wrapperContained)); }
// public boolean method_33376(yarnwrap.block.BlockState direction) { return wrapperContained.method_33376(direction.wrapperContained); }
// public boolean isWaterlogged() { return wrapperContained.isWaterlogged(); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }
// public boolean hasAnyDirection(yarnwrap.block.BlockState state) { return wrapperContained.hasAnyDirection(state.wrapperContained); }
// public boolean isNotFullBlock(yarnwrap.block.BlockState state) { return wrapperContained.isNotFullBlock(state.wrapperContained); }
public yarnwrap.block.LichenGrower getGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.getGrower()); }
public java.util.Set flagToDirections(byte flag) { return wrapperContained.flagToDirections(flag); }
public boolean canGrowWithDirection(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrowWithDirection(world.wrapperContained,state.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
public byte directionsToFlag(java.util.Collection directions) { return wrapperContained.directionsToFlag(directions); }
public java.util.Set collectDirections(yarnwrap.block.BlockState state) { return wrapperContained.collectDirections(state.wrapperContained); }

}