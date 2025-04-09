package yarnwrap.block;
public class MossBlock { public net.minecraft.block.MossBlock wrapperContained; public MossBlock(net.minecraft.block.MossBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}