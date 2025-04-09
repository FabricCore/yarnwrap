package yarnwrap.block;
public class TintedGlassBlock { public net.minecraft.block.TintedGlassBlock wrapperContained; public TintedGlassBlock(net.minecraft.block.TintedGlassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}