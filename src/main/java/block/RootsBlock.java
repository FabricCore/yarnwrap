package yarnwrap.block;
public class RootsBlock { public net.minecraft.block.RootsBlock wrapperContained; public RootsBlock(net.minecraft.block.RootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}