package yarnwrap.block;
public class CobwebBlock { public net.minecraft.block.CobwebBlock wrapperContained; public CobwebBlock(net.minecraft.block.CobwebBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}