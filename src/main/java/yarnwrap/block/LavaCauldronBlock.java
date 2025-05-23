package yarnwrap.block;
public class LavaCauldronBlock { public net.minecraft.block.LavaCauldronBlock wrapperContained; public LavaCauldronBlock(net.minecraft.block.LavaCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LavaCauldronBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LavaCauldronBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape LAVA_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LAVA_SHAPE); }
// public void LAVA_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LAVA_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape LAVA_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LavaCauldronBlock.LAVA_SHAPE); }
// public static void LAVA_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.LavaCauldronBlock.LAVA_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape INSIDE_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.INSIDE_COLLISION_SHAPE); }
// public void INSIDE_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.INSIDE_COLLISION_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape INSIDE_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LavaCauldronBlock.INSIDE_COLLISION_SHAPE); }
// public static void INSIDE_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.LavaCauldronBlock.INSIDE_COLLISION_SHAPE = value.wrapperContained; }


}