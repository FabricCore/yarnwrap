package yarnwrap.block;
public class GrassBlock { public net.minecraft.block.GrassBlock wrapperContained; public GrassBlock(net.minecraft.block.GrassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}