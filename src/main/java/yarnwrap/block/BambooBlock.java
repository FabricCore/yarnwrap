package yarnwrap.block;
public class BambooBlock { public net.minecraft.block.BambooBlock wrapperContained; public BambooBlock(net.minecraft.block.BambooBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BambooBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BambooBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape SMALL_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_LEAVES_SHAPE); }
// public void SMALL_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMALL_LEAVES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SMALL_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BambooBlock.SMALL_LEAVES_SHAPE); }
// public static void SMALL_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BambooBlock.SMALL_LEAVES_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NO_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NO_LEAVES_SHAPE); }
// public void NO_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NO_LEAVES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape NO_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BambooBlock.NO_LEAVES_SHAPE); }
// public static void NO_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BambooBlock.NO_LEAVES_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.BambooBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.BambooBlock.AGE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LARGE_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_LEAVES_SHAPE); }
// public void LARGE_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LARGE_LEAVES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape LARGE_LEAVES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BambooBlock.LARGE_LEAVES_SHAPE); }
// public static void LARGE_LEAVES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BambooBlock.LARGE_LEAVES_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty STAGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.STAGE); }
// public void STAGE(yarnwrap.state.property.IntProperty value) { wrapperContained.STAGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty STAGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.BambooBlock.STAGE); }
// public static void STAGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.BambooBlock.STAGE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty LEAVES() { return new yarnwrap.state.property.EnumProperty(wrapperContained.LEAVES); }
// public void LEAVES(yarnwrap.state.property.EnumProperty value) { wrapperContained.LEAVES = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty LEAVES() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BambooBlock.LEAVES); }
// public static void LEAVES(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BambooBlock.LEAVES = value.wrapperContained; }

// public void updateLeaves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int height) { wrapperContained.updateLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained,height); }
// public static void updateLeaves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int height, ) { net.minecraft.block.BambooBlock.updateLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained,height); }
// public int countBambooBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooBelow(world.wrapperContained,pos.wrapperContained); }
// public static int countBambooBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.BambooBlock.countBambooBelow(world.wrapperContained,pos.wrapperContained); }
// public int countBambooAbove(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.countBambooAbove(world.wrapperContained,pos.wrapperContained); }
// public static int countBambooAbove(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.BambooBlock.countBambooAbove(world.wrapperContained,pos.wrapperContained); }

}