package yarnwrap.block;
public class SnowBlock { public net.minecraft.block.SnowBlock wrapperContained; public SnowBlock(net.minecraft.block.SnowBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_LAYERS() { return wrapperContained.SHAPES_BY_LAYERS; }
// public void SHAPES_BY_LAYERS(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_LAYERS = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_LAYERS() { return net.minecraft.block.SnowBlock.SHAPES_BY_LAYERS; }
// public static void SHAPES_BY_LAYERS(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.SnowBlock.SHAPES_BY_LAYERS = value; }

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

// public yarnwrap.util.shape.VoxelShape method_66467(int layers) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66467(layers)); }
// public static yarnwrap.util.shape.VoxelShape method_66467(int layers, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SnowBlock.method_66467(layers)); }

}