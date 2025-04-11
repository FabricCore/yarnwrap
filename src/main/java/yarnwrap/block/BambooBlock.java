package yarnwrap.block;
public class BambooBlock { public net.minecraft.block.BambooBlock wrapperContained; public BambooBlock(net.minecraft.block.BambooBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.shape.VoxelShape SMALL_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_LEAVES_SHAPE); }
// public void SMALL_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMALL_LEAVES_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NO_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NO_LEAVES_SHAPE); }
// public void NO_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NO_LEAVES_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LARGE_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_LEAVES_SHAPE); }
// public void LARGE_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LARGE_LEAVES_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.IntProperty STAGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.STAGE); }
// public void STAGE(yarnwrap.state.property.IntProperty value) { wrapperContained.STAGE = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty LEAVES() { return new yarnwrap.state.property.EnumProperty(wrapperContained.LEAVES); }
// public void LEAVES(yarnwrap.state.property.EnumProperty value) { wrapperContained.LEAVES = value.wrapperContained; }
// public void updateLeaves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int height) { wrapperContained.updateLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained,height); }
// public int countBambooBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooBelow(world.wrapperContained,pos.wrapperContained); }
// public int countBambooAbove(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooAbove(world.wrapperContained,pos.wrapperContained); }

}