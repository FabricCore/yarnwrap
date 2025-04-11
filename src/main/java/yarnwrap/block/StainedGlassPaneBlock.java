package yarnwrap.block;
public class StainedGlassPaneBlock { public net.minecraft.block.StainedGlassPaneBlock wrapperContained; public StainedGlassPaneBlock(net.minecraft.block.StainedGlassPaneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public StainedGlassPaneBlock(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.block.StainedGlassPaneBlock(color.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54045(Object instance) { return wrapperContained.method_54045(instance); }

}