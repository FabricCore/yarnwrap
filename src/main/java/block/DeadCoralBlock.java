package yarnwrap.block;
public class DeadCoralBlock { public net.minecraft.block.DeadCoralBlock wrapperContained; public DeadCoralBlock(net.minecraft.block.DeadCoralBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }

}