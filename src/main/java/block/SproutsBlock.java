package yarnwrap.block;
public class SproutsBlock { public net.minecraft.block.SproutsBlock wrapperContained; public SproutsBlock(net.minecraft.block.SproutsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}