package yarnwrap.block;
public class CarrotsBlock { public net.minecraft.block.CarrotsBlock wrapperContained; public CarrotsBlock(net.minecraft.block.CarrotsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return net.minecraft.block.CarrotsBlock.AGE_TO_SHAPE; }
// public static void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CarrotsBlock.AGE_TO_SHAPE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CarrotsBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CarrotsBlock.CODEC = value; }


}