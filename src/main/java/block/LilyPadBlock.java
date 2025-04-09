package yarnwrap.block;
public class LilyPadBlock { public net.minecraft.block.LilyPadBlock wrapperContained; public LilyPadBlock(net.minecraft.block.LilyPadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}