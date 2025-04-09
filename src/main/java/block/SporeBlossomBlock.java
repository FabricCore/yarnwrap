package yarnwrap.block;
public class SporeBlossomBlock { public net.minecraft.block.SporeBlossomBlock wrapperContained; public SporeBlossomBlock(net.minecraft.block.SporeBlossomBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}