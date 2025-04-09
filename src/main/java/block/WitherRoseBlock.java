package yarnwrap.block;
public class WitherRoseBlock { public net.minecraft.block.WitherRoseBlock wrapperContained; public WitherRoseBlock(net.minecraft.block.WitherRoseBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}