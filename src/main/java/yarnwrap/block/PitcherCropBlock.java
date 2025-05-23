package yarnwrap.block;
public class PitcherCropBlock { public net.minecraft.block.PitcherCropBlock wrapperContained; public PitcherCropBlock(net.minecraft.block.PitcherCropBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.PitcherCropBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.PitcherCropBlock.AGE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape AGE_0_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.AGE_0_SHAPE); }
// public void AGE_0_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.AGE_0_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape AGE_0_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PitcherCropBlock.AGE_0_SHAPE); }
// public static void AGE_0_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.PitcherCropBlock.AGE_0_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LOWER_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LOWER_COLLISION_SHAPE); }
// public void LOWER_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LOWER_COLLISION_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape LOWER_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PitcherCropBlock.LOWER_COLLISION_SHAPE); }
// public static void LOWER_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.PitcherCropBlock.LOWER_COLLISION_SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PitcherCropBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PitcherCropBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.PitcherCropBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.PitcherCropBlock.shapeFunction = value; }

// public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PitcherCropBlock.HALF); }
// public static void HALF(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PitcherCropBlock.HALF = value.wrapperContained; }

// public void tryGrow(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int amount) { wrapperContained.tryGrow(world.wrapperContained,state.wrapperContained,pos.wrapperContained,amount); }
// public static void tryGrow(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int amount, ) { net.minecraft.block.PitcherCropBlock.tryGrow(world.wrapperContained,state.wrapperContained,pos.wrapperContained,amount); }
// public boolean canGrowAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canGrowAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.PitcherCropBlock.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public boolean isFullyGrown(yarnwrap.block.BlockState state) { return wrapperContained.isFullyGrown(state.wrapperContained); }
// public static boolean isFullyGrown(yarnwrap.block.BlockState state, ) { return net.minecraft.block.PitcherCropBlock.isFullyGrown(state.wrapperContained); }
// public boolean isLowerHalf(yarnwrap.block.BlockState state) { return wrapperContained.isLowerHalf(state.wrapperContained); }
// public static boolean isLowerHalf(yarnwrap.block.BlockState state, ) { return net.minecraft.block.PitcherCropBlock.isLowerHalf(state.wrapperContained); }
// public boolean canGrow(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int age) { return wrapperContained.canGrow(world.wrapperContained,pos.wrapperContained,state.wrapperContained,age); }
// public static boolean canGrow(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int age, ) { return net.minecraft.block.PitcherCropBlock.canGrow(world.wrapperContained,pos.wrapperContained,state.wrapperContained,age); }
// public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.PitcherCropBlock.canPlaceAt(world.wrapperContained,pos.wrapperContained); }
// public Object getLowerHalfContext(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getLowerHalfContext(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static Object getLowerHalfContext(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.PitcherCropBlock.getLowerHalfContext(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isDoubleTallAtAge(int age) { return wrapperContained.isDoubleTallAtAge(age); }
// public static boolean isDoubleTallAtAge(int age, ) { return net.minecraft.block.PitcherCropBlock.isDoubleTallAtAge(age); }
// public yarnwrap.util.shape.VoxelShape method_66458(int state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66458(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66458(int state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PitcherCropBlock.method_66458(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.PitcherCropBlock.createShapeFunction(); }

}