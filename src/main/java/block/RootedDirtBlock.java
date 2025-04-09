package yarnwrap.block;
public class RootedDirtBlock { public net.minecraft.block.RootedDirtBlock wrapperContained; public RootedDirtBlock(net.minecraft.block.RootedDirtBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}