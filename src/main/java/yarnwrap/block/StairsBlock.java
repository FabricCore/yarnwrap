package yarnwrap.block;
public class StairsBlock { public net.minecraft.block.StairsBlock wrapperContained; public StairsBlock(net.minecraft.block.StairsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape BOTTOM_NORTH_WEST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_NORTH_WEST_CORNER_SHAPE); }
// public void BOTTOM_NORTH_WEST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_NORTH_WEST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public void TOP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_SOUTH_WEST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SOUTH_WEST_CORNER_SHAPE); }
// public void TOP_SOUTH_WEST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SOUTH_WEST_CORNER_SHAPE = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] BOTTOM_SHAPES() { return wrapperContained.BOTTOM_SHAPES; }
// public void BOTTOM_SHAPES(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.BOTTOM_SHAPES = value; }
public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SHAPE = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] TOP_SHAPES() { return wrapperContained.TOP_SHAPES; }
// public void TOP_SHAPES(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.TOP_SHAPES = value; }
// public yarnwrap.util.shape.VoxelShape TOP_SOUTH_EAST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SOUTH_EAST_CORNER_SHAPE); }
// public void TOP_SOUTH_EAST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SOUTH_EAST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_NORTH_WEST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_NORTH_WEST_CORNER_SHAPE); }
// public void TOP_NORTH_WEST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_NORTH_WEST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape BOTTOM_SOUTH_EAST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SOUTH_EAST_CORNER_SHAPE); }
// public void BOTTOM_SOUTH_EAST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_SOUTH_EAST_CORNER_SHAPE = value.wrapperContained; }
// public int[] SHAPE_INDICES() { return wrapperContained.SHAPE_INDICES; }
// public void SHAPE_INDICES(int[] value) { wrapperContained.SHAPE_INDICES = value; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.block.BlockState baseBlockState() { return new yarnwrap.block.BlockState(wrapperContained.baseBlockState); }
// public void baseBlockState(yarnwrap.block.BlockState value) { wrapperContained.baseBlockState = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape BOTTOM_NORTH_EAST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_NORTH_EAST_CORNER_SHAPE); }
// public void BOTTOM_NORTH_EAST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_NORTH_EAST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SHAPE); }
// public void BOTTOM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_NORTH_EAST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_NORTH_EAST_CORNER_SHAPE); }
// public void TOP_NORTH_EAST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_NORTH_EAST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape BOTTOM_SOUTH_WEST_CORNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SOUTH_WEST_CORNER_SHAPE); }
// public void BOTTOM_SOUTH_WEST_CORNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_SOUTH_WEST_CORNER_SHAPE = value.wrapperContained; }
// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public void baseBlock(yarnwrap.block.Block value) { wrapperContained.baseBlock = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.shape.VoxelShape composeShape(int i,yarnwrap.util.shape.VoxelShape base,yarnwrap.util.shape.VoxelShape northWest,yarnwrap.util.shape.VoxelShape northEast,yarnwrap.util.shape.VoxelShape southWest,yarnwrap.util.shape.VoxelShape southEast) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.composeShape(i,base.wrapperContained,northWest.wrapperContained,northEast.wrapperContained,southWest.wrapperContained,southEast.wrapperContained)); }
// public net.minecraft.util.shape.VoxelShape[] composeShapes(yarnwrap.util.shape.VoxelShape base,yarnwrap.util.shape.VoxelShape northWest,yarnwrap.util.shape.VoxelShape northEast,yarnwrap.util.shape.VoxelShape southWest,yarnwrap.util.shape.VoxelShape southEast) { return wrapperContained.composeShapes(base.wrapperContained,northWest.wrapperContained,northEast.wrapperContained,southWest.wrapperContained,southEast.wrapperContained); }
// public int getShapeIndexIndex(yarnwrap.block.BlockState state) { return wrapperContained.getShapeIndexIndex(state.wrapperContained); }
// public yarnwrap.block.enums.StairShape getStairShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.enums.StairShape(wrapperContained.getStairShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public boolean isStairs(yarnwrap.block.BlockState state) { return wrapperContained.isStairs(state.wrapperContained); }
// public boolean isDifferentOrientation(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir) { return wrapperContained.isDifferentOrientation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,dir.wrapperContained); }

}