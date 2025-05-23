package yarnwrap.block;
public class WallBlock { public net.minecraft.block.WallBlock wrapperContained; public WallBlock(net.minecraft.block.WallBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public void UP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UP = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.WallBlock.UP); }
// public static void UP(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.WallBlock.UP = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.WallBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.WallBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallBlock.CODEC = value; }

// public java.util.function.Function collisionShapeFunction() { return wrapperContained.collisionShapeFunction; }
// public void collisionShapeFunction(java.util.function.Function value) { wrapperContained.collisionShapeFunction = value; }
// public static java.util.function.Function collisionShapeFunction() { return net.minecraft.block.WallBlock.collisionShapeFunction; }
// public static void collisionShapeFunction(java.util.function.Function value, ) { net.minecraft.block.WallBlock.collisionShapeFunction = value; }

// public yarnwrap.util.shape.VoxelShape POST_SHAPE_FOR_TALL_TEST() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.POST_SHAPE_FOR_TALL_TEST); }
// public void POST_SHAPE_FOR_TALL_TEST(yarnwrap.util.shape.VoxelShape value) { wrapperContained.POST_SHAPE_FOR_TALL_TEST = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape POST_SHAPE_FOR_TALL_TEST() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallBlock.POST_SHAPE_FOR_TALL_TEST); }
// public static void POST_SHAPE_FOR_TALL_TEST(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.WallBlock.POST_SHAPE_FOR_TALL_TEST = value.wrapperContained; }

// public java.util.Map WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION() { return wrapperContained.WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION; }
// public void WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION(java.util.Map value) { wrapperContained.WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION = value; }
// public static java.util.Map WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION() { return net.minecraft.block.WallBlock.WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION; }
// public static void WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.WallBlock.WALL_SHAPES_FOR_TALL_TEST_BY_DIRECTION = value; }

// public yarnwrap.state.property.EnumProperty EAST_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.EAST_WALL_SHAPE); }
// public void EAST_WALL_SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.EAST_WALL_SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty EAST_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallBlock.EAST_WALL_SHAPE); }
// public static void EAST_WALL_SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallBlock.EAST_WALL_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty NORTH_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.NORTH_WALL_SHAPE); }
// public void NORTH_WALL_SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.NORTH_WALL_SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty NORTH_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallBlock.NORTH_WALL_SHAPE); }
// public static void NORTH_WALL_SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallBlock.NORTH_WALL_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty SOUTH_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SOUTH_WALL_SHAPE); }
// public void SOUTH_WALL_SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SOUTH_WALL_SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SOUTH_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallBlock.SOUTH_WALL_SHAPE); }
// public static void SOUTH_WALL_SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallBlock.SOUTH_WALL_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty WEST_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WEST_WALL_SHAPE); }
// public void WEST_WALL_SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.WEST_WALL_SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WEST_WALL_SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallBlock.WEST_WALL_SHAPE); }
// public static void WEST_WALL_SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallBlock.WEST_WALL_SHAPE = value.wrapperContained; }

// public java.util.Map WALL_SHAPE_PROPERTIES_BY_DIRECTION() { return wrapperContained.WALL_SHAPE_PROPERTIES_BY_DIRECTION; }
// public void WALL_SHAPE_PROPERTIES_BY_DIRECTION(java.util.Map value) { wrapperContained.WALL_SHAPE_PROPERTIES_BY_DIRECTION = value; }
public static java.util.Map WALL_SHAPE_PROPERTIES_BY_DIRECTION() { return net.minecraft.block.WallBlock.WALL_SHAPE_PROPERTIES_BY_DIRECTION; }
// public static void WALL_SHAPE_PROPERTIES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.WallBlock.WALL_SHAPE_PROPERTIES_BY_DIRECTION = value; }

// public java.util.function.Function outlineShapeFunction() { return wrapperContained.outlineShapeFunction; }
// public void outlineShapeFunction(java.util.function.Function value) { wrapperContained.outlineShapeFunction = value; }
// public static java.util.function.Function outlineShapeFunction() { return net.minecraft.block.WallBlock.outlineShapeFunction; }
// public static void outlineShapeFunction(java.util.function.Function value, ) { net.minecraft.block.WallBlock.outlineShapeFunction = value; }

