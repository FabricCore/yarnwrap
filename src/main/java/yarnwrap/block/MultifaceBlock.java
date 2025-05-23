package yarnwrap.block;
public class MultifaceBlock { public net.minecraft.block.MultifaceBlock wrapperContained; public MultifaceBlock(net.minecraft.block.MultifaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
// public static java.util.Map FACING_PROPERTIES() { return net.minecraft.block.MultifaceBlock.FACING_PROPERTIES; }
// public static void FACING_PROPERTIES(java.util.Map value, ) { net.minecraft.block.MultifaceBlock.FACING_PROPERTIES = value; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.block.MultifaceBlock.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.block.MultifaceBlock.DIRECTIONS = value; }

// public boolean hasAllHorizontalDirections() { return wrapperContained.hasAllHorizontalDirections; }
// public void hasAllHorizontalDirections(boolean value) { wrapperContained.hasAllHorizontalDirections = value; }
// public static boolean hasAllHorizontalDirections() { return net.minecraft.block.MultifaceBlock.hasAllHorizontalDirections; }
// public static void hasAllHorizontalDirections(boolean value, ) { net.minecraft.block.MultifaceBlock.hasAllHorizontalDirections = value; }

// public boolean canMirrorX() { return wrapperContained.canMirrorX; }
// public void canMirrorX(boolean value) { wrapperContained.canMirrorX = value; }
// public static boolean canMirrorX() { return net.minecraft.block.MultifaceBlock.canMirrorX; }
// public static void canMirrorX(boolean value, ) { net.minecraft.block.MultifaceBlock.canMirrorX = value; }

// public boolean canMirrorZ() { return wrapperContained.canMirrorZ; }
// public void canMirrorZ(boolean value) { wrapperContained.canMirrorZ = value; }
// public static boolean canMirrorZ() { return net.minecraft.block.MultifaceBlock.canMirrorZ; }
// public static void canMirrorZ(boolean value, ) { net.minecraft.block.MultifaceBlock.canMirrorZ = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MultifaceBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MultifaceBlock.CODEC = value; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.MultifaceBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.MultifaceBlock.WATERLOGGED = value.wrapperContained; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.MultifaceBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.MultifaceBlock.shapeFunction = value; }

// public boolean canGrowOn(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canGrowOn(world.wrapperContained,direction.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean canGrowOn(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.MultifaceBlock.canGrowOn(world.wrapperContained,direction.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.block.BlockState method_33361(yarnwrap.block.BlockState direction) { return new yarnwrap.block.BlockState(wrapperContained.method_33361(direction.wrapperContained)); }
// public static yarnwrap.block.BlockState method_33361(yarnwrap.block.BlockState direction, ) { return new yarnwrap.block.BlockState(net.minecraft.block.MultifaceBlock.method_33361(direction.wrapperContained)); }
public yarnwrap.block.BlockState withDirection(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.BlockState(wrapperContained.withDirection(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.block.BlockState withDirection(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.block.BlockState(net.minecraft.block.MultifaceBlock.withDirection(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public yarnwrap.block.BlockState disableDirection(yarnwrap.block.BlockState state,yarnwrap.state.property.BooleanProperty direction) { return new yarnwrap.block.BlockState(wrapperContained.disableDirection(state.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.block.BlockState disableDirection(yarnwrap.block.BlockState state,yarnwrap.state.property.BooleanProperty direction, ) { return new yarnwrap.block.BlockState(net.minecraft.block.MultifaceBlock.disableDirection(state.wrapperContained,direction.wrapperContained)); }
// public boolean hasDirection(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return wrapperContained.hasDirection(state.wrapperContained,direction.wrapperContained); }
// public static boolean hasDirection(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.MultifaceBlock.hasDirection(state.wrapperContained,direction.wrapperContained); }
// public yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,java.util.function.Function mirror) { return new yarnwrap.block.BlockState(wrapperContained.mirror(state.wrapperContained,mirror)); }
// public static yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,java.util.function.Function mirror, ) { return new yarnwrap.block.BlockState(net.minecraft.block.MultifaceBlock.mirror(state.wrapperContained,mirror)); }
// public yarnwrap.block.BlockState withAllDirections(yarnwrap.state.StateManager stateManager) { return new yarnwrap.block.BlockState(wrapperContained.withAllDirections(stateManager.wrapperContained)); }
// public static yarnwrap.block.BlockState withAllDirections(yarnwrap.state.StateManager stateManager, ) { return new yarnwrap.block.BlockState(net.minecraft.block.MultifaceBlock.withAllDirections(stateManager.wrapperContained)); }
// public boolean canHaveDirection(yarnwrap.util.math.Direction direction) { return wrapperContained.canHaveDirection(direction.wrapperContained); }
// public static boolean canHaveDirection(yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.MultifaceBlock.canHaveDirection(direction.wrapperContained); }
// public yarnwrap.state.property.BooleanProperty getProperty(yarnwrap.util.math.Direction direction) { return new yarnwrap.state.property.BooleanProperty(wrapperContained.getProperty(direction.wrapperContained)); }
// public static yarnwrap.state.property.BooleanProperty getProperty(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.MultifaceBlock.getProperty(direction.wrapperContained)); }
// public boolean hasAnyDirection(yarnwrap.block.BlockState state) { return wrapperContained.hasAnyDirection(state.wrapperContained); }
// public static boolean hasAnyDirection(yarnwrap.block.BlockState state, ) { return net.minecraft.block.MultifaceBlock.hasAnyDirection(state.wrapperContained); }
// public boolean isNotFullBlock(yarnwrap.block.BlockState state) { return wrapperContained.isNotFullBlock(state.wrapperContained); }
// public static boolean isNotFullBlock(yarnwrap.block.BlockState state, ) { return net.minecraft.block.MultifaceBlock.isNotFullBlock(state.wrapperContained); }
// public java.util.Set flagToDirections(byte flag) { return wrapperContained.flagToDirections(flag); }
// public static java.util.Set flagToDirections(byte flag, ) { return net.minecraft.block.MultifaceBlock.flagToDirections(flag); }
public boolean canGrowWithDirection(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrowWithDirection(world.wrapperContained,state.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean canGrowWithDirection(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.MultifaceBlock.canGrowWithDirection(world.wrapperContained,state.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public byte directionsToFlag(java.util.Collection directions) { return wrapperContained.directionsToFlag(directions); }
// public static byte directionsToFlag(java.util.Collection directions, ) { return net.minecraft.block.MultifaceBlock.directionsToFlag(directions); }
// public java.util.Set collectDirections(yarnwrap.block.BlockState state) { return wrapperContained.collectDirections(state.wrapperContained); }
// public static java.util.Set collectDirections(yarnwrap.block.BlockState state, ) { return net.minecraft.block.MultifaceBlock.collectDirections(state.wrapperContained); }
// public boolean canGrowOn(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrowOn(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean canGrowOn(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.MultifaceBlock.canGrowOn(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66454(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66454(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66454(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.MultifaceBlock.method_66454(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.MultifaceBlock.createShapeFunction(); }

}