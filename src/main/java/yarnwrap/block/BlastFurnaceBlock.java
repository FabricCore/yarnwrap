package yarnwrap.block;
public class BlastFurnaceBlock { public net.minecraft.block.BlastFurnaceBlock wrapperContained; public BlastFurnaceBlock(net.minecraft.block.BlastFurnaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}