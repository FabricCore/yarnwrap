package yarnwrap.block;
public class CarpetBlock { public net.minecraft.block.CarpetBlock wrapperContained; public CarpetBlock(net.minecraft.block.CarpetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}