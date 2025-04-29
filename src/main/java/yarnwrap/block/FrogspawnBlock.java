package yarnwrap.block;
public class FrogspawnBlock { public net.minecraft.block.FrogspawnBlock wrapperContained; public FrogspawnBlock(net.minecraft.block.FrogspawnBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FrogspawnBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.FrogspawnBlock.SHAPE = value.wrapperContained; }

// public int MIN_TADPOLES() { return wrapperContained.MIN_TADPOLES; }
// public void MIN_TADPOLES(int value) { wrapperContained.MIN_TADPOLES = value; }
// public static int MIN_TADPOLES() { return net.minecraft.block.FrogspawnBlock.MIN_TADPOLES; }
// public static void MIN_TADPOLES(int value, ) { net.minecraft.block.FrogspawnBlock.MIN_TADPOLES = value; }

// public int MAX_TADPOLES() { return wrapperContained.MAX_TADPOLES; }
// public void MAX_TADPOLES(int value) { wrapperContained.MAX_TADPOLES = value; }
// public static int MAX_TADPOLES() { return net.minecraft.block.FrogspawnBlock.MAX_TADPOLES; }
// public static void MAX_TADPOLES(int value, ) { net.minecraft.block.FrogspawnBlock.MAX_TADPOLES = value; }

// public int MIN_HATCH_TIME() { return wrapperContained.MIN_HATCH_TIME; }
// public void MIN_HATCH_TIME(int value) { wrapperContained.MIN_HATCH_TIME = value; }
// public static int MIN_HATCH_TIME() { return net.minecraft.block.FrogspawnBlock.MIN_HATCH_TIME; }
// public static void MIN_HATCH_TIME(int value, ) { net.minecraft.block.FrogspawnBlock.MIN_HATCH_TIME = value; }

// public int MAX_HATCH_TIME() { return wrapperContained.MAX_HATCH_TIME; }
// public void MAX_HATCH_TIME(int value) { wrapperContained.MAX_HATCH_TIME = value; }
// public static int MAX_HATCH_TIME() { return net.minecraft.block.FrogspawnBlock.MAX_HATCH_TIME; }
// public static void MAX_HATCH_TIME(int value, ) { net.minecraft.block.FrogspawnBlock.MAX_HATCH_TIME = value; }

// public int minHatchTime() { return wrapperContained.minHatchTime; }
// public void minHatchTime(int value) { wrapperContained.minHatchTime = value; }
// public static int minHatchTime() { return net.minecraft.block.FrogspawnBlock.minHatchTime; }
// public static void minHatchTime(int value, ) { net.minecraft.block.FrogspawnBlock.minHatchTime = value; }

// public int maxHatchTime() { return wrapperContained.maxHatchTime; }
// public void maxHatchTime(int value) { wrapperContained.maxHatchTime = value; }
// public static int maxHatchTime() { return net.minecraft.block.FrogspawnBlock.maxHatchTime; }
// public static void maxHatchTime(int value, ) { net.minecraft.block.FrogspawnBlock.maxHatchTime = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FrogspawnBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FrogspawnBlock.CODEC = value; }

// public void setHatchTimeRange(int min,int max) { wrapperContained.setHatchTimeRange(min,max); }
// public static void setHatchTimeRange(int min,int max, ) { net.minecraft.block.FrogspawnBlock.setHatchTimeRange(min,max); }
// public void hatch(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.hatch(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void hatch(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.FrogspawnBlock.hatch(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean canLayAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canLayAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canLayAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.FrogspawnBlock.canLayAt(world.wrapperContained,pos.wrapperContained); }
// public void breakWithoutDrop(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.breakWithoutDrop(world.wrapperContained,pos.wrapperContained); }
// public static void breakWithoutDrop(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.FrogspawnBlock.breakWithoutDrop(world.wrapperContained,pos.wrapperContained); }
// public int getHatchTime(yarnwrap.util.math.random.Random random) { return wrapperContained.getHatchTime(random.wrapperContained); }
// public static int getHatchTime(yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.FrogspawnBlock.getHatchTime(random.wrapperContained); }
// public void spawnTadpoles(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.spawnTadpoles(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void spawnTadpoles(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.FrogspawnBlock.spawnTadpoles(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void resetHatchTimeRange() { wrapperContained.resetHatchTimeRange(); }
public static void resetHatchTimeRange() { net.minecraft.block.FrogspawnBlock.resetHatchTimeRange(); }
// public double getSpawnOffset(yarnwrap.util.math.random.Random random) { return wrapperContained.getSpawnOffset(random.wrapperContained); }
// public static double getSpawnOffset(yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.FrogspawnBlock.getSpawnOffset(random.wrapperContained); }

}