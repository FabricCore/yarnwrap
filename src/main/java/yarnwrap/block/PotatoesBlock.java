package yarnwrap.block;
public class PotatoesBlock { public net.minecraft.block.PotatoesBlock wrapperContained; public PotatoesBlock(net.minecraft.block.PotatoesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.PotatoesBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.PotatoesBlock.SHAPES_BY_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PotatoesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PotatoesBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape method_66460(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66460(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66460(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PotatoesBlock.method_66460(age)); }

}