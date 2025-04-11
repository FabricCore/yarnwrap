package yarnwrap.block;
public class StainedGlassBlock { public net.minecraft.block.StainedGlassBlock wrapperContained; public StainedGlassBlock(net.minecraft.block.StainedGlassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public StainedGlassBlock(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.block.StainedGlassBlock(color.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54044(Object instance) { return wrapperContained.method_54044(instance); }

}