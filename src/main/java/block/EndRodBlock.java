package yarnwrap.block;
public class EndRodBlock { public net.minecraft.block.EndRodBlock wrapperContained; public EndRodBlock(net.minecraft.block.EndRodBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}