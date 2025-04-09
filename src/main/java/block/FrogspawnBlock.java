package yarnwrap.block;
public class FrogspawnBlock { public net.minecraft.block.FrogspawnBlock wrapperContained; public FrogspawnBlock(net.minecraft.block.FrogspawnBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public int MIN_TADPOLES() { return wrapperContained.MIN_TADPOLES; }
// public int MAX_TADPOLES() { return wrapperContained.MAX_TADPOLES; }
// public int MIN_HATCH_TIME() { return wrapperContained.MIN_HATCH_TIME; }
// public int MAX_HATCH_TIME() { return wrapperContained.MAX_HATCH_TIME; }
// public int minHatchTime() { return wrapperContained.minHatchTime; }
// public int maxHatchTime() { return wrapperContained.maxHatchTime; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void setHatchTimeRange(int min,int max) { wrapperContained.setHatchTimeRange(min,max); }
// public void hatch(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.hatch(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean canLayAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canLayAt(world.wrapperContained,pos.wrapperContained); }
// public void breakWithoutDrop(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.breakWithoutDrop(world.wrapperContained,pos.wrapperContained); }
// public int getHatchTime(yarnwrap.util.math.random.Random random) { return wrapperContained.getHatchTime(random.wrapperContained); }
// public void spawnTadpoles(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.spawnTadpoles(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public void resetHatchTimeRange() { wrapperContained.resetHatchTimeRange(); }
// public double getSpawnOffset(yarnwrap.util.math.random.Random random) { return wrapperContained.getSpawnOffset(random.wrapperContained); }

}