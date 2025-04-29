package yarnwrap.block;
public class BambooShootBlock { public net.minecraft.block.BambooShootBlock wrapperContained; public BambooShootBlock(net.minecraft.block.BambooShootBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BambooShootBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BambooShootBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BambooShootBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BambooShootBlock.SHAPE = value.wrapperContained; }

// public void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.grow(world.wrapperContained,pos.wrapperContained); }
// public static void grow(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.BambooShootBlock.grow(world.wrapperContained,pos.wrapperContained); }

}