package yarnwrap.block;
public class StairsBlock { public net.minecraft.block.StairsBlock wrapperContained; public StairsBlock(net.minecraft.block.StairsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.StairsBlock.SHAPE); }
// public static void SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.StairsBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.StairsBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.StairsBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.StairsBlock.HALF); }
// public static void HALF(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.StairsBlock.HALF = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.StairsBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.StairsBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.block.BlockState baseBlockState() { return new yarnwrap.block.BlockState(wrapperContained.baseBlockState); }
// public void baseBlockState(yarnwrap.block.BlockState value) { wrapperContained.baseBlockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState baseBlockState() { return new yarnwrap.block.BlockState(net.minecraft.block.StairsBlock.baseBlockState); }
// public static void baseBlockState(yarnwrap.block.BlockState value, ) { net.minecraft.block.StairsBlock.baseBlockState = value.wrapperContained; }

// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public void baseBlock(yarnwrap.block.Block value) { wrapperContained.baseBlock = value.wrapperContained; }
// public static yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(net.minecraft.block.StairsBlock.baseBlock); }
// public static void baseBlock(yarnwrap.block.Block value, ) { net.minecraft.block.StairsBlock.baseBlock = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.StairsBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.StairsBlock.CODEC = value; }

// public java.util.Map OUTER_BOTTOM_SHAPES() { return wrapperContained.OUTER_BOTTOM_SHAPES; }
// public void OUTER_BOTTOM_SHAPES(java.util.Map value) { wrapperContained.OUTER_BOTTOM_SHAPES = value; }
// public static java.util.Map OUTER_BOTTOM_SHAPES() { return net.minecraft.block.StairsBlock.OUTER_BOTTOM_SHAPES; }
// public static void OUTER_BOTTOM_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.OUTER_BOTTOM_SHAPES = value; }

// public java.util.Map STRAIGHT_BOTTOM_SHAPES() { return wrapperContained.STRAIGHT_BOTTOM_SHAPES; }
// public void STRAIGHT_BOTTOM_SHAPES(java.util.Map value) { wrapperContained.STRAIGHT_BOTTOM_SHAPES = value; }
// public static java.util.Map STRAIGHT_BOTTOM_SHAPES() { return net.minecraft.block.StairsBlock.STRAIGHT_BOTTOM_SHAPES; }
// public static void STRAIGHT_BOTTOM_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.STRAIGHT_BOTTOM_SHAPES = value; }

// public java.util.Map INNER_BOTTOM_SHAPES() { return wrapperContained.INNER_BOTTOM_SHAPES; }
// public void INNER_BOTTOM_SHAPES(java.util.Map value) { wrapperContained.INNER_BOTTOM_SHAPES = value; }
// public static java.util.Map INNER_BOTTOM_SHAPES() { return net.minecraft.block.StairsBlock.INNER_BOTTOM_SHAPES; }
// public static void INNER_BOTTOM_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.INNER_BOTTOM_SHAPES = value; }

// public java.util.Map OUTER_TOP_SHAPES() { return wrapperContained.OUTER_TOP_SHAPES; }
// public void OUTER_TOP_SHAPES(java.util.Map value) { wrapperContained.OUTER_TOP_SHAPES = value; }
// public static java.util.Map OUTER_TOP_SHAPES() { return net.minecraft.block.StairsBlock.OUTER_TOP_SHAPES; }
// public static void OUTER_TOP_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.OUTER_TOP_SHAPES = value; }

// public java.util.Map STRAIGHT_TOP_SHAPES() { return wrapperContained.STRAIGHT_TOP_SHAPES; }
// public void STRAIGHT_TOP_SHAPES(java.util.Map value) { wrapperContained.STRAIGHT_TOP_SHAPES = value; }
// public static java.util.Map STRAIGHT_TOP_SHAPES() { return net.minecraft.block.StairsBlock.STRAIGHT_TOP_SHAPES; }
// public static void STRAIGHT_TOP_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.STRAIGHT_TOP_SHAPES = value; }

// public java.util.Map INNER_TOP_SHAPES() { return wrapperContained.INNER_TOP_SHAPES; }
// public void INNER_TOP_SHAPES(java.util.Map value) { wrapperContained.INNER_TOP_SHAPES = value; }
// public static java.util.Map INNER_TOP_SHAPES() { return net.minecraft.block.StairsBlock.INNER_TOP_SHAPES; }
// public static void INNER_TOP_SHAPES(java.util.Map value, ) { net.minecraft.block.StairsBlock.INNER_TOP_SHAPES = value; }

// public yarnwrap.util.shape.VoxelShape OUTER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTER_SHAPE); }
// public void OUTER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTER_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.StairsBlock.OUTER_SHAPE); }
// public static void OUTER_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.StairsBlock.OUTER_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape STRAIGHT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.STRAIGHT_SHAPE); }
// public void STRAIGHT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.STRAIGHT_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape STRAIGHT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.StairsBlock.STRAIGHT_SHAPE); }
// public static void STRAIGHT_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.StairsBlock.STRAIGHT_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape INNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.INNER_SHAPE); }
// public void INNER_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.INNER_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape INNER_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.StairsBlock.INNER_SHAPE); }
// public static void INNER_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.StairsBlock.INNER_SHAPE = value.wrapperContained; }

// public StairsBlock(yarnwrap.block.BlockState baseBlockState,Object settings) { this.wrapperContained = new net.minecraft.block.StairsBlock(baseBlockState.wrapperContained,settings); }
// public yarnwrap.block.enums.StairShape getStairShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.enums.StairShape(wrapperContained.getStairShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.enums.StairShape getStairShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.enums.StairShape(net.minecraft.block.StairsBlock.getStairShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public boolean isStairs(yarnwrap.block.BlockState state) { return wrapperContained.isStairs(state.wrapperContained); }
// public static boolean isStairs(yarnwrap.block.BlockState state, ) { return net.minecraft.block.StairsBlock.isStairs(state.wrapperContained); }
// public boolean isDifferentOrientation(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir) { return wrapperContained.isDifferentOrientation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,dir.wrapperContained); }
// public static boolean isDifferentOrientation(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir, ) { return net.minecraft.block.StairsBlock.isDifferentOrientation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,dir.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54046(Object instance) { return wrapperContained.method_54046(instance); }
// public static com.mojang.datafixers.kinds.App method_54046(Object instance, ) { return net.minecraft.block.StairsBlock.method_54046(instance); }
// public yarnwrap.block.BlockState method_54047(yarnwrap.block.StairsBlock block) { return new yarnwrap.block.BlockState(wrapperContained.method_54047(block.wrapperContained)); }
// public static yarnwrap.block.BlockState method_54047(yarnwrap.block.StairsBlock block, ) { return new yarnwrap.block.BlockState(net.minecraft.block.StairsBlock.method_54047(block.wrapperContained)); }

}