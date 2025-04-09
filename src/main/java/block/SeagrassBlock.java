package yarnwrap.block;
public class SeagrassBlock { public net.minecraft.block.SeagrassBlock wrapperContained; public SeagrassBlock(net.minecraft.block.SeagrassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}