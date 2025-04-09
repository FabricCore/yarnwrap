package yarnwrap.block;
public class StainedGlassPaneBlock { public net.minecraft.block.StainedGlassPaneBlock wrapperContained; public StainedGlassPaneBlock(net.minecraft.block.StainedGlassPaneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}