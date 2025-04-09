package yarnwrap.block;
public class TwistingVinesBlock { public net.minecraft.block.TwistingVinesBlock wrapperContained; public TwistingVinesBlock(net.minecraft.block.TwistingVinesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}