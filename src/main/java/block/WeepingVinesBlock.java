package yarnwrap.block;
public class WeepingVinesBlock { public net.minecraft.block.WeepingVinesBlock wrapperContained; public WeepingVinesBlock(net.minecraft.block.WeepingVinesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}