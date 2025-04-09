package yarnwrap.block;
public class DeadCoralFanBlock { public net.minecraft.block.DeadCoralFanBlock wrapperContained; public DeadCoralFanBlock(net.minecraft.block.DeadCoralFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }

}