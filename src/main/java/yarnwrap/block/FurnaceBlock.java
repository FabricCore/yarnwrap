package yarnwrap.block;
public class FurnaceBlock { public net.minecraft.block.FurnaceBlock wrapperContained; public FurnaceBlock(net.minecraft.block.FurnaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}