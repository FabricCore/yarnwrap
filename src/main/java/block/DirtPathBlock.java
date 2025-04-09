package yarnwrap.block;
public class DirtPathBlock { public net.minecraft.block.DirtPathBlock wrapperContained; public DirtPathBlock(net.minecraft.block.DirtPathBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}