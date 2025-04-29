package yarnwrap.block;
public class SnowBlock { public net.minecraft.block.SnowBlock wrapperContained; public SnowBlock(net.minecraft.block.SnowBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] LAYERS_TO_SHAPE() { return wrapperContained.LAYERS_TO_SHAPE; }
// public void LAYERS_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.LAYERS_TO_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] LAYERS_TO_SHAPE() { return net.minecraft.block.SnowBlock.LAYERS_TO_SHAPE; }
// public static void LAYERS_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.SnowBlock.LAYERS_TO_SHAPE = value; }

// public yarnwrap.state.property.IntProperty LAYERS() { return new yarnwrap.state.property.IntProperty(wrapperContained.LAYERS); }
// public void LAYERS(yarnwrap.state.property.IntProperty value) { wrapperContained.LAYERS = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty LAYERS() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.SnowBlock.LAYERS); }
// public static void LAYERS(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.SnowBlock.LAYERS = value.wrapperContained; }

// public int MAX_LAYERS() { return wrapperContained.MAX_LAYERS; }
// public void MAX_LAYERS(int value) { wrapperContained.MAX_LAYERS = value; }
public static int MAX_LAYERS() { return net.minecraft.block.SnowBlock.MAX_LAYERS; }
// public static void MAX_LAYERS(int value, ) { net.minecraft.block.SnowBlock.MAX_LAYERS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SnowBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SnowBlock.CODEC = value; }


}