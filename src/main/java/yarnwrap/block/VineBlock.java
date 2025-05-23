package yarnwrap.block;
public class VineBlock { public net.minecraft.block.VineBlock wrapperContained; public VineBlock(net.minecraft.block.VineBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.WEST); }
// public static void WEST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VineBlock.WEST = value.wrapperContained; }

// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
public static java.util.Map FACING_PROPERTIES() { return net.minecraft.block.VineBlock.FACING_PROPERTIES; }
// public static void FACING_PROPERTIES(java.util.Map value, ) { net.minecraft.block.VineBlock.FACING_PROPERTIES = value; }

// public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.SOUTH); }
// public static void SOUTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VineBlock.SOUTH = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.EAST); }
// public static void EAST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VineBlock.EAST = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public void UP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UP = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.UP); }
// public static void UP(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VineBlock.UP = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.NORTH); }
// public static void NORTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VineBlock.NORTH = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.VineBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.VineBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.VineBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.VineBlock.shapeFunction = value; }

// public yarnwrap.block.BlockState getGrownState(yarnwrap.block.BlockState above,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.getGrownState(above.wrapperContained,state.wrapperContained,random.wrapperContained)); }
// public static yarnwrap.block.BlockState getGrownState(yarnwrap.block.BlockState above,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.block.VineBlock.getGrownState(above.wrapperContained,state.wrapperContained,random.wrapperContained)); }
// public boolean shouldConnectTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.shouldConnectTo(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean shouldConnectTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.VineBlock.shouldConnectTo(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public int getAdjacentBlockCount(yarnwrap.block.BlockState state) { return wrapperContained.getAdjacentBlockCount(state.wrapperContained); }
// public static int getAdjacentBlockCount(yarnwrap.block.BlockState state, ) { return net.minecraft.block.VineBlock.getAdjacentBlockCount(state.wrapperContained); }
// public boolean hasAdjacentBlocks(yarnwrap.block.BlockState state) { return wrapperContained.hasAdjacentBlocks(state.wrapperContained); }
// public static boolean hasAdjacentBlocks(yarnwrap.block.BlockState state, ) { return net.minecraft.block.VineBlock.hasAdjacentBlocks(state.wrapperContained); }
// public boolean canGrowAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canGrowAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.VineBlock.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public boolean method_10826(Object entry) { return wrapperContained.method_10826(entry); }
// public static boolean method_10826(Object entry, ) { return net.minecraft.block.VineBlock.method_10826(entry); }
// public yarnwrap.block.BlockState getPlacementShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getPlacementShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.VineBlock.getPlacementShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.state.property.BooleanProperty getFacingProperty(yarnwrap.util.math.Direction direction) { return new yarnwrap.state.property.BooleanProperty(wrapperContained.getFacingProperty(direction.wrapperContained)); }
// public static yarnwrap.state.property.BooleanProperty getFacingProperty(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VineBlock.getFacingProperty(direction.wrapperContained)); }
// public boolean shouldHaveSide(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return wrapperContained.shouldHaveSide(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }
// public static boolean shouldHaveSide(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side, ) { return net.minecraft.block.VineBlock.shouldHaveSide(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }
// public boolean hasHorizontalSide(yarnwrap.block.BlockState state) { return wrapperContained.hasHorizontalSide(state.wrapperContained); }
// public static boolean hasHorizontalSide(yarnwrap.block.BlockState state, ) { return net.minecraft.block.VineBlock.hasHorizontalSide(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66470(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66470(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66470(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.VineBlock.method_66470(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.VineBlock.createShapeFunction(); }

}