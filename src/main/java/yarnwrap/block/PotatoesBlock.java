package yarnwrap.block;
public class PotatoesBlock { public net.minecraft.block.PotatoesBlock wrapperContained; public PotatoesBlock(net.minecraft.block.PotatoesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}