package yarnwrap.block;
public class AzaleaBlock { public net.minecraft.block.AzaleaBlock wrapperContained; public AzaleaBlock(net.minecraft.block.AzaleaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}