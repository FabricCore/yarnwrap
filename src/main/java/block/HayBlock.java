package yarnwrap.block;
public class HayBlock { public net.minecraft.block.HayBlock wrapperContained; public HayBlock(net.minecraft.block.HayBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}