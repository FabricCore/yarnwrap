package yarnwrap.block;
public class DeadBushBlock { public net.minecraft.block.DeadBushBlock wrapperContained; public DeadBushBlock(net.minecraft.block.DeadBushBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}