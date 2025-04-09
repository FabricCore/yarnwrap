package yarnwrap.block;
public class StainedGlassBlock { public net.minecraft.block.StainedGlassBlock wrapperContained; public StainedGlassBlock(net.minecraft.block.StainedGlassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}