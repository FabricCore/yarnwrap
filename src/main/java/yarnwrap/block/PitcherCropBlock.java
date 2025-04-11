package yarnwrap.block;
public class PitcherCropBlock { public net.minecraft.block.PitcherCropBlock wrapperContained; public PitcherCropBlock(net.minecraft.block.PitcherCropBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape GROWN_UPPER_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.GROWN_UPPER_OUTLINE_SHAPE); }
// public void GROWN_UPPER_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.GROWN_UPPER_OUTLINE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape GROWN_LOWER_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.GROWN_LOWER_OUTLINE_SHAPE); }
// public void GROWN_LOWER_OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.GROWN_LOWER_OUTLINE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape AGE_0_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.AGE_0_SHAPE); }
// public void AGE_0_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.AGE_0_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LOWER_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LOWER_COLLISION_SHAPE); }
// public void LOWER_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LOWER_COLLISION_SHAPE = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] UPPER_OUTLINE_SHAPES() { return wrapperContained.UPPER_OUTLINE_SHAPES; }
// public void UPPER_OUTLINE_SHAPES(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.UPPER_OUTLINE_SHAPES = value; }
// public net.minecraft.util.shape.VoxelShape[] LOWER_OUTLINE_SHAPES() { return wrapperContained.LOWER_OUTLINE_SHAPES; }
// public void LOWER_OUTLINE_SHAPES(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.LOWER_OUTLINE_SHAPES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void tryGrow(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int amount) { wrapperContained.tryGrow(world.wrapperContained,state.wrapperContained,pos.wrapperContained,amount); }
// public boolean canGrowAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrowAt(world.wrapperContained,pos.wrapperContained); }
// public boolean isFullyGrown(yarnwrap.block.BlockState state) { return wrapperContained.isFullyGrown(state.wrapperContained); }
// public boolean isLowerHalf(yarnwrap.block.BlockState state) { return wrapperContained.isLowerHalf(state.wrapperContained); }
// public boolean canGrow(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int age) { return wrapperContained.canGrow(world.wrapperContained,pos.wrapperContained,state.wrapperContained,age); }
// public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained); }
// public Object getLowerHalfContext(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getLowerHalfContext(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isDoubleTallAtAge(int age) { return wrapperContained.isDoubleTallAtAge(age); }

}