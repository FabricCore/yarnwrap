package yarnwrap.block;
public class CarrotsBlock { public net.minecraft.block.CarrotsBlock wrapperContained; public CarrotsBlock(net.minecraft.block.CarrotsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}