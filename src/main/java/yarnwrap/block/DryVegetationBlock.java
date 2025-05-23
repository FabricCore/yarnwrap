package yarnwrap.block;
public class DryVegetationBlock { public net.minecraft.block.DryVegetationBlock wrapperContained; public DryVegetationBlock(net.minecraft.block.DryVegetationBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.DryVegetationBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.DryVegetationBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DryVegetationBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DryVegetationBlock.CODEC = value; }


}