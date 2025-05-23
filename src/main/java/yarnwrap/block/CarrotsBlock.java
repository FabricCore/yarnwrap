package yarnwrap.block;
public class CarrotsBlock { public net.minecraft.block.CarrotsBlock wrapperContained; public CarrotsBlock(net.minecraft.block.CarrotsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.CarrotsBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CarrotsBlock.SHAPES_BY_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CarrotsBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CarrotsBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape method_66422(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66422(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66422(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CarrotsBlock.method_66422(age)); }

}