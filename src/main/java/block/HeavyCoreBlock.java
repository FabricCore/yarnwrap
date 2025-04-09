package yarnwrap.block;
public class HeavyCoreBlock { public net.minecraft.block.HeavyCoreBlock wrapperContained; public HeavyCoreBlock(net.minecraft.block.HeavyCoreBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }

}