// public boolean shouldConnectTo(yarnwrap.block.BlockState state,boolean faceFullSquare,yarnwrap.util.math.Direction side) { return wrapperContained.shouldConnectTo(state.wrapperContained,faceFullSquare,side.wrapperContained); }
// public static boolean shouldConnectTo(yarnwrap.block.BlockState state,boolean faceFullSquare,yarnwrap.util.math.Direction side, ) { return net.minecraft.block.WallBlock.shouldConnectTo(state.wrapperContained,faceFullSquare,side.wrapperContained); }
// public java.util.function.Function createShapeFunction(float tallHeight,float lowHeight) { return wrapperContained.createShapeFunction(tallHeight,lowHeight); }
// public static java.util.function.Function createShapeFunction(float tallHeight,float lowHeight, ) { return net.minecraft.block.WallBlock.createShapeFunction(tallHeight,lowHeight); }
// public yarnwrap.block.BlockState getStateAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState) { return new yarnwrap.block.BlockState(wrapperContained.getStateAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained)); }
// public static yarnwrap.block.BlockState getStateAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState, ) { return new yarnwrap.block.BlockState(net.minecraft.block.WallBlock.getStateAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained)); }
// public yarnwrap.block.BlockState getStateWith(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState,boolean north,boolean east,boolean south,boolean west) { return new yarnwrap.block.BlockState(wrapperContained.getStateWith(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained,north,east,south,west)); }
// public static yarnwrap.block.BlockState getStateWith(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState aboveState,boolean north,boolean east,boolean south,boolean west, ) { return new yarnwrap.block.BlockState(net.minecraft.block.WallBlock.getStateWith(world.wrapperContained,state.wrapperContained,pos.wrapperContained,aboveState.wrapperContained,north,east,south,west)); }
// public yarnwrap.block.BlockState getStateWithNeighbor(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos neighborPos,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithNeighbor(world.wrapperContained,pos.wrapperContained,state.wrapperContained,neighborPos.wrapperContained,neighborState.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.block.BlockState getStateWithNeighbor(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos neighborPos,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.block.BlockState(net.minecraft.block.WallBlock.getStateWithNeighbor(world.wrapperContained,pos.wrapperContained,state.wrapperContained,neighborPos.wrapperContained,neighborState.wrapperContained,direction.wrapperContained)); }
// public boolean isConnected(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property) { return wrapperContained.isConnected(state.wrapperContained,property.wrapperContained); }
// public static boolean isConnected(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property, ) { return net.minecraft.block.WallBlock.isConnected(state.wrapperContained,property.wrapperContained); }
// public yarnwrap.block.BlockState getStateWith(yarnwrap.block.BlockState state,boolean north,boolean east,boolean south,boolean west,yarnwrap.util.shape.VoxelShape aboveShape) { return new yarnwrap.block.BlockState(wrapperContained.getStateWith(state.wrapperContained,north,east,south,west,aboveShape.wrapperContained)); }
// public static yarnwrap.block.BlockState getStateWith(yarnwrap.block.BlockState state,boolean north,boolean east,boolean south,boolean west,yarnwrap.util.shape.VoxelShape aboveShape, ) { return new yarnwrap.block.BlockState(net.minecraft.block.WallBlock.getStateWith(state.wrapperContained,north,east,south,west,aboveShape.wrapperContained)); }
// public boolean shouldUseTallShape(yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape) { return wrapperContained.shouldUseTallShape(aboveShape.wrapperContained,tallShape.wrapperContained); }
// public static boolean shouldUseTallShape(yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape, ) { return net.minecraft.block.WallBlock.shouldUseTallShape(aboveShape.wrapperContained,tallShape.wrapperContained); }
// public yarnwrap.block.enums.WallShape getWallShape(boolean connected,yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape) { return new yarnwrap.block.enums.WallShape(wrapperContained.getWallShape(connected,aboveShape.wrapperContained,tallShape.wrapperContained)); }
// public static yarnwrap.block.enums.WallShape getWallShape(boolean connected,yarnwrap.util.shape.VoxelShape aboveShape,yarnwrap.util.shape.VoxelShape tallShape, ) { return new yarnwrap.block.enums.WallShape(net.minecraft.block.WallBlock.getWallShape(connected,aboveShape.wrapperContained,tallShape.wrapperContained)); }
// public boolean shouldHavePost(yarnwrap.block.BlockState state,yarnwrap.block.BlockState aboveState,yarnwrap.util.shape.VoxelShape aboveShape) { return wrapperContained.shouldHavePost(state.wrapperContained,aboveState.wrapperContained,aboveShape.wrapperContained); }
// public static boolean shouldHavePost(yarnwrap.block.BlockState state,yarnwrap.block.BlockState aboveState,yarnwrap.util.shape.VoxelShape aboveShape, ) { return net.minecraft.block.WallBlock.shouldHavePost(state.wrapperContained,aboveState.wrapperContained,aboveShape.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66472(yarnwrap.util.shape.VoxelShape state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66472(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66472(yarnwrap.util.shape.VoxelShape state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallBlock.method_66472(state.wrapperContained)); }

}