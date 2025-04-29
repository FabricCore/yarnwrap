package yarnwrap.block;
public class ScaffoldingBlock { public net.minecraft.block.ScaffoldingBlock wrapperContained; public ScaffoldingBlock(net.minecraft.block.ScaffoldingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NORMAL_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORMAL_OUTLINE_SHAPE); }
// public void NORMAL_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORMAL_OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape NORMAL_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ScaffoldingBlock.NORMAL_OUTLINE_SHAPE); }
// public static void NORMAL_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ScaffoldingBlock.NORMAL_OUTLINE_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(wrapperContained.DISTANCE); }
// public void DISTANCE(yarnwrap.state.property.IntProperty value) { wrapperContained.DISTANCE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.ScaffoldingBlock.DISTANCE); }
// public static void DISTANCE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.ScaffoldingBlock.DISTANCE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ScaffoldingBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ScaffoldingBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape BOTTOM_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_OUTLINE_SHAPE); }
// public void BOTTOM_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape BOTTOM_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ScaffoldingBlock.BOTTOM_OUTLINE_SHAPE); }
// public static void BOTTOM_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ScaffoldingBlock.BOTTOM_OUTLINE_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty BOTTOM() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BOTTOM); }
// public void BOTTOM(yarnwrap.state.property.BooleanProperty value) { wrapperContained.BOTTOM = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty BOTTOM() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ScaffoldingBlock.BOTTOM); }
// public static void BOTTOM(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ScaffoldingBlock.BOTTOM = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.COLLISION_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ScaffoldingBlock.COLLISION_SHAPE); }
// public static void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ScaffoldingBlock.COLLISION_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ScaffoldingBlock.OUTLINE_SHAPE); }
// public static void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ScaffoldingBlock.OUTLINE_SHAPE = value.wrapperContained; }

// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public static int MAX_DISTANCE() { return net.minecraft.block.ScaffoldingBlock.MAX_DISTANCE; }
// public static void MAX_DISTANCE(int value, ) { net.minecraft.block.ScaffoldingBlock.MAX_DISTANCE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ScaffoldingBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ScaffoldingBlock.CODEC = value; }

// public int calculateDistance(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateDistance(world.wrapperContained,pos.wrapperContained); }
// public static int calculateDistance(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.ScaffoldingBlock.calculateDistance(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldBeBottom(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int distance) { return wrapperContained.shouldBeBottom(world.wrapperContained,pos.wrapperContained,distance); }
// public static boolean shouldBeBottom(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int distance, ) { return net.minecraft.block.ScaffoldingBlock.shouldBeBottom(world.wrapperContained,pos.wrapperContained,distance); }

}