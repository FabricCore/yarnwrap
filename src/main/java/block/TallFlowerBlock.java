package yarnwrap.block;
public class TallFlowerBlock { public net.minecraft.block.TallFlowerBlock wrapperContained; public TallFlowerBlock(net.minecraft.block.TallFlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}