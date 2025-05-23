package yarnwrap.block;
public class TorchflowerBlock { public net.minecraft.block.TorchflowerBlock wrapperContained; public TorchflowerBlock(net.minecraft.block.TorchflowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.TorchflowerBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.TorchflowerBlock.AGE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TorchflowerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TorchflowerBlock.CODEC = value; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.TorchflowerBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.TorchflowerBlock.SHAPES_BY_AGE = value; }

// public yarnwrap.util.shape.VoxelShape method_66469(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66469(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66469(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TorchflowerBlock.method_66469(age)); }

}