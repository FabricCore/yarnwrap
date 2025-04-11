package yarnwrap.block;
public class RotatedInfestedBlock { public net.minecraft.block.RotatedInfestedBlock wrapperContained; public RotatedInfestedBlock(net.minecraft.block.RotatedInfestedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}