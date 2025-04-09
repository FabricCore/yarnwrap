package yarnwrap.block;
public class TranslucentBlock { public net.minecraft.block.TranslucentBlock wrapperContained; public TranslucentBlock(net.minecraft.block.TranslucentBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}