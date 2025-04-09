package yarnwrap.block;
public class SnowBlock { public net.minecraft.block.SnowBlock wrapperContained; public SnowBlock(net.minecraft.block.SnowBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] LAYERS_TO_SHAPE() { return wrapperContained.LAYERS_TO_SHAPE; }
public yarnwrap.state.property.IntProperty LAYERS() { return new yarnwrap.state.property.IntProperty(wrapperContained.LAYERS); }
public int MAX_LAYERS() { return wrapperContained.MAX_LAYERS; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}