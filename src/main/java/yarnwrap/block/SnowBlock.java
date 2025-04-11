package yarnwrap.block;
public class SnowBlock { public net.minecraft.block.SnowBlock wrapperContained; public SnowBlock(net.minecraft.block.SnowBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] LAYERS_TO_SHAPE() { return wrapperContained.LAYERS_TO_SHAPE; }
// public void LAYERS_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.LAYERS_TO_SHAPE = value; }
public yarnwrap.state.property.IntProperty LAYERS() { return new yarnwrap.state.property.IntProperty(wrapperContained.LAYERS); }
// public void LAYERS(yarnwrap.state.property.IntProperty value) { wrapperContained.LAYERS = value.wrapperContained; }
public int MAX_LAYERS() { return wrapperContained.MAX_LAYERS; }
// public void MAX_LAYERS(int value) { wrapperContained.MAX_LAYERS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}