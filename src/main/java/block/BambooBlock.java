package yarnwrap.block;
public class BambooBlock { public net.minecraft.block.BambooBlock wrapperContained; public BambooBlock(net.minecraft.block.BambooBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape SMALL_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_LEAVES_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NO_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NO_LEAVES_SHAPE); }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.util.shape.VoxelShape LARGE_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_LEAVES_SHAPE); }
public yarnwrap.state.property.IntProperty STAGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.STAGE); }
public yarnwrap.state.property.EnumProperty LEAVES() { return new yarnwrap.state.property.EnumProperty(wrapperContained.LEAVES); }
// public void updateLeaves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int height) { wrapperContained.updateLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained,height); }
// public int countBambooBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooBelow(world.wrapperContained,pos.wrapperContained); }
// public int countBambooAbove(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooAbove(world.wrapperContained,pos.wrapperContained); }

}