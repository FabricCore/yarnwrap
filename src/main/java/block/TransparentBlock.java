package yarnwrap.block;
public class TransparentBlock { public net.minecraft.block.TransparentBlock wrapperContained; public TransparentBlock(net.minecraft.block.TransparentBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}