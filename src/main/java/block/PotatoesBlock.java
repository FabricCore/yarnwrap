package yarnwrap.block;
public class PotatoesBlock { public net.minecraft.block.PotatoesBlock wrapperContained; public PotatoesBlock(net.minecraft.block.PotatoesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}