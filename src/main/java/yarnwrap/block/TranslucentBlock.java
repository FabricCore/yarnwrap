package yarnwrap.block;
public class TranslucentBlock { public net.minecraft.block.TranslucentBlock wrapperContained; public TranslucentBlock(net.minecraft.block.TranslucentBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}