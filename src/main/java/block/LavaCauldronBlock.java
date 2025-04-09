package yarnwrap.block;
public class LavaCauldronBlock { public net.minecraft.block.LavaCauldronBlock wrapperContained; public LavaCauldronBlock(net.minecraft.block.LavaCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}